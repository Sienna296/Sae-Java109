package graphe.Graphe.graphe;

import graphe.Graphe.graphe.Graphe;

import java.util.*;

public class Dijkstra {

    public static <T> List<T> dijkstra() {
        Map<T, Integer> distances = new HashMap<>();
        Map<T, T> predecesseurs = new HashMap<>();
        PriorityQueue<T> file = new PriorityQueue<>(Comparator.comparingInt(distances::get));
        Set<T> visites = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez ligne de départ : "); //bon jsp comment sera fait le graphe mais c'est pour me donner
        // une visu plus claire du truc donc je demande a l'utilisateur de saisir le début et l'arrivée
        int lDepart = scanner.nextInt();
        System.out.print("Entrez colonne de départ : ");
        int cDepart = scanner.nextInt();

        System.out.print("Entrez ligne d’arrivée : ");
        int lArrivee = scanner.nextInt();
        System.out.print("Entrez colonne d’arrivée : ");
        int cArrivee = scanner.nextInt();

        Coord depart = new Coord(lDepart, cDepart);
        Coord arrivee = new Coord(lArrivee, cArrivee);

        private int MAX_LIGNES;
        private int MAX_LIGNES;
        if (lDepart < 0 || lDepart >= MAX_LIGNES || cDepart < 0 || cDepart >= MAX_LIGNES) {
            System.out.println("Départ invalide !");
            return;
        }

        if (lArrivee < 0 || lArrivee >= MAX_LIGNES || cArrivee < 0 || cArrivee >= MAX_LIGNES) {
            System.out.println("Arrivée invalide !");
            return;
        }


        while (!file.isEmpty()) {
            T courant = file.poll();

            if (courant.equals(arrivee)) break;

            if (visites.contains(courant)) continue;
            visites.add(courant);

            for (Graphe.Arc<T> arc : graphe.getSucc(courant)) {
                T voisin = arc.dst();
                int nouvelleDistance = distances.get(courant) + arc.val();

                if (!distances.containsKey(voisin) || nouvelleDistance < distances.get(voisin)) {
                    distances.put(voisin, nouvelleDistance);
                    predecesseurs.put(voisin, courant);
                    file.add(voisin);
                }
            }
        }

        // Reconstruire le chemin
        List<T> chemin = new LinkedList<>();
        T courant = arrivee;
        while (courant != null && predecesseurs.containsKey(courant)) {
            chemin.add(0, courant);
            courant = predecesseurs.get(courant);
        }
        if (courant != null && courant.equals(depart)) {
            chemin.add(0, depart);
        }

        return chemin;
    }
}

