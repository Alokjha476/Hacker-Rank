package Java_8.Functional_Interface;

public interface Calculator {
    int calculate(int a, int b);

}

class implementation {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator div = (a, b) -> a / b;
        Calculator rem = (a, b) -> a % b;

        System.out.println(add.calculate(1, 2));
        System.out.println(sub.calculate(1, 2));
        System.out.println(add.calculate(1, 2));
        System.out.println(add.calculate(1, 2));


    }
}
