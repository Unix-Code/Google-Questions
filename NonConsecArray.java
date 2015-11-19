public class NonConsecArray {
    public static int sum(int[] array) {
        int Sum = 0;
        int i = 0;
        int iTemp = 2;
        int tempSum = 0;

        while (iTemp < array.length) {
            if (i + iTemp > array.length - 1) {
                i = 0;
                iTemp++;
                System.out.println("Back to Beginning");
                System.out.println("iTemp: " + iTemp + "\ni: " + i);
                continue;
            }
            
            tempSum = array[i] + array[i + iTemp];
            System.out.println("tempSum: " + tempSum);
            System.out.println("Sum: " + Sum);

            if (tempSum > Sum) {
                Sum = tempSum;
            }

            i++;

        }

        return Sum;
    }
}