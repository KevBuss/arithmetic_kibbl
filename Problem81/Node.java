package Problem81;

import java.util.*;

public abstract class Node implements Cloneable {
    /**
     * the default constructor for the Node Class
     */
    public Node() {
    }

    /**
     * Abstract method defining eval
     * @param data an array containing the value of the Node
     * @return a double representing the value of the Node
     */
    public double eval(double[] data) {
        System.out.println("Eval method in node");
        return 0;
    }

    /**
     * A string representing the contents of the Node
     */
    public String toString() {
        return "";
    }

    /**
     * Creates a clone of the Node Object
     * @return the cloned Object
     */
    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("SimpleClass can't clone.");
        }
        return o;
    }

    /**
     * Used to help calculate the size of the tree
     * @return a value representing the size of the Node and it's children
     */
    public int mySize() {
        return 0;
    }

    /**
     * Abstract method defining adding random kids to a node
     * @param o the OperatorFactory object
     * @param t the TerminalFactory object
     * @param maxDepth the maximum depth allowed for the resulting tree
     * @param rand the Ramdom object
     */
    public abstract void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand);
}
