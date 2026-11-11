/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio.caso.prac1;
import java.util.ArrayList;
/**
 *
 * @author markm
 */
public class Libreria {

    // Metodo para prestar publicaciones
   

    // Coleccion para almacenar publicaciones
    private static ArrayList<Publicacion> publicaciones =
            new ArrayList<Publicacion>();

    // Registrar publicaciones
    public static void registrarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    // Obtener publicaciones
    public static ArrayList<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    // Metodo para prestar publicaciones
    public static String prestarPublicacion(Publicacion publicacion) {

        if (publicacion instanceof Libro) {

            Libro libro = (Libro) publicacion;

            if (libro.getprecio() < 200) {
                return "El libro se presta por 15 dias.";
            } else if (libro.getprecio() > 200) {
                return "El libro se presta por 3 dias.";
            } else {
                return "El libro cuesta $200 y no tiene un plazo definido.";
            }

        } else if (publicacion instanceof Revista) {

            return "La revista se presta por 5 dias.";

        } else if (publicacion instanceof Ebook) {

            Ebook ebook = (Ebook) publicacion;

            return "El Ebook no se puede prestar.\n"
                    + "URL de descarga: " + ebook.geturl();
        }

        return "Publicacion no reconocida.";
    }

    // Metodo para devolver publicaciones
    public static String DevolverPublicacion(
            Publicacion publicacion, int diasAtraso)
            throws EbookNoSeDevuelve {

        if (diasAtraso < 0) {
            throw new IllegalArgumentException(
                    "Los dias de atraso no pueden ser negativos."
            );
        }

        if (publicacion instanceof Libro) {

            double multa = diasAtraso * 2.0;

            return "La multa del libro es: $" + multa;

        } else if (publicacion instanceof Revista) {

            double multa = diasAtraso * 1.5;

            return "La multa de la revista es: $" + multa;

        } else if (publicacion instanceof Ebook) {

            throw new EbookNoSeDevuelve(
                    "El Ebook no requiere devolucion fisica."
            );
        }

        return "No se pudo procesar la devolucion.";
    }
}
