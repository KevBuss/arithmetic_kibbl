import java.util.*;

public class TerminalFactory {
    private int numIndepVars;

    TerminalFactory(int n) {
        numIndepVars = n;
    }

    public Node getTerminal(Random rand) {
        int randVar = rand.nextInt(numIndepVars + 1);
        double randConst = rand.nextDouble();
        if(randVar < numIndepVars) 
            return new Variable(randVar);
        else
            return new Const(randConst);
    }

    public int getNumIndepVars() {
        return numIndepVars;
    }
}
