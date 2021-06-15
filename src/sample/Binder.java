package sample;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;

public class Binder {

    private static File imagenBalonVacio = new File("src/sample/resources/favoritoVacio.PNG");
    private static Image favoritoVacio = new Image(imagenBalonVacio.toURI().toString());

    private static File imagenBalonLLeno = new File("src/sample/resources/favoritoLleno.PNG");
    private static Image favoritoLleno = new Image(imagenBalonLLeno.toURI().toString());

    public static void bindJugador(Jugador jugador, ImageView balon){
        if (jugador.esFavorito){
            balon.setImage(favoritoLleno);
            System.out.println(jugador.nombre+" es favorito");
        } else {
            balon.setImage(favoritoVacio);
            System.out.println(jugador.nombre+"no es favorito");
        }
    }

}
