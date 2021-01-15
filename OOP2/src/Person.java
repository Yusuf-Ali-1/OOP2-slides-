public class Person {


    String name;
    int age;
    String location;

    public int birthday() {
        return age + 1;
    }

    public void sayHello(){
        System.out.println("Hello " +  name);

    }

    public boolean reallyHardMath(){
        double answer = (-5 + Math.sqrt(5 * 2 - 4 * (8 * 15)) + (2 * 8));
        System.out.println(answer);
        return true;
    }

    public Person (){

    }

    public Person (String name, int age, String location) {

        this.name = name;
        this.age = age;
        this.location = location;

    }

    public Person (String name) {
        this.name = name;
    }




}

