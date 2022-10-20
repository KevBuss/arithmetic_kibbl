import java.util.*;

public class OperatorFactory {
    private Node[] currentOps;

    OperatorFactory(Node[] n) {
        currentOps = n;
    }

    public Node getOperator(Random rand) {
        int random = rand.nextInt(getNumOps());
        return (Node)(currentOps[random].clone());
    }

    public int getNumOps() {
        return currentOps.length;
    }
}
