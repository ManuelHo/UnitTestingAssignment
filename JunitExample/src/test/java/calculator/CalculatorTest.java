package calculator;

import java.nio.CharBuffer;
import java.util.Scanner;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.support.membermodification.MemberModifier;

import calculator.exception.IllegalOperatorException;
import calculator.exception.InfinityException;
import calculator.exception.NegativeValueException;

/**
 * Class to test Calculator. Note that all test cases are executed on the same
 * instance of calculator to make sure that subsequent calculations do not
 * affect each other.
 *
 */
public class CalculatorTest {

	private static Calculator calculator;
	// private static DataInputStream in;
	private static Scanner in;

	/**
	 * This method is executed once and prior to all test methods of the test
	 * class. Needs to be static. BeforeClass methods of superclasses are
	 * executed prior to BeforeClass methods of the current class.
	 */
	@BeforeClass
	public static void setUpEnvironment() {
		// in = org.mockito.Mockito.mock(DataInputStream.class);
		in = PowerMockito.mock(Scanner.class);
//		PowerMockito.mockStatic(Scanner.class);
		
		calculator = new Calculator(in);
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

	@Test
	public void testInputValidation() throws Exception {
		CharBuffer buf = CharBuffer.allocate(1024);
	    buf.limit(0);
		
//		Scanner spy = PowerMockito.spy(in);
		MemberModifier.field(Scanner.class, "buf").set(in, buf);
		
//		PowerMockito.when(spy, "floatPattern").thenReturn(fuckyou);
//		PowerMockito.when(spy, "nextFloat").thenReturn(1);
//		PowerMockito.when(spy, "nextChar").thenReturn("+");
//		
		PowerMockito.when(in.next()).thenReturn("1").thenReturn("+").thenReturn("2");
//		PowerMockito.when(in.nextFloat()).thenReturn(Float.valueOf("1\r\n"));
//				.thenReturn(Float.valueOf("0\n"))
//				.thenReturn(Float.valueOf("1\n"))
//				.thenReturn(Float.valueOf("2\n"));
//		PowerMockito.when(in.next()).thenReturn("+\n");
//		PowerMockito.when(in.nextFloat()).thenReturn(Float.valueOf("2\r\n"));

		calculator.calculate();
	}

	@AfterClass
	public static void tearDownEnvironment() {
		calculator = null;
	}

}
