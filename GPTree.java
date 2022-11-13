import java.util.*;

public class GPTree {
    private Node root;
    private int mySize;
    private double sum;

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

    public double eval(ArrayList<DataRow> dset) {
        sum = 0;
        for(int i = 0; i < dset.size(); i++) {
            sum += (dset.get(i).y-root.eval(dset.get(i).x)*(dset.get(i).y-root.eval(dset.get(i).x)));
        }
        return sum;
    }

    public int mySize() {
        return root.mySize();
    }
}
