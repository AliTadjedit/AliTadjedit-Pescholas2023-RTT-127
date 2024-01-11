package HackRankPracticeSBAshell;

public class InvalidNumberException  extends Exception{


    String s;
    public InvalidNumberException(String s) throws InvalidNumberException{
        this.s=s;
    }

    public String getMessage() {
        return s;
    }
}

