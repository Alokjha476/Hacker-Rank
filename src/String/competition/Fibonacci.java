package String.competition;

public class Fibonacci {
    public static int fibonacci(int num) {
        // base case
        if (num == 0 || num == 1) {
            return num;
        } else {
            int sn1 = fibonacci(num - 1);
            int sn2 = fibonacci(num - 2);

            return sn1 + sn2;

        }


    }
    public static void main(String[] args) {
        // 0,1,1,2,3,5,8,13
        int num = 7;
        for (int i = 0; i <num ; i++) {
            System.out.println(fibonacci(i) + " ");

        }



    }
}
