import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Person firstPerson = new Person();

        Person secondPerson = new Person("John");

        Person thirdPerson = new Person("Jane", 45, "London");

        thirdPerson.sayHello();
        // System.out.print(firstPerson.reallyHardMath());

        System.out.println("Jane will be " + thirdPerson.birthday() + " years old next year");

//        Student new_student = new Student();
//        new_student.name = "Michael";
//        new_student.age = 20;
//        new_student.gradYear = 2020;
//        new_student.enrolledStudent();
//       System.out.println("Name: " + new_student.name + "\nAge: "
//              + new_student.age +"\nGraduation Year: " + new_student.gradYear
//                + "\nEnrolled? " + new_student.enrolled);

        ArrayList<Student> studentList = new ArrayList<Student>();

        Student new_student = new Student();
        new_student.name = "Michael";
        new_student.age = 20;
        new_student.gradYear = 2020;
        studentList.add(new_student);

        Student new_student2 = new Student();
        new_student2.name = "Janice";
        new_student2.age = 32;
        new_student2.gradYear = 2019;
        studentList.add(new_student2);

        for (Student s : studentList){
            System.out.println("Name: " + s.name + "\nAge: " +
                    s.age +"\nGraduation Year: " + s.gradYear +
                    "\nEnrolled? " + s.enrolled);
        }




    }
}
