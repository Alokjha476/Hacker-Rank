package WebWee_Company;

public class SingletonClass {
    // Class instance variable
    private static SingletonClass instance;
    // constructor
    private SingletonClass() {
        System.out.println("Singleton class is calling: ");
    }
    private void show() {
        System.out.println("is calling");
    }
    // method
    public static SingletonClass getInstance() {
        if (instance == null) {
            synchronized (SingletonClass.class) {
                if (instance == null) {
                    instance = new SingletonClass();
                }
            }
        }
        return instance;
    }
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        singletonClass.show();
        if (singletonClass1 == singletonClass) {
            System.out.println("Both is calling same ");
        } else {
            System.out.println("Not calling same instance");
        }

    }
}
