package Problem81;

import java.util.*;

public class OperatorFactory {
    private Node[] currentOps;

    /**
     * Constructor for the class OperatorFactory
     * @param n an array of operation objects available
     */
    OperatorFactory(Node[] n) {
        currentOps = n;
    }

    /**
     * Provides a random operator to include in the GPTree
     * @param rand the Random object
     * @return a random Node representing a mathematical operation
     */
    public Node getOperator(Random rand) {
        int random = rand.nextInt(getNumOps());
        return (Node)(currentOps[random].clone());
    }

    /**
     * Provides the number of operations available
     * @return the number of operations in the provided operation array
     */
    public int getNumOps() {
        return currentOps.length;
    }
}
