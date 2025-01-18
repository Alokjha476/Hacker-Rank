package OOPS;

interface Dogs {
    void sound();

    void run();

}

interface Cats {
    void sound();

}

interface Menna extends Dogs, Cats {
    @Override
    void sound();
}

class A implements Dogs, Cats, Menna {

    @Override
    public void sound() {
        System.out.println("Class A calling Interfaces");
    }

    @Override
    public void run() {
        System.out.println("Menna is running very fastly");
    }
}

public class Animals {
    public static void main(String[] args) {
        /*Menna menna = ()->{
            System.out.println("Menna is calling");
        };
        menna.sound();*/
        /*Cats cats = ()->{
            System.out.println("Cat is calling");
        };
        cats.sound();*/
       /* A a = new A();
        a.sound();
        a.run();*/



    }
}
