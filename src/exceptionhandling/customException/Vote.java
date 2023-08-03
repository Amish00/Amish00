package exceptionhandling.customException;

public class Vote {
    public void eligibilityToVote(int age) throws InvalidAgeException{
        if (age < 18){
            System.out.println("Cannot Vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
}
