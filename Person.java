public abstract class Person {
    String myName;
    String occupation;


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
