package sample;

import javafx.scene.image.Image;

public class Jugador {
    public boolean esFavorito;
    public String nombre;
    public String equipo;
    public String posicion;
    public int dorsal;
    public float puntos;
    public float asistencias;
    public float rebotes;
    public Image foto;

    public Jugador (String nombre, boolean esFavorito, String equipo, String posicion, int dorsal, float puntos, float asistencias, float rebotes, Image foto){
        this.esFavorito = esFavorito;
        this.nombre = nombre;
        this.equipo = equipo;
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.puntos = puntos;
        this.asistencias = asistencias;
        this.rebotes = rebotes;
        this.foto=foto;
    }
}
