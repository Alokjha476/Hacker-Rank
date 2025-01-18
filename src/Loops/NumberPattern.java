package Loops;

public interface NumberPattern {
    static void main(String[] args) {
        /*for (int i = 1; i <=26 ; i+=5) {
            for (int j = i; j <= 4+i ; j++) {
                System.out.print(j + "    ");
            }
            System.out.println();
        }*/

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println();
            }


        }
    }
}
