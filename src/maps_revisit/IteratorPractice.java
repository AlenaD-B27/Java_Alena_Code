package maps_revisit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("James", "Anna", "Emre", "Jane"));

        for(String each : names){
            System.out.println(each);
        }
        System.out.println();

        Iterator<String> it = names.iterator();

        System.out.println(it.hasNext());
        System.out.println(it.next());
    }
}
