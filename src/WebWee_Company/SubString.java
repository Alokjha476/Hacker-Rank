package WebWee_Company;

public class SubString {
    public static void main(String[] args) {
        String str = "WEBWEE";

        int n = str.length();
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <= n ; j++) {
                System.out.println(str.substring(i,j));
            }

        }
    }
}
