/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio103;

/**
 *
 * @author Pablo
 */
public class PorNitrogeno extends Congelados {

    private String info;
    private int tiempo;

    public PorNitrogeno(String info, int tiempo, String fecha_envasado, String Pais_origen, double Temperatura, String fecha_caducidad, int numLote) {
        super(fecha_envasado, Pais_origen, Temperatura, fecha_caducidad, numLote);
        this.info = info;
        this.tiempo = tiempo;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return super.toString() + " PorNitrogeno: " + "informacion del metodo de congelación " + this.info + ", tiempo expuesto " + this.tiempo + " segundos";
    }

}
