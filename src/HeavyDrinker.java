package src;

import java.util.Random;

class HeavyDrinker extends Person {
    //Declare initial variables
    //Min and max for random number generation to get random answer/question
    private int min = 0;
    private int max = 2;
    //Declared random number generation object
    private Random rand = new Random();
    private int randomNum;
    //Numshot an additional parameter for this class that extends onto super
    private int numShot;
    //array of predetermined answer/question
    private String[] answer = {"I caN't drINk NOMO","I'm not drunk","I love you man!!"};
    private String[] question;
    //Constructor set values
    public HeavyDrinker(String myName,String occupation, int additionalShots){
        super(myName, occupation);
        numShot = additionalShots;
        question = new String[]{"WHEERE IM I?", "I got " + numShot + " MORE shots in me!", "Where my phone at"};
    }
    //Generate random number within min/max bound, and ask that question
    @Override
    public void askQuestion(){
        randomNum = rand.nextInt((max - min) + 1) + min;
        System.out.println(question[randomNum]);
    }
    //Generate random number within min/max bound, and answer that question
    @Override
    public void answerQuestion(){
        randomNum = rand.nextInt((max - min) + 1) + min;
        System.out.println(answer[randomNum]);
    }
}
