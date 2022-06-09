/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author Pablo
 */
public class Gato extends Mamifero {

    private String raza;
    private String nombre;
    private Pelaje pelaje;

    public Gato(String raza, String nombre, int patas, double mediaVida) {
        super(patas, mediaVida);
        this.raza = raza;
        this.nombre = nombre;
        this.pelaje = pelaje.corto;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pelaje getPelaje() {
        return pelaje;
    }

    public void setPelaje(Pelaje pelaje) {
        this.pelaje = pelaje;
    }

    public String cazar() {
        return "Mi gato con " + super.getPatas() + " está cazando";
    }

    @Override
    public String dormir() {
        return "Duerme 15 horas";
    }

    @Override
    public String toString() {
        return "El gato tiene " + super.toString() + " Gato con pelaje " + this.pelaje;
    }

    @Override
    public String comunicarse() {
        return "Maulla";
    }

}
