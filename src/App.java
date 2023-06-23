import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<String>();
        
        Student student = new Student();

        student.setName("Yanawut");
        System.out.println(student.getName());

        students.add(student.getName());

        student.setName("ice");
        System.out.println(student.getName());
        students.add(student.getName());
        
        
        for(int i = 0 ; i< students.size() ; ++i) {
            System.out.print(students.get(i) + ", ");
            
        }

    }
}
