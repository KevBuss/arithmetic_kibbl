package Problem81;

import java.util.*;

public class Binop extends Node {
    protected Node lChild, rChild;
    protected int depth = 0;

    /**
     * Overloading constructor for Binop Class
     * @param l a Node variable to be set to the left child
     * @param r a Node variable to be set to the right child
     */
    public Binop(Node l, Node r) {
        lChild = l;
        rChild = r;
        depth = 0;
    }

    /**
     * The default constructor for Binop Class
     */
    public Binop() {
        lChild = null;
        rChild = null;
    }

    /**
     * Sets the left and right children for a Binop node. Randomly determines whether this should be an operator or a terminal unless the depth has reached its max depth.
     * @param o the OperatorFactory object
     * @param t the TerminalFactory object
     * @param maxDepth the maximum depth allowed for the resulting tree
     * @param rand the Ramdom object
     */
    public void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) {

        // Determine lChild
        if (depth == maxDepth) {
            lChild = t.getTerminal(rand);
        } 
        else {
            int operator = rand.nextInt(o.getNumOps() + t.getNumIndepVars());
            if (operator < o.getNumOps()) {
                Binop op = (Binop)o.getOperator(rand);
                op.depth = 1+this.depth;
                lChild = op;
                lChild.addRandomKids(o, t, maxDepth, rand);
            }
            else {
                lChild = t.getTerminal(rand);
            }
        }

        // Determine rChild
        if (depth == maxDepth) {
            rChild = t.getTerminal(rand);
        } 
        else {
            int operator = rand.nextInt(o.getNumOps() + t.getNumIndepVars());
            if (operator < o.getNumOps()) {
                Binop op = (Binop)o.getOperator(rand);
                op.depth = 1+this.depth;
                rChild = op;
                rChild.addRandomKids(o, t, maxDepth, rand);
            }
            else {
                rChild = t.getTerminal(rand);
            }
        }
    }

    /**
     * Used to help calculate the size of the tree
     * @return the sum of the left and right childrens sizes
     */
    public int mySize() {
        return 1+lChild.mySize()+rChild.mySize();
    }
}
