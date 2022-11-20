package Problem81;

import java.util.*;

public class Const extends Node {
    private double value;

    /**
     * Default constructor for class Const
     */
    public Const() {
    }

    /**
     * overloading constructor for class Const
     * @param d the value to be given to the Const Node
     */
    public Const(double d) {
        value = d;
    }

    /**
     * @param data an array containing the value of the constant to be used
     * @return the content of the Const Node
     */
    public double eval(double[] data) {
        return value;
    }

    /**
     * @return a string representing the constant value in the Node
     */
    public String toString() {
        return "" + value;
    }

    /**
     * AddRandomKids method inherited from abstract class Node
     * @param o the OperatorFactory object
     * @param t the TerminalFactory object
     * @param maxDepth the maximum depth allowed for the resulting tree
     * @param rand the Ramdom object
     */
    public void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) {

    }

    /**
     * Used to help calculate the size of the tree
     * @return a 1 to be added to the total size of the tree
     */
    public int mySize() {
        return 1;
    }
}
