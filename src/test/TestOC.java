package test;

import java.io.IOException;

import services.Chargement;
import services.Sauvegarde;

public class TestOC
{
    public static void testChargement() throws IOException, ClassNotFoundException
    {
        Chargement.chargementFichierSauvegarde("src/data/donnees.don");
    }

    public static void testSauvegarde() throws IOException, ClassNotFoundException
    {
        Sauvegarde.saisieEtSauvegardeDansFichier("src/data/donnees.don");
    }

    public static void test() throws IOException, ClassNotFoundException
    {
        testSauvegarde();
        testChargement();
    }
}
