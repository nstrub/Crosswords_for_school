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
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        Boggle bog = new Boggle(4);
        BorderPane root = new BorderPane();
        //Arrière plan
        BorderPane borderPane = new BorderPane();
        Image bkg = new Image("/background.jpg");
        ImageView bkgView = new ImageView(bkg);
        bkgView.setFitWidth(1000);
        bkgView.setFitHeight(700);
        root.getChildren().add(bkgView);

        //Grille
        root.setCenter(new VueLettres(bog));
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
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public static void main(String[] args){
        launch(args);
    }
}