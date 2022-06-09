/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej105;

/**
 *
 * @author Pablo
 */
public class Motocicleta extends Bicicleta {

    protected double velocidad;
    protected int cilindrada;

    public Motocicleta(double velocidad, int cilindrada, Tipo tipo, String color, int ruedas) {
        super(tipo, color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public Tipo getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo de bicicleta: MOTOCICLETA:" + "\nVelocidad: " + this.velocidad + " Km/h\nCilindrada: " + this.cilindrada+" cc";
    }

}
