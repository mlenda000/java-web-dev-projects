import org.junit.Test;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
Scanner sc = new Scanner(System.in);
private static final DecimalFormat df = new DecimalFormat("0.00");

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
            if (a.answerCheck(userInput)){
                i++;
            }

        }
        double grade  = gradeQuiz(i);
        System.out.println("Your grade is: " + df.format(grade)+ "%");
    }

    public double gradeQuiz(double correct){

        return ((correct/3) * 100);
    }

}
