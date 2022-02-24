import boggle.model.Boggle;
import boggle.model.ecouteurs.QuitEcouteur;
import boggle.model.vue.VueInfo;
import boggle.model.vue.VueLettres;
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
        //root.setBottom(new VueInfo(bog)); plus tard...

        //Grille
        root.setCenter(new VueLettres(bog)) ; //en cours..

        //VueInfo
        root.setBottom(new VueInfo(bog));

        //root.setRight(new PanneauControle(bog)) ; class pas encore crée

        //Ecran
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.show();

    }

    public static void main(String[] args){
        launch(args);
    }
}