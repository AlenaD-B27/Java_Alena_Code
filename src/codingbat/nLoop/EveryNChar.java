package codingbat.nLoop;

public class EveryNChar {


    public static String everyNth(String str, int n) {
        String newStr = "";
        for(int i = 0; i < str.length(); i += n){
            newStr += str.charAt(i);
        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(everyNth("alena", 2));
    }







}
