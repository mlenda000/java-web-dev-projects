public class TrueFalse extends Question{

    public TrueFalse(String question, String answer) {
        super(question, answer);
    }

    public boolean answerCheck(String answer){
        if(answer.equalsIgnoreCase(this.getanswer())){
            return true;
        }else{
            return false;
        }
    }
}
