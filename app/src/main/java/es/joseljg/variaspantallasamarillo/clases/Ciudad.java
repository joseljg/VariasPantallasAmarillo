package es.joseljg.variaspantallasamarillo.clases;

import android.os.Build;

import java.io.Serializable;
import java.util.Objects;

public class Ciudad implements Serializable {
    private String nombre;
    private int habitantes;
    //----------------------------

    public Ciudad(String nombre, int habitantes) {
        this.nombre = nombre;
        this.habitantes = habitantes;
    }
    //-------------------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }
    //-------------------------------------

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                ", habitantes=" + habitantes +
                '}';
    }

    //------------------------------------------

}
