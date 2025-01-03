package strings;

/* reverse string 4 types
 toChatArray();
charAt(int index);
reverse(); method in String Builder and Buffer*/
public class Reverse {
    // By toCharArray();
    public static void byToCharArray(String string) {
        char[] ch = string.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {

            System.out.print(ch[i]);
        }

    }

    public static void byIndex(String string){
        for (int i = string.length()-1; i >= 0 ; i--) {
            System.out.print(string.charAt(i));
        }

    }
    public static String byStringBuilder(String string){
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        return sb.toString();
    }


    public static void main(String[] args) {
        String str = "Hello";
        byToCharArray(str);
        System.out.println();
        byIndex(str);
        System.out.println();
        System.out.println(byStringBuilder(str));
    }
}
