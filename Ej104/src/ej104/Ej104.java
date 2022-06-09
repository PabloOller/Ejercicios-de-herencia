/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej104;

/**
 *
 * @author Pablo
 */
public class Ej104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor Jose = new Profesor("Jose", 5);
        ProfesorDeUni Pablo = new ProfesorDeUni("Pablo", 6, 4);

        System.out.println(Jose.toString());
        System.out.println(Pablo.toString());
        System.out.println("");
        System.out.println("\n"+Jose.darClase());
        System.out.println(Jose.parar());
        System.out.println("\n"+Pablo.darClase());
        System.out.println(Pablo.Investigar());
        System.out.println(Pablo.parar());
        System.out.println(Pablo.Investigar());
        System.out.println(Pablo.pararInvestigar());
    }

}
