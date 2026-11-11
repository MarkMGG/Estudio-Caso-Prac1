/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio.caso.prac1;

/**
 *
 * @author markm
 */
public class Ebook extends Publicacion implements Reproducible {

    private String formato;
    private double tamanoArchivo;
    private String url;

    public Ebook(String titulo, String editorial, int paginas) {
        super(titulo, editorial, paginas);
    }

    public Ebook(String titulo, String editorial, int paginas,
                 String formato, double tamanoArchivo, String url) {

        super(titulo, editorial, paginas);
        this.formato = formato;
        this.tamanoArchivo = tamanoArchivo;
        this.url = url;
    }

    @Override
    public void reproducir(String titulo, int paginas) {
        System.out.println("Reproduciendo " + titulo);
    }

    @Override
    public void detener(String titulo) {
        System.out.println("Deteniendo la reproduccion de " + titulo);
    }

    public String geturl() {
        return url;
    }

    @Override
    public String toString() {
        return "EBOOK: " + titulo
                + " | Formato: " + formato
                + " | URL: " + url;
    }
}
