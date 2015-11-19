public class NonConsecArray {
    public static int sum(int[] array) {
        int Sum = 0;
        int i = 0;
        int iTemp = 2;
        int tempSum = 0;

        while (iTemp < array.length) {
            tempSum = array[i] + array[i + iTemp];

            if (tempSum > Sum) {
                Sum = tempSum;
            }
            i++;

            if (i + iTemp > array.length - 1) {
                i = 0;
                iTemp++;
            }
        }

        return Sum;
    }
}