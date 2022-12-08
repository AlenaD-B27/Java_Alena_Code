package maps_revisit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveLength {
    public static void main(String[] args) {

        Set<String> words = new HashSet<>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eights", "nine", "ten", "hello", "java", "world"));

        Iterator<String> it = words.iterator();
        while(it.hasNext()){
            if(it.next().length() < 5){
                it.remove();
            }
        }

        System.out.println(words);





    }
}
