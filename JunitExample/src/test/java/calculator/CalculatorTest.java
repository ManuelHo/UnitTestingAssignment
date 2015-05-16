package calculator;

import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;

import calculator.exception.IllegalOperatorException;
import calculator.exception.InfinityException;
import calculator.exception.NegativeValueException;

/**
 * Class to test Calculator. Note that all test cases are executed on the same
 * instance of calculator to make sure that subsequent calculations do not
 * affect each other.
 *
 */
@RunWith(org.powermock.modules.junit4.PowerMockRunner.class)
@PrepareForTest({ Calculator.class })
public class CalculatorTest {

	private static Calculator calculator;

	/**
	 * This method is executed once and prior to all test methods of the test
	 * class. Needs to be static. BeforeClass methods of superclasses are
	 * executed prior to BeforeClass methods of the current class.
	 */
	@BeforeClass
	public static void setUpEnvironment() {
		calculator = new Calculator();
	}

	/**
	 * Test if addition works as expected.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testNegativeSummandAddition() throws Exception {
		calculator.setX(3);
		calculator.setY(-2);
		calculator.setOperator(MathHelper.ADDITION);
		Assert.assertEquals("Calculator did not add correctly", 1.0,
				calculator.calculate(), 0.01);
	}

	/**
	 * Test if addition works as expected.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testAddition() throws Exception {
		calculator.setX(3);
		calculator.setY(2);
		calculator.setOperator(MathHelper.ADDITION);
		Assert.assertEquals("Calculator did not add correctly", 5.0,
				calculator.calculate(), 0.01);
	}

	/**
	 * Test if subtraction works as expected.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testSubtraction() throws Exception {
		calculator.setX(5);
		calculator.setY(2);
		calculator.setOperator(MathHelper.SUBTRACTION);
		Assert.assertEquals("Calculator did not subtract correctly", 3.0,
				calculator.calculate(), 0.01);
	}

	/**
	 * Test if multiplication works as expected.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testMultiplication() throws Exception {
		calculator.setX(4);
		calculator.setY(2);
		calculator.setOperator(MathHelper.MULTIPLICATION);
		Assert.assertEquals("Calculator did not multiply correctly", 8.0,
				calculator.calculate(), 0.01);
	}

	/**
	 * Test if division works as expected.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testDivision() throws Exception {
		calculator.setX(8);
		calculator.setY(2);
		calculator.setOperator(MathHelper.DIVISION);
		Assert.assertEquals("Calculator did not divide correctly", 4.0,
				calculator.calculate(), 0.01);
	}

	/**
	 * Test if division works as expected.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testNegativeDivision() throws Exception {
		calculator.setX(-8);
		calculator.setY(-2);
		calculator.setOperator(MathHelper.DIVISION);
		Assert.assertEquals("Calculator did not divide correctly", 4.0,
				calculator.calculate(), 0.01);
	}

	/**
	 * Calculator should throw an InfinityException upon division by 0.
	 * 
	 * @throws Exception
	 */
	@Test(expected = InfinityException.class)
	public void testDivisionByZero() throws Exception {
		calculator.setX(8);
		calculator.setY(0);
		calculator.setOperator(MathHelper.DIVISION);
		calculator.calculate();
	}

	/**
	 * Because calculator is not supposed to deliver negative results, it should
	 * throw a NegativeValueException when a negative result is computed.
	 * 
	 * @throws Exception
	 */
	@Test(expected = NegativeValueException.class)
	public void testIllegalSubtractionResult() throws Exception {
		calculator.setX(3);
		calculator.setY(5);
		calculator.setOperator(MathHelper.SUBTRACTION);
		calculator.calculate();
	}

	/**
	 * Because calculator is not supposed to deliver negative results, it should
	 * throw a NegativeValueException when a negative result is computed.
	 * 
	 * @throws Exception
	 */
	@Test(expected = NegativeValueException.class)
	public void testIllegalMultiplicationResult() throws Exception {
		calculator.setX(3);
		calculator.setY(-5);
		calculator.setOperator(MathHelper.MULTIPLICATION);
		calculator.calculate();
	}

	/**
	 * Test if calculator throws exception if an illegal operator has been
	 * specified.
	 * 
	 * @throws Exception
	 */
	@Test(expected = IllegalOperatorException.class)
	public void testIllegalOperator() throws Exception {
		calculator.setX(4);
		calculator.setY(2);
		calculator.setOperator('i');
		calculator.calculate();
	}

	/**
	 * Test if the user is asked to enter X, Y and the operator if no input is
	 * provided
	 * 
	 * @throws NegativeValueException
	 * @throws InfinityException
	 * @throws IllegalOperatorException
	 */
	@Test
	public void testInput() throws NegativeValueException, InfinityException,
			IllegalOperatorException {
		// mock java.util.scanner
		Scanner scanner = PowerMockito.mock(Scanner.class);
		PowerMockito.when(scanner.nextFloat()).thenReturn((float) 1)
				.thenReturn((float) 2);
		PowerMockito.when(scanner.next()).thenReturn("+");

		// create calculator with mocked scanner
		calculator = new Calculator(scanner);

		Assert.assertEquals("Correct", 3.0, calculator.calculate(), 0.0);
	}

	@AfterClass
	public static void tearDownEnvironment() {
		calculator = null;
	}

}
