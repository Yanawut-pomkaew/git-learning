import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name1 = sc.nextLine();
        Student student1 = new Student();

        student1.setName(name1);
       
        student1.setAge(21);
        student1.setGpa(3.00f);

        students.add(student1);

        Student student2 = new Student();

        student2.setName("ice");
        
        
        student2.setAge(22);
        student2.setGpa(2.97f);
        students.add(student2);
        
        
        for(int i = 0 ; i< students.size() ; ++i) {
            System.out.println("Name : " + students.get(i).getName());
            System.out.println("Age : " + students.get(i).getAge());
            System.out.println("GPA : " + students.get(i).getGpa());
            System.out.println("-------------------------------------");
            
        }
        sc.close();
    }
}
