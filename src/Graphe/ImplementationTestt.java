package Graphe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ImplementationTestt {

    @Test
    void ajoutersommet() {
        Implementation<String> graphe = new Implementation();
        graphe.ajoutersommet("A");
        graphe.ajoutersommet("B");
        graphe.ajoutersommet("C");
    }

    @Test
    void ajouterarc() {
        Implementation<String> graphe = new Implementation();
        graphe.ajouterarc("A","B",5);
        graphe.ajouterarc("B","C",3);
        graphe.ajouterarc("C","A",2);
    }

    @Test
    void getSucc() {
        Implementation<String> graphe = new Implementation();

        graphe.ajouterarc("A","B",5);
        graphe.ajouterarc("B","C",3);
        graphe.ajouterarc("C","A",2);

        List<Graphe.Arc<String>> succA = graphe.getSucc("A");
        List<Graphe.Arc<String>> succB = graphe.getSucc("B");
        List<Graphe.Arc<String>> succC = graphe.getSucc("C");

        assertEquals(1, succA.size());
        assertFalse(succA.contains("B"));

    }
}