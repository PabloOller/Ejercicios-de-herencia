/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio103;

/**
 *
 * @author Pablo
 */
public class PorAire extends Congelados {

    private double PercNitrogeno;
    private double PercOxigeno;
    private double PercCO2;
    private double PercH2O;

    public PorAire(double PercNitrogeno, double PercOxigeno, double PercCO2, double PercH2O, String fecha_envasado, String Pais_origen, double Temperatura, String fecha_caducidad, int numLote) {
        super(fecha_envasado, Pais_origen, Temperatura, fecha_caducidad, numLote);
        this.PercNitrogeno = PercNitrogeno;
        this.PercOxigeno = PercOxigeno;
        this.PercCO2 = PercCO2;
        this.PercH2O = PercH2O;
    }

    public double getPercNitrogeno() {
        return PercNitrogeno;
    }

    public void setPercNitrogeno(double PercNitrogeno) {
        this.PercNitrogeno = PercNitrogeno;
    }

    public double getPercOxigeno() {
        return PercOxigeno;
    }

    public void setPercOxigeno(double PercOxigeno) {
        this.PercOxigeno = PercOxigeno;
    }

    public double getPercCO2() {
        return PercCO2;
    }

    public void setPercCO2(double PercCO2) {
        this.PercCO2 = PercCO2;
    }

    public double getPercH2O() {
        return PercH2O;
    }

    public void setPercH2O(double PercH2O) {
        this.PercH2O = PercH2O;
    }

    @Override
    public String toString() {
        return super.toString() + " PorAire: " + "PercNitrogeno: " + this.PercNitrogeno + ", PercOxigeno: " + this.PercOxigeno + ", PercCO2: " + this.PercCO2 + ", PercH2O: " + this.PercH2O;
    }

}
