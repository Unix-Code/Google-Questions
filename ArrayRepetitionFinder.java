import java.util.Date;
import java.util.Random;
public class ArrayRepetitionFinder {
    public static void main(String[] args) {
        
        int[] array = new int[10000000];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(9) + 1;
        }
        
        Date start = new Date();
        find(array);
        Date end = new Date();
        long duration = end.getTime() - start.getTime();
        System.out.println(duration);
        
        Integer[] array2 = new Integer[10000000];
        for (int i = 0; i < array.length; i++) {
            array2[i] = new Integer(array[i]);
        }
        
        start = new Date();
        find2(array2);
        end = new Date();
        duration = end.getTime() - start.getTime();
        System.out.println(duration);
        
    }
    
    public static int find(int[] array) {
        int counter = 1;
        int countTemp = 0;
        int iTemp = -1;
        Integer current;
        Integer next;

        for (int i = 0; i < array.length; i++) {
            current = array[i];
            next = (i + 1 == array.length) ? null : array[i + 1];
            if (next == current) {
                counter++;
            }
            else if (next != current && counter > 1) {
                if (counter > countTemp) {
                    iTemp = i - counter + 1;
                    countTemp = counter;
                }
                counter = 1;
            }
        }
        return iTemp;
    }

    public static int find2(Integer[] array) {
        int counter = 1;
        int countTemp = 0;
        int iTemp = 0;
        int retIndex = -1;
        Integer current = null;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == current) {
                counter++;
            }
            else {
                if (counter > countTemp) {
                    countTemp = counter;
                    retIndex = iTemp;
                }
                counter = 1;
                iTemp=i;
                current = array[i];
            }
        }
        if (counter > countTemp && retIndex != -1) {
            retIndex = iTemp;
        }
        return retIndex;
    }
}