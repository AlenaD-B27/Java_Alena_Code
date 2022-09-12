package codingbat.switchFstAndLast;
// switch the first and last characters in the string
public class Method {
    public static String frontBack(String str) {

        String returnStr = "";

        if(str.length() > 0){
            char first = str.charAt(0);
            char last = str.charAt(str.length()-1);
            returnStr = str.replaceFirst(""+first, ""+last);
            returnStr = returnStr.substring(0, returnStr.length()-1) + first;
        }

        return returnStr;

    }

    public static void main(String[] args) {
        System.out.println(frontBack("ba"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("Alena"));
        System.out.println("");
    }
}
