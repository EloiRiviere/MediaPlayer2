/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eloir
 */

public class Album
{

    String nom;
    List<Musique> pistes;
    Artiste artiste;
    int annee;
    
    public Album(String nom, Artiste artiste, int annee)
    {
        setNom(nom);
        setArtiste(artiste);
        setAnnee(annee);
        setPistesVide();
    }

    public String getNom() {
        return nom;
    }

    public Artiste getArtiste() {
        return artiste;
    }

    public int getAnnee() {
        return annee;
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

    
    
    
    private void setNom(String nom) {
        this.nom = nom;
    }

    private void setArtiste(Artiste artiste) {
        this.artiste = artiste;
    }

    private void setAnnee(int annee) {
        this.annee = annee;
    }

    private void setPistesVide()
    {
        this.pistes = new ArrayList<Musique>();
    }
    
    @Override
    
    public String toString()
    {
        String desc = "Nom: "+getNom()+"\nArtiste: "+artiste+"\nAnnée: "+annee+"\nPistes:\n  ";
        for (Musique m : pistes)
        {
            desc = desc+m+"\n  ";
        }
        desc = desc+"\n";
        return desc;
    }
    
}
