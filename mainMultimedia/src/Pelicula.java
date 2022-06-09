
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Pablo
 */
public class Pelicula extends Multimedia {

    private String actor_principal;
    private String actriz_principal;

    public Pelicula(String actor, String actriz, String titulo, int duración, Formato formato) {
        super(titulo, duración, formato);
        this.actor_principal = actor;
        this.actriz_principal = actriz;
    }

    public String getActor_principal() {
        return actor_principal;
    }

    public void setActor_principal(String actor_principal) {
        this.actor_principal = actor_principal;
    }

    public String getActriz_principal() {
        return actriz_principal;
    }

    public void setActriz_principal(String actriz_principal) {
        this.actriz_principal = actriz_principal;
    }

    @Override
    public String toString() {
        return super.toString() + " \nPelicula:" + " actor principal: " + this.actor_principal + ", actriz principal: " + this.actriz_principal;
    }

    public boolean equals(Pelicula pelicula) {
        boolean igual = false;
        if (pelicula.getFormato().equals(super.getFormato()) && pelicula.getDuracion() == super.getDuracion()) {
            if (pelicula.getActor_principal().equals(this.actor_principal) && pelicula.getActriz_principal().equals(this.actriz_principal)) {
                igual = true;
            }
        }
        return igual;
    }
}
