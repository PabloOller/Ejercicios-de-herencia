/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej104;

/**
 *
 * @author Pablo
 */
public class Asignatura {

    private int codigo;
    private int numeroHoras;

    public Asignatura(int codigo, int numeroHoras) {
        this.codigo = codigo;
        this.numeroHoras = numeroHoras;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "codigo=" + this.codigo + ", numeroHoras=" + this.numeroHoras + '}';
    }
}
