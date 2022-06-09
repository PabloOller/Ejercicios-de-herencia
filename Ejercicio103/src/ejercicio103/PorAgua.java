/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio103;

/**
 *
 * @author Pablo
 */
public class PorAgua extends Congelados {

    private double infoSAl;

    public PorAgua(double infoSAl, String fecha_envasado, String Pais_origen, double Temperatura, String fecha_caducidad, int numLote) {
        super(fecha_envasado, Pais_origen, Temperatura, fecha_caducidad, numLote);
        this.infoSAl = infoSAl;
    }

    public double getInfoSAl() {
        return infoSAl;
    }

    public void setInfoSAl(double infoSAl) {
        this.infoSAl = infoSAl;
    }

    @Override
    public String toString() {
        return super.toString() + " PorAgua: " + "informacion de la salinidad del  agua con la que se congeló: " + this.infoSAl + "g/L";
    }

}
