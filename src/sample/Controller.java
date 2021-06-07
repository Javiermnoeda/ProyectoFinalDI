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

    @FXML
    ImageView warriors,suns,spurs,nets,heat,raptors;

    ArrayList<Jugador> listaWarriors = new ArrayList<>();
    ArrayList<Jugador> listaSuns = new ArrayList<>();
    ArrayList<Jugador> listaSpurs = new ArrayList<>();
    ArrayList<Jugador> listaNets = new ArrayList<>();
    ArrayList<Jugador> listaHeat = new ArrayList<>();
    ArrayList<Jugador> listaRaptors = new ArrayList<>();

    @FXML
    public void initialize(){
        steph = new Jugador("Stephen Curry",false,"GSW","Base",30);
        klay = new Jugador("Klay Thompson",false,"GSW","Escolta",11);
        dbook = new Jugador("Devin Booker",false,"PHO","Escolta",1);
        cp3 = new Jugador("Chris Paul",false,"PHO","Base",3);
        jokic = new Jugador("Nikola Jokic",false,"DEN","Pivot",15);
        jammal = new Jugador("Jammal Murray",false,"DEN","Base",27);
        kd = new Jugador("Kevin Durant",false,"BKN","Alero",7);
        jh = new Jugador("James Harden",false,"BKN","Base",13);
        jimmy = new Jugador("Jimmy Butler",false,"MIA","Alero",22);
        bam = new Jugador("Bam Adebayo",false,"MIA","Pivot",13);
        kl7 = new Jugador("Kyle Lowry",false,"TOR","Base",7);
        p = new Jugador("Pascal Siakam",false,"TOR","Ala-Pivot",43);

        listaWarriors.add(steph);
        listaWarriors.add(klay);
        listaSuns.add(dbook);
        listaSuns.add(cp3);
        listaSpurs.add(jokic);
        listaSpurs.add(jammal);
        listaNets.add(kd);
        listaNets.add(jh);
        listaHeat.add(bam);
        listaHeat.add(jimmy);
        listaRaptors.add(kl7);
        listaRaptors.add(p);
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

            Image imagenEquipo = new Image("sample/resources/warriors.PNG");
            controllerJugadores.imagenEquipo.setImage(imagenEquipo);


            Image imagenJ2 = new Image("sample/resources/klay.PNG");
            Image imagenJ1 = new Image("sample/resources/curry.PNG");
            controllerJugadores.foto1.setImage(imagenJ1);
            controllerJugadores.foto2.setImage(imagenJ2);


            controllerJugadores.nombreEquipo.setText(steph.equipo);
            controllerJugadores.nombreJ1.setText(steph.nombre);
            controllerJugadores.nombreJ2.setText(klay.nombre);
        } catch (Exception e){
           System.out.println("No se que pasa");
        }
    }

    @FXML
    public void pulsandoNets(){
        try{
            abrirVentanaJugadores();

            Image imagenEquipo = new Image("sample/resources/nets.PNG");
            controllerJugadores.imagenEquipo.setImage(imagenEquipo);


            Image imagenDurant = new Image("sample/resources/kd.PNG");
            Image imagenHarden = new Image("sample/resources/harden.PNG");
            controllerJugadores.foto1.setImage(imagenDurant);
            controllerJugadores.foto2.setImage(imagenHarden);


            controllerJugadores.nombreEquipo.setText(kd.equipo);
            controllerJugadores.nombreJ1.setText(kd.nombre);
            controllerJugadores.nombreJ2.setText(jh.nombre);
        } catch (Exception e){
            System.out.println("No se que pasa");
        }
    }

    @FXML
    public void pulsandoHeat(){
        try{
            abrirVentanaJugadores();

            Image imagenEquipo = new Image("sample/resources/heat.PNG");
            controllerJugadores.imagenEquipo.setImage(imagenEquipo);


            Image imagenJ1 = new Image("sample/resources/jimmy.PNG");
            Image imagenJ2 = new Image("sample/resources/bam.PNG");
            controllerJugadores.foto1.setImage(imagenJ1);
            controllerJugadores.foto2.setImage(imagenJ2);


            controllerJugadores.nombreEquipo.setText(jimmy.equipo);
            controllerJugadores.nombreJ1.setText(jimmy.nombre);
            controllerJugadores.nombreJ2.setText(bam.nombre);
        } catch (Exception e){
            System.out.println("No se que pasa");
        }
    }

    @FXML
    public void pulsandoSuns(){
        try{
            abrirVentanaJugadores();

            Image imagenEquipo = new Image("sample/resources/suns.PNG");
            controllerJugadores.imagenEquipo.setImage(imagenEquipo);


            Image imagenJ1 = new Image("sample/resources/dbook.PNG");
            Image imagenJ2 = new Image("sample/resources/cp3.PNG");
            controllerJugadores.foto1.setImage(imagenJ1);
            controllerJugadores.foto2.setImage(imagenJ2);


            controllerJugadores.nombreEquipo.setText(dbook.equipo);
            controllerJugadores.nombreJ1.setText(dbook.nombre);
            controllerJugadores.nombreJ2.setText(cp3.nombre);
        } catch (Exception e){
            System.out.println("No se que pasa");
        }
    }

    @FXML
    public void pulsandoNuggets(){
        try{
            abrirVentanaJugadores();

            Image imagenEquipo = new Image("sample/resources/denver.PNG");
            controllerJugadores.imagenEquipo.setImage(imagenEquipo);


            Image imagenJ1 = new Image("sample/resources/jokic.PNG");
            Image imagenJ2 = new Image("sample/resources/jammal.PNG");
            controllerJugadores.foto1.setImage(imagenJ1);
            controllerJugadores.foto2.setImage(imagenJ2);


            controllerJugadores.nombreEquipo.setText(jokic.equipo);
            controllerJugadores.nombreJ1.setText(jokic.nombre);
            controllerJugadores.nombreJ2.setText(jammal.nombre);
        } catch (Exception e){
            System.out.println("No se que pasa");
        }
    }

    @FXML
    public void pulsandoRaptors(){
        try{
            abrirVentanaJugadores();

            Image imagenEquipo = new Image("sample/resources/raptors.PNG");
            controllerJugadores.imagenEquipo.setImage(imagenEquipo);


            Image imagenJ1 = new Image("sample/resources/kl7.PNG");
            Image imagenJ2 = new Image("sample/resources/pascal.PNG");
            controllerJugadores.foto1.setImage(imagenJ1);
            controllerJugadores.foto2.setImage(imagenJ2);


            controllerJugadores.nombreEquipo.setText(kl7.equipo);
            controllerJugadores.nombreJ1.setText(kl7.nombre);
            controllerJugadores.nombreJ2.setText(p.nombre);
        } catch (Exception e){
            System.out.println("No se que pasa");
        }
    }
}

