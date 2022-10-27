import java.util.*;

public class Minus extends Binop{
    public Minus(Node l, Node r) {
        super(l,r);
    }

    public Minus() {
        super();
    }

    public double eval(double[] data) {
        return lChild.eval(data) - rChild.eval(data);
    }

    public String toString() {
        return "("+lChild.toString()+" - "+rChild.toString()+")";
    }
}
