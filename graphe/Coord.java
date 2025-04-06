package graphe.Graphe.graphe;

public class Coord {
    public final int ligne;
    public final int colonne;

    public Coord(int ligne, int colonne) {
        this.ligne = ligne;
        this.colonne = colonne;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coord)) return false;
        Coord c = (Coord) o;
        return ligne == c.ligne && colonne == c.colonne;
    }

    @Override
    public int hashCode() {
        return 31 * ligne + colonne;
    }

    @Override
    public String toString() {
        return "(" + ligne + "," + colonne + ")";
    }
}
