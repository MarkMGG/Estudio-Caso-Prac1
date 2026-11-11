/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package estudio.caso.prac1;

import javax.swing.SwingUtilities;

public class EstudioCasoPrac1 {

    public static void main(String[] args) {

        // Libro inicial
        Libro libro1 = new Libro(
                "Ciberseguridad",
                "Fide",
                250,
                "Mark",
                "12345",
                150
        );

        // Revista inicial
        Revista revista1 = new Revista(
                "Tecnologia",
                "Editorial CR",
                50,
                1,
                "Mensual"
        );

        // Ebook inicial
        Ebook ebook1 = new Ebook(
                "Java basico",
                "Editorial CR",
                120,
                "PDF",
                5.5,
                "https://ejemplo.com/java"
        );

        // Registrar publicaciones
        Libreria.registrarPublicacion(libro1);
        Libreria.registrarPublicacion(revista1);
        Libreria.registrarPublicacion(ebook1);

        // Abrir interfaz grafica
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Biblioteca().setVisible(true);
            }
        });
    }
}
