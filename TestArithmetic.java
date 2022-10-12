import java.util.*;
public class TestArithmetic {
    static Random r = new Random();
    static double[] data1 = {1.0,2.0,3.0};
    static double[] data2 = {4.0,5.0,6.0};
    public static void main(String[] args) {
        Node n = randOperator(
            randOperator(
                randTerminal(), randTerminal()),
            randOperator(
                randTerminal(), randTerminal())
        );
        System.out.println("Data1: "+n.toString()+" = "+n.eval(data1));
        System.out.println("Data2: "+n.toString()+" = "+n.eval(data2));
        System.out.println("Data1 values:\n\tX0 = "+data1[0]+"\n\tX1 = "+data1[1]+"\n\tX2 = "+data1[2]);
        System.out.println("Data2 values:\n\tX0 = "+data2[0]+"\n\tX1 = "+data2[1]+"\n\tX2 = "+data2[2]);
    }

    public static Node randOperator(Node left, Node right) {
        Node[] operators = {new Plus(left, right),new Minus(left, right),new Divide(left, right), new Mult(left, right)};
        return operators[r.nextInt(3)];
    }

    public static Node randConst() {
        double constant = r.nextInt(20)+1;
        return new Const(constant);
    }

    public static Node randVar() {
        int index = r.nextInt(2);
        return new Variable(index);
    }

    public static Node randTerminal() {
        int index = r.nextInt(2);
        switch(index) {
            case 0: 
            return randConst();
            case 1: 
            return randVar();
        }
        return null;
    }
}
