package sample;

import javafx.scene.image.Image;
import sample.Jugador;

public class Equipo {
    public String nombre;
    public Image imagen;
    public Jugador jugador;
    public Jugador jugador2;


    public Equipo(String nombre, Image imagen, Jugador jugador, Jugador jugador2){
        this.nombre=nombre;
        this.jugador=jugador;
        this.jugador2=jugador2;
        this.imagen=imagen;

    }

}
