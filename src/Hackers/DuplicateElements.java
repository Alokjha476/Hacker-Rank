package Hackers;


public class DuplicateElements {
    public static void duplicatesInArray(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                System.out.print(array[i] + " ");
            }
            while (i < array.length - 1 && array[i] == array[i - 1]) {
                i++;
            }
        }
    }

    public static StringBuilder duplicateInString(String element) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < element.length(); i++) {
            int count = 1;
            while (i < element.length() - 1 && element.charAt(i) == element.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(element.charAt(i)).append(count);
        }
        return sb;
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 5, 4, 4, 4, 4, 4, 1, 1, 6, 6, 6, 6,};
        duplicatesInArray(array);
        System.out.println();
        String str = "aabbcdd";
        System.out.println(duplicateInString(str));

        System.out.println();


    }
}



