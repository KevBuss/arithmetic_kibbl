import java.util.*;

public class GPTree {
    private Node root;
    private int mySize;

    GPTree() {
        root = null;
    }

    GPTree(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) {
        root = o.getOperator(rand);
        root.addRandomKids(o, t, maxDepth, rand);
    }

    public String toString() {
        return root.toString();
    }

    public double eval(double[] data) {
        return root.eval(data);
    }
    public int mySize() { return root.mySize(); }
}
