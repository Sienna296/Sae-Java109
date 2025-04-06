import graphe.Graphe.graphe.Graphe;

import java.util.*;

public class Dijkstra {

    public static <T> List<T> dijkstra() {
        Map<T, Integer> distances = new HashMap<>();
        Map<T, T> predecesseurs = new HashMap<>();
        PriorityQueue<T> file = new PriorityQueue<>(Comparator.comparingInt(distances::get));
        Set<T> visites = new HashSet<>();

        distances.put(depart, 0);
        file.add(depart);

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

