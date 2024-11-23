package Maps;

import java.util.*;

public class Movies {

    private final String name;
    private final Integer rating;
    private final Integer year;

    public Integer getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public Movies(String name, Integer rating, Integer year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movies{" + "name='" + name + '\'' + ", rating=" + rating + ", year=" + year + '}';
    }

    public static void main(String[] args) {
        Map<Integer, Movies> moviesMap = new HashMap<>();
        moviesMap.put(1, new Movies("Gadar ek prem katha", 9, 2008));
        moviesMap.put(5, new Movies("Nadar ek prem katha", 8, 2001));
        moviesMap.put(4, new Movies("Indian ", 10, 2003));
        moviesMap.put(2, new Movies("Prem", 5, 2007));
        moviesMap.put(3, new Movies("Mohabbaten", 9, 2010));
        moviesMap.put(6, new Movies("kjdnwdnw ek prem katha", 6, 2008));
        moviesMap.put(7, new Movies("jdnwkjdn ek prem katha", 2, 2005));
        moviesMap.put(8, new Movies("kjdww ek prem katha", 0, 2008));
        moviesMap.put(11, new Movies("dwwd ek prem katha", 6, 2011));
        moviesMap.put(10, new Movies("siddhat ek prem katha", 5, 2008));
        moviesMap.put(9, new Movies("dwdiuhhokjwhdiud ek prem katha", 2, 2007));
        moviesMap.put(12, new Movies("dkjhiude ek prem katha", 1, 2000));

        // sort by key
        List<Map.Entry<Integer, Movies>> moviesList = new ArrayList<>(moviesMap.entrySet());
        moviesList.sort(Map.Entry.comparingByKey());
       // moviesList.forEach(System.out::println);

        //sort by name in value

        List<Map.Entry<Integer, Movies>> moviesList1 = new ArrayList<>(moviesMap.entrySet());
        moviesList1.sort(Comparator.comparing(entry -> entry.getValue().getName()));
        //moviesList1.forEach(System.out::println);

        List<Map.Entry<Integer, Movies>> sortedEntries = new ArrayList<>(moviesMap.entrySet());
        sortedEntries.sort(Comparator
                .comparing((Map.Entry<Integer, Movies> entry) -> entry.getValue().getName().compareToIgnoreCase(entry.getValue().getName())) // sort by name
                .thenComparing((Map.Entry<Integer, Movies> entry1)
                        -> entry1.getValue().getYear())); // then sort by year
        sortedEntries.forEach(System.out::println);


       /* !
                !
                        !
                                !*/
    }
}
