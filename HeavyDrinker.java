import java.util.Random;

class HeavyDrinker extends Person {
    
    int min = 0;
    int max = 5;
    Random rand = new Random();
    int randomNum = rand.nextInt((max - min) + 1) + min;
    
    public HeavyDrinker(){
        
    }
    
    @Override
    public void askQuestion(){

    }
    @Override
    public void answerQuestion(){

    }
}
