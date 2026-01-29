package src;

/*
Person Class: abstract class to be an outline for what methods children need to implement to work with the party class
Authors: Cole Mutter and Van Nguyen
1/27/26
No outside Sources
 */

public abstract class Person {
    private String myName;
    private String occupation;

    public Person(String myName, String occupation){
        this.myName = myName;
        this.occupation = occupation;
    }

    public void askName(){
        System.out.println("What is your name?");
    }
    public void giveName(){
        System.out.println("My name is "+myName);
    }

    public void whatIDo(){
        System.out.println("I am a "+occupation);
    }

    public abstract void askQuestion();
    public abstract void answerQuestion();
}
