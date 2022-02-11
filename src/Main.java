import boggle.model.Boggle;
import boggle.model.vue.VueLettres;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        Boggle bog = new Boggle(4);
        BorderPane root = new BorderPane();
        //root.setBottom(new VueInfo(bog)); plus tard...
        root.setCenter(new VueLettres(bog)) ; //en cours...
        //root.setRight(new PanneauControle(bog)) ; class pas encore crée
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}