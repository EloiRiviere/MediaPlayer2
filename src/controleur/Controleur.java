package controleur;

import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import modeles.Album;
import modeles.Musique;
import test.Player;
import test.TestMusique;

public class Controleur implements Initializable
{
    @FXML
    public void gestionM (ActionEvent event) throws Exception
    {
        BorderPane root2  = FXMLLoader.load(this.getClass().getClassLoader().getResource("ressources/ajouterMusique.fxml"));
        root2.getStylesheets().add(getClass().getResource("/ressources/style2.css").toExternalForm());
        Stage stage1 = new Stage();
        stage1.setScene(new Scene(root2,600,400));
        stage1.setTitle("Ajouter une musique");
        stage1.show();
    }

    @FXML
    ListView<Album> listeViewL;
    @FXML
    ListView<Musique> listeViewM;
    @FXML
    TextArea textArea;

    public List<Album> listeAlbums = TestMusique.getMediatheque();
    public ObservableList<Album> observableListALbum = FXCollections.observableArrayList((ArrayList)listeAlbums);
    private ListProperty<Album> listPropertyAlbum = new SimpleListProperty<>(observableListALbum);

    @FXML
    public void initialize(URL location, ResourceBundle ressources)
    {
        listeViewL.itemsProperty().bind(listPropertyAlbum);


        listeViewL.getSelectionModel().selectedItemProperty().addListener((observable,oldV,newV)->
        {
            if(oldV!=null)
            {
//                textArea.textProperty().bind(oldV.nomProperty());
                List<Musique> listeMusiques = newV.getPistes();
                ObservableList<Musique> observableListMusiques = FXCollections.observableArrayList((ArrayList)listeMusiques);
                ListProperty<Musique> listPropertyMusiques = new SimpleListProperty<>(observableListMusiques);
                listeViewM.itemsProperty().bind(listPropertyMusiques);
            }
            if(newV!=null)
            {
//                textArea.textProperty().bind(newV.nomProperty());
                List<Musique> listeMusiques = newV.getPistes();
                ObservableList<Musique> observableListMusiques = FXCollections.observableArrayList((ArrayList)listeMusiques);
                ListProperty<Musique> listPropertyMusiques = new SimpleListProperty<>(observableListMusiques);
                listeViewM.itemsProperty().bind(listPropertyMusiques);
            }
            else
            {
                List<Musique> listeMusiques = newV.getPistes();
                ObservableList<Musique> observableListMusiques = FXCollections.observableArrayList((ArrayList)listeMusiques);
                ListProperty<Musique> listPropertyMusiques = new SimpleListProperty<>(observableListMusiques);
                listeViewM.itemsProperty().bind(listPropertyMusiques);
            }
        });

        for (Album a: listeAlbums)
        {
            System.out.println(a.afficher());
        }
    }

    @FXML
    public void play (ActionEvent event)
    {
        try{
            Player player = new Player();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


//    public void initList (ActionEvent event) throws Exception
//    {
//
//        listeViewL.setCellFactory(new Callback<ListView<String>, javafx.scene.control.ListCell<String>>()
//        {
//            @Override
//            public ListCell<String> call(ListView<String> listeViewL)
//            {
//                return new ListCell();
//            }
//        });
//
//    }

}
