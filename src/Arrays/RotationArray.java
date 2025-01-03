package Arrays;

/*Left Rotation by One Position
Right Rotation by One Position
Left Rotation by d Positions
Right Rotation by d Positions*/
public class RotationArray {
    // Left Rotation by One Position
    public static void leftRotateByOne(int[] array) {
        int first = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[array.length - 1] = first; // first --> last position
    }
    //Right Rotation by One Position
    public static void rightRotateByOne(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = array[array.length - 1];
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

    }
}
