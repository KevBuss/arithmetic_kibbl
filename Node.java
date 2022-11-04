import java.util.*;

public abstract class Node implements Cloneable {
    public Node() {
    }

    public double eval(double[] data) {
        System.out.println("Eval method in node");
        return 0;
    }

    public String toString() {
        return "";
    }

    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("SimpleClass can't clone.");
        }
        return o;
    }

    public int mySize() {
        return 0;
    }

    public abstract void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand);
}
