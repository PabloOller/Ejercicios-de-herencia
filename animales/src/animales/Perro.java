/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author Pablo
 */
public class Perro extends Mamifero {

    private String raza;
    private String nombre;
    private boolean mezcla;

    public Perro(String raza, String nombre, int Patas, double mediaVida, boolean mezcla) {
        super(Patas, mediaVida);
        this.raza = raza;
        this.nombre = nombre;
        this.mezcla = mezcla;
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

    public boolean isMezcla() {
        return mezcla;
    }

    public void setMezcla(boolean mezcla) {
        this.mezcla = mezcla;
    }

    @Override
    public String comunicarse() {
        return "Ladrido";
    }

    public String jugar() {
        return this.nombre + " está jugando";
    }

    @Override
    public String toString() {
        String tipo = "";
        if (mezcla) {
            tipo = "puro";
        } else {
            tipo = "cruzado";
        }

        return super.toString() + "\nEl perro es de raza " + this.raza + " se llama " + this.nombre + " y además, es " + tipo;
    }

}
