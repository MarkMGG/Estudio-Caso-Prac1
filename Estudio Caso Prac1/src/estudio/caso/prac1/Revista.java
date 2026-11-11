/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package estudio.caso.prac1;
/**
 *
 * @author markm
 */
public class Revista extends Publicacion {

    private int numeroEdicion;
    private String periodicidad;

    public Revista(String titulo, String editorial, int paginas) {
        super(titulo, editorial, paginas);
    }

    public Revista(String titulo, String editorial, int paginas,
                   int numeroEdicion, String periodicidad) {

        super(titulo, editorial, paginas);
        this.numeroEdicion = numeroEdicion;
        this.periodicidad = periodicidad;
    }

    @Override
    public String toString() {
        return "REVISTA: " + titulo
                + " | Edicion: " + numeroEdicion
                + " | Periodicidad: " + periodicidad;
    }
}
