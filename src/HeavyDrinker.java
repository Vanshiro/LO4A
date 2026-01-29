package src;

import java.util.Random;

class HeavyDrinker extends Person {
    
    private int min = 0;
    private int max = 2;
    private Random rand = new Random();
    private int randomNum;    
    private int numShot;
    private String[] answer = {"I caN't drINk NOMO","I'm not drunk","I love you man!!"};
    private String[] question;
    public HeavyDrinker(String myName,String occupation, int additionalShots){
        super(myName, occupation);
        numShot = additionalShots;
        question = new String[]{"WHEERE IM I?", "I got " + numShot + " MORE shots in me!", "Where my phone at"};
    }
    @Override
    public void askQuestion(){
        randomNum = rand.nextInt((max - min) + 1) + min;
        System.out.println(question[randomNum]);
    }
    @Override
    public void answerQuestion(){
        randomNum = rand.nextInt((max - min) + 1) + min;
        System.out.println(answer[randomNum]);
    }
}
