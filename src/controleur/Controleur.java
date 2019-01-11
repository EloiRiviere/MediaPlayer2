package controleur;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Callback;
import modeles.Album;
import modeles.Musique;
import test.TestMusique;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class Controleur
{
    @FXML
    public void gestionM (ActionEvent event) throws Exception
    {
        // Stage stage1 = new Stage();
        BorderPane root2  = FXMLLoader.load(this.getClass().getClassLoader().getResource("ressources/ajouterMusique.fxml"));
        Stage stage1 = new Stage();
        stage1.setScene(new Scene(root2,400,400));
        stage1.setTitle("Ajouter une musique");
        stage1.show();
    }

    //https://stackoverflow.com/questions/19588029/customize-listview-in-javafx-with-fxml#19632586

    private ObservableList<Musique> liMusique= FXCollections.observableArrayList();
    private final ListProperty<Musique> liMusiqueP=new SimpleListProperty<>(liMusique);

    @FXML
    private List<Album> Mediatheque = TestMusique.getMediatheque();
    public ObservableList<Album> listeViewMusique = FXCollections.observableArrayList(Mediatheque);

    @FXML
    public void comboBox (ActionEvent event) throws Exception
    {
        System.out.println(liMusiqueP);
    }




}
