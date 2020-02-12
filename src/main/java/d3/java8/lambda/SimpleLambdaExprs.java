package d3.java8.lambda;

import java.util.Comparator;
import java.util.TreeSet;


public class SimpleLambdaExprs {

    interface LambdaExprEmpty {
        void execute();
    }

    interface LambdaExprOneParameter {
        void execute(String str);
    }

    interface LambdaExprTwoParameter {
        void execute(String str, int perc);
    }

    interface BasicMaths {
        int operate(int x, int y);
    }

    public static void main(String[] args) {
        LambdaExprEmpty empty = () -> System.out.println("Deep");
        empty.execute();

        LambdaExprOneParameter oneParameter = (str) -> System.out.println(str);
        oneParameter.execute("Hello");

        LambdaExprTwoParameter twoParameter = (str, perc) -> System.out.println(str + perc);
        twoParameter.execute("good", 20);

        BasicMaths add = (x, y) -> x+y;
        BasicMaths multiply = (x,y) -> x*y;
        BasicMaths divide = (x,y) -> y!=0 ? x/y : 0;
        BasicMaths substract = (x,y) -> x-y;

        System.out.println("substract = " + add.operate(10, 5));
        System.out.println("multiply = " + multiply.operate(10, 5));
        System.out.println("divide = " + divide.operate(0, 5));
        System.out.println("substract = " + substract.operate(10, 5));

        TreeSet<Integer> h =
                new TreeSet<Integer>(Comparator.reverseOrder());
        h.add(850);
        h.add(235);
        h.add(1080);
        h.add(15);
        h.add(5);
        System.out.println("Elements of the TreeSet after" +
                " sorting are: " + h);
    }
}
