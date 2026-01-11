package Polymorphism;

import java.util.logging.Logger;

class Sum{
    private static final Logger logger = Logger.getLogger(Sum.class.getName());

    int sum(int a,int b){
        logger.info("Calculating sum of two integers: " + a + " + " + b);
        return a+b;

    }

    int sum(int a,int b, int c){
        logger.info("Calculating sum of three integers: " + a + " + " + b + " + " + c);
        return a+b+c;
    }


}
public class Overloading {
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println("The sum of two numbers: " + s.sum(5, 10));
        System.out.println("The sum of three numbers: " + s.sum(5, 10, 15));

    }
}
