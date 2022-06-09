/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pablo
 */
public class Multimedia {

    private String titulo;
    private int duracion;
    private Formato formato;

    public Multimedia(String titulo, int duración, Formato formato) {
        this.formato = formato;
        this.titulo = titulo;
        this.duracion = duración;
    }

    public Multimedia(String titulo, int duración) {
        this.titulo = titulo;
        this.duracion = duración;
        this.formato = Formato.mp3;
    }

    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Multimedia{" + "\nTitulo:" + this.titulo + ", Duración: " + this.duracion + ", formato: " + this.formato;
    }

    public boolean equals(Multimedia multimedia) {
        boolean igual = false;
        if (multimedia.getFormato().equals(this.formato) && multimedia.getDuracion() == this.duracion) {
            igual = true;
        }
        return igual;
    }

}
