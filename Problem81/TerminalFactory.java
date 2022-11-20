package Problem81;

import java.util.*;

public class TerminalFactory {
    private int numIndepVars;

    /**
     * The constructor for the class TerminalFactory
     * @param n The number of independent variables to randomly choose from
     */
    TerminalFactory(int n) {
        numIndepVars = n;
    }

    /**
     * Randomly chooses whether the terminal should be a variable or a constant Node
     * @param rand the Random object
     * @return a Const or Variabnle Node object as a tree terminal
     */
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
