/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package estudio.caso.prac1;
/**
 *
 * @author markm
 */
public class Libro extends Publicacion {

    private String autor;
    private String ISBN;
    private double precio;

    public Libro(String autor, String ISBN, String titulo,
                 String Editorial, int Paginas) {

        super(titulo, Editorial, Paginas);
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public Libro(String titulo, String editorial, int paginas,
                 String autor, String ISBN, double precio) {

        super(titulo, editorial, paginas);
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
    }

    public double getprecio() {
        return precio;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "LIBRO: " + titulo
                + " | Autor: " + autor
                + " | Editorial: " + Editorial
                + " | Precio: $" + precio;
    }
}
