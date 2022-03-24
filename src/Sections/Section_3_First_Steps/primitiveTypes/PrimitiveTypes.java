package Sections.Section_3_First_Steps.primitiveTypes;

/**
 * This class is to learn about primitive types in Java. There are 8:
 * - boolean
 * - byte
 * - char
 * - short
 * - int
 * - long
 * - float
 */
public class PrimitiveTypes {

    public static void main(String[] args) {
        printTitle();
        
        printSeparator();
        
        // Integer MIN and MAX
        printMinIntValue();
        printMaxIntValue();
        
        printSeparator();
        
        // Byte MIN and MAX
        printMinByteValue();
        printMaxByteValue();
        
        printSeparator();

        // Short MIN and MAX
        printMinShortValue();
        printMaxShortValue();
        
        printSeparator();

        // Long MIN and MAX
        printMinLongValue();
        printMaxLongValue();

        printSeparator();
    }

    /**
     * Prints the Title of the execution
     */
    private static void printTitle() {
        System.out.println("Java primitive types MIN and MAX values");
    }

    /**
     * Prints a line separator between classes to make it more readable
     */
    private static void printSeparator() {
        System.out.println("************************************************");
    }

    /**
     * Prints the integer class MIN value
     */
    private static void printMinIntValue() {
        System.out.println("Integer MIN value: " + Integer.MIN_VALUE);
    }

    /**
     * Prints the integer class MAX value
     */
    private static void printMaxIntValue() {
        System.out.println("Integer MAX value: " + Integer.MAX_VALUE);
    }

    /**
     * Prints the Byte class MIN value
     */
    private static void printMinByteValue() {
        System.out.println("Byte MAX value: " + Byte.MIN_VALUE);
    }

    /**
     * Prints the Byte class MAX value
     */
    private static void printMaxByteValue() {
        System.out.println("Byte MAX value: " + Byte.MAX_VALUE);
    }

    /**
     * Prints the short class MIN value
     */
    private static void printMinShortValue() {
        System.out.println("Short MIN value: " + Short.MIN_VALUE);
    }

    /**
     * Prints the short class MAX value
     */
    private static void printMaxShortValue() {
        System.out.println("Short MAX value: " + Short.MAX_VALUE);
    }

    /**
     * Prints the long class MIN value
     */
    private static void printMinLongValue() {
        System.out.println("Long MIN value: " + Long.MIN_VALUE);
    }

    /**
     * Prints the long class MAX value
     */
    private static void printMaxLongValue() {
        System.out.println("Long MAX value: " + Long.MAX_VALUE);
    }
}
