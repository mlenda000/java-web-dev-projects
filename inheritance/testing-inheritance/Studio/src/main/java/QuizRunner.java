public class QuizRunner{
    public static void main(String[] args) {

        Quiz newQuiz = new Quiz();

        MultipleChoice mc = new MultipleChoice("What color is the sky?\na.) Yellow\nb.) Blue\nc.) Green","b");
        newQuiz.addQuestion(mc);

        Checkbox cb = new Checkbox("Select the elements that make up water?\na.) Hydrogen\nb.) Carbon\nc.) Oxygen","a c");
        newQuiz.addQuestion(cb);

        TrueFalse tf = new TrueFalse("This studio was fun\n(True or False)", "false");
        newQuiz.addQuestion(tf);


        System.out.println();
        newQuiz.runQuiz();

    }
}
