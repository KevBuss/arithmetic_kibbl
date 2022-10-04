import java.util.*;
public class TestArithmetic {
    static Random r = new Random();
    public static void main(String[] args) {
        Node n = randOperator(
            randOperator(
                randConst(), randConst()),
            randOperator(
                randConst(), randConst())
        );
        System.out.println(n.toString()+" = "+n.eval());
    }

    public static Node randOperator(Node left, Node right) {
        Node[] operators = {new Plus(left, right),new Minus(left, right),new Divide(left, right), new Mult(left, right)};
        return operators[r.nextInt(3)];
    }

    public static Node randConst() {
        double constant = r.nextDouble(1,21);
        return new Const(constant);
    }
}
