import java.util.ArrayList;

public abstract class Question {

private final String question;
private final String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }


    public String getaQuestion() {
        return this.question;
    }

    public String getanswer() {
        return this.answer;
    }

    public abstract boolean answerCheck(String answer);


}
