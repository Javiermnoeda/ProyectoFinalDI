package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class ControllerJugador {

    private Controller controller;

    @FXML
    ImageView foto;

    @FXML
    Label nombre,dorsal,posicion,labelPuntos,labelAsistencias,labelRebotes;

     public void ponerInfo(){
         try {
             nombre.setText(controller.steph.nombre);
             dorsal.setText(String.valueOf(controller.steph.dorsal));
             posicion.setText(controller.steph.posicion);
             labelPuntos.setText(String.valueOf(controller.steph.puntos));
             labelAsistencias.setText(String.valueOf(controller.steph.asistencias));
             labelRebotes.setText(String.valueOf(controller.steph.rebotes));
         } catch (Exception e){
             System.out.println("No se puedo poner la info");
         }
    }
}
