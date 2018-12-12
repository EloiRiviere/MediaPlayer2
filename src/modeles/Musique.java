/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author eloir
 */
public class Musique
{
    private final StringProperty titre = new SimpleStringProperty();
        public String getTitre() {return titre.get();}
        public void setTitre(String titre) {this.titre.set(titre);}
        public StringProperty titreProperty(){return titre;}
        
   private final FloatProperty duree = new SimpleFloatProperty();
        public float getDuree() {return duree.get();}
        public void setDuree(float duree) {this.duree.set(duree);}
        public FloatProperty dureeProperty(){return duree;}
        
           
    public Musique(String titre, float duree)
    {
        setTitre(titre);
        setDuree(duree);
    }

    @Override
    
    public String toString()
    {
        return getTitre();
    }
    
}
