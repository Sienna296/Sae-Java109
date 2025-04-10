package graphe.Graphe.graphe;

public class Coord {
    public final int lignes;
    public final int colonnes;

    public Coord(int lignes, int colonnes) {
        this.lignes = lignes;
        this.colonnes = colonnes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coord)) return false;
        Coord c = (Coord) o;
        return lignes == c.lignes && colonnes == c.colonnes;
    }

    @Override
    public int hashCode() {
        return 31 * lignes + colonnes;
    }

    @Override
    public String toString() {
        return "(" + lignes + "," + colonnes + ")";
    }
}
