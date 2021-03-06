package test_data.utilities;

/**
 * @author Orestis Melkonian
 */
public final class Colors {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";

    public static void print(String color, Object obj) {
        System.out.print(color + obj + RESET);
    }
    public static void println(String color, Object obj) {
        System.out.println(color + obj + RESET);
    }
}
