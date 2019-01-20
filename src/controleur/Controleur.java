package controleur;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.util.List;

import modeles.Album;
import test.TestMusique;

public class Controleur
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

    //https://stackoverflow.com/questions/19588029/customize-listview-in-javafx-with-fxml#19632586


    @FXML
    private List<Album> Mediatheque = TestMusique.getMediatheque();
    public ObservableList<Album> listeViewMusique = FXCollections.observableArrayList(Mediatheque);
    @FXML ListView listeViewL = new ListView();

    @FXML
    void initialize()
    {
        listeViewL.setItems(listeViewMusique);
        //System.out.println(listeViewMusique);
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
