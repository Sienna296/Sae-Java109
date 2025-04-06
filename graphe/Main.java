package graphe.Graphe.graphe;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        class Main {
            public static void main(String[] args) {
                int lignes = 5;
                int colonnes = 5;
                Grille graphe = new Grille(lignes, colonnes);

                System.out.println("=== Graphe Complet ===");
                graphe.afficherGraphe();

                Coord depart = new Coord(0, 0);
                Coord arrivee = new Coord(4, 4);
                List<Coord> chemin = graphe.Dijkstra();

                System.out.println("\n=== Chemin le plus court de " + depart + " à " + arrivee + " ===");
                for (Coord c : chemin) {
                    System.out.print(c + " ");
                }
            }
        }