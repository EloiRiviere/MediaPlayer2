/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

/**
 *
 * @author eloir
 */
public class Artiste
{
    String nom;

    public Artiste(String nom)
    {
        setNom(nom);
    }

    public String getNom() {
        return nom;
    }

    
    
    private void setNom(String nom) {
        this.nom = nom;
    }
    
    @Override
    
    public String toString()
    {
        return getNom();
    }
      
}
