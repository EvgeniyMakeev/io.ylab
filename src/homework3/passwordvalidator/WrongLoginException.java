package homework3.passwordvalidator;

public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}
