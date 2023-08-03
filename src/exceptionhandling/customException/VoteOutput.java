package exceptionhandling.customException;

public class VoteOutput {
    public static void main(String[] args) {
        Vote vote = new Vote();
        try{
            vote.eligibilityToVote(17);
        } catch (InvalidAgeException e) {
            System.out.println("Eligible");
        }
    }
}
