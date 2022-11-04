import java.util.*;

public class Binop extends Node {
    protected Node lChild, rChild;
    protected int depth = 0;

    public Binop(Node l, Node r) {
        lChild = l;
        rChild = r;
        depth = 0;
    }

    public Binop() {
        lChild = null;
        rChild = null;
    }

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
    public int mySize() {
        return 1+lChild.mySize()+rChild.mySize();
    }
}
