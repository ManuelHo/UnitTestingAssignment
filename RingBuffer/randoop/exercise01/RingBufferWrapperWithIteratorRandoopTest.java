package exercise01;
import junit.framework.*;
import junit.textui.*;

public class RingBufferWrapperWithIteratorRandoopTest extends TestCase {

  public static void main(String[] args) {
    TestRunner runner = new TestRunner();
    TestResult result = runner.doRun(suite(), false);
    if (! result.wasSuccessful()) {
      System.exit(1);
    }
  }

  public RingBufferWrapperWithIteratorRandoopTest(String name) {
    super(name);
  }

  public static Test suite() {
    TestSuite result = new TestSuite();
    result.addTest(new TestSuite(RingBufferWrapperWithIteratorRandoopTest0.class));
    result.addTest(new TestSuite(RingBufferWrapperWithIteratorRandoopTest1.class));
    result.addTest(new TestSuite(RingBufferWrapperWithIteratorRandoopTest2.class));
    return result;
  }

}
