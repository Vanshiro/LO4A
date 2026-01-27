public class SixSevenEnthusiast extends Person {
    public SixSevenEnthusiast(String name, String occupation) {
        super(name, occupation);
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
