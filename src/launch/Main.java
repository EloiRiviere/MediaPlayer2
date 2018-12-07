package launch;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author leo
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        primaryStage.setTitle("MediaPlayer");
        
        BorderPane root = FXMLLoader.load(this.getClass().getClassLoader().getResource("ressources/accueil.fxml"));
        root.getStylesheets().add(getClass().getResource("/ressources/style.css").toExternalForm());

        primaryStage.setScene(new Scene(root,1200,700));
        primaryStage.show();
        
    }
    
   
    @FXML
    public void gestionM (ActionEvent event) throws Exception {
       // Stage stage1 = new Stage();
        BorderPane root2  = FXMLLoader.load(this.getClass().getClassLoader().getResource("ressources/ajouterMusique.fxml"));
        Stage stage1 = new Stage();
        stage1.setScene(new Scene(root2,400,400));
        stage1.setTitle("Ajouter une musique");
        stage1.show();
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
