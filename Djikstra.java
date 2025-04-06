package graphe.Graphe;

import java.util.ArrayList;

import java.util.HashMap;



public abstract class Djikstra implements Graphe{

    //private ArrayList<Sommet> sommets;

    private Hashmap<Ligne, Colonne>

    //ligne et colonne définissent le sommet
    private int Ligne;
    private int Colonne;

    private int depart;
    private int arrivee;



    public Djikstra(int depart, int arrivee, int Ligne, int Colonne) {
        this.depart = depart;
        this.arrivee = arrivee;
        sommets = new ArrayList<>();

    }

    public void algoDjikstra(int cpt) {
        //calcul du chemin le plus court
        for(int i = 0; i < sommets.size(); i++) {


        }
    }
}
