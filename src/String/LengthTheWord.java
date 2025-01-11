package String;

public class LengthTheWord {
    public static int count(String str){
        String str2 = str.trim();
        String[] string = str2.split("[^a-zA-Z0-9]+");

        return string.length;

    }
    public static void main(String[] args) {
        String str = "     This is my @&*   Book      ";
        System.out.println(count(str));
    }
}
