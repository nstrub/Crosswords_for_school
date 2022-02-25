import boggle.model.Boggle;
import boggle.model.ecouteurs.QuitEcouteur;
import boggle.model.vue.PanneauControle;
import boggle.model.vue.VueInfo;
import boggle.model.vue.VueLettres;
import boggle.model.vue.VueTrouve;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        //Image background = new Image("/background.jpg",1000,700,false,true,true);
        //ImageView bkg = new ImageView(background);
        //root.getChildren().add(bkg);


        //Grille
        root.setCenter(new VueLettres(bog)) ;
        root.setLeft(new VueTrouve(bog));
        //VueInfo
        root.setBottom(new VueInfo(bog));
        //PanneauControl
        root.setRight(new PanneauControle(bog)) ;

        //Ecran
        primaryStage.setTitle("BOGGLE");
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.show();

    }

    public static void main(String[] args){
        launch(args);
    }
}