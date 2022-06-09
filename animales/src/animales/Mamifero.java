/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author Pablo
 */
public class Mamifero {

    private int Patas;
    private double mediaVida;

    public Mamifero() {

    }

    public Mamifero(int nPatas, double vida) {
        setPatas(nPatas);
        setMediaVida(vida);
    }

    public int getPatas() {
        return Patas;
    }

    public void setPatas(int Patas) {
        this.Patas = Patas;
    }

    public double getMediaVida() {
        return mediaVida;
    }

    public void setMediaVida(double mediaVida) {
        this.mediaVida = mediaVida;
    }

    public String comunicarse() {
        return "";
    }

    public String dormir() {
        return "Un mamifero duerme 8 horas";
    }

    @Override
    public String toString() {
        return "Nº de patas: " + Patas + " Media de vida: " + mediaVida;
    }
}
