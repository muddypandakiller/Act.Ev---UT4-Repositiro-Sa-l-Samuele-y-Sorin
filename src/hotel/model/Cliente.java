package hotel.model;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nombre;
    private List<String> reservas; 
    private List<String> reservasactivas;

    public Cliente(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.reservas = new ArrayList<>();
        this.reservasactivas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getReservas() {
        return reservas;
    }

    public void setReservas(List<String> reservas) {
        this.reservas = reservas;
    }

    public List<String> getReservasactivas() {
        return reservasactivas;
    }

    public void setReservasactivas(List<String> reservasactivas) {
        this.reservasactivas = reservasactivas;
    }

    public boolean reservasmax () {
        return reservasactivas.size() <3;
    }

}

