package Linear_Search;

public class MaxString {
    public static String maxString(String [] array){
        String maxString = array[0];
        for (String string : array) {
            if (maxString.compareTo(string) < 0) {
                maxString = string;
            }
        }
        return maxString;
    }
    public static void main(String[] args) {
        String[] strings = {"apple", "peas", "banana", "carrot", "dunk", "zeb"};
        String smallest = maxString(strings);
        System.out.println(smallest);

    }
}
