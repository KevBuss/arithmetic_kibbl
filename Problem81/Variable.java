package Problem81;

import java.util.*;

public class Variable extends Node {
    private int variable;

    /**
     * The constructor for the Variable class
     * @param var the random variable assigned by the TerminalFactory class
     */
    public Variable(int var) {
        variable = var;
    }

    /**
     * @param data an array containing the value of the x variable
     * @return the content of the Variable Node
     */
    public double eval(double[] data) {
        return data[variable];
    }

    /**
     * @return a string representing which variable is used
     */
    public String toString() {
        return "X" + variable;
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
