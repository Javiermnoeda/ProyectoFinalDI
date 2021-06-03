package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class ControllerPlantilla {

    ControllerJugador controllerJugador = null;

    @FXML
    ImageView foto1, foto2, imagenEquipo;

    @FXML
    Label nombreEquipo, nombreJ1, nombreJ2;

    @FXML
    private void abrirVentanaIndividual() {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("VentanaJugador.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
             controllerJugador = loader.getController();
            Scene scene = new Scene(root,650,500);
            stage.setScene(scene);
            stage.setTitle("Ventana 2");
            stage.show();
        } catch(Exception e) {
            System.out.println("No se ha podido abrir la segunda ventana, algo pasa.");
        }
    }

    private void abrirJugador(Jugador jugador){
        abrirVentanaIndividual();

    }
}
