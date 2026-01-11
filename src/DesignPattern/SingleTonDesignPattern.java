package DesignPattern;

public class SingleTonDesignPattern {
    private static SingleTonDesignPattern instance;

    private SingleTonDesignPattern() {
        // private constructor to prevent instantiation
    }
    private void show(){
        System.out.println("Singleton instance method called.");
    }

    public static SingleTonDesignPattern getInstance() {
        if (instance == null) {
            instance = new SingleTonDesignPattern();

        }
        return instance;
    }

    public static void main(String[] args) {
        SingleTonDesignPattern instance = SingleTonDesignPattern.getInstance();
        SingleTonDesignPattern instance1 = SingleTonDesignPattern.getInstance();
        if (instance == instance1) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
        instance.show();
    }
}
