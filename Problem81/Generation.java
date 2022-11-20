package Problem81;

/* Generated by Together */
import java.util.*;
import java.text.*;

/** A container of GPTrees. */
public class Generation {
    private int numTrees;
    private GPTree[] population;
    private double[] fitness;

    /** Specifies the number of GPTrees in this generation, the
    * factories used to generate the individual trees, the maximum tree depth,
    * and the Random object used. 
    */
    Generation(int numTrees, OperatorFactory o, TerminalFactory t, int m, Random r) {
        this.numTrees = numTrees;
        population = new GPTree[numTrees];
        for (int i = 0; i < numTrees; i++)
            population[i] = new GPTree(o, t, m, r);
    }

    /** Evaluate each tree in this generation, and set each tree's fitness value. */
    public void evalAll(ArrayList<DataRow> d) {
        fitness = new double[numTrees];
        for (int i = 0; i < numTrees; i++) {
            population[i].eval(d);
            fitness[i] = population[i].eval(d);
        }
    }

    /** Print the symbolicEval of each tree, and its fitness value. Very lengthy! */
    public void printAll(ArrayList<DataRow> d) {
        for (int i = 0; i < numTrees; i++) {
            System.out.println(population[i]);
            System.out.println("This tree's fitness is "
                +  NumberFormat.getInstance().format(population[i].eval(d)));
        }
    }

    /** Prints the tree with the lowest fitness value. */
    public void printBestTree() {
        Arrays.sort(fitness);
        //printAll();
        System.out.println("The smallest trees fitness was: "+fitness[0]);
    }
}