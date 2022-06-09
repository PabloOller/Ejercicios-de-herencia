/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animales;

/**
 *
 * @author Pablo
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamifero mamif = new Mamifero(4, 6);
        Perro Pastor_aleman = new Perro("Pastor Alemán", "Luna", 4, 13, true);
        Gato Misifu = new Gato("Vacilon", "Misifu", 4, 7);
        System.out.println(Pastor_aleman.comunicarse());
        System.out.println(Pastor_aleman.dormir());
        System.out.println(Pastor_aleman);
        System.out.println(Misifu.comunicarse());
        System.out.println(Misifu.dormir());
        System.out.println(Misifu.cazar());
        System.out.println(Misifu);
    }

}
