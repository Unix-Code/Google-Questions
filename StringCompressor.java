public class StringCompressor {
    public static String compress(String start) {
        char compare;
        char next;
        StringBuilder sb = new StringBuilder();
        int counter = 1;

        for (int i = 0; i < start.length(); i++) {
            compare = start.charAt(i);
            next = (i + 1 == start.length()) ? (char)0 : start.charAt(i + 1);
            if (next == compare) {
                counter++;
            }
            else if (next != compare && counter > 2) {
                sb.append(String.valueOf(counter) + "x" + compare);
                counter = 1;
            }
            else if (next != compare){
                sb.append(compare);
                if (counter == 2) {
                    sb.append(compare);
                }
                counter = 1;
            }
        }

        return sb.toString();
    }
}