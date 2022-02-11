import boggle.model.Boggle;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        Boggle bog = new Boggle(4);
        BorderPane root = new BorderPane();
        root.setBottom(new VueInfo(bog));
        root.setCenter(new VueLettres(bog)) ;
        root.setRight(new PanneauControle(bog)) ;
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.show();
    }
}
