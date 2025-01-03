package strings;

public class Split1 {
    // find the length
    public static int findLength(String str){
       String [] word = str.split(" ");
       return word.length;
    }
    // reverse the only word in the same location
    public static String reverseWord(String str){
       String [] words = str.split(" ");
        String newString = "";
        for (int i = 0; i <words.length ; i++) { // my -> ym
            String string1 = words[i];
            for (int j = string1.length()-1; j >= 0; j--) {
                newString = newString+ string1.charAt(j);
            }
            newString = newString+ " ";
        }
        return newString;
    }
    public static void main(String[] args) {
        String str = "my name is Alok kumar";
        System.out.println(findLength(str));
        System.out.println(reverseWord(str));


        // find the length
        // reverse the only words in the same location
        // remove the white spaces
        //reverse the full string
        //capital first letter

    }
}
