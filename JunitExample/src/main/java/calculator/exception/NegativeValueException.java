package calculator.exception;

/**
 * Exception to indicate that a negative value has occured.
 *
 * @author pal
 */
public class NegativeValueException extends Exception {

    public NegativeValueException(String message) {
        super(message);
    }

}
