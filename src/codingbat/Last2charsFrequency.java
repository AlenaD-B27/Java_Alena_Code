package codingbat;

public class Last2charsFrequency {
    public static int last2(String str) {

        int count = 0;

        if(str.length() > 2){


            String sample = str.substring(str.length()-2);
            String dummie = str;

            for (int i = 0; i < (str.length()-sample.length()); i++){
                if(dummie.substring(0, sample.length()).equals(sample)){
                    count++;
                }
                dummie = str.substring(i+1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(last2("xxaxxaxxaxx"));
    }
}
