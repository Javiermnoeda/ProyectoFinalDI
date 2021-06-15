package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class ControllerJugador {

    ControllerPlantilla controllerPlantilla = null;
    ControllerEquipos controllerEquipos = null;

    public Jugador jugadorSeleccionado = null;

    @FXML
    ImageView foto,imagenFavorito;

    @FXML
    Label nombre,dorsal,posicion,labelPuntos,labelAsistencias,labelRebotes,labelMedia;

    public void enviarJugador(Jugador jugador){
            jugadorSeleccionado = jugador;
            nombre.setText(jugador.nombre);
            foto.setImage(jugador.foto);
            dorsal.setText(String.valueOf(jugador.dorsal));
            posicion.setText(jugador.posicion);
            labelPuntos.setText(String.valueOf(jugador.puntos));
            labelAsistencias.setText(String.valueOf(jugador.asistencias));
            labelRebotes.setText(String.valueOf(jugador.rebotes));
            labelMedia.setText(String.valueOf(jugador.media));
    }

    @FXML
    public void jugadorFavorito() {
        jugadorSeleccionado.esFavorito=! jugadorSeleccionado.esFavorito; // El simbolo lo que dice es lo contrario ej: si es falso es verdadero y viceversa
        controllerPlantilla.actualizarFavorito1();
        controllerPlantilla.actualizarFavorito2();
        Binder.bindJugador(jugadorSeleccionado,imagenFavorito); // TODO actualizar a la ventana anterior
    }

    public void enviarControllerJugadores(ControllerPlantilla controllerPlantilla1){
        controllerPlantilla = controllerPlantilla1;
    }
}
