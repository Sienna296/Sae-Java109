package Graphe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Implementation<T> implements Graphe<T> {
    //Hashmap pour stockezla matrice d'adjacence//
    // T designe le sommet et List Arc T designe les arcs sortant depuis ce sommet//
    private HashMap<T, List<Arc<T>>> m_adjacence;

    public Implementation() {
        this.m_adjacence = new HashMap<>();  // constructeur pour creer le  hashmap//
    }
    //Methode pour ajouter un Sommet//
    //(if Absent) va verifier si le sommet est dans la Hashmap//
    // si pas dedant methode ajoute avec liste vide d'arcs(essentielle pour prochaine methode ajout d'arc//
    // si dedant fais rien )
    public void ajoutersommet(T sommet){
        m_adjacence.putIfAbsent(sommet, new ArrayList<>());
    }

    public void ajouterarc(T src, T dst,int val){ //Voir classe arc pour ces param//
        ajoutersommet(src);
        ajoutersommet(dst);
        m_adjacence.get(src).add(new Arc<>(val,dst)); //prend la source puis lui ajoute un arc avec sa valuation puis sa destination//
    }
    @Override // redefini la mtehode parce que elle est deja presente dans l'interface graphe//
    public List<Arc<T>> getSucc(T s) {
        return m_adjacence.getOrDefault(s, Collections.emptyList());
        // va essayer de recuperer les sucesseurs de s(sommet) dans la Hashmap//
        //si il n'a pas de sucesseurs alors retourne une liste vide pour pas retourner null//
    }
}

