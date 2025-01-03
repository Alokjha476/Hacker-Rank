package strings.competition;

public class NumberPalindrome {
    public static void main(String[] args) {
        int number = 121;
        int newNumber = number;
        int rev = 0;
        while (number> 0){
            int rem = number%10;
            rev = rev*10+ rem;
            number=number/10;

        }
        System.out.println(rev);
        if (newNumber == rev){
            System.out.println("is Palindrome");
        }
        else {
            System.out.println("is not palindrome");
        }
    }
}
