/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio103;

/**
 *
 * @author Pablo
 */
public class Frescos extends Productos {
    private String fecha_conservacion;
    private String Pais_origen;
    private String metodo_conservacion;

    public Frescos(String fecha_conservacion, String Pais_origen, String metodo_conservacion, String fecha_caducidad, int numLote) {
        super(fecha_caducidad, numLote);
        this.fecha_conservacion = fecha_conservacion;
        this.Pais_origen = Pais_origen;
        this.metodo_conservacion = metodo_conservacion;
    }

    public String getFecha_conservacion() {
        return fecha_conservacion;
    }

    public void setFecha_conservacion(String fecha_conservacion) {
        this.fecha_conservacion = fecha_conservacion;
    }

    public String getPais_origen() {
        return Pais_origen;
    }

    public void setPais_origen(String Pais_origen) {
        this.Pais_origen = Pais_origen;
    }

    public String getMetodo_conservacion() {
        return metodo_conservacion;
    }

    public void setMetodo_conservacion(String metodo_conservacion) {
        this.metodo_conservacion = metodo_conservacion;
    }

    @Override
    public String toString() {
        return super.toString()+" Frescos: " + "fecha de conservacion: " + this.fecha_conservacion + ", Pais de origen: " + this.Pais_origen + ", metodo de conservacion: " + this.metodo_conservacion;
    }
    
}
