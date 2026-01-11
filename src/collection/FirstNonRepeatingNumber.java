package collection;

import java.util.*;

public class FirstNonRepeatingNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4,2, 3, 6,6, 7, 8, 9, 10,1);
       Map<Integer, Integer> map = new HashMap<>();

       for(Integer n : list){
           map.put(n, map.getOrDefault(n, 0) + 1);
       }
      /* for (Map.Entry<Integer, Integer> entry : map.entrySet()){
              int value = entry.getValue();
              if(value == 1){
                    System.out.println("First non-repeating number is: " + entry.getKey());
                    break;
              }
       }*/

        for (int key : map.keySet()){
            if(map.get(key) == 1){
                System.out.println("First non-repeating number is: " + key);
                break;
            }

        }


        }

}
