/**Module 1 Programming Assignment (2)
 * Mark Kapapa
 * 
 * Due: 11/3/2025
 */

//Example numbers:
//4388576018410707 (valid)
//4388576018402626 (invalid)

import java.util.Scanner;
public class M1A2632_MarkKapapa {

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        
        if (prefixMatched(number, 4) | prefixMatched(number, 5) | prefixMatched(number, 37) | prefixMatched(number, 6)) {
        } else {
            return false;
        }
        getSize(number);

        if (sum % 10 != 0) {
            return false;
        } 
        return true;
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {
        String numberString = String.valueOf(number);
        int sum = 0;

        for (int i = getSize(number) - 2; i >= 0; i -= 2) {
            char digitChar = numberString.charAt(i); 
            int digit = Character.getNumericValue(digitChar);
            digit *= 2;
            sum += getDigit(digit);
            // debugging stuff:
            //System.out.print(digitChar + " * 2 = ");
            //System.out.print(digit + " --> ");
            //System.out.println(getDigit(digit));
        }
        return sum;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number) {
        if (String.valueOf(number).length() == 1) {
            return number;
        } else {
            return number / 10 + number % 10;
        }
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {
        String numberString = String.valueOf(number);
        int sum = 0;

        for (int i = getSize(number) - 1; i > 0; i -= 2) {
            char digitChar = numberString.charAt(i); 
            int digit = Character.getNumericValue(digitChar);
            sum += getDigit(digit);
            // debugging stuff:
            //System.out.print(digitChar + " * 2 = ");
            //System.out.print(digit + " --> ");
            //System.out.println(getDigit(digit));
        }
        return sum;
    }

    /** Return true if the number d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {        
        if (d == getPrefix(number, d)) {
            return true;
        } else {
            return false;
        }
    }

    /** Return the number of digits in d */
    public static int getSize(long d) {
        String numberString = String.valueOf(d);
        return numberString.length();
    }

    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k) {

        String numberString = String.valueOf(number);
        String prefix = "";
        
        for (int i = 0; i < String.valueOf(k).length(); i++) {
            char digitChar = numberString.charAt(i);
            prefix += digitChar;
        }
        //System.out.println(prefix);
        return Long.parseLong(prefix);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----------------------------------------------\nTrustworthy Credit Card Number Validator*\n----------------------------------------------\n*We never sell your info.");
        System.out.print("\nEnter credit card number: ");

        long numba = input.nextLong();
        boolean result = isValid(numba);
        if (result == true) {
            System.out.println("Nice! The number " + numba + " is a valid credit card number.\n");
        } else {
            System.out.println(numba + " is an invalid card number :(\n");
        }

        //4388576018410707 (valid)
        //4388576018402626 (invalid)
        input.close();
        
    }
}
