package Polymorphism;
class Sub {
    int sub(int a, int b) {
        return a + b;
    }
}
class Sub2 extends  Sub {
    @Override
    int sub(int a, int b) {
        return a - b;
    }
}

public class Overriding {
    public static void main(String[] args) {
       Sub s = new Sub();
       s.sub(10, 5); // Calls Sub's sub method
         Sub2 s2 = new Sub2();
         s2.sub(10, 5);
        System.out.println(s.sub(10, 5));
        System.out.println(s2.sub(10, 5));
    }
}
