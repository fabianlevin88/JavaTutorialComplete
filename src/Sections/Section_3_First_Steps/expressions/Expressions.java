package Sections.Section_3_First_Steps.expressions;

/**
 * This class is to learn how to work with mathematical expressions and how they are calculated
 */
public class Expressions {

    public static void main(String[] args) {
        int expression1 = (10 + 5) + (2 * 5);
        int expression2 = (10 + (2 + 10/6) * 4);
        int expression3 = expression1 * 43;

        calculateExpressions(expression1, expression2, expression3);
    }

    /**
     * This method is only to print the value of some expressions being calculated
     * @param ex1
     * @param ex2
     * @param ex3
     */
    private static void calculateExpressions(int ex1, int ex2, int ex3) {
        System.out.println("The expression 1 is: " + ex1);
        System.out.println("The expression 2 is: " + ex2);
        System.out.println("The expression 3 is: " + ex3);
        System.out.println("Expression 1 + Expression 2 is: " + (ex1 + ex2));
        System.out.println("Expression 1 + Expression 2 + Expression 3 is: " + (ex1 + ex2 + ex3));
    }
}
