package launch;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;

import test.TestOC;
import test.TestParser;

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

    public static void test() throws IOException, ClassNotFoundException
    {
        //TestOC.test();
        //TestOC.testAlbum();
        //TestOC.testListeAlbum();

        //TestParser.testAudioParser();
        //TestParser.testFileParser();
        //TestParser.testParser();
        //TestParser.recuperationAlbums();
        System.out.println(TestParser.getMusicDataMap(TestParser.getFoldersFilesMap()));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        launch(args);
        test();
    }
}
