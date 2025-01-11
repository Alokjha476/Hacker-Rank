package String;

import java.util.Arrays;

public class FindAllOccurrence {
    public static StringBuilder findOccurrence(String string) {
        StringBuilder sb = new StringBuilder(" ");
        char[] sch = string.toCharArray();
        Arrays.sort(sch);
        for (int i = 0; i < sch.length; i++) {
            int count = 1;
            while (i < sch.length - 1 && sch[i] == sch[i + 1]) {
                count++;
                i++;
            }
            sb.append(sch[i]).append(count);
        }

        return sb;
    }

    public static void main(String[] args) {
        String str = "aallokayy"; // a2l2o1k1a1y2
        System.out.println(findOccurrence(str));


    }
}
