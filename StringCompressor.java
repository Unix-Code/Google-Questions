import java.util.ArrayList;
public class StringCompressor {
    public static String compress(String start) {
        char compare;
        char next;
        char previous;
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        
        for (int i = 0; i < start.length(); i++) {
            compare = start.charAt(i);
            next = (i + 1 == start.length()) ? (char)0 : start.charAt(i + 1);
            previous = (i == 0) ? (char)0 : start.charAt(i - 1);
            if (next == compare) {
                counter++;
            }
            else if (next != compare && compare == previous) {
                sb.append(String.valueOf(counter + 1) + "x" + compare);
                counter = 0;
            }
            else if (next != compare && compare != previous){
                sb.append(compare);
            }
        }
        
        return sb.toString();
    }
}