package Sections.Section_3_First_Steps.primitiveTypes.Challenge;

/**
 * CHALLENGE
 * Your challenge is to create a byte variable and set it to any valid byte, it does
 * not matter. Create a short variable and set it to any short number.
 *
 * Create an int variable and set it to any valid int number. Lastly, create a variable
 * of type long nd make it equal to 50.000 plus 10 times the sum of the byte plus the short
 * plus the integer values.
 */
public class PrimitiveChallenge {

    public static void main(String[] args) {
        byte byteValue = 32;
        short shortValue = 400;
        int integerValue = 560000;
        long result = getLongResult(byteValue, shortValue, integerValue);

        System.out.println("The result is: " + result);
    }

    public static long getLongResult(byte byteValue, short shortValue, int integerValue) {
        return 50000 + 10 * (byteValue + shortValue + integerValue);
    }
}
