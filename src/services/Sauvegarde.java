package services;

import java.io.*;

public class Sauvegarde
{
    public static void saisieEtSauvegardeDansFichier(String cheminFichierSauvegarde) throws IOException
    {
        InputStreamReader fluxEntree = new InputStreamReader(System.in);
        BufferedReader lecteur = new BufferedReader(fluxEntree);
        try(ObjectOutputStream transfert = new ObjectOutputStream(new FileOutputStream(cheminFichierSauvegarde)))
        {
            System.out.println("Saisir un truc au clavier :");
            String lu = lecteur.readLine();
            System.out.println("Vous avez écrit : " + lu);
            transfert.writeObject(lu);
            System.out.println("Sauvegarde effectuée.");
        }
    }
}
