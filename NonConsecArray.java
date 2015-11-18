public class NonConsecArray {
    public int sum(int[] array) {
        int Sum = 0;
        int i = 0;
        int iTemp = 2;
        int tempSum = 0;
        
        while (i < array.length && iTemp < array.length) {
            if (i + iTemp > array.length - 1) {
                iTemp++;
                i = 0;
            }
            else {
                tempSum = array[i] + array[i + iTemp];
            }

            if (tempSum > Sum) {
                Sum = tempSum;
            }
            i++;
        } 

        return Sum;
    }
}