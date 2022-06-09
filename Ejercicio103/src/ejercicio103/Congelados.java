/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio103;

/**
 *
 * @author Pablo
 */
public class Congelados extends Productos {

    private String fecha_envasado;
    private String Pais_origen;
    private double Temperatura;

    public Congelados(String fecha_envasado, String Pais_origen, double Temperatura, String fecha_caducidad, int numLote) {
        super(fecha_caducidad, numLote);
        this.fecha_envasado = fecha_envasado;
        this.Pais_origen = Pais_origen;
        this.Temperatura = Temperatura;
    }

    public String getFecha_envasado() {
        return fecha_envasado;
    }

    public void setFecha_envasado(String fecha_envasado) {
        this.fecha_envasado = fecha_envasado;
    }

    public String getPais_origen() {
        return Pais_origen;
    }

    public void setPais_origen(String Pais_origen) {
        this.Pais_origen = Pais_origen;
    }

    public double getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(double Temperatura) {
        this.Temperatura = Temperatura;
    }

    @Override
    public String toString() {
        return super.toString() + " Congelados:" + " fecha de envasado: " + this.fecha_envasado + ", Temperatura: " + this.Temperatura + ", Pais de origen: " + this.Pais_origen;
    }
}
