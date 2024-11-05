
import Studentpacge.Student;

public class studentTest {
    public static void main(String[] args) {

        Student student1 = new Student("danah",24,3.5);

        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("GPA Status: " + student1.getGpaStatus());


        student1.setGpa(-1.0);
        System.out.println("Invalid GPA test, GPA Status: " + student1.getGpaStatus());
    }
}
