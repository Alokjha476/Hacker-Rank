import java.io.FilterOutputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        int breakPoint = 2;
        // 65123
        int [] array1 = new int[array.length];
        array1[0] = array[array.length-1];
        for (int i = 0; i <array.length-1 ; i++) {
            array1[i+1] = array[i];

        }
        System.out.println(Arrays.toString(array1));


    }
}
