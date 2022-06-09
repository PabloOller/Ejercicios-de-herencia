/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej104;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Pablo
 */
public class Profesor {

    private String nombre;
    protected ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
    private double horasSemanales;
    protected Random AL = new Random();
    protected boolean Ocupado;

    public Profesor(String nombre, int numAsignaturas) {
        this.nombre = nombre;
        this.horasSemanales = 0;
        int Imparte = AL.nextInt(numAsignaturas - 1) + 1;

        for (int i = 0; i < Imparte; i++) {
            int codigo = AL.nextInt(100) + 100;
            int horas = AL.nextInt(5) + 3;
            while (codigo == codigo - 1) {
                codigo = AL.nextInt(100) + 100;
                horas = AL.nextInt(5) + 3;
            }
            Asignatura AS = new Asignatura(codigo, horas);
            this.asignaturas.add(AS);
            this.horasSemanales += AS.getNumeroHoras();
        }
        this.Ocupado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public double getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(double horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public boolean isOcupado() {
        return Ocupado;
    }

    public void setOcupado(boolean Ocupado) {
        this.Ocupado = Ocupado;
    }

    private int asignaturaAleatoria() {
        int posicion = AL.nextInt(asignaturas.size());
        while (asignaturas.get(posicion) == null) {
            posicion = AL.nextInt(asignaturas.size());
        }
        return posicion;
    }

    public String darClase() {
        String daClase = "";
        if (Ocupado) {
            daClase = this.nombre+" está ocupado";
        } else {
            daClase = this.nombre + " está dando clase de " + asignaturas.get(asignaturaAleatoria()).getCodigo();
            this.Ocupado = true;
        }
        return daClase;
    }

    public String parar() {
        String para = "";
        if (Ocupado) {
            this.Ocupado = false;
            para = this.nombre + " ha finalizado de dar clase";
        } else {
            para = "El profesor no estaba dando clase";
        }
        return para;
    }

    @Override
    public String toString() {
        String devolver = "\n\nPROFESOR\n" + "Nombre: " + this.nombre + "\nAsignaturas:";
        for (int i = 0; i < asignaturas.size(); i++) {
            if (asignaturas.get(i) != null) {
                devolver += "\n" + this.asignaturas.get(i).toString();
            }
        }
        devolver += "\nHorasSemanales: " + this.horasSemanales;
        if (this.Ocupado) {
            devolver += "\nSí está dando clase";
        } else {
            devolver += "\nNo está dando clase";
        }
        return devolver;
    }

}
