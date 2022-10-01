package helping_friends;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChar {
    public static void main(String[] args) {


        String str = "Tomato".toLowerCase();

        Map <Character, Integer> counter = new LinkedHashMap<>();

        for(int i = 0; i < str.length(); i++){
            char numbPosChar = str.charAt(i);
            if(counter.containsKey(numbPosChar)) {
                counter.put(numbPosChar, counter.get(numbPosChar) + 1);
            } else {
                counter.put(numbPosChar, 1);
            }
        }
        System.out.println(counter);


    }
}
