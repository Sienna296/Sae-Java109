package graphe.Graphe.graphe;

import graphe.Graphe;

import java.util.*;

public class Grille implements Graphe {

    private int ligne;
    private int colonne;

    public Grille(int ligne,int colonne) {
        this.ligne = ligne;
        this.colonne = colonne;
    }

        private boolean estValide(int l, int c) {
            return l >= 0 && l < ligne && c >= 0 && c < colonne;
        }

        @Override
        public List<Arc<Coord>> getSucc(Coord s) {
            List<Arc<Coord>> successeurs = new ArrayList<>();
            int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}}; // bas, haut, droite, gauche

            for (int[] dir : directions) {
                int nl = s.lignes + dir[0];
                int nc = s.colonnes + dir[1];
                if (estValide(nl, nc)) {
                    successeurs.add(new Arc<>(1, new Coord(nl, nc)));
                }
            }

            return successeurs;
        }

        public void afficherGraphe() {
            for (int l = 0; l < ligne; l++) {
                for (int c = 0; c < colonne; c++) {
                    Coord s = new Coord(l, c);
                    System.out.print(s + " → ");
                    for (Arc<Coord> arc : getSucc(s)) {
                        System.out.print(arc.dst() + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

}
