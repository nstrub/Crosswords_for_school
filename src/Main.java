import boggle.model.Boggle;
import boggle.model.ecouteurs.QuitEcouteur;
import boggle.model.vue.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        Boggle bog = new Boggle(4);
        BorderPane root = new BorderPane();
        //arrière plan


        //Grille
        VueLettres vuvu = new VueLettres(bog);
        root.setCenter(vuvu);
        root.setLeft(new VueTrouve(bog));
        //VueInfo
        root.setBottom(new VueInfo(bog));
        //PanneauControl
        root.setRight(new PanneauControle(bog)) ;
        //Menu déroulant
        root.setTop(new VueMenu(bog));

        //Ecran
        primaryStage.setTitle("BOGGLE");
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.show();

    }

    public static void main(String[] args){
        launch(args);
    }
}