package test;

import java.util.ArrayList;
import java.util.List;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

import modeles.Album;
import modeles.Artiste;
import modeles.Musique;

import javax.print.attribute.standard.Media;
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


    public static List<Album> getMediatheque()
    {
        List<Album> Mediatheque = new ArrayList<>();

        Artiste mammoth_mammoth = new Artiste("Mammoth Mammoth");
        Artiste grand_magus = new Artiste("Grand Magus");


        Album mount_the_mountain = new Album("Mount The Mountain", mammoth_mammoth, 2017);
        List<Musique> mount_the_mountain_musiques = new ArrayList<Musique>()
        {
            {
                add(new Musique("Mount the Mountain", 6.27f));
                add(new Musique("Sellbound", 3.34f));
                add(new Musique("Hole in the Head", 4.29f));
                add(new Musique("Kickin'My Dog", 3.55f));
                add(new Musique("Procrastination", 3.36f));
                add(new Musique("Sleepwalker", 3.33f));
                add(new Musique("Epitome", 3.22f));
                add(new Musique("Hard Way Down", 3.26f));
                add(new Musique("Wild and Dead", 4.22f));
                add(new Musique("Cold Liquor", 3.31f));
                add(new Musique("Can't Get You Out of ...Head", 4.04f));
            }
        };
        mount_the_mountain.setAllPistes((ArrayList)mount_the_mountain_musiques);
//        System.out.println(mount_the_mountain);


        Album sword_song = new Album("Sword Song", grand_magus, 2016);
        List<Musique> sword_song_musiques = new ArrayList<Musique>()
        {
            {
                add(new Musique("Freja's Choice", 4.00f));
                add(new Musique("Varangian", 3.41f));
                add(new Musique("Forged In Iron", 5.38f));
                add(new Musique("Born FOr Battle", 3.41f));
                add(new Musique("Master Of The Land", 3.51f));
                add(new Musique("Last One To Fall", 4.00f));
                add(new Musique("Frost And Fire", 3.16f));
                add(new Musique("Hurg", 2.07f));
                add(new Musique("Every Day There's a Battle to Fight", 4.30f));
                add(new Musique("In for the Kill", 3.35f));
                add(new Musique("Stormbringer", 5.04f));
            }
        };
        sword_song.setAllPistes((ArrayList)sword_song_musiques);
//        System.out.println(sword_song);

        Mediatheque.add(getAlbum());
        Mediatheque.add(mount_the_mountain);
        Mediatheque.add(sword_song);
        return Mediatheque;
    }

    public static Album getAlbum()
    {
        Artiste alter_bridge = new Artiste("Alter Bridge");
        Album blackbird = new Album("Blackbird", alter_bridge, 2007);

        List<Musique> blackbird_musiques = new ArrayList<Musique>()
        {
            {
                add(new Musique("Ties That Bind", 3.19f));
                add(new Musique("Come To Life", 3.51f));
                add(new Musique("Brand New Start", 4.56f));
                add(new Musique("Buried Alive", 4.33f));
                add(new Musique("Coming Home", 4.22f));
                add(new Musique("Before Tomorrow Comes", 4.5f));
                add(new Musique("Rise Today", 4.21f));
                add(new Musique("Blackbird", 8.1f));
                add(new Musique("One By One", 4.17f));
                add(new Musique("Watch Over You", 4.16f));
                add(new Musique("Break Me Down", 3.57f));
                add(new Musique("White Knuckles", 4.25f));
                add(new Musique("Wayward One", 4.48f));
                add(new Musique("The Damage Done", 3.47f));
            }
        };

        blackbird.setAllPistes((ArrayList)blackbird_musiques);

        return blackbird;
    }
}
