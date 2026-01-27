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

    public void askQuestion(){
        System.out.println(questions[currentQuestion]);
        if  (currentQuestion < questions.length - 1) {
            currentQuestion += 1;
        }
        else {
            currentQuestion = 0;
        }
    }

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
