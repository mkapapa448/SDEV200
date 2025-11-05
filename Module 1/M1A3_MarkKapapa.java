import java.util.Scanner;
public class M1A3_MarkKapapa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----------------------------------------------\n Two-Dimensional Array Identity Verifier\n----------------------------------------------\n");
        System.out.print("Enter m1 (a 3 by 3 matrix) row by row: ");
        String inputLine1 = input.nextLine();
        String[] numberStrings = inputLine1.split(" ");

        int[][] m1 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int v = 0; v < 3; v++) {
                m1[i][v] = Integer.parseInt(numberStrings[i*3 + v]);
            }
        }
        
        System.out.print("Enter m2 (a 3 by 3 matrix) row by row: ");
        inputLine1 = input.nextLine();
        numberStrings = inputLine1.split(" ");

        int[][] m2 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int v = 0; v < 3; v++) {
                m2[i][v] = Integer.parseInt(numberStrings[i*3 + v]);
            }
        }
        input.close();
        /* Used for testing
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
        */
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical!");
        } else {
            System.out.println("The two arrays are not identical");
        }
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
