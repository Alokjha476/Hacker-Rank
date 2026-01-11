package collection;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        int[] charCount = new int[256]; // Assuming ASCII character set

        // Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                System.out.println("First non-repeating character: " + str.charAt(i));
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}
