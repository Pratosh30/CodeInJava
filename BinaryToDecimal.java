
//write a java program to convert binary to decimal through recursion
import java.util.*;

public class BinaryToDecimal {
    public static int binaryToDecimal(String binary) {
        if (binary.isEmpty()) {
            return 0;
        } else {
            int lastDigit = binary.charAt(binary.length() - 1) - '0';
            String remainingBinary = binary.substring(0, binary.length() - 1);
            return lastDigit + 2 * binaryToDecimal(remainingBinary);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binary = sc.nextLine(); // example binary number
        int decimal = binaryToDecimal(binary);
        System.out.println("The decimal equivalent of " + binary + " is " + decimal);
    }
}