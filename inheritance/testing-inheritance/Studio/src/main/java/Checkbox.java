public class Checkbox extends Question{

    public Checkbox(String question, String answer) {
        super(question, answer);
    }

   @Override
    public boolean answerCheck(String answer){
        String actualAnswer = this.getanswer();
        if(answer.equalsIgnoreCase(actualAnswer)){
            return true;
        }else{
            return false;
        }
    }
}
