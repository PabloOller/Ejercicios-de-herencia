/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej105;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Ej105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehiculo VH1 = new Vehiculo("Rojo", 4);
        Vehiculo VH2 = new Vehiculo("Azul", 2);
        Coche CH1 = new Coche(200, 2000, "Blanco", 4);
        Coche CH2 = new Coche(180, 1600, "Gris", 4);
        Camioneta CM1 = new Camioneta(2000, 250, 3500, "Negro", 4);
        Camioneta CM2 = new Camioneta(1700, 230, 3000, "Amarillo", 4);
        Bicicleta BC1 = new Bicicleta(Tipo.urbana, "Naranja", 2);
        Bicicleta BC2 = new Bicicleta(Tipo.deportiva, "Verde", 2);
        Motocicleta MT1 = new Motocicleta(300, 750, Tipo.deportiva, "Marron", 2);
        Motocicleta MT2 = new Motocicleta(270, 1000, Tipo.urbana, "Morado", 2);

        ArrayList<Vehiculo> Lista = new ArrayList<Vehiculo>();
        Lista.add(VH1);
        Lista.add(VH2);
        Lista.add(CH1);
        Lista.add(CH2);
        Lista.add(CM1);
        Lista.add(CM2);
        Lista.add(BC1);
        Lista.add(BC2);
        Lista.add(MT1);
        Lista.add(MT2);

        for (int i = 0; i < Lista.size(); i++) {
            System.out.println("\n"+Lista.get(i).toString());
        }
        System.out.println("\nNumero de ruedas tiene el vehículo: ");
        int numRuedas = sc.nextInt();
        int cont = 0;
        for (int i = 0; i < Lista.size(); i++) {
            if (numRuedas == Lista.get(i).getRuedas()) {
                System.out.println(Lista.get(i));
                cont++;
            }
        }
        System.out.println("Se han encontrado " + cont + " vehiculos con " + numRuedas + " ruedas.");
    }

}
