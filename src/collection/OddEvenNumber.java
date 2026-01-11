package collection;

public class OddEvenNumber{
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        int even = 0; int odd = 0;
       for(int n : arr){
           if(n%2==0)
               even++;

           else
               odd++;


       }

    }
}
