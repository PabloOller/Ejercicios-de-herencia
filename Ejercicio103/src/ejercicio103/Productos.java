/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio103;

/**
 *
 * @author Pablo
 */
public class Productos {

    private String fecha_caducidad;
    private int numLote;

    public Productos(String fecha_caducidad, int numLote) {
        this.fecha_caducidad = fecha_caducidad;
        this.numLote = numLote;
    }

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    @Override
    public String toString() {
        return "Productos" + "fecha de caducidad: " + this.fecha_caducidad + ", numero de lote: " + this.numLote;
    }

}
