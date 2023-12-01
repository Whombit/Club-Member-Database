package Debug;

//Import the JOptionPane & JSON Simple Object
import javax.swing.JOptionPane;
//This fucking line
//I have no idea why this line is giving me an error but I cant run the program with it
import org.json.simple.JSONObject;

//I really wish I could test the damn program but java's dicking me rn
public class Main {
    public static void main(String[] args) {
        //Instantiate a new student with no constructor arguements
        Student student = new Student();

        //Construct the JOptionPane to set the newName variable
        //Prints the Student's inputed name to the console
        String newName = JOptionPane.showInputDialog("Enter your name");
        System.out.println("Student name: " + newName);

        //Construct the JOptionPane to set the newGrade variable
        //Prints the Student's inputed grade to the console
        int newGrade = Integer.parseInt(JOptionPane.showInputDialog("What grade are you in"));
        System.out.println("Student grade: " + newGrade);

        //Construct the JOptionPane to set the newPosition variable
        //Prints the Student's inputed position to the console
        String newPosition = JOptionPane.showInputDialog("What position are you\nin Coding club");
        System.out.println("Student Position: " + newPosition);

        //Sets the unparameterized student object instantiated earlier to the data given by the user
        student.setName(newName);
        student.setGrade(newGrade);
        student.setPosition(newPosition);

        //Adds this info to a JSON file called "json" because Im a god of naming things
        JSONObject json = new JSONObject();
        json.put("name", student.getName());
        json.put("grade", student.getGrade());
        json.put("position", student.getPosition());

        //Represents the JSON data as a String in the console
        System.out.println("JSON representation: " + json.toJSONString());
    }
}
