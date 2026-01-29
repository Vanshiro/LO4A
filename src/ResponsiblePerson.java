package src;
/*
Responsible Person Class: a child of the person class that implements the behaviour of a "responsible person" for a conversation
Authors: Cole Mutter and Van Nguyen
1/27/26
No outside Sources
 */

public class ResponsiblePerson extends Person {
    private final String[] questions = {
            "What do you do for work?",
            "What stocks are you invested in?",
            "What do you do in for free time?"
    };

    private final String[] answers = {
            "I have to be up at 8am for work tomorrow!",
            "I work out 5 days a week",
            "I like to keep myself informed and prepared"
    };

    private int currentQuestion;
    private int currentAnswer;


    public ResponsiblePerson(String myName, String occupation) {
        super(myName, occupation);
        currentQuestion = 0;
        currentAnswer = 0;
    }

    @Override
    public void askQuestion(){
        System.out.println(questions[currentQuestion]);
        if  (currentQuestion < questions.length - 1) {
            currentQuestion += 1;
        }
        else {
            currentQuestion = 0;
        }
    }

    @Override
    public void answerQuestion(){
        System.out.println(answers[currentAnswer]);
        if  (currentAnswer < answers.length - 1) {
            currentAnswer += 1;
        }
        else {
            currentAnswer = 0;
        }
    }
}
