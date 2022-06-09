/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Pablo
 */
public class MainMultimedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Multimedia archivo = new Multimedia("hola",103);
        Cancion PorEjemplo = new Cancion("Wade", "Paco",Genero.RB,"PorEjemplo",5,Formato.wav);
        Pelicula StarWars = new Pelicula("Harrison Ford", "Carrie Fisher","Star Wars",210,Formato.mp4);
        
        System.out.println(StarWars.toString());
        System.out.println(PorEjemplo.toString());
        if(StarWars.equals(PorEjemplo)){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("No son iguales");
        }
    }
    
}
