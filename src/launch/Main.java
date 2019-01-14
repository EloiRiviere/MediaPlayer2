package launch;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("MediaPlayer");
        
        BorderPane root = FXMLLoader.load(this.getClass().getClassLoader().getResource("ressources/accueil.fxml"));
        root.getStylesheets().add(getClass().getResource("/ressources/style2.css").toExternalForm());

        primaryStage.setScene(new Scene(root,1200,700));
        primaryStage.show();

}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
}
