/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio.caso.prac1;

/**
 *
 * @author markm
 */
//Creamos la clase abstracta publicacion.
public abstract class Publicacion {

    protected String titulo;
    protected String Editorial;
    protected int Paginas;

    public Publicacion(String titulo, String Editorial, int Paginas) {
        this.titulo = titulo;
        this.Editorial = Editorial;
        this.Paginas = Paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public int getPaginas() {
        return Paginas;
    }

    @Override
    public String toString() {
        return titulo + " | " + Editorial + " | " + Paginas + " paginas";
    }
}

 