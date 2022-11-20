package Problem81;

import java.util.*;

public class GPTree {
    private Node root;
    private double sum;

    /**
     * The default constructor for class GPTree
     */
    GPTree() {
        root = null;
    }

    /**
     * Overloading constructor for class GPTree
     * @param o the OperatorFactory object
     * @param t the TerminalFactory object
     * @param maxDepth the maximum depth allowed for the resulting tree
     * @param rand the Ramdom object
     */
    GPTree(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) {
        root = o.getOperator(rand);
        root.addRandomKids(o, t, maxDepth, rand);
    }

    /**
     * a method to create a string to represent the final equation
     * @return a string representing the equation that the GPTree represents
     */
    public String toString() {
        return root.toString();
    }

    /**
     * Calculates the fitness of the GPTree in relation to a provided data set
     * @param dset the set of information to calculate the fitness. Includes x values and resulting y values to compare to
     * @return the sum of differences representing the fitness
     */
    public double eval(ArrayList<DataRow> dset) {
        sum = 0;
        for(int i = 0; i < dset.size(); i++) {
            sum += (dset.get(i).y-root.eval(dset.get(i).x)*(dset.get(i).y-root.eval(dset.get(i).x)));
        }
        return sum;
    }

    /**
     * Calculates recursively the size of the GPTree
     * @return the number of nodes the GPTree contains
     */
    public int mySize() {
        return root.mySize();
    }
}
