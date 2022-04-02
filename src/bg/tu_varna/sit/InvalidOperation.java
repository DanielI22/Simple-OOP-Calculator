package bg.tu_varna.sit;

public class InvalidOperation extends Exception{
    public InvalidOperation() {
        super("The operation is not valid");
    }
}
