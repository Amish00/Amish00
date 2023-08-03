package exceptionhandling.customException;

    public class InvalidAgeException extends Exception{
        public  InvalidAgeException(String message){
            super(message); //call constructor from parent class
        }
    }
