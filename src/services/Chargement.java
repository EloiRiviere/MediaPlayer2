package services;

import java.io.*;

public class Chargement
{
    public static void chargementFichierSauvegarde(String cheminFichierSauvegarde) throws IOException, NullPointerException, ClassNotFoundException
    {
        String ligne;
        System.out.println("Lecture dans le fichier de sauvegarde :");
        try (ObjectInputStream lire = new ObjectInputStream(new FileInputStream(cheminFichierSauvegarde)))
        {
            ligne = (String) lire.readObject();
        }
        System.out.println(ligne);
    }
}
