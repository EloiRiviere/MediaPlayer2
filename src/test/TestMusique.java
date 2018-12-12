
import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import modeles.Album;
import modeles.Artiste;
import modeles.Musique;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eloir
 */
public class TestMusique
{
    private final ObjectProperty<Musique> mesMusiques = new SimpleObjectProperty<>(new Musique("Ties That Bind",3.19f));
        public final Musique getMusique(){return mesMusiques.get();}
        public final void setMusique(Musique value) {mesMusiques.set(value);}
        public ObjectProperty<Musique> mesMusiquesProperty() {return mesMusiques;}
    
    
    
    
    
    
    Artiste alter_bridge = new Artiste("Alter Bridge");
    Album blackbird = new Album("Blackbird",alter_bridge,2007);
    List<Musique> musiques = new ArrayList<Musique>()
    {
	{
            add(new Musique("Ties That Bind",3.19f));
            add(new Musique("Come To Life",3.51f));
            add(new Musique("Brand New Start",4.56f));
            add(new Musique("Buried Alive",4.33f));
            add(new Musique("Coming Home",4.22f));
            add(new Musique("Before Tomorrow Comes",4.5f));
            add(new Musique("Rise Today",4.21f));
            add(new Musique("Blackbird",8.1f));
            add(new Musique("One By One",4.17f));
            add(new Musique("Watch Over You",4.16f));
            add(new Musique("Break Me Down",3.57f));
            add(new Musique("White Knuckles",4.25f));
            add(new Musique("Wayward One",4.48f));
            add(new Musique("The Damage Done",3.47f));
	}
    };
    //blackbird.setAllPistes(musiques);
    //System.out.println(blackbird);   
}
