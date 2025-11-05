public class M1A1_MarkKapapa {
    public static double footToMeter(double foot) {
        double meter = 0.305 * foot;
        return meter;
    }
    public static double meterToFoot(double meter) {
        double foot = 3.279 * meter;
        return foot;
    }
    public static String spaceFinder(double numba, int lengthh) {
        String space = "";
        for (int i = 0; i < lengthh; i++) {
            space += " ";
        }
        String amount = String.valueOf(numba);
        String spaces = space.substring(0, space.length() - amount.length());
        return spaces;
    }
    public static void main(String[] args) {

        System.out.println("\nFeet   Meters        Meters   Feet");
        System.out.println("------------------------------------"); 
        for (int i = 1; i < 11; i++) {
            int v = i*5 + 20;
            System.out.println(i + spaceFinder(i, 9) + footToMeter(i) + spaceFinder(footToMeter(i), 14) + v + spaceFinder(v, 11) + meterToFoot(v));
        
        }
        System.out.println("\n(Table made by using a function that subtracts the number length in the table from the subsequent spaces and outputs the correct space length.)\n");
        
    }
}