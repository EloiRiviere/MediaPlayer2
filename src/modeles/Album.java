/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eloir
 */

public class Album implements Serializable
{

    private final StringProperty nom = new SimpleStringProperty();
    public String getNom(){return nom.get();}
    public void setNom(String nom) {this.nom.set(nom);}
    public StringProperty nomProperty() {return nom;}

    List<Musique> pistes;

//    private ObservableList<Musique> pistes = FXCollections.observableArrayList();
//    private final ListProperty<Musique> liPistes=new SimpleListProperty<Musique>(pistes);
//    private ObservableList<Musique> getLiPistes(){return liPistes.get();}
//    public ListProperty<Musique> liPistesProperty(){return liPistes;}

    Artiste artiste;

    private final IntegerProperty annee = new SimpleIntegerProperty();
    public Integer getAnnee(){return annee.get();}
    public void setAnnee(Integer annee) {this.annee.set(annee);}
    public IntegerProperty anneeProperty() {return annee;}
    
    public Album(String nom, Artiste artiste, int annee)
    {
        setNom(nom);
        setArtiste(artiste);
        setAnnee(annee);
        setPistesVide();
    }


    public Artiste getArtiste() {
        return artiste;
    }

    public List<Musique> getPistes() {return pistes;}

    public List<Musique> getLiMusique()
    {
        return this.pistes;
    }
    
    public void ajouterPiste(Musique musique)
    {
        pistes.add(musique);
    }
    
    public void supprimerPiste(Musique musique)
    {
        pistes.remove(musique);
    }
    
    public void setAllPistes(ArrayList<Musique> allpistes)
    {
        this.pistes = allpistes;
    }

    private void setArtiste(Artiste artiste) {
        this.artiste = artiste;
    }

    private void setPistesVide()
    {
        this.pistes = FXCollections.observableArrayList();
    }

    public String afficher()
    {
        String desc = "Nom: "+getNom()+"\nArtiste: "+getArtiste()+"\nAnnée: "+getAnnee()+"\nPistes:\n  ";
        for (Musique m : getPistes())
        {
            desc = desc+m+"\n  ";
        }
        desc = desc+"\n";
        return desc;
    }


    @Override
    public String toString()
    {
        return getNom();
    }
    
}
