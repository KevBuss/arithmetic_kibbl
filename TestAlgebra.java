import java.util.*;

public class TestAlgebra {
    static int numIndepVars = 3;
    static int maxDepth = 5;
    static Random rand = new Random();

    public static void main(String[] args) {
        double[] data = { 3.14, 2.78, 1.0 };
        Node[] ops = { new Plus(), new Minus(), new Mult(), new Divide() };
        OperatorFactory o = new OperatorFactory(ops);
        TerminalFactory t = new TerminalFactory(numIndepVars);
        GPTree gpt = new GPTree(o, t, maxDepth, rand);
        System.out.println(gpt + " = " + gpt.eval(data));
        System.out.println("\nThe tree has "+gpt.mySize()+" nodes.");
    }
}
