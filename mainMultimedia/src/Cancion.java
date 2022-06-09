/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pablo
 */
public class Cancion extends Multimedia {

    private String Artista;
    private String Editor;
    private Genero genero;

    public Cancion(String Artista, String Editor, Genero genero, String titulo, int duración, Formato formato) {
        super(titulo, duración, formato);
        this.Artista = Artista;
        this.Editor = Editor;
        this.genero = genero;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public String getEditor() {
        return Editor;
    }

    public void setEditor(String Editor) {
        this.Editor = Editor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nCancion: " + "Artista: " + this.Artista + ", Editor: " + this.Editor + " Genero: " + this.genero;
    }

}
