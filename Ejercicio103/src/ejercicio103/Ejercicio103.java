/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio103;

/**
 *
 * @author Pablo
 */
public class Ejercicio103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Productos PR = new Productos("19/11/2000", 103);
        Frescos FR = new Frescos("02/02/2022", "España", "Por aire", "17/10/2023", 104);
        Refrigerados RF = new Refrigerados(23443, "01/12/2021", 1.7, "Italia", "23/09/2022", 226);
        Congelados CG = new Congelados("10/10/2020", "Marruecos", -2.4, "02/07/2025", 1234);
        PorAire PA = new PorAire(70, 21, 4, 5, "31/03/2015", "Francia", -8.6, "05//04/2032", 54);
        PorAgua PAG = new PorAgua(31.5, "18/06/2020", "Alemania", -20.3, "01/01/2051", 543);
        PorNitrogeno PN = new PorNitrogeno("Camara frigorifica", 10, "05/035", "Holanda", -55, "04/04/2055", 9439);
        
        System.out.println(PR.toString());
        System.out.println(FR.toString());
        System.out.println(RF.toString());
        System.out.println(CG.toString());
        System.out.println(PA.toString());
        System.out.println(PAG.toString());
        System.out.println(PN.toString());
        
    }

}
