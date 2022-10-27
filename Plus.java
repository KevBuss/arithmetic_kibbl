import java.util.*;

public class Plus extends Binop {
    public Plus(Node l, Node r) {
        super(l, r);
    }

    public Plus() {
        super();
    }

    public double eval(double[] data) {
        return lChild.eval(data) + rChild.eval(data);
    }

    public String toString() {
        return "("+lChild.toString()+" + "+rChild.toString()+")";
    }
}
