package maps_revisit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveNumber {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2,5,1,98,2,-6,46,0,8,2,-35,7));

        // remove all numbers less than 5

        Iterator<Integer> it = nums.iterator();

        while(it.hasNext()){
            if(it.next() < 5){   // pointer is moved to the element already
                it.remove();
            }
        }

        System.out.println(nums);






    }
}
