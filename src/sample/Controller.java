package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Controller {

    ControllerPlantilla controllerJugadores = null;

    Jugador steph,klay, dbook, cp3, jokic, jammal, kd, jh, jimmy, bam, kl7, p;
    Equipo gsw,bkn,pho,mia,den,tor;

    @FXML
    ImageView warriors,suns,spurs,nets,heat,raptors;

    @FXML
    public void initialize(){
        steph = new Jugador("Stephen Curry",false,"GSW","Base",30, 32F,5.8F,5.5F,new Image("sample/resources/curry.PNG"));
        klay = new Jugador("Klay Thompson",false,"GSW","Escolta",11,19.5F,2.3F,3.5F,new Image("sample/resources/klay.PNG"));
        dbook = new Jugador("Devin Booker",false,"PHO","Escolta",1,25.6F,4.3F,4.2F,new Image("sample/resources/dbook.PNG"));
        cp3 = new Jugador("Chris Paul",false,"PHO","Base",3,16.4F,8.9F,4.5F, new Image("sample/resources/cp3.PNG"));
        jokic = new Jugador("Nikola Jokic",false,"DEN","Pivot",15,26.4F,8.3F,10.8F, new Image("sample/resources/jokic.PNG"));
        jammal = new Jugador("Jammal Murray",false,"DEN","Base",27,21.2F,4.8F,4F,new Image("sample/resources/jammal.PNG"));
        kd = new Jugador("Kevin Durant",false,"BKN","Alero",7,26.9F,5.6F,7.1F, new Image("sample/resources/kd.PNG"));
        jh = new Jugador("James Harden",false,"BKN","Base",13,24.6F,10.8F,7.9F,new Image("sample/resources/harden.PNG"));
        jimmy = new Jugador("Jimmy Butler",false,"MIA","Alero",22,21.5F,7.1F,6.9F,new Image("sample/resources/jimmy.PNG"));
        bam = new Jugador("Bam Adebayo",false,"MIA","Pivot",13,18.7F,5.4F,9.0F, new Image("sample/resources/bam.PNG"));
        kl7 = new Jugador("Kyle Lowry",false,"TOR","Base",7,17.2F,7.3F,5.4F,new Image("sample/resources/kl7.PNG"));
        p = new Jugador("Pascal Siakam",false,"TOR","Ala-Pivot",43,21.4F,4.5F,7.2F,new Image("sample/resources/pascal.PNG"));


        gsw = new Equipo("Golden State Warriors",new Image("sample/resources/warriors.PNG"),steph,klay);
        bkn = new Equipo("Brooklyn Nets",new Image("sample/resources/nets.PNG"),kd,jh);
        pho = new Equipo("Phoenix Suns",new Image("sample/resources/suns.PNG"),dbook,cp3);
        mia = new Equipo("Miami Heat",new Image("sample/resources/heat.PNG"),jimmy,bam);
        den = new Equipo("Denver Nuggets",new Image("sample/resources/denver.PNG"),jokic,jammal);
        tor = new Equipo("Toronto Raptors",new Image("sample/resources/raptors.PNG"),kl7,p);
    }

    @FXML
    private void abrirVentanaJugadores() {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("VentanaPlantilla.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            controllerJugadores = loader.getController();
            Scene scene = new Scene(root,650,500);
            stage.setScene(scene);
            stage.setTitle("Ventana 2");
            stage.show();
        } catch(Exception e) {
            System.out.println("No se ha podido abrir la segunda ventana, algo pasa.");
        }
    }

    @FXML
    public void pulsadoWarriors(){
        try{
            abrirVentanaJugadores();
            pasarInfoEquipo(gsw);
        } catch (Exception e){
           System.out.println("No se que pasa");
        }
    }

    @FXML
    public void pulsandoNets(){
        try{
            abrirVentanaJugadores();
            pasarInfoEquipo(bkn);
        } catch (Exception e){
            System.out.println("No se que pasa");
        }
    }

    @FXML
    public void pulsandoHeat(){
        try{
            abrirVentanaJugadores();
            pasarInfoEquipo(mia);
        } catch (Exception e){
            System.out.println("No se que pasa");
        }
    }

    @FXML
    public void pulsandoSuns(){
        try{
            abrirVentanaJugadores();
            pasarInfoEquipo(pho);
        } catch (Exception e){
            System.out.println("No se que pasa");
        }
    }

    @FXML
    public void pulsandoNuggets(){
        try{
            abrirVentanaJugadores();
            pasarInfoEquipo(den);
        } catch (Exception e){
            System.out.println("No se que pasa");
        }
    }

    @FXML
    public void pulsandoRaptors(){
        try{
            abrirVentanaJugadores();
            pasarInfoEquipo(tor);
        } catch (Exception e){
            System.out.println("No se que pasa");
        }
    }

    public void pasarInfoEquipo(Equipo equipo){
        controllerJugadores.imagenEquipo.setImage(equipo.imagen);
        controllerJugadores.nombreEquipo.setText(equipo.nombre);

        controllerJugadores.foto1.setImage(equipo.jugador.foto);
        controllerJugadores.foto2.setImage(equipo.jugador2.foto);

        controllerJugadores.nombreJ1.setText(equipo.jugador.nombre);
        controllerJugadores.nombreJ2.setText(equipo.jugador2.nombre);
    }
}

