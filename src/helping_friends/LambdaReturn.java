package helping_friends;

import java.util.ArrayList;
import java.util.Arrays;


public class LambdaReturn {
    public static void main(String[] args) {


        ArrayList<String> str = new ArrayList<>(Arrays.asList("abcdef".split("")));
        ArrayList<Character> chars = new ArrayList<>();
        str.forEach(p -> chars.add(p.charAt(0)));



    }

}
