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
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import modeles.Album;
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


    public List<Album> listeAlbums = TestMusique.getMediatheque();
    public ObservableList<String> observableListMusique = FXCollections.observableArrayList((ArrayList)listeAlbums);
    private ListProperty<String> listPropertyMusique = new SimpleListProperty<>(observableListMusique);
    @FXML
    ListView<String> listeViewL;
    @FXML
    public void initialize(URL location, ResourceBundle ressources)
    {
        listeViewL.itemsProperty().bind(listPropertyMusique);
        for (Album a: listeAlbums)
        {
            System.out.println(a.afficher());
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
