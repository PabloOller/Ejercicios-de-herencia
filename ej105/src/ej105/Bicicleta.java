/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej105;

/**
 *
 * @author Pablo
 */
public class Bicicleta extends Vehiculo {

    protected Tipo tipo;

    public Bicicleta(Tipo tipo, String color, int ruedas) {
        super(color, ruedas);
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getRuedas() {
        return ruedas;
    }

    @Override
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

   
    

    @Override
    public String toString() {
        return super.toString() + "\nTipo de Vehiculo: BICICLETA: " + "\nEs urbana o deportiva? " + this.tipo;
    }

}
