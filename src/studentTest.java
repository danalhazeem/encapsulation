
import Studentpacge.Student;

public class studentTest {
    public static void main(String[] args) {

        Student student1 = new Student();


        student1.setName("danah alhazeem");
        student1.setAge(24);
        student1.setGpa(3.5);

        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("GPA Status: " + student1.getGpaStatus());


        student1.setGpa(2.5);
        System.out.println("Updated GPA Status: " + student1.getGpaStatus());


        student1.setGpa(1.8);
        System.out.println("Updated GPA Status: " + student1.getGpaStatus());


        student1.setGpa(4.5);
        System.out.println("Invalid GPA test, GPA Status: " + student1.getGpaStatus());


        student1.setGpa(-1.0);
        System.out.println("Invalid GPA test, GPA Status: " + student1.getGpaStatus());
    }
}
