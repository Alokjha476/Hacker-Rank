package Java_8.Functional_Interface;

public interface Calculator {
    int calculate(int a, int b);
    int  abc(int a , int b);

}

class implementation {
    public static void main(String[] args) {
       /* Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator div = (a, b) -> a / b;
        Calculator rem = (a, b) -> a % b;

        System.out.println(add.calculate(1, 2));
        System.out.println(sub.calculate(1, 2));
        System.out.println(add.calculate(1, 2));
        System.out.println(add.calculate(1, 2));*/

        Calculator calculator = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return 0;
            }

            @Override
            public int abc(int a, int b) {
                return 0;
            }

        };

        calculator.abc(2,4);

    }
}
