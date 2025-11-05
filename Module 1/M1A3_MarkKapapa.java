import java.util.Scanner;
public class M1A3_MarkKapapa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------------------------------------\n Two-Dimensional Array Identity Verifier\n----------------------------------------------\n");
        System.out.print("Enter m1 (a 3 by 3 matrix) row by row: ");

        /* 
        long numba = input.nextLong();
        boolean result = isValid(numba);
        if (result == true) {
            System.out.println("Nice! The number " + numba + " is a valid credit card number.\n");
        } else {
            System.out.println(numba + " is an invalid card number :(\n");
        }*/
        input.close();

        int[][] array = {
            {51, 22, 25}, 
            {6, 1, 4}, 
            {24, 54, 6}
        };
        int[][] array2 = {
            {51, 22, 25}, 
            {6, 1, 4}, 
            {24, 54, 6}
        };

        System.out.println(equals(array, array2));
    }
    public static boolean equals(int[][] m1, int[][] m2) {        
        for (int i = 0; i < 3; i++) {
            for (int v = 0; v < 3; v++) {
                if (m1[i][v] != m2[i][v]) {
                    return false;
                }
            }
        }
        return true;
    }
}
