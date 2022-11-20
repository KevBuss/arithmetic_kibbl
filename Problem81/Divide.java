package Problem81;

import java.util.*;

public class Divide extends Binop {
    /**
     * The overloading constructor for the Divide Class
     * @param l the left child Node
     * @param r the right child Node
     */
    public Divide(Node l, Node r) {
        super(l, r);
    }

    /**
     * The default constructor for the Divide Class
     */
    public Divide() {
        super();
    }

    /**
     * Divides the result of the left childs eval with the right childs eval
     * @return a double representing the Division of the right and left childeren
     */
    public double eval(double[] data) {
        return lChild.eval(data) / rChild.eval(data);
    }

    /**
     * @return a string representing the equation representing the left and right Children
     */
    public String toString() {
        return "("+lChild.toString()+" / "+rChild.toString()+")";
    }

    /**
     * Used to help calculate the size of the tree
     * @return the sum of the left and right childrens sizes
     */
    public int mySize() {
        return 1+lChild.mySize()+rChild.mySize();
    }
}

