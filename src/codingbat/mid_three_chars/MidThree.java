package codingbat.mid_three_chars;

public class MidThree {
    public static void main(String[] args) {


        String str = "012";
        String assume = str.substring((str.length() / 2 - 1) /* 3/2=1; 1-1 = (0) */, (str.length() / 2 + 2)/* 3/2=1; 1+2 = (3) */); // index 3 doesn't exist, BUT it works because substring needs args: (beginning index, RANGE end index)
        System.out.println(assume);
        System.out.println(str.substring(2, 3));
        String me = "Alena";
        System.out.println(me.substring(0,5));
    }
}
