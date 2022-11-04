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
    // The following requires that you add the mySize() method
    // to Node and all its subclasses. Try it!
    // mySize will get number of nodes including the current node and all of its
    // child nodes.
    public int mySize() { return root.mySize(); }
}
