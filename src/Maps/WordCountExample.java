package Maps;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class WordCountExample {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        ConcurrentHashMap<String, Integer> wordCunts = new ConcurrentHashMap<>();
        Runnable runnable = ()->{
            for(String str : words ){
                wordCunts.merge(str,1,Integer::sum);
            }
        };
        Thread thread = new Thread(runnable);
        Thread thread1 =new Thread(runnable);
        thread.start();
        thread1.start();
        System.out.println("Word Counts: " + runnable);
    }
}
