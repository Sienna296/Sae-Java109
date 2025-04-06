package graphe.Graphe;

import graphe.Graphe.graphe.Graphe.graphe.Coord;

public class Sommet extends Coord {

    private char tuile;

    public Sommet(int ligne, int colonne, char tuile) {
        super(ligne, colonne);
        this.tuile = ' ';
    }

    public char getTuile() {
        return tuile;
    }

    public void setTuile(char tuile) {
        this.tuile = tuile;
    }
}
