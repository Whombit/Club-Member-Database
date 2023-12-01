package Debug;

public class Student {
    //Declares the private variables for the Student object
    private String name;
    private int grade;
    private String position;

    //Sets the default values for the Student when parameters are not specified
    public Student() {
        this.name = "Student";
        this.grade = 0;
        this.position = "member";
    }

    //Parameterized constructor for the Student object
    //This allows the user to specify the values for the Student
    public Student(String name, int grade, String position) {
        this.grade = grade;
        this.name = name;
        this.position = position;
    }

    //Setters and getters for the Student to set the Name, Grade, and Position in the club
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getPosition() {
        return position;
    }
}
