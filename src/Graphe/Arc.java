package Graphe;

public class Arc<T> {
    private T src; //souce//
    private T dst; //destination//
    private int val; //valeur//

    public Arc(T src, T dst, int val) { //constructeur//
        this.src = src;
        this.dst = dst;
        this.val = val;
    }

    public T getSrc() { //getter src//
        return src;
    }

    public T getDst() { //gettetdst//
        return dst;
    }

    public int getVal() { //getterval//
        return val;
    }
}
