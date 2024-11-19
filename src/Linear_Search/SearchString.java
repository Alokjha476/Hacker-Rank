package Linear_Search;

public class SearchString {
    public static int findValue(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return i;
            }

        }
        return -1;

    }



    public static void main(String[] args) {
        String[] strings = {"apple", "peas", "banana", "carrot", "dunk", "zeb"};
        String value = "banana";

        int idx = findValue(strings, value);
        System.out.println(idx);
    }
}
