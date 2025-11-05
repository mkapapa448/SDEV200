import java.math.BigInteger;

public class M1A2632_MarkKapapa {
    /**
     * 1. Double every second digit from right to left. 
       If doubling of a digit results in a two-digit number, add up the two digits to get a single-digit number.
       Now add all single-digit numbers from Step 1.

     * 2. Add all digits in the odd places from right to left in the card number.

     * 3. Sum the results from Step 2 and Step 3.

     * 4. If the result from Step 4 is divisible by 10, the card number is valid; otherwise, it is invalid. For example, the number 4388576018402626 is invalid, but the number 4388576018410707 is valid.

     * 5. Write a program that prompts the user to enter a credit card number as a long integer. Display whether the number is valid or invalid. Design your program to use the following methods:

    **/




    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        //4 for Visa cards
        //5 for Master cards
        //37 for American Express cards
        //6 for Discover cards
        switch (String.valueOf(number).charAt(0)) {
            case 4:
                System.out.println("Type: Visa");
            break;
            case 5:
                System.out.println("Type: Mastercard");
            break;
            case 6:
                System.out.println("Type: Discover card");
            break;
            case 3:
                if (Integer.valueOf(String.valueOf(number).charAt(1)) == 7)
                    System.out.println("Type: American Express");
            break;
        }

        int sum = 0;

        for (int i = String.valueOf(number).length() - 2; i > 0; i -= 2) {
            if (Integer.valueOf(String.valueOf(number).charAt(i)) * 2 >= 10)
                sum += Integer.valueOf(String.valueOf(number).charAt(i))*2 / 10 + Integer.valueOf(String.valueOf(number).charAt(i))*2 % 10;
            else
                sum += Integer.valueOf(String.valueOf(number).charAt(i))*2;
        }

        int sum2 = 0;
        for (int i = String.valueOf(number).length() - 1; i > 0; i -= 2) {
            sum2 += Integer.valueOf(String.valueOf(number).charAt(i));
        }

        int finalSum = sum2 + sum;
        
        
        if (finalSum % 10 == 0)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        //Scanner input = new Scanner(System.in);
        //System.out.print("Enter a number: ");

        //isValid(input.nextLong());

        //input.close();
        //System.out.println(isValid(4388576018402626));
    }
}