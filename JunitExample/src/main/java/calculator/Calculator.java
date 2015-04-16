package calculator;

import java.util.Scanner;

import calculator.exception.InfinityException;
import calculator.exception.NegativeValueException;

/**
 * Performs basic arithmetic operations.
 *
 * @author pal
 */
public class Calculator {

    private MathHelper helper;
    private char operator;
    private float x;
    private float y;
    private float result;

    private Scanner in;

    public Calculator() {
        helper = new MathHelper();
        in = new Scanner(System.in);
    }

    private void readInput() {
        System.out.print("Enter first number: ");
        x = in.nextFloat();
        System.out.println();
        System.out.print("Enter desired operator: ");
        operator = in.next().charAt(0);
        System.out.println();
        System.out.print("Enter second number: ");
        y = in.nextFloat();
        System.out.println();
    }

    /**
     * @return result of calculation
     * @throws NegativeValueException - if result of calculation is a negative value
     * @throws InfinityException - if divisor == 0
     */
    public float calculate() throws NegativeValueException, InfinityException {
        if (x == 0 && y == 0) {
            readInput();
        }
        switch (operator) {
            case MathHelper.ADDITION:
                result = helper.add(x, y);
                break;
            case MathHelper.SUBTRACTION:
                result = helper.subtract(x, y);
                break;
            case MathHelper.MULTIPLICATION:
                result = helper.multiply(x, y);
                break;
            case MathHelper.DIVISION:
                result = helper.divide(x, y);
                break;
            default:
                result = 0;
        }
        resetValues();
        if (result < 0) {
            throw new NegativeValueException("Negative value returned - negative values are illegal");
        }
        return result;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setOperator(char c) {
        operator = c;
    }

    /**
     * Resets the values of x and y to 0.
     */
    public void resetValues() {
        x = y = 0;
    }

    /**
     * Creates a Calculator object and prints its reult to System.out.
     *
     * @param args - command line args are ignore
     * @throws NegativeValueException - when result of Calculator operation is negative
     * @throws InfinityException - when result of Calculator is infinity
     */
    public static void main(String[] args) throws NegativeValueException, InfinityException {
        Calculator calc = new Calculator();
        System.out.println("Result: " + calc.calculate());

    }

}
