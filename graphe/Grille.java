package graphe.Graphe.graphe;

import graphe.Graphe.graphe.Graphe;

import java.util.*;

public class Grille implements Graphe {
        private int lignes;
        private int colonnes;

    public Grille(int lignes) {
        this.lignes = lignes;
        this.colonnes = lignes;
    }

        private boolean estValide(int l, int c) {
            return l >= 0 && l < lignes && c >= 0 && c < colonnes;
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
            for (int l = 0; l < lignes; l++) {
                for (int c = 0; c < colonnes; c++) {
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
