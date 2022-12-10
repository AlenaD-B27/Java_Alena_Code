package constant_encapsulation;

public class Student {
    public final String schoolName;
    public Student(String schoolName) {
        this.schoolName = schoolName;
    }

}

class TryMe {
    public static void main(String[] args) {

        Student alena = new Student("Cydeo");
        System.out.println("alena.schoolName = " + alena.schoolName);


    }
}
