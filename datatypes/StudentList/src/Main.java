import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer,String> roll = new HashMap<>();
        String newStudent;
        do{
            System.out.println("Students: ");
            newStudent = input.nextLine();
            if (!newStudent.isEmpty()){
                System.out.println("ID: ");
                Integer id = input.nextInt();
                roll.put(id,newStudent);
                input.nextLine();
            }
        }while(!newStudent.isEmpty());

        System.out.println("\nClass Roster:");
        for (Map.Entry<Integer,String>students : roll.entrySet()){
            System.out.println(students.getValue()+ "'s ID: " +students.getKey());
        }
        System.out.println("Number of students on roster: " + roll.size());
    }
}