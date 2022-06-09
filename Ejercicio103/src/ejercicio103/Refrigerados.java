/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio103;

/**
 *
 * @author Pablo
 */
public class Refrigerados extends Productos {

    private int codigo_organismo;
    private String fecha_envasado;
    private double Temperatura;
    private String Pais_origen;

    public Refrigerados(int codigo_organismo, String fecha_envasado, double Temperatura, String Pais_origen, String fecha_caducidad, int numLote) {
        super(fecha_caducidad, numLote);
        this.codigo_organismo = codigo_organismo;
        this.fecha_envasado = fecha_envasado;
        this.Temperatura = Temperatura;
        this.Pais_origen = Pais_origen;
    }

    public int getCodigo_organismo() {
        return codigo_organismo;
    }

    public void setCodigo_organismo(int codigo_organismo) {
        this.codigo_organismo = codigo_organismo;
    }

    public String getFecha_envasado() {
        return fecha_envasado;
    }

    public void setFecha_envasado(String fecha_envasado) {
        this.fecha_envasado = fecha_envasado;
    }

    public double getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(double Temperatura) {
        this.Temperatura = Temperatura;
    }

    public String getPais_origen() {
        return Pais_origen;
    }

    public void setPais_origen(String Pais_origen) {
        this.Pais_origen = Pais_origen;
    }

    @Override
    public String toString() {
        return super.toString() + "Refrigerados:" + " codigo de organismo: " + this.codigo_organismo + ", fecha de envasado: " + this.fecha_envasado + ", Temperatura: " + this.Temperatura + ", Pais de origen: " + this.Pais_origen;
    }

}
