public class MultipleChoice extends Question{
    public MultipleChoice(String question, String answer) {
        super(question, answer);
    }

    public boolean answerCheck(String answer){
        String actualAnswer = this.getanswer();
        if(answer.equalsIgnoreCase(actualAnswer)){
            return true;
        }else{
            return false;
        }
    }
}
