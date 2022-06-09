/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej104;

import java.util.ArrayList;

/**
 *
 * @author Pablo
 */
public class ProfesorDeUni extends Profesor {

    private boolean investiga;
    private int horasInvestiga;

    public ProfesorDeUni(String nombre, int numAsignaturas, int horasInvestiga) {
        super(nombre, numAsignaturas);
        this.investiga = false;
        this.horasInvestiga = horasInvestiga;
        if (super.getHorasSemanales() < 8) {
            this.investiga = false;
            this.horasInvestiga = 0;
        }
    }

    public boolean isInvestiga() {
        return investiga;
    }

    public void setInvestiga(boolean investiga) {
        this.investiga = investiga;
    }

    public int getHorasInvestiga() {
        return horasInvestiga;
    }

    public void setHorasInvestiga(int horasInvestiga) {
        this.horasInvestiga = horasInvestiga;
    }

    @Override
    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    @Override
    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public boolean isOcupado() {
        return Ocupado;
    }

    @Override
    public void setOcupado(boolean Ocupado) {
        this.Ocupado = Ocupado;
    }

    public String Investigar() {
        String investigando = "";
        if (super.getHorasSemanales() > 8) {
            if (this.Ocupado) {
                investigando = super.getNombre() + " está ocupado";
            } else if (this.investiga) {
                investigando = super.getNombre() + " ya está investigando antes";
            } else {
                investigando = super.getNombre() + " esta investigando";
                this.investiga = true;
                this.Ocupado = true;
            }
        } else {
            System.out.println(super.getNombre() + " no tiene suficientes horas semanales");
        }
        return investigando;
    }

    public String pararInvestigar() {
        String para = "";
        if (investiga) {
            this.Ocupado = false;
            this.investiga = false;
            para = super.getNombre() + " ha terminado de investigar";
        } else {
            para = super.getNombre() + " no estaba investigando";
        }
        return para;
    }

    public void cogerOtraAsignatura() {
        int i = 0;
        Asignatura AS = new Asignatura(AL.nextInt(100) + 100, AL.nextInt(5) + 3);
        while (asignaturas.get(i) != null && i < asignaturas.size()) {
            i++;
        }
        if (AS.getNumeroHoras() + super.getHorasSemanales() > 25) {
            System.err.println("No se ha podido coger la asignatura: " + AS.getCodigo());
        } else {
            System.out.println("Se ha podido coger la asignatura: " + AS.getCodigo());
            asignaturas.add(AS);
            super.setHorasSemanales(AS.getNumeroHoras() + super.getHorasSemanales());
        }
    }

    public void abandonarAsignatura() {
        int i = asignaturas.size();
        while (asignaturas.get(i) == null && i > 0) {
            i--;
        }
        System.out.println("se le ha quitado la asignatura " + asignaturas.get(i));
        super.setHorasSemanales(super.getHorasSemanales() - asignaturas.get(i).getNumeroHoras());
        asignaturas.remove(asignaturas.get(i));
    }

    @Override
    public String toString() {
        String devolver = super.toString()+"\nEs profesor de universidad";
        if (this.investiga) {
            devolver += "\nEstá investigando";
        } else {
            devolver += "\nNo está investigando";
        }
        devolver += "\nHoras que investiga: " + this.horasInvestiga;
        return devolver;
    }

}
