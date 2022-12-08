public class Task {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < 100; i++) {
            num = num++; // ++num would work
        }
        System.out.println(num);
    }
}
