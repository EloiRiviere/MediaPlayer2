package test;

import javafx.beans.property.ListProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
import modeles.Album;
import modeles.Musique;
import test.TestMusique;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Player {

    private Media media;
    private MediaPlayer mediaPlayer;

    private final ObjectProperty<Musique> enLecture = new SimpleObjectProperty<>();

    @FXML
    private Button prec;

    @FXML
    private Button pause;

    @FXML
    private Button play;

    @FXML
    private Button suiv;

    @FXML
    private Slider volume;

    @FXML
    private Slider progression;


    public Player() throws IOException
    {
        lecture(new Musique("Mount the Mountain", 6.27f, "/home/leo/Documents/2A/P2/java/mediaplayer2/src/image/U2.mp3"));
    }

//    List<Musique> testListe = new ArrayList<Musique>() {
//        {
//            add(new Musique("Mount the Mountain", 6.27f, null));
//        }
//    };
//    public ObservableList<Album> observableListMusique = FXCollections.observableArrayList((ObservableList)testListe);
//    private ListProperty<Album> listPropertyMusique = new SimpleListProperty<>(observableListMusique);


    public void initialize()
    {

//        enLecture.bind(listPropertyMusique);
//        enLecture.addListener((observable,oldValue,newValue) ->{
//            if(oldValue!=null)
//            {
//                pause();
//            }
//            if(newValue!=null)
//            {
//                lecture(newValue);
//            }
//        });



    }

    private void lecture(Musique m)
    {
        File f= new File(m.getUrl());
        //System.out.println(m.getUrl());
        media = new Media(f.toURI().toString());
        System.out.println(media);
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
        mediaPlayer.volumeProperty().bind(volume.valueProperty());

        mediaPlayer.setOnReady(new Runnable() {
            @Override
            public void run() {
                progression.setMin(0.0);
                progression.setValue(0.0);
                progression.setMax(media.getDuration().toMinutes());
            }
        });

        mediaPlayer.currentTimeProperty().addListener((observable,oldValue,newValue)->{
            if(newValue!=null)
            {
                progression.setValue(newValue.toMinutes());
            }
        });

        progression.setOnMouseClicked((event) ->{
            mediaPlayer.seek(Duration.minutes(progression.getValue()));
        });
    }

    private void pause()
    {
        mediaPlayer.pause();
    }

}
