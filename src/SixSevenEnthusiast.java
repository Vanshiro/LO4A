package src;

/*
Six Seven Enthusiast Class: a child of the person class that implements the behaviour of a "six seven enthusiast" for a conversation
Authors: Cole Mutter and Van Nguyen
1/27/26
No outside Sources
 */


public class SixSevenEnthusiast extends Person {
    public SixSevenEnthusiast(String name, String occupation) {
        super(name, occupation);
    }

    @Override
    public void whatIDo(){
        super.whatIDo();
        System.out.println("SixSeven");
    }

    @Override
    public void askQuestion()
    {
        System.out.println("Do you know what comes after sixty six?");
    }

    @Override
    public void answerQuestion()
    {
        System.out.println("Six Sevennnn");
    }

    
}
