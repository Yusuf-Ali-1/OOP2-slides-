import java.io.Console;
import java.util.ArrayList;

public class Student extends Person {

//our variables and methods


    int gradYear;
    boolean enrolled = false;

    void enrolledStudent() {
        enrolled = true;
    }


    //variables, constuctor and enrolled method

//        static Student addStudents(String name, int age, int gradYear, boolean enrolled){
//
//            Student new_student = new Student();
//            new_student.name = name;
//            new_student.age = age;
//            new_student.gradYear = gradYear;
//            new_student.enrolled = enrolled;
//            return new_student;

//        }


//    public static void main(String[] args) {
//        ArrayList<Student> studentList = new ArrayList<Student>();
//        studentList.add(addStudents("Angela", 43, 1996, false));
//        studentList.add(addStudents("Daniel", 33, 2002, true));
//        studentList.add(addStudents("Ronald", 19, 2021, false));
//    }

    //We added an additional instance variable
    //and method to our new class


    //variables and methods

//    public static void main(String[] args) {
//        Console console = System.console();
//        ArrayList<Student> studentList = new ArrayList<Student>();
//        String studentName;
//        int studentAge;
//        int studentGradYear;
//        boolean enrollmentStatus;
//        String complete = "no";
//        //loop keeps getting user input as long as the complete variable equals "no"
//        while (complete.equals("no")) {
//            studentName = console.readLine("Enter a name: ");
//            studentAge = Integer.parseInt(console.readLine("Enter Age: "));
//            studentGradYear = Integer.parseInt(console.readLine("Year of Graduation: "));
//            enrollmentStatus = Boolean.parseBoolean(console.readLine("Enrolled (enter true or false: "));
//            studentList.add(addStudents(studentName, studentAge, studentGradYear, enrollmentStatus));
//            complete = console.readLine("List complete? Enter yes or no: ");
//        }
//
//        //loop through array list and output the contents one object at a time.
//        for (Student s : studentList) {
//            System.out.println("Name: " + s.name +
//                    "\nAge: " + s.age + "\nGraduation Year: " + s.gradYear + "\nEnrolled? " + s.enrolled);
//        }
//    }




}

    






