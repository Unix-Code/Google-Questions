import java.util.ArrayList;
public class SquareNumberSum {
    public static String summate(int start) {
        StringBuilder sb = new StringBuilder();
        int maxSquare = findLargestSquare(start);
        int sum = 0;

        while (sum < start) {
            maxSquare = findLargestSquare(start - sum);
            System.out.println(maxSquare);

            sb.append(String.valueOf(maxSquare) + " + ");
            sum += maxSquare;

            System.out.println("\nSum: " + sum);
        }
        //sb.delete(sb.length() - 3, sb.length());

        return sb.toString();
    }

    public static int findLargestSquare(int start) {
        int retSquare = 0;
        int itt = 0;

        while (Math.sqrt(Math.pow(Math.sqrt(retSquare) + 1, 2)) <= Math.sqrt(start)) {
            retSquare = (int)Math.pow(itt, 2);
            itt++;
        }

        return retSquare;
    }
}