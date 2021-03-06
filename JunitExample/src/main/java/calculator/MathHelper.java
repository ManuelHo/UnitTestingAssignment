package calculator;

import calculator.exception.InfinityException;

/**
 * Utility class that provides methods for mathematical operations.
 *
 */
public class MathHelper {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    /**
     * Returns the result of multiplying factor 1 with factor 2.
     *
     * @param x - factor 1
     * @param y - factor 2
     * @return - result
     */
    protected float multiply(float x, float y) {
        return x * y;
    }

    /**
     * Returns the partition size of splitting the dividend into divisor equally sized partitions.
     *
     * @param x - dividend
     * @param y - divisor
     * @return - result
     * @throws InfinityException
     */
    protected float divide(float x, float y) throws InfinityException {
        if (y == 0) {
            throw new InfinityException("Infinity");
        }
        return x / y;
    }

    /**
     * Returns the sum of summand1 and summand 2
     *
     * @param x - summand 1
     * @param y - summand 2
     * @return - result
     */
    protected float add(float x, float y) {
        return x + y;
    }

    /**
     * Returns the result of taking away the subtrahend from the minuend.
     *
     * @param x - minuend
     * @param y - subtrahend
     * @return - result
     */
    protected float subtract(float x, float y) {
        return x - y;
    }

}
