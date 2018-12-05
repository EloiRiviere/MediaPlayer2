/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launch;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

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

        primaryStage.setScene(new Scene(root,750,600));
        primaryStage.show();
        
    }
    
   
    @FXML
    public void gestionM (ActionEvent event) throws Exception {
       // Stage stage1 = new Stage();
        AnchorPane root2  = FXMLLoader.load(this.getClass().getClassLoader().getResource("ressources/ajouterMusique.fxml"));
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
