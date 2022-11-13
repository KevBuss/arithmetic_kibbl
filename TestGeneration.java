import java.util.*;

public class TestGeneration {
    static Random rand = new Random();
    public static void main(String[] args) {
        DataSet set = new DataSet("sample.txt");
        ArrayList<DataRow> data = set.createSet();
        Node[] ops = { new Plus(), new Minus(), new Mult(), new Divide() };
        OperatorFactory o = new OperatorFactory(ops);
        TerminalFactory t = new TerminalFactory(set.numIndepVars);
        
        Generation gen = new Generation(500, o, t, 3, rand);
        gen.evalAll(data);
        gen.printAll(data);
        gen.printBestTree();
    }
}
