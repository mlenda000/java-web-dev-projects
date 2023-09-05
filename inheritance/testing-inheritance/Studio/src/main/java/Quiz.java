import org.junit.Test;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
Scanner sc = new Scanner(System.in);

private ArrayList<Question> questions = new ArrayList<>();
ArrayList<String> answers;


    public void addQuestion(Question a){
        this.questions.add(a);
    }

    public void runQuiz(){
        double i=0;
        for (Question a: questions){
            System.out.println(a.getaQuestion());
            String userInput = sc.nextLine();
        }

//        System.out.println("Your grade is: " + gradeQuiz(i));
    }

    public double gradeQuiz(double correct){
        return correct/3;
    }

}
