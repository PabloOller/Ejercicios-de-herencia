/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej105;

/**
 *
 * @author Pablo
 */
public class Camioneta extends Coche {

    protected double carga;

    public Camioneta(double carga, double velocidad, int cilindrada, String color, int ruedas) {
        super(velocidad, cilindrada, color, ruedas);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de Coche: CAMIONETA" + "\nCarga: " + this.carga+" Kg";
    }

}
