package exercise01;

import junit.framework.*;

public class RingBufferWrapperWithIteratorRandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test1");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper((-1));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test2");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test3");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)(-1.0f));
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test4");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var2.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test5");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test6");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test7");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var2.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test8");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test9");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test10");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test11");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)"hi!");
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test12");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test13");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    boolean var4 = var3.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test14");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test15");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var2.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test16");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)0L);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test17");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test18");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)(short)10);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test19");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test20");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test21");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    boolean var4 = var3.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var3.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test22");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test23");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBufferWrapper var8 = new exercise01.RingBufferWrapper(0);
    int var9 = var8.size();
    int var10 = var8.size();
    boolean var11 = var8.isEmpty();
    java.util.Iterator var12 = var8.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var8);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test24");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var3.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test25");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)10);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test26");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test27");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)"hi!");
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test28");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    exercise01.RingBufferWrapper var5 = new exercise01.RingBufferWrapper(100);
    boolean var6 = var5.isEmpty();
    exercise01.RingBufferWrapper var8 = new exercise01.RingBufferWrapper(0);
    int var9 = var8.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var8.new RingBufferIteratorWrapper();
    var5.enqueue((java.lang.Object)var8);
    boolean var12 = var8.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var8.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var8);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test29");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(100);
    int var11 = var10.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var10);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test30");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test31");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    boolean var10 = var9.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var9.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test32");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test33");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var7 = new exercise01.RingBufferWrapper(100);
    boolean var8 = var7.isEmpty();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    int var11 = var10.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var10.new RingBufferIteratorWrapper();
    var7.enqueue((java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var10);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test34");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var7.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test35");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBufferWrapper var9 = new exercise01.RingBufferWrapper(0);
    int var10 = var9.size();
    int var11 = var9.size();
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    boolean var14 = var9.isEmpty();
    java.util.Iterator var15 = var9.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var15);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test36");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    int var6 = var4.size();
    boolean var7 = var4.isEmpty();
    java.util.Iterator var8 = var4.iterator();
    boolean var9 = var4.isEmpty();
    boolean var10 = var4.isEmpty();
    boolean var11 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var13 = var4.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var4);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test37");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test38");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)'#');
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test39");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var6.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test40");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var3.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test41");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)10L);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test42");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    boolean var11 = var10.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var10.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test43");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    boolean var5 = var2.hasNext();
    boolean var6 = var2.hasNext();
    boolean var7 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test44");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)1.0f);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test45");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    boolean var5 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var2.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test46");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    boolean var10 = var9.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test47");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test48");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)0.0d);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test49");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    boolean var5 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test50");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var4.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test51");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test52");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var7 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var7.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var7.new RingBufferIteratorWrapper();
    int var10 = var7.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var7);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test53");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test54");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test55");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    int var6 = var4.size();
    boolean var7 = var4.isEmpty();
    java.util.Iterator var8 = var4.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var4.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test56");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test57");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var6.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test58");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test59");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test60");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(100);
    boolean var11 = var10.isEmpty();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(0);
    int var14 = var13.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var13.new RingBufferIteratorWrapper();
    var10.enqueue((java.lang.Object)var13);
    boolean var17 = var13.isEmpty();
    int var18 = var13.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var13);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test61");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var1.iterator();
    exercise01.RingBufferWrapper var12 = new exercise01.RingBufferWrapper(100);
    boolean var13 = var12.isEmpty();
    exercise01.RingBufferWrapper var15 = new exercise01.RingBufferWrapper(0);
    int var16 = var15.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var15.new RingBufferIteratorWrapper();
    var12.enqueue((java.lang.Object)var15);
    boolean var19 = var15.isEmpty();
    int var20 = var15.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var21 = var15.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var15);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test62");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var7 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test63");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    int var8 = var4.size();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(100);
    boolean var11 = var10.isEmpty();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(0);
    int var14 = var13.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var13.new RingBufferIteratorWrapper();
    var10.enqueue((java.lang.Object)var13);
    int var17 = var10.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.enqueue((java.lang.Object)var17);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test64");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test65");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test66");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var10.new RingBufferIteratorWrapper();
    boolean var12 = var10.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var10);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test67");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var9.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test68");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    int var13 = var11.size();
    boolean var14 = var11.isEmpty();
    java.util.Iterator var15 = var11.iterator();
    boolean var16 = var11.isEmpty();
    boolean var17 = var11.isEmpty();
    boolean var18 = var11.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var19 = var11.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var20 = var11.new RingBufferIteratorWrapper();
    boolean var21 = var20.hasNext();
    boolean var22 = var20.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.enqueue((java.lang.Object)var20);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test69");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test70");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test71");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBufferWrapper var9 = new exercise01.RingBufferWrapper(0);
    int var10 = var9.size();
    int var11 = var9.size();
    java.util.Iterator var12 = var9.iterator();
    java.util.Iterator var13 = var9.iterator();
    boolean var14 = var9.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var9.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var15);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test72");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var7 = new exercise01.RingBufferWrapper(0);
    int var8 = var7.size();
    int var9 = var7.size();
    boolean var10 = var7.isEmpty();
    java.util.Iterator var11 = var7.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var7.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var12);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test73");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test74");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    boolean var5 = var2.hasNext();
    boolean var6 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test75");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var4.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var4.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test76");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBufferWrapper var8 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var8.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var8.new RingBufferIteratorWrapper();
    int var11 = var8.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var8.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var12);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test77");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var4.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test78");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper var7 = new exercise01.RingBufferWrapper(0);
    int var8 = var7.size();
    int var9 = var7.size();
    boolean var10 = var7.isEmpty();
    java.util.Iterator var11 = var7.iterator();
    boolean var12 = var7.isEmpty();
    java.util.Iterator var13 = var7.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var7);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test79");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var10.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test80");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test81");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var4 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test82");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var1.isEmpty();
    exercise01.RingBufferWrapper var8 = new exercise01.RingBufferWrapper(100);
    boolean var9 = var8.isEmpty();
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    var8.enqueue((java.lang.Object)var11);
    boolean var15 = var8.isEmpty();
    int var16 = var8.size();
    int var17 = var8.size();
    boolean var18 = var8.isEmpty();
    int var19 = var8.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var20 = var8.new RingBufferIteratorWrapper();
    java.lang.Object var21 = var8.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue(var21);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test83");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test84");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var4.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test85");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test86");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test87");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var6 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test88");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var4.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test89");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var9.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test90");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test91");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(100);
    int var11 = var10.size();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var13);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test92");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var4.new RingBufferIteratorWrapper();
    boolean var12 = var11.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test93");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    int var13 = var11.size();
    java.util.Iterator var14 = var11.iterator();
    int var15 = var11.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.enqueue((java.lang.Object)var15);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test94");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test95");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test96");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var6.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test97");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test98");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var6.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test99");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test100");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test101");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    java.lang.Object var2 = new java.lang.Object();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue(var2);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test102");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test103");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    exercise01.RingBufferWrapper var3 = new exercise01.RingBufferWrapper(0);
    int var4 = var3.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var3.new RingBufferIteratorWrapper();
    java.util.Iterator var6 = var3.iterator();
    var1.enqueue((java.lang.Object)var3);
    int var8 = var3.size();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    int var11 = var10.size();
    int var12 = var10.size();
    java.util.Iterator var13 = var10.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var14 = var10.new RingBufferIteratorWrapper();
    java.util.Iterator var15 = var10.iterator();
    boolean var16 = var10.isEmpty();
    java.util.Iterator var17 = var10.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.enqueue((java.lang.Object)var17);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test104");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var1.isEmpty();
    exercise01.RingBufferWrapper var5 = new exercise01.RingBufferWrapper(100);
    boolean var6 = var5.isEmpty();
    exercise01.RingBufferWrapper var8 = new exercise01.RingBufferWrapper(0);
    int var9 = var8.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var8.new RingBufferIteratorWrapper();
    var5.enqueue((java.lang.Object)var8);
    boolean var12 = var8.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var8.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var13);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test105");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test106");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test107");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    boolean var8 = var7.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test108");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBufferWrapper var9 = new exercise01.RingBufferWrapper(100);
    boolean var10 = var9.isEmpty();
    exercise01.RingBufferWrapper var12 = new exercise01.RingBufferWrapper(0);
    int var13 = var12.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var14 = var12.new RingBufferIteratorWrapper();
    var9.enqueue((java.lang.Object)var12);
    boolean var16 = var9.isEmpty();
    int var17 = var9.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var17);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test109");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test110");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test111");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test112");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test113");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    boolean var11 = var10.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test114");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var4.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test115");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    java.util.Iterator var15 = var1.iterator();
    int var16 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test116");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    boolean var5 = var2.hasNext();
    boolean var6 = var2.hasNext();
    boolean var7 = var2.hasNext();
    boolean var8 = var2.hasNext();
    boolean var9 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var2.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test117");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    boolean var8 = var7.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var7.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test118");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    java.lang.Object var13 = var1.dequeue();
    int var14 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test119");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var16 = var11.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var16.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test120");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)(byte)10);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test121");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper var6 = new exercise01.RingBufferWrapper(0);
    int var7 = var6.size();
    int var8 = var6.size();
    boolean var9 = var6.isEmpty();
    boolean var10 = var6.isEmpty();
    int var11 = var6.size();
    boolean var12 = var6.isEmpty();
    java.util.Iterator var13 = var6.iterator();
    int var14 = var6.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var14);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test122");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test123");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    boolean var7 = var6.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test124");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test125");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test126");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)0.0f);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test127");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    java.util.Iterator var15 = var1.iterator();
    exercise01.RingBufferWrapper var17 = new exercise01.RingBufferWrapper(0);
    int var18 = var17.size();
    int var19 = var17.size();
    boolean var20 = var17.isEmpty();
    java.util.Iterator var21 = var17.iterator();
    boolean var22 = var17.isEmpty();
    boolean var23 = var17.isEmpty();
    boolean var24 = var17.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var17.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var26 = var17.new RingBufferIteratorWrapper();
    boolean var27 = var26.hasNext();
    var1.enqueue((java.lang.Object)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var29 = var26.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test128");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test129");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    boolean var5 = var2.hasNext();
    boolean var6 = var2.hasNext();
    boolean var7 = var2.hasNext();
    boolean var8 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var2.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test130");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test131");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test132");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    boolean var11 = var10.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var10.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test133");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    boolean var10 = var9.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test134");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    exercise01.RingBufferWrapper var3 = new exercise01.RingBufferWrapper(0);
    int var4 = var3.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var3.new RingBufferIteratorWrapper();
    java.util.Iterator var6 = var3.iterator();
    var1.enqueue((java.lang.Object)var3);
    java.util.Iterator var8 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test135");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test136");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper var6 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var6.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var6.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var6.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var9);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test137");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test138");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    java.lang.Object var13 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var14 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test139");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test140");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    exercise01.RingBufferWrapper var5 = new exercise01.RingBufferWrapper(1);
    boolean var6 = var5.isEmpty();
    int var7 = var5.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var5.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var5.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var9.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test141");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var15.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test142");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    boolean var5 = var2.hasNext();
    boolean var6 = var2.hasNext();
    boolean var7 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var2.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test143");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(0);
    int var14 = var13.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var13.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var13.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test144");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    boolean var5 = var2.hasNext();
    boolean var6 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var2.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test145");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test146");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test147");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var10.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test148");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    java.lang.Object var2 = new java.lang.Object();
    var1.enqueue(var2);
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test149");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)"hi!");
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test150");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    boolean var6 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)false);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test151");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test152");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test153");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test154");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper var6 = new exercise01.RingBufferWrapper(100);
    boolean var7 = var6.isEmpty();
    exercise01.RingBufferWrapper var9 = new exercise01.RingBufferWrapper(0);
    int var10 = var9.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var9.new RingBufferIteratorWrapper();
    var6.enqueue((java.lang.Object)var9);
    boolean var13 = var6.isEmpty();
    int var14 = var6.size();
    int var15 = var6.size();
    java.util.Iterator var16 = var6.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var6);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test155");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test156");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test157");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var16 = var11.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var11.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test158");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    java.util.Iterator var16 = var11.iterator();
    exercise01.RingBufferWrapper var18 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var19 = var18.new RingBufferIteratorWrapper();
    boolean var20 = var19.hasNext();
    boolean var21 = var19.hasNext();
    boolean var22 = var19.hasNext();
    boolean var23 = var19.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.enqueue((java.lang.Object)var19);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test159");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.enqueue((java.lang.Object)(-1));
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test160");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var4.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test161");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    boolean var7 = var6.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test162");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    int var10 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var4.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test163");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var7 = new exercise01.RingBufferWrapper(100);
    boolean var8 = var7.isEmpty();
    int var9 = var7.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var7);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test164");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    int var10 = var4.size();
    exercise01.RingBufferWrapper var12 = new exercise01.RingBufferWrapper(0);
    int var13 = var12.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var14 = var12.new RingBufferIteratorWrapper();
    int var15 = var12.size();
    int var16 = var12.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.enqueue((java.lang.Object)var16);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test165");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test166");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var5.hasNext();
    boolean var7 = var5.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test167");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    int var7 = var1.size();
    exercise01.RingBufferWrapper var9 = new exercise01.RingBufferWrapper(1);
    boolean var10 = var9.isEmpty();
    int var11 = var9.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var9.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var9.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var13);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test168");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var6.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test169");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test170");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    boolean var8 = var7.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test171");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test172");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var11 = var4.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var4.new RingBufferIteratorWrapper();
    boolean var13 = var12.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test173");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    boolean var8 = var7.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var7.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test174");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    int var10 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var4.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test175");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var4.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test176");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    exercise01.RingBufferWrapper var3 = new exercise01.RingBufferWrapper(0);
    int var4 = var3.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var3.new RingBufferIteratorWrapper();
    java.util.Iterator var6 = var3.iterator();
    var1.enqueue((java.lang.Object)var3);
    int var8 = var3.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var3.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test177");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var16 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var17 = var1.dequeue();
    java.util.Iterator var18 = var1.iterator();
    int var19 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 2);

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test178");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var6.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test179");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    int var10 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var4.new RingBufferIteratorWrapper();
    boolean var12 = var11.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test180");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    boolean var5 = var2.hasNext();
    boolean var6 = var2.hasNext();
    boolean var7 = var2.hasNext();
    boolean var8 = var2.hasNext();
    boolean var9 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test181");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    boolean var8 = var7.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test182");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test183");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test184");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var16 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test185");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test186");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    java.util.Iterator var12 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    int var14 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test187");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test188");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test189");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    int var11 = var10.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var10.new RingBufferIteratorWrapper();
    java.util.Iterator var13 = var10.iterator();
    var1.enqueue((java.lang.Object)var13);
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(100);
    boolean var17 = var16.isEmpty();
    exercise01.RingBufferWrapper var19 = new exercise01.RingBufferWrapper(0);
    int var20 = var19.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var21 = var19.new RingBufferIteratorWrapper();
    var16.enqueue((java.lang.Object)var19);
    boolean var23 = var16.isEmpty();
    int var24 = var16.size();
    int var25 = var16.size();
    boolean var26 = var16.isEmpty();
    int var27 = var16.size();
    java.util.Iterator var28 = var16.iterator();
    var1.enqueue((java.lang.Object)var16);
    boolean var30 = var16.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test190");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    boolean var12 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test191");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test192");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    int var4 = var1.size();
    int var5 = var1.size();
    exercise01.RingBufferWrapper var7 = new exercise01.RingBufferWrapper(0);
    int var8 = var7.size();
    int var9 = var7.size();
    java.util.Iterator var10 = var7.iterator();
    java.util.Iterator var11 = var7.iterator();
    boolean var12 = var7.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var7.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var7);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test193");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    exercise01.RingBufferWrapper var3 = new exercise01.RingBufferWrapper(0);
    int var4 = var3.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var3.new RingBufferIteratorWrapper();
    java.util.Iterator var6 = var3.iterator();
    var1.enqueue((java.lang.Object)var3);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var3.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test194");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    int var16 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test195");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    boolean var9 = var8.hasNext();
    boolean var10 = var8.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test196() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test196");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test197() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test197");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    boolean var11 = var10.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test198() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test198");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    exercise01.RingBufferWrapper var7 = new exercise01.RingBufferWrapper(100);
    boolean var8 = var7.isEmpty();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    int var11 = var10.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var10.new RingBufferIteratorWrapper();
    var7.enqueue((java.lang.Object)var10);
    boolean var14 = var7.isEmpty();
    int var15 = var7.size();
    int var16 = var7.size();
    java.util.Iterator var17 = var7.iterator();
    exercise01.RingBufferWrapper var19 = new exercise01.RingBufferWrapper(0);
    int var20 = var19.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var21 = var19.new RingBufferIteratorWrapper();
    var7.enqueue((java.lang.Object)var19);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var23 = var7.new RingBufferIteratorWrapper();
    boolean var24 = var23.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var24);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test199() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test199");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    int var6 = var4.size();
    boolean var7 = var4.isEmpty();
    java.util.Iterator var8 = var4.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var4.new RingBufferIteratorWrapper();
    int var13 = var4.size();
    java.util.Iterator var14 = var4.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test200() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test200");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBufferWrapper var9 = new exercise01.RingBufferWrapper(100);
    boolean var10 = var9.isEmpty();
    exercise01.RingBufferWrapper var12 = new exercise01.RingBufferWrapper(0);
    int var13 = var12.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var14 = var12.new RingBufferIteratorWrapper();
    var9.enqueue((java.lang.Object)var12);
    boolean var16 = var12.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var12.new RingBufferIteratorWrapper();
    java.util.Iterator var18 = var12.iterator();
    java.util.Iterator var19 = var12.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var19);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test201() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test201");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var11 = var4.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var4.new RingBufferIteratorWrapper();
    boolean var13 = var12.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var12.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test202() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test202");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
    int var5 = var1.size();
    exercise01.RingBufferWrapper var7 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var7.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var7);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test203() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test203");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    java.util.Iterator var16 = var11.iterator();
    exercise01.RingBufferWrapper var18 = new exercise01.RingBufferWrapper(100);
    int var19 = var18.size();
    boolean var20 = var18.isEmpty();
    boolean var21 = var18.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.enqueue((java.lang.Object)var21);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test204() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test204");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);

  }

  public void test205() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test205");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    java.lang.Object var13 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var14 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(0);
    int var17 = var16.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var18 = var16.new RingBufferIteratorWrapper();
    java.util.Iterator var19 = var16.iterator();
    java.util.Iterator var20 = var16.iterator();
    int var21 = var16.size();
    var1.enqueue((java.lang.Object)var16);
    java.util.Iterator var23 = var16.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test206() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test206");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var14 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test207() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test207");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    java.util.Iterator var15 = var1.iterator();
    exercise01.RingBufferWrapper var17 = new exercise01.RingBufferWrapper(0);
    int var18 = var17.size();
    int var19 = var17.size();
    boolean var20 = var17.isEmpty();
    java.util.Iterator var21 = var17.iterator();
    boolean var22 = var17.isEmpty();
    boolean var23 = var17.isEmpty();
    boolean var24 = var17.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var17.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var26 = var17.new RingBufferIteratorWrapper();
    boolean var27 = var26.hasNext();
    var1.enqueue((java.lang.Object)var26);
    exercise01.RingBufferWrapper var30 = new exercise01.RingBufferWrapper(0);
    int var31 = var30.size();
    int var32 = var30.size();
    boolean var33 = var30.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var34 = var30.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var34);
    boolean var36 = var34.hasNext();
    boolean var37 = var34.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test208() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test208");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    java.util.Iterator var15 = var1.iterator();
    exercise01.RingBufferWrapper var17 = new exercise01.RingBufferWrapper(0);
    int var18 = var17.size();
    int var19 = var17.size();
    boolean var20 = var17.isEmpty();
    java.util.Iterator var21 = var17.iterator();
    boolean var22 = var17.isEmpty();
    boolean var23 = var17.isEmpty();
    boolean var24 = var17.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var17.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var26 = var17.new RingBufferIteratorWrapper();
    boolean var27 = var26.hasNext();
    var1.enqueue((java.lang.Object)var26);
    exercise01.RingBufferWrapper var30 = new exercise01.RingBufferWrapper(0);
    int var31 = var30.size();
    int var32 = var30.size();
    boolean var33 = var30.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var34 = var30.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var34);
    boolean var36 = var34.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var34.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test209() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test209");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    int var7 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test210() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test210");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper var7 = new exercise01.RingBufferWrapper(100);
    boolean var8 = var7.isEmpty();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    int var11 = var10.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var10.new RingBufferIteratorWrapper();
    var7.enqueue((java.lang.Object)var10);
    boolean var14 = var7.isEmpty();
    int var15 = var7.size();
    int var16 = var7.size();
    boolean var17 = var7.isEmpty();
    int var18 = var7.size();
    java.lang.Object var19 = var7.dequeue();
    int var20 = var7.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var7);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);

  }

  public void test211() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test211");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var4.new RingBufferIteratorWrapper();
    int var9 = var4.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var4.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test212() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test212");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test213() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test213");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test214() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test214");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    exercise01.RingBufferWrapper var3 = new exercise01.RingBufferWrapper(0);
    int var4 = var3.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var3.new RingBufferIteratorWrapper();
    java.util.Iterator var6 = var3.iterator();
    var1.enqueue((java.lang.Object)var3);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var3.new RingBufferIteratorWrapper();
    int var9 = var3.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.enqueue((java.lang.Object)(short)100);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test215() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test215");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    int var11 = var10.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var10.new RingBufferIteratorWrapper();
    java.util.Iterator var13 = var10.iterator();
    var1.enqueue((java.lang.Object)var13);
    java.lang.Object var15 = var1.dequeue();
    java.lang.Object var16 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var1.new RingBufferIteratorWrapper();
    boolean var18 = var17.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test216() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test216");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    int var10 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var11.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test217() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test217");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    boolean var7 = var6.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var6.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test218() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test218");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    boolean var5 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test219() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test219");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    boolean var5 = var2.hasNext();
    boolean var6 = var2.hasNext();
    boolean var7 = var2.hasNext();
    boolean var8 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test220() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test220");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    exercise01.RingBufferWrapper var3 = new exercise01.RingBufferWrapper(0);
    int var4 = var3.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var3.new RingBufferIteratorWrapper();
    java.util.Iterator var6 = var3.iterator();
    var1.enqueue((java.lang.Object)var3);
    boolean var8 = var3.isEmpty();
    int var9 = var3.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test221() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test221");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    int var11 = var10.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var10.new RingBufferIteratorWrapper();
    java.util.Iterator var13 = var10.iterator();
    var1.enqueue((java.lang.Object)var13);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test222() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test222");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var1.iterator();
    java.lang.Object var11 = new java.lang.Object();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue(var11);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test223() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test223");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    boolean var14 = var13.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test224() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test224");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    int var13 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var14 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var15 = var14.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var14.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test225() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test225");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var3 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test226() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test226");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    java.util.Iterator var15 = var1.iterator();
    exercise01.RingBufferWrapper var17 = new exercise01.RingBufferWrapper(0);
    int var18 = var17.size();
    int var19 = var17.size();
    boolean var20 = var17.isEmpty();
    java.util.Iterator var21 = var17.iterator();
    boolean var22 = var17.isEmpty();
    boolean var23 = var17.isEmpty();
    boolean var24 = var17.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var17.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var26 = var17.new RingBufferIteratorWrapper();
    boolean var27 = var26.hasNext();
    var1.enqueue((java.lang.Object)var26);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var26.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test227() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test227");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var8.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test228() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test228");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    java.util.Iterator var12 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test229() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test229");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    int var13 = var11.size();
    boolean var14 = var11.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var11.new RingBufferIteratorWrapper();
    boolean var16 = var11.isEmpty();
    java.util.Iterator var17 = var11.iterator();
    boolean var18 = var11.isEmpty();
    java.util.Iterator var19 = var11.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var11);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test230() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test230");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    java.util.Iterator var16 = var11.iterator();
    java.util.Iterator var17 = var11.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var18 = var11.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test231() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test231");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    java.lang.Object var13 = var1.dequeue();
    boolean var14 = var1.isEmpty();
    java.util.Iterator var15 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test232() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test232");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    boolean var8 = var7.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var7.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test233() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test233");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    boolean var13 = var1.isEmpty();
    int var14 = var1.size();
    boolean var15 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test234() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test234");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    exercise01.RingBufferWrapper var5 = new exercise01.RingBufferWrapper(1);
    boolean var6 = var5.isEmpty();
    int var7 = var5.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var5.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var5.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var9);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test235() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test235");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var16 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test236() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test236");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test237() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test237");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var7.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test238() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test238");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    java.lang.Object var13 = var1.dequeue();
    boolean var14 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var16 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test239() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test239");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test240() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test240");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    int var4 = var1.size();
    int var5 = var1.size();
    exercise01.RingBufferWrapper var7 = new exercise01.RingBufferWrapper(100);
    boolean var8 = var7.isEmpty();
    java.util.Iterator var9 = var7.iterator();
    int var10 = var7.size();
    int var11 = var7.size();
    java.util.Iterator var12 = var7.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var7);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test241() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test241");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(1);
    boolean var12 = var11.isEmpty();
    boolean var13 = var11.isEmpty();
    var1.enqueue((java.lang.Object)var13);
    boolean var15 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test242() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test242");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var11 = var4.iterator();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(0);
    int var14 = var13.size();
    int var15 = var13.size();
    boolean var16 = var13.isEmpty();
    boolean var17 = var13.isEmpty();
    int var18 = var13.size();
    boolean var19 = var13.isEmpty();
    java.util.Iterator var20 = var13.iterator();
    java.util.Iterator var21 = var13.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.enqueue((java.lang.Object)var21);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test243() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test243");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test244() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test244");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    boolean var11 = var1.isEmpty();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(100);
    boolean var14 = var13.isEmpty();
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(0);
    int var17 = var16.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var18 = var16.new RingBufferIteratorWrapper();
    var13.enqueue((java.lang.Object)var16);
    boolean var20 = var13.isEmpty();
    int var21 = var13.size();
    int var22 = var13.size();
    java.util.Iterator var23 = var13.iterator();
    exercise01.RingBufferWrapper var25 = new exercise01.RingBufferWrapper(0);
    int var26 = var25.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var27 = var25.new RingBufferIteratorWrapper();
    var13.enqueue((java.lang.Object)var25);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var29 = var13.new RingBufferIteratorWrapper();
    java.lang.Object var30 = var29.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue(var30);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test245() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test245");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var4.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var4.new RingBufferIteratorWrapper();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test246() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test246");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var4.new RingBufferIteratorWrapper();
    boolean var12 = var11.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var11.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test247() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test247");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    java.lang.Object var2 = new java.lang.Object();
    var1.enqueue(var2);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var5 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test248() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test248");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(100);
    boolean var11 = var10.isEmpty();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(0);
    int var14 = var13.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var13.new RingBufferIteratorWrapper();
    var10.enqueue((java.lang.Object)var13);
    boolean var17 = var10.isEmpty();
    int var18 = var10.size();
    int var19 = var10.size();
    boolean var20 = var10.isEmpty();
    int var21 = var10.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var22 = var10.new RingBufferIteratorWrapper();
    java.lang.Object var23 = var10.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var24 = var10.new RingBufferIteratorWrapper();
    java.util.Iterator var25 = var10.iterator();
    exercise01.RingBufferWrapper var27 = new exercise01.RingBufferWrapper(100);
    boolean var28 = var27.isEmpty();
    exercise01.RingBufferWrapper var30 = new exercise01.RingBufferWrapper(0);
    int var31 = var30.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var32 = var30.new RingBufferIteratorWrapper();
    var27.enqueue((java.lang.Object)var30);
    boolean var34 = var30.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var35 = var30.new RingBufferIteratorWrapper();
    int var36 = var30.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var37 = var30.new RingBufferIteratorWrapper();
    java.util.Iterator var38 = var30.iterator();
    var10.enqueue((java.lang.Object)var38);
    java.util.Iterator var40 = var10.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var10);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test249() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test249");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    boolean var5 = var4.hasNext();
    boolean var6 = var4.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var4.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test250() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test250");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var16 = var1.iterator();
    exercise01.RingBufferWrapper var18 = new exercise01.RingBufferWrapper(100);
    boolean var19 = var18.isEmpty();
    exercise01.RingBufferWrapper var21 = new exercise01.RingBufferWrapper(0);
    int var22 = var21.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var23 = var21.new RingBufferIteratorWrapper();
    var18.enqueue((java.lang.Object)var21);
    boolean var25 = var21.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var26 = var21.new RingBufferIteratorWrapper();
    int var27 = var21.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var28 = var21.new RingBufferIteratorWrapper();
    java.util.Iterator var29 = var21.iterator();
    var1.enqueue((java.lang.Object)var29);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var31 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var31.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test251() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test251");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    exercise01.RingBufferWrapper var3 = new exercise01.RingBufferWrapper(0);
    int var4 = var3.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var3.new RingBufferIteratorWrapper();
    java.util.Iterator var6 = var3.iterator();
    var1.enqueue((java.lang.Object)var3);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var3.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(100);
    boolean var11 = var10.isEmpty();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(0);
    int var14 = var13.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var13.new RingBufferIteratorWrapper();
    var10.enqueue((java.lang.Object)var13);
    boolean var17 = var10.isEmpty();
    int var18 = var10.size();
    int var19 = var10.size();
    boolean var20 = var10.isEmpty();
    int var21 = var10.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var22 = var10.new RingBufferIteratorWrapper();
    java.lang.Object var23 = var22.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.enqueue(var23);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test252() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test252");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    int var7 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test253() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test253");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    boolean var11 = var10.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var10.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test254() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test254");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    boolean var10 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var11.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test255() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test255");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    exercise01.RingBufferWrapper var5 = new exercise01.RingBufferWrapper(100);
    boolean var6 = var5.isEmpty();
    exercise01.RingBufferWrapper var8 = new exercise01.RingBufferWrapper(0);
    int var9 = var8.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var8.new RingBufferIteratorWrapper();
    var5.enqueue((java.lang.Object)var8);
    var5.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var15 = new exercise01.RingBufferWrapper(0);
    int var16 = var15.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var15.new RingBufferIteratorWrapper();
    java.util.Iterator var18 = var15.iterator();
    var5.enqueue((java.lang.Object)var15);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var20 = var5.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var5);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var22 = var5.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var22.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test256() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test256");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var13.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var13.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test257() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test257");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test258() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test258");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    int var6 = var4.size();
    boolean var7 = var4.isEmpty();
    java.util.Iterator var8 = var4.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    int var14 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test259() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test259");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    exercise01.RingBufferWrapper var7 = new exercise01.RingBufferWrapper(100);
    boolean var8 = var7.isEmpty();
    java.util.Iterator var9 = var7.iterator();
    boolean var10 = var7.isEmpty();
    java.util.Iterator var11 = var7.iterator();
    var1.enqueue((java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test260() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test260");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    boolean var10 = var4.isEmpty();
    exercise01.RingBufferWrapper var12 = new exercise01.RingBufferWrapper(0);
    int var13 = var12.size();
    int var14 = var12.size();
    java.util.Iterator var15 = var12.iterator();
    java.util.Iterator var16 = var12.iterator();
    boolean var17 = var12.isEmpty();
    java.util.Iterator var18 = var12.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var19 = var12.new RingBufferIteratorWrapper();
    boolean var20 = var12.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.enqueue((java.lang.Object)var12);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);

  }

  public void test261() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test261");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    java.util.Iterator var15 = var1.iterator();
    exercise01.RingBufferWrapper var17 = new exercise01.RingBufferWrapper(0);
    int var18 = var17.size();
    int var19 = var17.size();
    boolean var20 = var17.isEmpty();
    java.util.Iterator var21 = var17.iterator();
    boolean var22 = var17.isEmpty();
    boolean var23 = var17.isEmpty();
    boolean var24 = var17.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var17.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var26 = var17.new RingBufferIteratorWrapper();
    boolean var27 = var26.hasNext();
    var1.enqueue((java.lang.Object)var26);
    boolean var29 = var26.hasNext();
    boolean var30 = var26.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test262() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test262");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test263() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test263");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    exercise01.RingBufferWrapper var3 = new exercise01.RingBufferWrapper(0);
    int var4 = var3.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var3.new RingBufferIteratorWrapper();
    java.util.Iterator var6 = var3.iterator();
    var1.enqueue((java.lang.Object)var3);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var3.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var8.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test264() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test264");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    boolean var9 = var8.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test265() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test265");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var5.hasNext();
    boolean var7 = var5.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test266() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test266");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    int var6 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test267() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test267");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var16 = var1.iterator();
    exercise01.RingBufferWrapper var18 = new exercise01.RingBufferWrapper(100);
    boolean var19 = var18.isEmpty();
    exercise01.RingBufferWrapper var21 = new exercise01.RingBufferWrapper(0);
    int var22 = var21.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var23 = var21.new RingBufferIteratorWrapper();
    var18.enqueue((java.lang.Object)var21);
    boolean var25 = var21.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var26 = var21.new RingBufferIteratorWrapper();
    int var27 = var21.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var28 = var21.new RingBufferIteratorWrapper();
    java.util.Iterator var29 = var21.iterator();
    var1.enqueue((java.lang.Object)var29);
    boolean var31 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);

  }

  public void test268() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test268");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    exercise01.RingBufferWrapper var5 = new exercise01.RingBufferWrapper(100);
    boolean var6 = var5.isEmpty();
    exercise01.RingBufferWrapper var8 = new exercise01.RingBufferWrapper(0);
    int var9 = var8.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var8.new RingBufferIteratorWrapper();
    var5.enqueue((java.lang.Object)var8);
    var5.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var15 = new exercise01.RingBufferWrapper(0);
    int var16 = var15.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var15.new RingBufferIteratorWrapper();
    java.util.Iterator var18 = var15.iterator();
    var5.enqueue((java.lang.Object)var15);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var20 = var5.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var5);
    java.util.Iterator var22 = var5.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test269() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test269");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    int var4 = var1.size();
    int var5 = var1.size();
    exercise01.RingBufferWrapper var7 = new exercise01.RingBufferWrapper(100);
    boolean var8 = var7.isEmpty();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    int var11 = var10.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var10.new RingBufferIteratorWrapper();
    var7.enqueue((java.lang.Object)var10);
    boolean var14 = var7.isEmpty();
    int var15 = var7.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var16 = var7.new RingBufferIteratorWrapper();
    java.util.Iterator var17 = var7.iterator();
    java.util.Iterator var18 = var7.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var7);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test270() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test270");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var10 = var9.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test271() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test271");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var11 = var4.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var4.new RingBufferIteratorWrapper();
    boolean var13 = var12.hasNext();
    boolean var14 = var12.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var12.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test272() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test272");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var12 = var11.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test273() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test273");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test274() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test274");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var7 = new exercise01.RingBufferWrapper(0);
    int var8 = var7.size();
    int var9 = var7.size();
    boolean var10 = var7.isEmpty();
    java.util.Iterator var11 = var7.iterator();
    boolean var12 = var7.isEmpty();
    boolean var13 = var7.isEmpty();
    boolean var14 = var7.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var7.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var7);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test275() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test275");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var8 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test276() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test276");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    boolean var5 = var2.hasNext();
    boolean var6 = var2.hasNext();
    boolean var7 = var2.hasNext();
    boolean var8 = var2.hasNext();
    boolean var9 = var2.hasNext();
    boolean var10 = var2.hasNext();
    boolean var11 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test277() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test277");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var16 = var11.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test278() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test278");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(0);
    int var14 = var13.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var13.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var13);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var18 = var17.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test279() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test279");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var1.new RingBufferIteratorWrapper();
    boolean var12 = var11.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test280() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test280");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var1.new RingBufferIteratorWrapper();
    boolean var12 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test281() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test281");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var8.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test282() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test282");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var16 = var1.iterator();
    exercise01.RingBufferWrapper var18 = new exercise01.RingBufferWrapper(100);
    boolean var19 = var18.isEmpty();
    exercise01.RingBufferWrapper var21 = new exercise01.RingBufferWrapper(0);
    int var22 = var21.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var23 = var21.new RingBufferIteratorWrapper();
    var18.enqueue((java.lang.Object)var21);
    boolean var25 = var21.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var26 = var21.new RingBufferIteratorWrapper();
    int var27 = var21.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var28 = var21.new RingBufferIteratorWrapper();
    java.util.Iterator var29 = var21.iterator();
    var1.enqueue((java.lang.Object)var29);
    exercise01.RingBufferWrapper var32 = new exercise01.RingBufferWrapper(0);
    int var33 = var32.size();
    int var34 = var32.size();
    boolean var35 = var32.isEmpty();
    java.util.Iterator var36 = var32.iterator();
    boolean var37 = var32.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var38 = var32.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var38);
    int var40 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 2);

  }

  public void test283() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test283");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    java.lang.Object var13 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var14 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(0);
    int var17 = var16.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var18 = var16.new RingBufferIteratorWrapper();
    java.util.Iterator var19 = var16.iterator();
    java.util.Iterator var20 = var16.iterator();
    int var21 = var16.size();
    var1.enqueue((java.lang.Object)var16);
    boolean var23 = var16.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var24 = var16.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var24.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test284() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test284");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test285() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test285");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test286() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test286");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var1.new RingBufferIteratorWrapper();
    int var12 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test287() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test287");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var4.new RingBufferIteratorWrapper();
    boolean var9 = var4.isEmpty();
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var12 = var11.iterator();
    exercise01.RingBufferWrapper var14 = new exercise01.RingBufferWrapper(0);
    int var15 = var14.size();
    int var16 = var14.size();
    boolean var17 = var14.isEmpty();
    java.util.Iterator var18 = var14.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var19 = var14.new RingBufferIteratorWrapper();
    java.util.Iterator var20 = var14.iterator();
    var11.enqueue((java.lang.Object)var14);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var22 = var14.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.enqueue((java.lang.Object)var14);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test288() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test288");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test289() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test289");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    boolean var11 = var4.isEmpty();
    boolean var12 = var4.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test290() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test290");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    int var10 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var4.new RingBufferIteratorWrapper();
    boolean var12 = var4.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test291() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test291");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    java.lang.Object var13 = var1.dequeue();
    java.util.Iterator var14 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test292() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test292");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    boolean var4 = var3.hasNext();
    boolean var5 = var3.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test293() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test293");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var11 = var4.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var12.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test294() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test294");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var12 = var11.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test295() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test295");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    exercise01.RingBufferWrapper var8 = new exercise01.RingBufferWrapper(0);
    int var9 = var8.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var8.new RingBufferIteratorWrapper();
    java.util.Iterator var11 = var8.iterator();
    java.util.Iterator var12 = var8.iterator();
    int var13 = var8.size();
    java.util.Iterator var14 = var8.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var8);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test296() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test296");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var8 = new exercise01.RingBufferWrapper(100);
    boolean var9 = var8.isEmpty();
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    var8.enqueue((java.lang.Object)var11);
    boolean var15 = var11.isEmpty();
    int var16 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var11.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var18 = var11.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var11);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test297() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test297");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    int var6 = var4.size();
    boolean var7 = var4.isEmpty();
    java.util.Iterator var8 = var4.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var12 = var1.iterator();
    boolean var13 = var1.isEmpty();
    exercise01.RingBufferWrapper var15 = new exercise01.RingBufferWrapper(100);
    boolean var16 = var15.isEmpty();
    exercise01.RingBufferWrapper var18 = new exercise01.RingBufferWrapper(0);
    int var19 = var18.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var20 = var18.new RingBufferIteratorWrapper();
    var15.enqueue((java.lang.Object)var18);
    boolean var22 = var15.isEmpty();
    int var23 = var15.size();
    int var24 = var15.size();
    boolean var25 = var15.isEmpty();
    int var26 = var15.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var27 = var15.new RingBufferIteratorWrapper();
    java.lang.Object var28 = var27.next();
    var1.enqueue((java.lang.Object)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var30 = var27.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test298() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test298");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    int var6 = var4.size();
    boolean var7 = var4.isEmpty();
    java.util.Iterator var8 = var4.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var4.new RingBufferIteratorWrapper();
    boolean var13 = var4.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test299() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test299");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    exercise01.RingBufferWrapper var3 = new exercise01.RingBufferWrapper(0);
    int var4 = var3.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var3.new RingBufferIteratorWrapper();
    java.util.Iterator var6 = var3.iterator();
    var1.enqueue((java.lang.Object)var3);
    int var8 = var3.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var3.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test300() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test300");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    int var10 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test301() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test301");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    java.lang.Object var13 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var14 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var15 = var1.iterator();
    java.util.Iterator var16 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test302() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test302");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    boolean var5 = var2.hasNext();
    boolean var6 = var2.hasNext();
    boolean var7 = var2.hasNext();
    boolean var8 = var2.hasNext();
    boolean var9 = var2.hasNext();
    boolean var10 = var2.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test303() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test303");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    java.util.Iterator var10 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test304() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test304");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test305() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test305");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    boolean var16 = var1.isEmpty();
    boolean var17 = var1.isEmpty();
    java.util.Iterator var18 = var1.iterator();
    boolean var19 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test306() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test306");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var12.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test307() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test307");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    boolean var16 = var1.isEmpty();
    boolean var17 = var1.isEmpty();
    java.util.Iterator var18 = var1.iterator();
    exercise01.RingBufferWrapper var20 = new exercise01.RingBufferWrapper(100);
    boolean var21 = var20.isEmpty();
    exercise01.RingBufferWrapper var23 = new exercise01.RingBufferWrapper(0);
    int var24 = var23.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var23.new RingBufferIteratorWrapper();
    var20.enqueue((java.lang.Object)var23);
    boolean var27 = var20.isEmpty();
    int var28 = var20.size();
    int var29 = var20.size();
    var1.enqueue((java.lang.Object)var29);
    java.lang.Object var31 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var32 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var32.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);

  }

  public void test308() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test308");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test309() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test309");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(100);
    boolean var14 = var13.isEmpty();
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(0);
    int var17 = var16.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var18 = var16.new RingBufferIteratorWrapper();
    var13.enqueue((java.lang.Object)var16);
    boolean var20 = var13.isEmpty();
    int var21 = var13.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var22 = var13.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var13);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var24 = var13.new RingBufferIteratorWrapper();
    boolean var25 = var13.isEmpty();
    boolean var26 = var13.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test310() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test310");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var7.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test311() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test311");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    int var6 = var4.size();
    boolean var7 = var4.isEmpty();
    java.util.Iterator var8 = var4.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var4.new RingBufferIteratorWrapper();
    boolean var13 = var12.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test312() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test312");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    java.util.Iterator var10 = var4.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test313() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test313");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var14 = var13.new RingBufferIteratorWrapper();
    boolean var15 = var14.hasNext();
    boolean var16 = var14.hasNext();
    boolean var17 = var14.hasNext();
    boolean var18 = var14.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var18);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test314() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test314");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var5.hasNext();
    boolean var7 = var5.hasNext();
    boolean var8 = var5.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test315() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test315");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var4.new RingBufferIteratorWrapper();
    boolean var9 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var4.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test316() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test316");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var8 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test317() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test317");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    boolean var2 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test318() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test318");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    boolean var16 = var1.isEmpty();
    boolean var17 = var1.isEmpty();
    java.lang.Object var18 = var1.dequeue();
    exercise01.RingBufferWrapper var20 = new exercise01.RingBufferWrapper(100);
    boolean var21 = var20.isEmpty();
    exercise01.RingBufferWrapper var23 = new exercise01.RingBufferWrapper(0);
    int var24 = var23.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var23.new RingBufferIteratorWrapper();
    var20.enqueue((java.lang.Object)var23);
    boolean var27 = var20.isEmpty();
    int var28 = var20.size();
    int var29 = var20.size();
    int var30 = var20.size();
    boolean var31 = var20.isEmpty();
    java.lang.Object var32 = var20.dequeue();
    boolean var33 = var20.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var34 = var20.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var34.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test319() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test319");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    boolean var5 = var4.hasNext();
    boolean var6 = var4.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var4.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test320() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test320");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var9 = new exercise01.RingBufferWrapper(100);
    java.lang.Object var10 = new java.lang.Object();
    var9.enqueue(var10);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var9.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var9.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var13);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test321() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test321");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var7.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test322() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test322");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    exercise01.RingBufferWrapper var9 = new exercise01.RingBufferWrapper(0);
    int var10 = var9.size();
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    java.util.Iterator var13 = var9.iterator();
    boolean var14 = var9.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var9.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test323() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test323");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    int var6 = var4.size();
    boolean var7 = var4.isEmpty();
    java.util.Iterator var8 = var4.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var12 = var1.iterator();
    boolean var13 = var1.isEmpty();
    java.lang.Object var14 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test324() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test324");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    boolean var11 = var10.hasNext();
    java.lang.Object var12 = var10.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test325() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test325");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(0);
    int var14 = var13.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var13.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var13);
    int var17 = var13.size();
    exercise01.RingBufferWrapper var19 = new exercise01.RingBufferWrapper(100);
    boolean var20 = var19.isEmpty();
    exercise01.RingBufferWrapper var22 = new exercise01.RingBufferWrapper(0);
    int var23 = var22.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var24 = var22.new RingBufferIteratorWrapper();
    var19.enqueue((java.lang.Object)var22);
    var19.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var29 = new exercise01.RingBufferWrapper(0);
    int var30 = var29.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var31 = var29.new RingBufferIteratorWrapper();
    java.util.Iterator var32 = var29.iterator();
    var19.enqueue((java.lang.Object)var29);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var34 = var19.new RingBufferIteratorWrapper();
    java.lang.Object var35 = var19.dequeue();
    java.util.Iterator var36 = var19.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.enqueue((java.lang.Object)var19);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);

  }

  public void test326() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test326");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test327() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test327");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    int var7 = var1.size();
    int var8 = var1.size();
    boolean var9 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test328() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test328");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    boolean var13 = var1.isEmpty();
    int var14 = var1.size();
    java.lang.Object var15 = var1.dequeue();
    boolean var16 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test329() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test329");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    boolean var8 = var7.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test330() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test330");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var8 = var4.iterator();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var4.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test331() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test331");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var11 = var1.iterator();
    java.util.Iterator var12 = var1.iterator();
    java.lang.Object var13 = var1.dequeue();
    boolean var14 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test332() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test332");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    exercise01.RingBufferWrapper var5 = new exercise01.RingBufferWrapper(100);
    boolean var6 = var5.isEmpty();
    exercise01.RingBufferWrapper var8 = new exercise01.RingBufferWrapper(0);
    int var9 = var8.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var8.new RingBufferIteratorWrapper();
    var5.enqueue((java.lang.Object)var8);
    var5.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var15 = new exercise01.RingBufferWrapper(0);
    int var16 = var15.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var15.new RingBufferIteratorWrapper();
    java.util.Iterator var18 = var15.iterator();
    var5.enqueue((java.lang.Object)var15);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var20 = var5.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var5);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var22 = var5.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var23 = var5.new RingBufferIteratorWrapper();
    boolean var24 = var23.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);

  }

  public void test333() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test333");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    boolean var7 = var6.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test334() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test334");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    java.lang.Object var13 = var1.dequeue();
    exercise01.RingBufferWrapper var15 = new exercise01.RingBufferWrapper(100);
    boolean var16 = var15.isEmpty();
    exercise01.RingBufferWrapper var18 = new exercise01.RingBufferWrapper(0);
    int var19 = var18.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var20 = var18.new RingBufferIteratorWrapper();
    var15.enqueue((java.lang.Object)var18);
    boolean var22 = var15.isEmpty();
    int var23 = var15.size();
    int var24 = var15.size();
    boolean var25 = var15.isEmpty();
    int var26 = var15.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var27 = var15.new RingBufferIteratorWrapper();
    java.lang.Object var28 = var27.next();
    var1.enqueue((java.lang.Object)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var30 = var27.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test335() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test335");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(0);
    int var14 = var13.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var13.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var13);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test336() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test336");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    int var10 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var11.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test337() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test337");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    exercise01.RingBufferWrapper var3 = new exercise01.RingBufferWrapper(0);
    int var4 = var3.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var3.new RingBufferIteratorWrapper();
    java.util.Iterator var6 = var3.iterator();
    var1.enqueue((java.lang.Object)var3);
    int var8 = var3.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var3.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var3.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test338() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test338");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test339() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test339");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    int var11 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var13 = var12.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test340() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test340");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    int var8 = var4.size();
    java.util.Iterator var9 = var4.iterator();
    boolean var10 = var4.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var4.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test341() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test341");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    int var10 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var12 = var4.iterator();
    exercise01.RingBufferWrapper var14 = new exercise01.RingBufferWrapper(100);
    boolean var15 = var14.isEmpty();
    exercise01.RingBufferWrapper var17 = new exercise01.RingBufferWrapper(0);
    int var18 = var17.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var19 = var17.new RingBufferIteratorWrapper();
    var14.enqueue((java.lang.Object)var17);
    boolean var21 = var14.isEmpty();
    int var22 = var14.size();
    int var23 = var14.size();
    boolean var24 = var14.isEmpty();
    int var25 = var14.size();
    int var26 = var14.size();
    java.util.Iterator var27 = var14.iterator();
    java.lang.Object var28 = var14.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var29 = var14.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.enqueue((java.lang.Object)var29);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test342() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test342");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test343() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test343");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    java.lang.Object var13 = var1.dequeue();
    exercise01.RingBufferWrapper var15 = new exercise01.RingBufferWrapper(100);
    boolean var16 = var15.isEmpty();
    exercise01.RingBufferWrapper var18 = new exercise01.RingBufferWrapper(0);
    int var19 = var18.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var20 = var18.new RingBufferIteratorWrapper();
    var15.enqueue((java.lang.Object)var18);
    boolean var22 = var15.isEmpty();
    int var23 = var15.size();
    int var24 = var15.size();
    boolean var25 = var15.isEmpty();
    int var26 = var15.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var27 = var15.new RingBufferIteratorWrapper();
    java.lang.Object var28 = var27.next();
    var1.enqueue((java.lang.Object)var27);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var27.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test344() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test344");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    int var6 = var4.size();
    boolean var7 = var4.isEmpty();
    java.util.Iterator var8 = var4.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(100);
    boolean var14 = var13.isEmpty();
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(0);
    int var17 = var16.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var18 = var16.new RingBufferIteratorWrapper();
    var13.enqueue((java.lang.Object)var16);
    boolean var20 = var13.isEmpty();
    int var21 = var13.size();
    int var22 = var13.size();
    boolean var23 = var13.isEmpty();
    int var24 = var13.size();
    var1.enqueue((java.lang.Object)var13);
    boolean var26 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var27 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var27.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test345() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test345");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    int var8 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test346() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test346");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    boolean var5 = var4.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test347() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test347");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test348() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test348");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    int var11 = var10.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var10.new RingBufferIteratorWrapper();
    java.util.Iterator var13 = var10.iterator();
    var1.enqueue((java.lang.Object)var13);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var16 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test349() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test349");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    java.util.Iterator var16 = var11.iterator();
    java.util.Iterator var17 = var11.iterator();
    exercise01.RingBufferWrapper var19 = new exercise01.RingBufferWrapper(0);
    int var20 = var19.size();
    int var21 = var19.size();
    boolean var22 = var19.isEmpty();
    java.util.Iterator var23 = var19.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var24 = var19.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.enqueue((java.lang.Object)var24);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test350() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test350");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var5.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test351() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test351");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    java.lang.Object var2 = new java.lang.Object();
    var1.enqueue(var2);
    exercise01.RingBufferWrapper var5 = new exercise01.RingBufferWrapper(100);
    boolean var6 = var5.isEmpty();
    java.util.Iterator var7 = var5.iterator();
    int var8 = var5.size();
    java.util.Iterator var9 = var5.iterator();
    var1.enqueue((java.lang.Object)var5);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var5.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var11.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test352() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test352");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    boolean var16 = var1.isEmpty();
    boolean var17 = var1.isEmpty();
    java.lang.Object var18 = var1.dequeue();
    exercise01.RingBufferWrapper var20 = new exercise01.RingBufferWrapper(100);
    boolean var21 = var20.isEmpty();
    exercise01.RingBufferWrapper var23 = new exercise01.RingBufferWrapper(0);
    int var24 = var23.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var23.new RingBufferIteratorWrapper();
    var20.enqueue((java.lang.Object)var23);
    boolean var27 = var20.isEmpty();
    int var28 = var20.size();
    int var29 = var20.size();
    int var30 = var20.size();
    boolean var31 = var20.isEmpty();
    java.lang.Object var32 = var20.dequeue();
    boolean var33 = var20.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var34 = var20.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var36 = var34.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test353() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test353");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test354() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test354");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var11 = var4.iterator();
    boolean var12 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var4.new RingBufferIteratorWrapper();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test355() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test355");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    exercise01.RingBufferWrapper var12 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var13 = var12.iterator();
    var1.enqueue((java.lang.Object)var12);
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(100);
    java.lang.Object var17 = new java.lang.Object();
    var16.enqueue(var17);
    exercise01.RingBufferWrapper var20 = new exercise01.RingBufferWrapper(100);
    boolean var21 = var20.isEmpty();
    java.util.Iterator var22 = var20.iterator();
    int var23 = var20.size();
    java.util.Iterator var24 = var20.iterator();
    var16.enqueue((java.lang.Object)var20);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var26 = var20.new RingBufferIteratorWrapper();
    var12.enqueue((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test356() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test356");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var16 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var17 = var1.dequeue();
    java.util.Iterator var18 = var1.iterator();
    java.util.Iterator var19 = var1.iterator();
    int var20 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 2);

  }

  public void test357() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test357");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    int var6 = var4.size();
    boolean var7 = var4.isEmpty();
    java.util.Iterator var8 = var4.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(100);
    boolean var14 = var13.isEmpty();
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(0);
    int var17 = var16.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var18 = var16.new RingBufferIteratorWrapper();
    var13.enqueue((java.lang.Object)var16);
    boolean var20 = var13.isEmpty();
    int var21 = var13.size();
    int var22 = var13.size();
    boolean var23 = var13.isEmpty();
    int var24 = var13.size();
    var1.enqueue((java.lang.Object)var13);
    java.util.Iterator var26 = var1.iterator();
    boolean var27 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test358() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test358");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var4.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test359() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test359");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    boolean var7 = var6.hasNext();
    boolean var8 = var6.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test360() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test360");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
    exercise01.RingBufferWrapper var6 = new exercise01.RingBufferWrapper(100);
    boolean var7 = var6.isEmpty();
    exercise01.RingBufferWrapper var9 = new exercise01.RingBufferWrapper(0);
    int var10 = var9.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var9.new RingBufferIteratorWrapper();
    var6.enqueue((java.lang.Object)var9);
    java.util.Iterator var13 = var9.iterator();
    int var14 = var9.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var9.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var9);
    boolean var17 = var9.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test361() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test361");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    boolean var16 = var1.isEmpty();
    boolean var17 = var1.isEmpty();
    java.lang.Object var18 = var1.dequeue();
    boolean var19 = var1.isEmpty();
    java.lang.Object var20 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 10.0f+ "'", var20.equals(10.0f));

  }

  public void test362() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test362");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    java.lang.Object var13 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var14 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(0);
    int var17 = var16.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var18 = var16.new RingBufferIteratorWrapper();
    java.util.Iterator var19 = var16.iterator();
    java.util.Iterator var20 = var16.iterator();
    int var21 = var16.size();
    var1.enqueue((java.lang.Object)var16);
    boolean var23 = var16.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var24 = var16.new RingBufferIteratorWrapper();
    boolean var25 = var24.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test363() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test363");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBufferWrapper var9 = new exercise01.RingBufferWrapper(0);
    int var10 = var9.size();
    int var11 = var9.size();
    boolean var12 = var9.isEmpty();
    java.util.Iterator var13 = var9.iterator();
    boolean var14 = var9.isEmpty();
    boolean var15 = var9.isEmpty();
    boolean var16 = var9.isEmpty();
    java.util.Iterator var17 = var9.iterator();
    int var18 = var9.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var9);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test364() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test364");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(100);
    exercise01.RingBufferWrapper var15 = new exercise01.RingBufferWrapper(0);
    int var16 = var15.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var15.new RingBufferIteratorWrapper();
    java.util.Iterator var18 = var15.iterator();
    var13.enqueue((java.lang.Object)var15);
    int var20 = var15.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var21 = var15.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var15);
    exercise01.RingBufferWrapper var24 = new exercise01.RingBufferWrapper(100);
    boolean var25 = var24.isEmpty();
    java.util.Iterator var26 = var24.iterator();
    int var27 = var24.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.enqueue((java.lang.Object)var24);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);

  }

  public void test365() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test365");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var1.iterator();
    int var11 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test366() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test366");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    java.lang.Object var13 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var14 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var14.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test367() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test367");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    exercise01.RingBufferWrapper var3 = new exercise01.RingBufferWrapper(0);
    int var4 = var3.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var3.new RingBufferIteratorWrapper();
    java.util.Iterator var6 = var3.iterator();
    var1.enqueue((java.lang.Object)var3);
    boolean var8 = var3.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var3.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var3.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test368() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test368");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    int var5 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test369() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test369");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    java.util.Iterator var15 = var1.iterator();
    exercise01.RingBufferWrapper var17 = new exercise01.RingBufferWrapper(0);
    int var18 = var17.size();
    int var19 = var17.size();
    boolean var20 = var17.isEmpty();
    java.util.Iterator var21 = var17.iterator();
    boolean var22 = var17.isEmpty();
    boolean var23 = var17.isEmpty();
    boolean var24 = var17.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var17.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var26 = var17.new RingBufferIteratorWrapper();
    boolean var27 = var26.hasNext();
    var1.enqueue((java.lang.Object)var26);
    exercise01.RingBufferWrapper var30 = new exercise01.RingBufferWrapper(0);
    int var31 = var30.size();
    int var32 = var30.size();
    boolean var33 = var30.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var34 = var30.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var34);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var34.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test370() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test370");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    exercise01.RingBufferWrapper var3 = new exercise01.RingBufferWrapper(0);
    int var4 = var3.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var3.new RingBufferIteratorWrapper();
    java.util.Iterator var6 = var3.iterator();
    var1.enqueue((java.lang.Object)var3);
    boolean var8 = var3.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var3.new RingBufferIteratorWrapper();
    int var10 = var3.size();
    int var11 = var3.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test371() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test371");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    int var6 = var1.size();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    int var9 = var1.size();
    int var10 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test372() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test372");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    boolean var16 = var1.isEmpty();
    boolean var17 = var1.isEmpty();
    java.util.Iterator var18 = var1.iterator();
    exercise01.RingBufferWrapper var20 = new exercise01.RingBufferWrapper(100);
    boolean var21 = var20.isEmpty();
    exercise01.RingBufferWrapper var23 = new exercise01.RingBufferWrapper(0);
    int var24 = var23.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var23.new RingBufferIteratorWrapper();
    var20.enqueue((java.lang.Object)var23);
    boolean var27 = var20.isEmpty();
    int var28 = var20.size();
    int var29 = var20.size();
    var1.enqueue((java.lang.Object)var29);
    exercise01.RingBufferWrapper var32 = new exercise01.RingBufferWrapper(0);
    int var33 = var32.size();
    int var34 = var32.size();
    boolean var35 = var32.isEmpty();
    java.util.Iterator var36 = var32.iterator();
    boolean var37 = var32.isEmpty();
    boolean var38 = var32.isEmpty();
    boolean var39 = var32.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var40 = var32.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var41 = var32.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var42 = var32.new RingBufferIteratorWrapper();
    int var43 = var32.size();
    var1.enqueue((java.lang.Object)var43);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var45 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var46 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test373() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test373");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var10.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var10);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test374() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test374");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    java.util.Iterator var15 = var1.iterator();
    exercise01.RingBufferWrapper var17 = new exercise01.RingBufferWrapper(0);
    int var18 = var17.size();
    int var19 = var17.size();
    boolean var20 = var17.isEmpty();
    java.util.Iterator var21 = var17.iterator();
    boolean var22 = var17.isEmpty();
    boolean var23 = var17.isEmpty();
    boolean var24 = var17.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var17.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var26 = var17.new RingBufferIteratorWrapper();
    boolean var27 = var26.hasNext();
    var1.enqueue((java.lang.Object)var26);
    exercise01.RingBufferWrapper var30 = new exercise01.RingBufferWrapper(100);
    boolean var31 = var30.isEmpty();
    exercise01.RingBufferWrapper var33 = new exercise01.RingBufferWrapper(0);
    int var34 = var33.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var35 = var33.new RingBufferIteratorWrapper();
    var30.enqueue((java.lang.Object)var33);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var37 = var30.new RingBufferIteratorWrapper();
    java.util.Iterator var38 = var30.iterator();
    int var39 = var30.size();
    var1.enqueue((java.lang.Object)var39);
    java.lang.Object var41 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);

  }

  public void test375() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test375");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test376() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test376");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var4.new RingBufferIteratorWrapper();
    boolean var9 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    int var11 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var12.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test377() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test377");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    int var13 = var1.size();
    boolean var14 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test378() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test378");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var5.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test379() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test379");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    int var11 = var10.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var10.new RingBufferIteratorWrapper();
    java.util.Iterator var13 = var10.iterator();
    var1.enqueue((java.lang.Object)var13);
    java.lang.Object var15 = var1.dequeue();
    java.lang.Object var16 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var1.new RingBufferIteratorWrapper();
    int var18 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);

  }

  public void test380() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test380");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    java.lang.Object var2 = new java.lang.Object();
    var1.enqueue(var2);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);

  }

  public void test381() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test381");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    java.lang.Object var2 = new java.lang.Object();
    var1.enqueue(var2);
    exercise01.RingBufferWrapper var5 = new exercise01.RingBufferWrapper(100);
    boolean var6 = var5.isEmpty();
    java.util.Iterator var7 = var5.iterator();
    int var8 = var5.size();
    java.util.Iterator var9 = var5.iterator();
    var1.enqueue((java.lang.Object)var5);
    exercise01.RingBufferWrapper var12 = new exercise01.RingBufferWrapper(0);
    int var13 = var12.size();
    int var14 = var12.size();
    java.util.Iterator var15 = var12.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var16 = var12.new RingBufferIteratorWrapper();
    java.util.Iterator var17 = var12.iterator();
    var5.enqueue((java.lang.Object)var17);
    int var19 = var5.size();
    exercise01.RingBufferWrapper var21 = new exercise01.RingBufferWrapper(0);
    int var22 = var21.size();
    int var23 = var21.size();
    boolean var24 = var21.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var21.new RingBufferIteratorWrapper();
    boolean var26 = var21.isEmpty();
    java.util.Iterator var27 = var21.iterator();
    var5.enqueue((java.lang.Object)var27);
    int var29 = var5.size();
    java.lang.Object var30 = var5.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test382() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test382");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var12 = var11.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var11.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test383() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test383");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    boolean var8 = var7.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test384() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test384");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    boolean var7 = var6.hasNext();
    boolean var8 = var6.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test385() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test385");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    int var16 = var1.size();
    java.util.Iterator var17 = var1.iterator();
    exercise01.RingBufferWrapper var19 = new exercise01.RingBufferWrapper(100);
    boolean var20 = var19.isEmpty();
    exercise01.RingBufferWrapper var22 = new exercise01.RingBufferWrapper(0);
    int var23 = var22.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var24 = var22.new RingBufferIteratorWrapper();
    var19.enqueue((java.lang.Object)var22);
    boolean var26 = var19.isEmpty();
    int var27 = var19.size();
    int var28 = var19.size();
    java.util.Iterator var29 = var19.iterator();
    exercise01.RingBufferWrapper var31 = new exercise01.RingBufferWrapper(100);
    boolean var32 = var31.isEmpty();
    exercise01.RingBufferWrapper var34 = new exercise01.RingBufferWrapper(0);
    int var35 = var34.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var36 = var34.new RingBufferIteratorWrapper();
    var31.enqueue((java.lang.Object)var34);
    boolean var38 = var31.isEmpty();
    int var39 = var31.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var40 = var31.new RingBufferIteratorWrapper();
    var19.enqueue((java.lang.Object)var31);
    java.lang.Object var42 = var19.dequeue();
    int var43 = var19.size();
    java.util.Iterator var44 = var19.iterator();
    var1.enqueue((java.lang.Object)var44);
    java.util.Iterator var46 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var46);

  }

  public void test386() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test386");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    java.util.Iterator var13 = var1.iterator();
    java.lang.Object var14 = var1.dequeue();
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(0);
    int var17 = var16.size();
    int var18 = var16.size();
    boolean var19 = var16.isEmpty();
    java.util.Iterator var20 = var16.iterator();
    boolean var21 = var16.isEmpty();
    boolean var22 = var16.isEmpty();
    boolean var23 = var16.isEmpty();
    var1.enqueue((java.lang.Object)var23);
    int var25 = var1.size();
    exercise01.RingBufferWrapper var27 = new exercise01.RingBufferWrapper(100);
    int var28 = var27.size();
    boolean var29 = var27.isEmpty();
    boolean var30 = var27.isEmpty();
    boolean var31 = var27.isEmpty();
    java.util.Iterator var32 = var27.iterator();
    var1.enqueue((java.lang.Object)var27);
    int var34 = var27.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);

  }

  public void test387() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test387");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    int var8 = var1.size();
    java.lang.Object var9 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test388() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test388");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test389() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test389");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    boolean var16 = var1.isEmpty();
    java.util.Iterator var17 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test390() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test390");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    boolean var13 = var1.isEmpty();
    int var14 = var1.size();
    java.util.Iterator var15 = var1.iterator();
    int var16 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 1);

  }

  public void test391() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test391");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    exercise01.RingBufferWrapper var3 = new exercise01.RingBufferWrapper(10);
    int var4 = var3.size();
    var1.enqueue((java.lang.Object)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test392() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test392");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    int var11 = var10.size();
    int var12 = var10.size();
    java.util.Iterator var13 = var10.iterator();
    java.util.Iterator var14 = var10.iterator();
    boolean var15 = var10.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var16 = var10.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var10.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var10);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test393() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test393");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    java.lang.Object var2 = new java.lang.Object();
    var1.enqueue(var2);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test394() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test394");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var9 = var8.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var8.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test395() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test395");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    java.util.Iterator var13 = var1.iterator();
    java.lang.Object var14 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    boolean var16 = var15.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var17 = var15.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test396() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test396");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test397() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test397");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    exercise01.RingBufferWrapper var3 = new exercise01.RingBufferWrapper(0);
    int var4 = var3.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var3.new RingBufferIteratorWrapper();
    java.util.Iterator var6 = var3.iterator();
    var1.enqueue((java.lang.Object)var3);
    int var8 = var1.size();
    int var9 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test398() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test398");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var11 = var4.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var4.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test399() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test399");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var5.hasNext();
    boolean var7 = var5.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test400() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test400");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var1.new RingBufferIteratorWrapper();
    int var12 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test401() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test401");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    boolean var13 = var1.isEmpty();
    int var14 = var1.size();
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(100);
    boolean var17 = var16.isEmpty();
    exercise01.RingBufferWrapper var19 = new exercise01.RingBufferWrapper(0);
    int var20 = var19.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var21 = var19.new RingBufferIteratorWrapper();
    var16.enqueue((java.lang.Object)var19);
    boolean var23 = var16.isEmpty();
    int var24 = var16.size();
    int var25 = var16.size();
    boolean var26 = var16.isEmpty();
    int var27 = var16.size();
    java.util.Iterator var28 = var16.iterator();
    java.lang.Object var29 = var16.dequeue();
    exercise01.RingBufferWrapper var31 = new exercise01.RingBufferWrapper(0);
    int var32 = var31.size();
    int var33 = var31.size();
    boolean var34 = var31.isEmpty();
    java.util.Iterator var35 = var31.iterator();
    boolean var36 = var31.isEmpty();
    boolean var37 = var31.isEmpty();
    boolean var38 = var31.isEmpty();
    var16.enqueue((java.lang.Object)var38);
    int var40 = var16.size();
    var1.enqueue((java.lang.Object)var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);

  }

  public void test402() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test402");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var4.new RingBufferIteratorWrapper();
    boolean var9 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var11 = var10.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test403() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test403");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var11 = var4.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var4.new RingBufferIteratorWrapper();
    boolean var13 = var12.hasNext();
    boolean var14 = var12.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var12.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test404() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test404");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var7.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test405() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test405");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    java.lang.Object var2 = new java.lang.Object();
    var1.enqueue(var2);
    exercise01.RingBufferWrapper var5 = new exercise01.RingBufferWrapper(1);
    boolean var6 = var5.isEmpty();
    boolean var7 = var5.isEmpty();
    var1.enqueue((java.lang.Object)var7);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    boolean var10 = var9.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test406() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test406");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    exercise01.RingBufferWrapper var5 = new exercise01.RingBufferWrapper(100);
    boolean var6 = var5.isEmpty();
    exercise01.RingBufferWrapper var8 = new exercise01.RingBufferWrapper(0);
    int var9 = var8.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var8.new RingBufferIteratorWrapper();
    var5.enqueue((java.lang.Object)var8);
    var5.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var15 = new exercise01.RingBufferWrapper(0);
    int var16 = var15.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var15.new RingBufferIteratorWrapper();
    java.util.Iterator var18 = var15.iterator();
    var5.enqueue((java.lang.Object)var15);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var20 = var5.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var5);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var22 = var5.new RingBufferIteratorWrapper();
    java.lang.Object var23 = var22.next();
    java.lang.Object var24 = var22.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + 10.0f+ "'", var24.equals(10.0f));

  }

  public void test407() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test407");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test408() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test408");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(100);
    exercise01.RingBufferWrapper var15 = new exercise01.RingBufferWrapper(0);
    int var16 = var15.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var15.new RingBufferIteratorWrapper();
    java.util.Iterator var18 = var15.iterator();
    var13.enqueue((java.lang.Object)var15);
    int var20 = var15.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var21 = var15.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var15);
    int var23 = var15.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);

  }

  public void test409() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test409");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(100);
    boolean var17 = var16.isEmpty();
    exercise01.RingBufferWrapper var19 = new exercise01.RingBufferWrapper(0);
    int var20 = var19.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var21 = var19.new RingBufferIteratorWrapper();
    var16.enqueue((java.lang.Object)var19);
    boolean var23 = var16.isEmpty();
    int var24 = var16.size();
    int var25 = var16.size();
    boolean var26 = var16.isEmpty();
    java.util.Iterator var27 = var16.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var28 = var16.new RingBufferIteratorWrapper();
    boolean var29 = var28.hasNext();
    var1.enqueue((java.lang.Object)var29);
    int var31 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == 1);

  }

  public void test410() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test410");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var11 = var4.iterator();
    boolean var12 = var4.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var4.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test411() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test411");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    int var11 = var10.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var10.new RingBufferIteratorWrapper();
    java.util.Iterator var13 = var10.iterator();
    var1.enqueue((java.lang.Object)var13);
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(100);
    boolean var17 = var16.isEmpty();
    exercise01.RingBufferWrapper var19 = new exercise01.RingBufferWrapper(0);
    int var20 = var19.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var21 = var19.new RingBufferIteratorWrapper();
    var16.enqueue((java.lang.Object)var19);
    boolean var23 = var16.isEmpty();
    int var24 = var16.size();
    int var25 = var16.size();
    boolean var26 = var16.isEmpty();
    int var27 = var16.size();
    java.util.Iterator var28 = var16.iterator();
    var1.enqueue((java.lang.Object)var16);
    java.lang.Object var30 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var31 = var1.new RingBufferIteratorWrapper();
    boolean var32 = var31.hasNext();
    java.lang.Object var33 = var31.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);

  }

  public void test412() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test412");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    int var9 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test413() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test413");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test414() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test414");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    boolean var13 = var1.isEmpty();
    boolean var14 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test415() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test415");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test416() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test416");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var14 = var1.dequeue();
    java.util.Iterator var15 = var1.iterator();
    exercise01.RingBufferWrapper var17 = new exercise01.RingBufferWrapper(0);
    int var18 = var17.size();
    int var19 = var17.size();
    boolean var20 = var17.isEmpty();
    java.util.Iterator var21 = var17.iterator();
    boolean var22 = var17.isEmpty();
    boolean var23 = var17.isEmpty();
    boolean var24 = var17.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var17.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var26 = var17.new RingBufferIteratorWrapper();
    boolean var27 = var26.hasNext();
    var1.enqueue((java.lang.Object)var26);
    boolean var29 = var26.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var30 = var26.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test417() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test417");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    int var6 = var4.size();
    boolean var7 = var4.isEmpty();
    java.util.Iterator var8 = var4.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(100);
    boolean var14 = var13.isEmpty();
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(0);
    int var17 = var16.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var18 = var16.new RingBufferIteratorWrapper();
    var13.enqueue((java.lang.Object)var16);
    boolean var20 = var13.isEmpty();
    int var21 = var13.size();
    int var22 = var13.size();
    boolean var23 = var13.isEmpty();
    int var24 = var13.size();
    var1.enqueue((java.lang.Object)var13);
    boolean var26 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var27 = var1.new RingBufferIteratorWrapper();
    boolean var28 = var27.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);

  }

  public void test418() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test418");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    boolean var8 = var1.isEmpty();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test419() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test419");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(100);
    boolean var12 = var11.isEmpty();
    exercise01.RingBufferWrapper var14 = new exercise01.RingBufferWrapper(0);
    int var15 = var14.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var16 = var14.new RingBufferIteratorWrapper();
    var11.enqueue((java.lang.Object)var14);
    var11.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var21 = new exercise01.RingBufferWrapper(0);
    int var22 = var21.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var23 = var21.new RingBufferIteratorWrapper();
    java.util.Iterator var24 = var21.iterator();
    var11.enqueue((java.lang.Object)var21);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var26 = var11.new RingBufferIteratorWrapper();
    java.lang.Object var27 = var11.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var11);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test420() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test420");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    int var5 = var1.size();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test421() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test421");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test422() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test422");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test423() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test423");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    java.util.Iterator var13 = var1.iterator();
    java.lang.Object var14 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test424() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test424");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test425() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test425");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test426() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test426");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    java.util.Iterator var12 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    boolean var14 = var13.hasNext();
    java.lang.Object var15 = var13.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test427() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test427");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(100);
    exercise01.RingBufferWrapper var15 = new exercise01.RingBufferWrapper(0);
    int var16 = var15.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var15.new RingBufferIteratorWrapper();
    java.util.Iterator var18 = var15.iterator();
    var13.enqueue((java.lang.Object)var15);
    int var20 = var15.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var21 = var15.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var15);
    int var23 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 2);

  }

  public void test428() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test428");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var4.new RingBufferIteratorWrapper();
    boolean var9 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test429() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test429");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    java.lang.Object var13 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var14 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(0);
    int var17 = var16.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var18 = var16.new RingBufferIteratorWrapper();
    java.util.Iterator var19 = var16.iterator();
    java.util.Iterator var20 = var16.iterator();
    int var21 = var16.size();
    var1.enqueue((java.lang.Object)var16);
    boolean var23 = var16.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var24 = var16.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var16.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var25.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);

  }

  public void test430() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test430");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var14 = new exercise01.RingBufferWrapper(100);
    boolean var15 = var14.isEmpty();
    exercise01.RingBufferWrapper var17 = new exercise01.RingBufferWrapper(0);
    int var18 = var17.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var19 = var17.new RingBufferIteratorWrapper();
    var14.enqueue((java.lang.Object)var17);
    boolean var21 = var14.isEmpty();
    int var22 = var14.size();
    int var23 = var14.size();
    int var24 = var14.size();
    int var25 = var14.size();
    java.util.Iterator var26 = var14.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var14);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test431() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test431");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    int var6 = var4.size();
    boolean var7 = var4.isEmpty();
    java.util.Iterator var8 = var4.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var4.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var4.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test432() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test432");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test433() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test433");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    boolean var10 = var9.hasNext();
    boolean var11 = var9.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test434() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test434");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var4.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var4.new RingBufferIteratorWrapper();
    int var13 = var4.size();
    int var14 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var4.new RingBufferIteratorWrapper();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test435() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test435");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    java.lang.Object var8 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(100);
    boolean var12 = var11.isEmpty();
    exercise01.RingBufferWrapper var14 = new exercise01.RingBufferWrapper(0);
    int var15 = var14.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var16 = var14.new RingBufferIteratorWrapper();
    var11.enqueue((java.lang.Object)var14);
    java.util.Iterator var18 = var11.iterator();
    exercise01.RingBufferWrapper var20 = new exercise01.RingBufferWrapper(0);
    int var21 = var20.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var22 = var20.new RingBufferIteratorWrapper();
    java.util.Iterator var23 = var20.iterator();
    var11.enqueue((java.lang.Object)var23);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var11.new RingBufferIteratorWrapper();
    java.lang.Object var26 = var25.next();
    java.lang.Object var27 = var25.next();
    var1.enqueue((java.lang.Object)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test436() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test436");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    int var7 = var1.size();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test437() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test437");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    boolean var9 = var8.hasNext();
    boolean var10 = var8.hasNext();
    java.lang.Object var11 = var8.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var8.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test438() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test438");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    int var11 = var10.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var10.new RingBufferIteratorWrapper();
    java.util.Iterator var13 = var10.iterator();
    var1.enqueue((java.lang.Object)var13);
    java.lang.Object var15 = var1.dequeue();
    boolean var16 = var1.isEmpty();
    java.util.Iterator var17 = var1.iterator();
    boolean var18 = var1.isEmpty();
    int var19 = var1.size();
    int var20 = var1.size();
    java.lang.Object var21 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test439() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test439");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    int var2 = var1.size();
    int var3 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test440() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test440");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    boolean var16 = var1.isEmpty();
    boolean var17 = var1.isEmpty();
    java.lang.Object var18 = var1.dequeue();
    exercise01.RingBufferWrapper var20 = new exercise01.RingBufferWrapper(100);
    boolean var21 = var20.isEmpty();
    exercise01.RingBufferWrapper var23 = new exercise01.RingBufferWrapper(0);
    int var24 = var23.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var23.new RingBufferIteratorWrapper();
    var20.enqueue((java.lang.Object)var23);
    boolean var27 = var20.isEmpty();
    int var28 = var20.size();
    int var29 = var20.size();
    int var30 = var20.size();
    boolean var31 = var20.isEmpty();
    java.lang.Object var32 = var20.dequeue();
    boolean var33 = var20.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var34 = var20.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var34);
    int var36 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 3);

  }

  public void test441() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test441");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    java.util.Iterator var12 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var15 = new exercise01.RingBufferWrapper(100);
    java.lang.Object var16 = new java.lang.Object();
    var15.enqueue(var16);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var18 = var15.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var19 = var15.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var15);
    boolean var21 = var15.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test442() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test442");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var9 = var1.dequeue();
    boolean var10 = var1.isEmpty();
    exercise01.RingBufferWrapper var12 = new exercise01.RingBufferWrapper(100);
    boolean var13 = var12.isEmpty();
    exercise01.RingBufferWrapper var15 = new exercise01.RingBufferWrapper(0);
    int var16 = var15.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var15.new RingBufferIteratorWrapper();
    var12.enqueue((java.lang.Object)var15);
    var12.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var22 = new exercise01.RingBufferWrapper(0);
    int var23 = var22.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var24 = var22.new RingBufferIteratorWrapper();
    java.util.Iterator var25 = var22.iterator();
    var12.enqueue((java.lang.Object)var22);
    boolean var27 = var12.isEmpty();
    boolean var28 = var12.isEmpty();
    java.util.Iterator var29 = var12.iterator();
    exercise01.RingBufferWrapper var31 = new exercise01.RingBufferWrapper(100);
    boolean var32 = var31.isEmpty();
    exercise01.RingBufferWrapper var34 = new exercise01.RingBufferWrapper(0);
    int var35 = var34.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var36 = var34.new RingBufferIteratorWrapper();
    var31.enqueue((java.lang.Object)var34);
    boolean var38 = var31.isEmpty();
    int var39 = var31.size();
    int var40 = var31.size();
    var12.enqueue((java.lang.Object)var40);
    exercise01.RingBufferWrapper var43 = new exercise01.RingBufferWrapper(0);
    int var44 = var43.size();
    int var45 = var43.size();
    boolean var46 = var43.isEmpty();
    java.util.Iterator var47 = var43.iterator();
    boolean var48 = var43.isEmpty();
    boolean var49 = var43.isEmpty();
    boolean var50 = var43.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var51 = var43.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var52 = var43.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var53 = var43.new RingBufferIteratorWrapper();
    int var54 = var43.size();
    var12.enqueue((java.lang.Object)var54);
    boolean var56 = var12.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    java.util.Iterator var58 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);

  }

  public void test443() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test443");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var6.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test444() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test444");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBufferWrapper var9 = new exercise01.RingBufferWrapper(100);
    boolean var10 = var9.isEmpty();
    exercise01.RingBufferWrapper var12 = new exercise01.RingBufferWrapper(0);
    int var13 = var12.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var14 = var12.new RingBufferIteratorWrapper();
    var9.enqueue((java.lang.Object)var12);
    java.util.Iterator var16 = var9.iterator();
    exercise01.RingBufferWrapper var18 = new exercise01.RingBufferWrapper(0);
    int var19 = var18.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var20 = var18.new RingBufferIteratorWrapper();
    java.util.Iterator var21 = var18.iterator();
    var9.enqueue((java.lang.Object)var21);
    java.lang.Object var23 = var9.dequeue();
    boolean var24 = var9.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var24);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test445() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test445");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test446() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test446");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test447() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test447");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test448() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test448");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    int var11 = var10.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var10.new RingBufferIteratorWrapper();
    java.util.Iterator var13 = var10.iterator();
    var1.enqueue((java.lang.Object)var13);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    boolean var16 = var15.hasNext();
    boolean var17 = var15.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test449() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test449");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    int var13 = var1.size();
    java.util.Iterator var14 = var1.iterator();
    java.lang.Object var15 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var16 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test450() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test450");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBufferWrapper var9 = new exercise01.RingBufferWrapper(100);
    boolean var10 = var9.isEmpty();
    exercise01.RingBufferWrapper var12 = new exercise01.RingBufferWrapper(0);
    int var13 = var12.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var14 = var12.new RingBufferIteratorWrapper();
    var9.enqueue((java.lang.Object)var12);
    boolean var16 = var9.isEmpty();
    int var17 = var9.size();
    int var18 = var9.size();
    boolean var19 = var9.isEmpty();
    int var20 = var9.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var21 = var9.new RingBufferIteratorWrapper();
    java.lang.Object var22 = var9.dequeue();
    java.util.Iterator var23 = var9.iterator();
    exercise01.RingBufferWrapper var25 = new exercise01.RingBufferWrapper(0);
    int var26 = var25.size();
    int var27 = var25.size();
    boolean var28 = var25.isEmpty();
    java.util.Iterator var29 = var25.iterator();
    boolean var30 = var25.isEmpty();
    boolean var31 = var25.isEmpty();
    boolean var32 = var25.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var33 = var25.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var34 = var25.new RingBufferIteratorWrapper();
    boolean var35 = var34.hasNext();
    var9.enqueue((java.lang.Object)var34);
    boolean var37 = var34.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var34);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test451() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test451");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var4.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test452() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test452");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    boolean var16 = var1.isEmpty();
    boolean var17 = var1.isEmpty();
    java.util.Iterator var18 = var1.iterator();
    exercise01.RingBufferWrapper var20 = new exercise01.RingBufferWrapper(100);
    boolean var21 = var20.isEmpty();
    exercise01.RingBufferWrapper var23 = new exercise01.RingBufferWrapper(0);
    int var24 = var23.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var23.new RingBufferIteratorWrapper();
    var20.enqueue((java.lang.Object)var23);
    boolean var27 = var20.isEmpty();
    int var28 = var20.size();
    int var29 = var20.size();
    var1.enqueue((java.lang.Object)var29);
    java.lang.Object var31 = var1.dequeue();
    exercise01.RingBufferWrapper var33 = new exercise01.RingBufferWrapper(0);
    int var34 = var33.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var35 = var33.new RingBufferIteratorWrapper();
    java.util.Iterator var36 = var33.iterator();
    java.util.Iterator var37 = var33.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var38 = var33.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var39 = var33.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test453() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test453");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    int var11 = var10.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var10.new RingBufferIteratorWrapper();
    java.util.Iterator var13 = var10.iterator();
    var1.enqueue((java.lang.Object)var13);
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(100);
    boolean var17 = var16.isEmpty();
    exercise01.RingBufferWrapper var19 = new exercise01.RingBufferWrapper(0);
    int var20 = var19.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var21 = var19.new RingBufferIteratorWrapper();
    var16.enqueue((java.lang.Object)var19);
    boolean var23 = var16.isEmpty();
    int var24 = var16.size();
    int var25 = var16.size();
    boolean var26 = var16.isEmpty();
    int var27 = var16.size();
    java.util.Iterator var28 = var16.iterator();
    var1.enqueue((java.lang.Object)var16);
    java.lang.Object var30 = var1.dequeue();
    java.lang.Object var31 = var1.dequeue();
    java.util.Iterator var32 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);

  }

  public void test454() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test454");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var10 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test455() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test455");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var1.isEmpty();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var9 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test456() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test456");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
    exercise01.RingBufferWrapper var6 = new exercise01.RingBufferWrapper(0);
    int var7 = var6.size();
    int var8 = var6.size();
    boolean var9 = var6.isEmpty();
    boolean var10 = var6.isEmpty();
    int var11 = var6.size();
    boolean var12 = var6.isEmpty();
    java.util.Iterator var13 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    boolean var15 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test457() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test457");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    boolean var10 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test458() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test458");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    boolean var16 = var1.isEmpty();
    boolean var17 = var1.isEmpty();
    java.lang.Object var18 = var1.dequeue();
    boolean var19 = var1.isEmpty();
    exercise01.RingBufferWrapper var21 = new exercise01.RingBufferWrapper(1);
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    exercise01.RingBufferWrapper var25 = new exercise01.RingBufferWrapper(1);
    boolean var26 = var25.isEmpty();
    int var27 = var25.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var28 = var25.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var29 = var25.new RingBufferIteratorWrapper();
    var21.enqueue((java.lang.Object)var29);
    var1.enqueue((java.lang.Object)var29);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var32 = var1.new RingBufferIteratorWrapper();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);

  }

  public void test459() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test459");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    int var11 = var10.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var10.new RingBufferIteratorWrapper();
    java.util.Iterator var13 = var10.iterator();
    var1.enqueue((java.lang.Object)var13);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var16 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);

  }

  public void test460() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test460");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(100);
    boolean var14 = var13.isEmpty();
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(0);
    int var17 = var16.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var18 = var16.new RingBufferIteratorWrapper();
    var13.enqueue((java.lang.Object)var16);
    boolean var20 = var13.isEmpty();
    int var21 = var13.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var22 = var13.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var13);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var24 = var13.new RingBufferIteratorWrapper();
    int var25 = var13.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);

  }

  public void test461() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test461");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    boolean var16 = var1.isEmpty();
    boolean var17 = var1.isEmpty();
    java.util.Iterator var18 = var1.iterator();
    exercise01.RingBufferWrapper var20 = new exercise01.RingBufferWrapper(100);
    boolean var21 = var20.isEmpty();
    exercise01.RingBufferWrapper var23 = new exercise01.RingBufferWrapper(0);
    int var24 = var23.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var23.new RingBufferIteratorWrapper();
    var20.enqueue((java.lang.Object)var23);
    boolean var27 = var20.isEmpty();
    int var28 = var20.size();
    int var29 = var20.size();
    var1.enqueue((java.lang.Object)var29);
    java.lang.Object var31 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var32 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var33 = var32.next();
    boolean var34 = var32.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);

  }

  public void test462() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test462");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var5.hasNext();
    boolean var7 = var5.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test463() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test463");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    int var11 = var10.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var10.new RingBufferIteratorWrapper();
    java.util.Iterator var13 = var10.iterator();
    var1.enqueue((java.lang.Object)var13);
    java.lang.Object var15 = var1.dequeue();
    boolean var16 = var1.isEmpty();
    java.util.Iterator var17 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var18 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var19 = var18.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);

  }

  public void test464() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test464");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var4.new RingBufferIteratorWrapper();
    boolean var9 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var11 = var4.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);

  }

  public void test465() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test465");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    int var10 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var12 = var4.iterator();
    exercise01.RingBufferWrapper var14 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var15 = var14.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var16 = var14.new RingBufferIteratorWrapper();
    int var17 = var14.size();
    exercise01.RingBufferWrapper var19 = new exercise01.RingBufferWrapper(0);
    int var20 = var19.size();
    int var21 = var19.size();
    boolean var22 = var19.isEmpty();
    boolean var23 = var19.isEmpty();
    int var24 = var19.size();
    boolean var25 = var19.isEmpty();
    java.util.Iterator var26 = var19.iterator();
    var14.enqueue((java.lang.Object)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.enqueue((java.lang.Object)var19);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test466() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test466");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(100);
    boolean var14 = var13.isEmpty();
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(0);
    int var17 = var16.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var18 = var16.new RingBufferIteratorWrapper();
    var13.enqueue((java.lang.Object)var16);
    boolean var20 = var13.isEmpty();
    int var21 = var13.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var22 = var13.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var13);
    java.lang.Object var24 = var1.dequeue();
    int var25 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var26 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var27 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test467() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test467");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    int var9 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    boolean var11 = var10.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test468() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test468");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    int var6 = var4.size();
    boolean var7 = var4.isEmpty();
    java.util.Iterator var8 = var4.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    boolean var14 = var13.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test469() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test469");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    java.lang.Object var2 = new java.lang.Object();
    var1.enqueue(var2);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var5.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test470() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test470");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    exercise01.RingBufferWrapper var5 = new exercise01.RingBufferWrapper(100);
    boolean var6 = var5.isEmpty();
    exercise01.RingBufferWrapper var8 = new exercise01.RingBufferWrapper(0);
    int var9 = var8.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var8.new RingBufferIteratorWrapper();
    var5.enqueue((java.lang.Object)var8);
    var5.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var15 = new exercise01.RingBufferWrapper(0);
    int var16 = var15.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var15.new RingBufferIteratorWrapper();
    java.util.Iterator var18 = var15.iterator();
    var5.enqueue((java.lang.Object)var15);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var20 = var5.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var5);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var22 = var5.new RingBufferIteratorWrapper();
    int var23 = var5.size();
    boolean var24 = var5.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test471() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test471");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    boolean var16 = var1.isEmpty();
    boolean var17 = var1.isEmpty();
    java.util.Iterator var18 = var1.iterator();
    exercise01.RingBufferWrapper var20 = new exercise01.RingBufferWrapper(100);
    boolean var21 = var20.isEmpty();
    exercise01.RingBufferWrapper var23 = new exercise01.RingBufferWrapper(0);
    int var24 = var23.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var23.new RingBufferIteratorWrapper();
    var20.enqueue((java.lang.Object)var23);
    boolean var27 = var20.isEmpty();
    int var28 = var20.size();
    int var29 = var20.size();
    var1.enqueue((java.lang.Object)var29);
    java.lang.Object var31 = var1.dequeue();
    int var32 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 3);

  }

  public void test472() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test472");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var8 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test473() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test473");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var4.new RingBufferIteratorWrapper();
    boolean var9 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
    int var11 = var4.size();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(0);
    int var14 = var13.size();
    boolean var15 = var13.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.enqueue((java.lang.Object)var15);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test474() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test474");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    int var13 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var14 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);

  }

  public void test475() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test475");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(100);
    exercise01.RingBufferWrapper var15 = new exercise01.RingBufferWrapper(0);
    int var16 = var15.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var15.new RingBufferIteratorWrapper();
    java.util.Iterator var18 = var15.iterator();
    var13.enqueue((java.lang.Object)var15);
    int var20 = var15.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var21 = var15.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var15);
    java.util.Iterator var23 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test476() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test476");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    int var4 = var1.size();
    int var5 = var1.size();
    java.util.Iterator var6 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test477() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test477");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var1.new RingBufferIteratorWrapper();
    boolean var12 = var11.hasNext();
    java.lang.Object var13 = var11.next();
    boolean var14 = var11.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test478() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test478");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    exercise01.RingBufferWrapper var8 = new exercise01.RingBufferWrapper(0);
    int var9 = var8.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var8);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test479() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test479");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(0);
    int var14 = var13.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var13.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var13);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var1.new RingBufferIteratorWrapper();
    boolean var18 = var17.hasNext();
    java.lang.Object var19 = var17.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test480() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test480");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    int var11 = var10.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var10.new RingBufferIteratorWrapper();
    java.util.Iterator var13 = var10.iterator();
    var1.enqueue((java.lang.Object)var13);
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(100);
    boolean var17 = var16.isEmpty();
    exercise01.RingBufferWrapper var19 = new exercise01.RingBufferWrapper(0);
    int var20 = var19.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var21 = var19.new RingBufferIteratorWrapper();
    var16.enqueue((java.lang.Object)var19);
    boolean var23 = var16.isEmpty();
    int var24 = var16.size();
    int var25 = var16.size();
    boolean var26 = var16.isEmpty();
    int var27 = var16.size();
    java.util.Iterator var28 = var16.iterator();
    var1.enqueue((java.lang.Object)var16);
    java.lang.Object var30 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var31 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var32 = var31.next();
    boolean var33 = var31.hasNext();
    java.lang.Object var34 = var31.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test481() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test481");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var1.new RingBufferIteratorWrapper();
    int var12 = var1.size();
    exercise01.RingBufferWrapper var14 = new exercise01.RingBufferWrapper(100);
    boolean var15 = var14.isEmpty();
    exercise01.RingBufferWrapper var17 = new exercise01.RingBufferWrapper(0);
    int var18 = var17.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var19 = var17.new RingBufferIteratorWrapper();
    var14.enqueue((java.lang.Object)var17);
    java.util.Iterator var21 = var14.iterator();
    exercise01.RingBufferWrapper var23 = new exercise01.RingBufferWrapper(0);
    int var24 = var23.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var23.new RingBufferIteratorWrapper();
    java.util.Iterator var26 = var23.iterator();
    var14.enqueue((java.lang.Object)var26);
    java.lang.Object var28 = var14.dequeue();
    boolean var29 = var14.isEmpty();
    java.util.Iterator var30 = var14.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var31 = var14.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var14);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test482() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test482");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    boolean var10 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test483() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test483");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    int var2 = var1.size();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    int var6 = var4.size();
    boolean var7 = var4.isEmpty();
    int var8 = var4.size();
    var1.enqueue((java.lang.Object)var4);
    int var10 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test484() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test484");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    java.lang.Object var2 = new java.lang.Object();
    var1.enqueue(var2);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var6 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var7 = var6.new RingBufferIteratorWrapper();
    boolean var8 = var7.hasNext();
    boolean var9 = var7.hasNext();
    boolean var10 = var7.hasNext();
    boolean var11 = var7.hasNext();
    boolean var12 = var7.hasNext();
    var1.enqueue((java.lang.Object)var12);
    int var14 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 2);

  }

  public void test485() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test485");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
    exercise01.RingBufferWrapper var6 = new exercise01.RingBufferWrapper(100);
    boolean var7 = var6.isEmpty();
    exercise01.RingBufferWrapper var9 = new exercise01.RingBufferWrapper(0);
    int var10 = var9.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var11 = var9.new RingBufferIteratorWrapper();
    var6.enqueue((java.lang.Object)var9);
    java.util.Iterator var13 = var9.iterator();
    int var14 = var9.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var9.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var9);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var17 = var9.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var18 = var17.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test486() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test486");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    boolean var16 = var1.isEmpty();
    boolean var17 = var1.isEmpty();
    java.lang.Object var18 = var1.dequeue();
    exercise01.RingBufferWrapper var20 = new exercise01.RingBufferWrapper(100);
    boolean var21 = var20.isEmpty();
    exercise01.RingBufferWrapper var23 = new exercise01.RingBufferWrapper(0);
    int var24 = var23.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var25 = var23.new RingBufferIteratorWrapper();
    var20.enqueue((java.lang.Object)var23);
    boolean var27 = var20.isEmpty();
    int var28 = var20.size();
    int var29 = var20.size();
    int var30 = var20.size();
    boolean var31 = var20.isEmpty();
    java.lang.Object var32 = var20.dequeue();
    boolean var33 = var20.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var34 = var20.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var34);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var36 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var36.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);

  }

  public void test487() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test487");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    boolean var6 = var5.hasNext();
    boolean var7 = var5.hasNext();
    boolean var8 = var5.hasNext();
    boolean var9 = var5.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test488() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test488");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    int var13 = var1.size();
    java.util.Iterator var14 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var16 = var15.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var15.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test489() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test489");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test490() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test490");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    java.lang.Object var13 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var14 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(0);
    int var17 = var16.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var18 = var16.new RingBufferIteratorWrapper();
    java.util.Iterator var19 = var16.iterator();
    java.util.Iterator var20 = var16.iterator();
    int var21 = var16.size();
    var1.enqueue((java.lang.Object)var16);
    java.lang.Object var23 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);

  }

  public void test491() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test491");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test492() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test492");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test493() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test493");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    java.lang.Object var2 = new java.lang.Object();
    var1.enqueue(var2);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var4 = var1.new RingBufferIteratorWrapper();
    java.lang.Object var5 = var4.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var4.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test494() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test494");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    int var11 = var1.size();
    boolean var12 = var1.isEmpty();
    boolean var13 = var1.isEmpty();
    java.util.Iterator var14 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var15 = var1.new RingBufferIteratorWrapper();
    boolean var16 = var15.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test495() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test495");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    var1.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(0);
    int var12 = var11.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var11.new RingBufferIteratorWrapper();
    java.util.Iterator var14 = var11.iterator();
    var1.enqueue((java.lang.Object)var11);
    boolean var16 = var1.isEmpty();
    boolean var17 = var1.isEmpty();
    java.lang.Object var18 = var1.dequeue();
    boolean var19 = var1.isEmpty();
    exercise01.RingBufferWrapper var21 = new exercise01.RingBufferWrapper(1);
    boolean var22 = var21.isEmpty();
    boolean var23 = var21.isEmpty();
    exercise01.RingBufferWrapper var25 = new exercise01.RingBufferWrapper(1);
    boolean var26 = var25.isEmpty();
    int var27 = var25.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var28 = var25.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var29 = var25.new RingBufferIteratorWrapper();
    var21.enqueue((java.lang.Object)var29);
    var1.enqueue((java.lang.Object)var29);
    java.lang.Object var32 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + 10.0f+ "'", var32.equals(10.0f));

  }

  public void test496() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test496");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test497() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test497");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    boolean var8 = var1.isEmpty();
    int var9 = var1.size();
    int var10 = var1.size();
    boolean var11 = var1.isEmpty();
    int var12 = var1.size();
    java.util.Iterator var13 = var1.iterator();
    java.lang.Object var14 = var1.dequeue();
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(0);
    int var17 = var16.size();
    int var18 = var16.size();
    boolean var19 = var16.isEmpty();
    java.util.Iterator var20 = var16.iterator();
    boolean var21 = var16.isEmpty();
    boolean var22 = var16.isEmpty();
    boolean var23 = var16.isEmpty();
    var1.enqueue((java.lang.Object)var23);
    int var25 = var1.size();
    exercise01.RingBufferWrapper var27 = new exercise01.RingBufferWrapper(100);
    boolean var28 = var27.isEmpty();
    java.util.Iterator var29 = var27.iterator();
    var1.enqueue((java.lang.Object)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test498() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test498");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    boolean var6 = var1.isEmpty();
    boolean var7 = var1.isEmpty();
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var1.new RingBufferIteratorWrapper();
    boolean var11 = var1.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var13 = var12.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test499() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test499");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    int var6 = var4.size();
    boolean var7 = var4.isEmpty();
    java.util.Iterator var8 = var4.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var9 = var4.new RingBufferIteratorWrapper();
    java.util.Iterator var10 = var4.iterator();
    var1.enqueue((java.lang.Object)var4);
    int var12 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test500() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest0.test500");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(0);
    int var11 = var10.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var10.new RingBufferIteratorWrapper();
    java.util.Iterator var13 = var10.iterator();
    var1.enqueue((java.lang.Object)var13);
    java.lang.Object var15 = var1.dequeue();
    boolean var16 = var1.isEmpty();
    java.util.Iterator var17 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var18 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var20 = new exercise01.RingBufferWrapper(0);
    int var21 = var20.size();
    int var22 = var20.size();
    boolean var23 = var20.isEmpty();
    java.util.Iterator var24 = var20.iterator();
    boolean var25 = var20.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var26 = var20.new RingBufferIteratorWrapper();
    java.util.Iterator var27 = var20.iterator();
    java.util.Iterator var28 = var20.iterator();
    var1.enqueue((java.lang.Object)var28);
    exercise01.RingBufferWrapper var31 = new exercise01.RingBufferWrapper(100);
    boolean var32 = var31.isEmpty();
    exercise01.RingBufferWrapper var34 = new exercise01.RingBufferWrapper(0);
    int var35 = var34.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var36 = var34.new RingBufferIteratorWrapper();
    var31.enqueue((java.lang.Object)var34);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var38 = var31.new RingBufferIteratorWrapper();
    java.util.Iterator var39 = var31.iterator();
    int var40 = var31.size();
    exercise01.RingBufferWrapper var42 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var43 = var42.iterator();
    var31.enqueue((java.lang.Object)var42);
    int var45 = var31.size();
    var1.enqueue((java.lang.Object)var31);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == 2);

  }

}
