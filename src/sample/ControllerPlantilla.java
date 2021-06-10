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
    ControllerEquipos controllerEquipos = null;

    @FXML
    private ImageView foto1, foto2, imagenEquipo;

    @FXML
    private Label nombreEquipo, nombreJ1, nombreJ2;

    public Equipo equipoSeleccionado = null;

    @FXML
    private void abrirVentanaIndividual(Jugador jugador) {
        try {
            if (controllerJugador == null){
                Stage stage = new Stage();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("VentanaJugador.fxml"));
                AnchorPane root = (AnchorPane) loader.load();
                controllerJugador = loader.getController();
                Scene scene = new Scene(root,605,315);
                stage.setScene(scene);
                stage.setTitle("Informacion De Jugador");
                stage.show();
            }
            controllerJugador.enviarJugador(jugador);
        } catch(Exception e) {
            System.out.println("No se ha podido abrir la segunda ventana, algo pasa.");
        }
    }

    @FXML
    private void abrirJugador1(){
        try{
            abrirVentanaIndividual(equipoSeleccionado.jugador);
        } catch (Exception e){
            System.out.println("No se pudo mandar la info");
        }
    }

    @FXML
    private void abrirJugador2(){
        try{
            abrirVentanaIndividual(equipoSeleccionado.jugador2);
        } catch (Exception e){
            System.out.println("No se pudo mandar la info");
        }
    }

    public void enviarEquipo(Equipo equipo) {
        equipoSeleccionado = equipo;
        imagenEquipo.setImage(equipo.imagen);
        nombreEquipo.setText(equipo.nombre);

        foto1.setImage(equipo.jugador.foto);
        foto2.setImage(equipo.jugador2.foto);

        nombreJ1.setText(equipo.jugador.nombre);
        nombreJ2.setText(equipo.jugador2.nombre);
    }


}
