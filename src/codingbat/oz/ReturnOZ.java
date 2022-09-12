package codingbat.oz;

public class ReturnOZ {
    public static String startOz(String str) {
        String newStr = "";



        if(str.length() >= 1 && str.charAt(0) == 'o'){
            newStr += "o";
        }
        if(str.length() >= 2 && str.charAt(1) == 'z'){
            newStr += "z";
        }

        return newStr;
    }


    public static void main(String[] args) {
        System.out.println(startOz("oz"));
        System.out.println(startOz("kzAlena"));
        System.out.println(startOz(""));
        System.out.println(startOz("obrakadabra"));
    }
}
