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
public class Musique
{
    String titre;
    float duree;
    
    public Musique(String titre, float duree)
    {
        setTitre(titre);
        setDuree(duree);
    }

    public String getTitre() {
        return titre;
    }

    public float getDuree() {
        return duree;
    }

    private void setTitre(String titre) {
        this.titre = titre;
    }

    private void setDuree(float duree) {
        this.duree = duree;
    }
    
    @Override
    
    public String toString()
    {
        return getTitre();
    }
    
}
