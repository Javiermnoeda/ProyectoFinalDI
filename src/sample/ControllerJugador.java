package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class ControllerJugador {

    ControllerPlantilla controllerPlantilla = null;
    ControllerEquipos controllerEquipos = null;

    @FXML
    ImageView foto;

    @FXML
    Label nombre,dorsal,posicion,labelPuntos,labelAsistencias,labelRebotes;

    public void enviarJugador(Jugador jugador){
            nombre.setText(jugador.nombre);
            foto.setImage(jugador.foto);
            dorsal.setText(String.valueOf(jugador.dorsal));
            posicion.setText(jugador.posicion);
            labelPuntos.setText(String.valueOf(jugador.puntos));
            labelAsistencias.setText(String.valueOf(jugador.asistencias));
            labelRebotes.setText(String.valueOf(jugador.rebotes));
    }

}
