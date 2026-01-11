package Exceptions;

public class MultipleExceptionHandler {
    public static void main(String[] args) {
        try{
            int i = 10/10;
            String s = null;
            System.out.println(s.length());

        }catch (ArithmeticException e){
            System.out.println("Exception handled: " + e);

        }
        catch (NullPointerException e){
            System.out.println("Exception handled: " + e);
        }
    }
}
