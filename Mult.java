import java.util.*;

public class Mult extends Binop {
    public Mult(Node l, Node r) {
        super(l, r);
    }

    public Mult() {
        super();
    }

    public double eval(double[] data) {
        return lChild.eval(data) * rChild.eval(data);
    }

    public String toString() {
        return "("+lChild.toString()+" * "+rChild.toString()+")";
    }
    public int mySize() {
        return 1+lChild.mySize()+rChild.mySize();
    }
}
