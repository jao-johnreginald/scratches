class Scratch {
    public static void main(String[] args) {

        Teacher maamPerry = new Teacher("Maam Perry", 32, 52242, "Programming");
        System.out.println(maamPerry);
        maamPerry.recordAttendance("Absent");
        maamPerry.performDuties();

        Student steven = new Student("Steven", 19, 13227);
        System.out.println(steven);
        steven.recordAttendance("Present");
        steven.performDuties();

        Teacher sirRodel = new Teacher("Sir Rodel", 53, 52243, "Arts");
        Teacher maamAve = new Teacher("Maam Ave", 23, 52232, "English");

        Student dan = new Student("Dan", 19, 13226);
        Student boris = new Student("Boris", 19, 13342);
        Student mark = new Student("Mark", 19, 13341);

        // We created 2 'Teacher' objects and 3 'Student' objects, but we can make a 'Person' array
        Person[] people = {
                sirRodel, maamAve, dan, boris, mark
        };

        // This will go through the array and for each individual 'Person' it will make an individual variable called person
        for (Person person : people) {
            System.out.println(person);
            person.recordAttendance("Present");
            person.performDuties();
        }
    }
}

// 'Abstract' prevents you from creating a new object of this 'Person' class
// You need to specify what type of 'Person' object you want to create
// Person genericPerson = new Person("Name", "Role", 15); - THIS WON"T WORK
abstract class Person {

    String name;
    String role;
    int age;

    Person(String name, String role, int age) {
        this.name = name;
        this.role = role;
        this.age = age;
    }

    // It is useful to Override this toString method and simply print that object
    // instead of having to create a new method then printing inside the method then calling the method
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    void recordAttendance(String attendanceStatus) {
        String fullString = "ATTENDANCE RECORDED: " + attendanceStatus;
        System.out.println(fullString);
    }

    // We can also put 'abstract' into a method, abstract methods cannot have braces
    abstract void performDuties();
}

class Teacher extends Person {

    int employeeId;
    String subject;

    // There's a warning saying we need to make a constructor because parent class has a constructor
    public Teacher(String name, int age, int employeeId, String subject) {
        super(name, "Teacher", age);
        this.employeeId = employeeId;
        this.subject = subject;
    }

    // We MUST Override the 'performDuties' method because it's an abstract
    @Override
    void performDuties() {
        String fullString = "<Teaches " + subject + ">";
        System.out.println(fullString);
    }
}

class Student extends Person {

    int studentId;

    public Student(String name, int age, int studentId) {
        super(name, "Student", age);
        this.studentId = studentId;
    }

    @Override
    void performDuties() {
        System.out.println("<Studies...>");
    }
}