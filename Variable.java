import java.util.*;

public class Variable extends Node {
    private int variable;

    public Variable(int var) {
        variable = var;
    }

    public double eval(double[] data) {
        return data[variable];
    }

    public String toString() {
        return "X" + variable;
    }

    public void addRandomKids(OperatorFactory o, TerminalFactory t, int maxDepth, Random rand) {
    }
}
