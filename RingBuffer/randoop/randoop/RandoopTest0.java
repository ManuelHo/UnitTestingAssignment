package randoop;

import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test1");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test2");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    int var2 = var1.size();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test3");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.lang.Object var7 = var6.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var8 = var6.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0.0d+ "'", var7.equals(0.0d));

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test4");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var4.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test5");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.lang.Object var6 = var5.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0.0d+ "'", var6.equals(0.0d));

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test6");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test7");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test8");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(100);
    var3.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var6 = var3.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var3.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)var3);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test9");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var4.hasNext();
    boolean var6 = var4.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test10");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
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
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test11");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    exercise01.RingBufferException var7 = new exercise01.RingBufferException("");
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.toString();
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    java.lang.String var12 = var11.toString();
    java.lang.String var13 = var11.toString();
    java.lang.String var14 = var11.toString();
    var7.addSuppressed((java.lang.Throwable)var11);
    var3.addSuppressed((java.lang.Throwable)var11);
    var1.addSuppressed((java.lang.Throwable)var3);
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    java.lang.String var20 = var19.toString();
    java.lang.String var21 = var19.toString();
    java.lang.String var22 = var19.toString();
    var3.addSuppressed((java.lang.Throwable)var19);
    java.lang.Throwable[] var24 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: "+ "'", var4.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: "+ "'", var9.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: "+ "'", var13.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: "+ "'", var14.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "exercise01.RingBufferException: "+ "'", var22.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test12");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test13");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test14");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
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
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test15");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test16");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    exercise01.RingBufferException var7 = new exercise01.RingBufferException("");
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.toString();
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    java.lang.String var12 = var11.toString();
    java.lang.String var13 = var11.toString();
    java.lang.String var14 = var11.toString();
    var7.addSuppressed((java.lang.Throwable)var11);
    var3.addSuppressed((java.lang.Throwable)var11);
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.Throwable[] var18 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: "+ "'", var4.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: "+ "'", var9.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: "+ "'", var13.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: "+ "'", var14.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test17");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
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
    assertTrue(var6 == false);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test18");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var6.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test19");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    int var3 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test20");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(short)(-1));
    boolean var6 = var1.isEmpty();
    java.lang.Object var7 = var1.dequeue();
    int var8 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + (short)(-1)+ "'", var7.equals((short)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test21");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test22");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.String var6 = var5.toString();
    java.lang.String var7 = var5.toString();
    java.lang.String var8 = var5.toString();
    var1.addSuppressed((java.lang.Throwable)var5);
    java.lang.String var10 = var5.toString();
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("hi!");
    var5.addSuppressed((java.lang.Throwable)var12);
    java.lang.Throwable[] var14 = var5.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: "+ "'", var2.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: "+ "'", var6.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test23");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    java.util.Iterator var2 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test24");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
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
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test25");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    int var2 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
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

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test26");


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      exercise01.RingBuffer var1 = new exercise01.RingBuffer((-1));
      fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test27");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var6 = var5.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test28");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)true);
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(100);
    var8.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var11 = var8.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var11);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test29");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    java.lang.String var2 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var2.equals("exercise01.RingBufferException: hi!"));

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test30");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test31");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
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
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test32");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.lang.Object var7 = var6.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0.0d+ "'", var7.equals(0.0d));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test33");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test34");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var6.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test35");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    boolean var5 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test36");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.String var6 = var5.toString();
    java.lang.String var7 = var5.toString();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    java.lang.String var10 = var9.toString();
    java.lang.String var11 = var9.toString();
    java.lang.String var12 = var9.toString();
    var5.addSuppressed((java.lang.Throwable)var9);
    var1.addSuppressed((java.lang.Throwable)var9);
    java.lang.String var15 = var9.toString();
    java.lang.Throwable[] var16 = var9.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: "+ "'", var2.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: "+ "'", var6.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test37");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(short)(-1));
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(100);
    var10.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var13 = var10.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var10.new RingBufferIterator();
    java.lang.Object var15 = var14.next();
    var1.enqueue((java.lang.Object)var14);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 0.0d+ "'", var15.equals(0.0d));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test38");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var4 = var3.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test39");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(short)(-1));
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    boolean var10 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test40");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    int var8 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test41");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test42");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(2);
    exercise01.RingBuffer var3 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var4 = var3.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var3.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var3.new RingBufferIterator();
    java.util.Iterator var7 = var3.iterator();
    var1.enqueue((java.lang.Object)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test43");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var7 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    var6.enqueue((java.lang.Object)(short)(-1));
    boolean var11 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var11);
    boolean var13 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test44");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(10);
    var1.enqueue((java.lang.Object)10);
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test45");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(100);
    var8.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var11 = var8.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var11);
    int var13 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 2);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test46");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test47");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
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

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test48");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var4.hasNext();
    boolean var6 = var4.hasNext();
    java.lang.Object var7 = var4.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0.0d+ "'", var7.equals(0.0d));

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test49");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test50");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(10);
    var1.enqueue((java.lang.Object)10);
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    boolean var11 = var10.hasNext();
    java.lang.Object var12 = var10.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 0.0d+ "'", var12.equals(0.0d));

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test51");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.toString();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("hi!");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.String var11 = var10.toString();
    java.lang.String var12 = var10.toString();
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("");
    java.lang.String var15 = var14.toString();
    java.lang.String var16 = var14.toString();
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.String var19 = var18.toString();
    java.lang.String var20 = var18.toString();
    java.lang.String var21 = var18.toString();
    var14.addSuppressed((java.lang.Throwable)var18);
    var10.addSuppressed((java.lang.Throwable)var18);
    var8.addSuppressed((java.lang.Throwable)var10);
    var3.addSuppressed((java.lang.Throwable)var10);
    exercise01.RingBufferException var27 = new exercise01.RingBufferException("");
    java.lang.String var28 = var27.toString();
    var10.addSuppressed((java.lang.Throwable)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: "+ "'", var6.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: "+ "'", var19.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "exercise01.RingBufferException: "+ "'", var28.equals("exercise01.RingBufferException: "));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test52");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.Throwable[] var5 = var1.getSuppressed();
    java.lang.String var6 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: "+ "'", var6.equals("exercise01.RingBufferException: "));

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test53");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)true);
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(100);
    var8.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var11 = var8.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var11);
    boolean var13 = var11.hasNext();
    boolean var14 = var11.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test54");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test55");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    int var2 = var1.size();
    exercise01.RingBuffer var4 = new exercise01.RingBuffer(100);
    int var5 = var4.size();
    var4.enqueue((java.lang.Object)1);
    int var8 = var4.size();
    boolean var9 = var4.isEmpty();
    java.util.Iterator var10 = var4.iterator();
    exercise01.RingBuffer var12 = new exercise01.RingBuffer(1);
    int var13 = var12.size();
    var12.enqueue((java.lang.Object)'4');
    var4.enqueue((java.lang.Object)'4');
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)'4');
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test56");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(10);
    var1.enqueue((java.lang.Object)10);
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    java.lang.Object var11 = var10.next();
    boolean var12 = var10.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0.0d+ "'", var11.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test57");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    var1.enqueue((java.lang.Object)0L);
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var8 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var7.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var10);
    boolean var12 = var10.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test58");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var7 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    var6.enqueue((java.lang.Object)(short)(-1));
    boolean var11 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer.RingBufferIterator var13 = var1.new RingBufferIterator();
    int var14 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 1);

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test59");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var7 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    var6.enqueue((java.lang.Object)(short)(-1));
    boolean var11 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer.RingBufferIterator var13 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test60");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var7 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    var6.enqueue((java.lang.Object)(short)(-1));
    boolean var11 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer.RingBufferIterator var13 = var1.new RingBufferIterator();
    boolean var14 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test61");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test62");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(short)(-1));
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(100);
    var10.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var13 = var10.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var10.new RingBufferIterator();
    java.lang.Object var15 = var14.next();
    var1.enqueue((java.lang.Object)var14);
    boolean var17 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 0.0d+ "'", var15.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test63");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    int var2 = var1.size();
    var1.enqueue((java.lang.Object)1);
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    var9.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var12 = var9.new RingBufferIterator();
    java.util.Iterator var13 = var9.iterator();
    var1.enqueue((java.lang.Object)var13);
    int var15 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var16 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 2);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test64");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    boolean var4 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test65");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
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
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test66");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.toString();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("hi!");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.String var11 = var10.toString();
    java.lang.String var12 = var10.toString();
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("");
    java.lang.String var15 = var14.toString();
    java.lang.String var16 = var14.toString();
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.String var19 = var18.toString();
    java.lang.String var20 = var18.toString();
    java.lang.String var21 = var18.toString();
    var14.addSuppressed((java.lang.Throwable)var18);
    var10.addSuppressed((java.lang.Throwable)var18);
    var8.addSuppressed((java.lang.Throwable)var10);
    var3.addSuppressed((java.lang.Throwable)var10);
    java.lang.Throwable[] var26 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: "+ "'", var6.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: "+ "'", var19.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test67");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    int var2 = var1.size();
    var1.enqueue((java.lang.Object)1);
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test68");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)true);
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(100);
    var8.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var11 = var8.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var11);
    boolean var13 = var11.hasNext();
    java.lang.Object var14 = var11.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var15 = var11.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0.0d+ "'", var14.equals(0.0d));

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test69");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var7 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    var6.enqueue((java.lang.Object)(short)(-1));
    boolean var11 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer.RingBufferIterator var13 = var1.new RingBufferIterator();
    java.lang.Object var14 = var13.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test70");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    var1.enqueue((java.lang.Object)0L);
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var8 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var7.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var10);
    exercise01.RingBuffer.RingBufferIterator var12 = var1.new RingBufferIterator();
    int var13 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test71");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.String var6 = var5.toString();
    java.lang.String var7 = var5.toString();
    java.lang.String var8 = var5.toString();
    var1.addSuppressed((java.lang.Throwable)var5);
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("");
    var11.addSuppressed((java.lang.Throwable)var13);
    var5.addSuppressed((java.lang.Throwable)var11);
    java.lang.Throwable[] var16 = var11.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: "+ "'", var2.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: "+ "'", var6.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test72");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    int var2 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
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

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test73");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.Throwable[] var2 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test74");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)true);
    java.lang.Object var7 = var1.dequeue();
    boolean var8 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0.0d+ "'", var7.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test75");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
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
    assertTrue(var6 == false);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test76");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var7 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    var6.enqueue((java.lang.Object)(short)(-1));
    boolean var11 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer.RingBufferIterator var13 = var1.new RingBufferIterator();
    exercise01.RingBuffer var15 = new exercise01.RingBuffer(100);
    var15.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var18 = var15.new RingBufferIterator();
    java.util.Iterator var19 = var15.iterator();
    int var20 = var15.size();
    exercise01.RingBuffer var22 = new exercise01.RingBuffer(10);
    var15.enqueue((java.lang.Object)10);
    exercise01.RingBuffer.RingBufferIterator var24 = var15.new RingBufferIterator();
    boolean var25 = var24.hasNext();
    boolean var26 = var24.hasNext();
    var1.enqueue((java.lang.Object)var26);
    boolean var28 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test77");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(100);
    var7.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var10 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var7.new RingBufferIterator();
    exercise01.RingBuffer var14 = new exercise01.RingBuffer(100);
    var14.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var17 = var14.new RingBufferIterator();
    var7.enqueue((java.lang.Object)var17);
    var1.enqueue((java.lang.Object)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test78");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var3.toString();
    java.lang.Throwable[] var6 = var3.getSuppressed();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    java.lang.String var10 = var9.toString();
    java.lang.String var11 = var9.toString();
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("");
    java.lang.String var14 = var13.toString();
    java.lang.String var15 = var13.toString();
    java.lang.String var16 = var13.toString();
    var9.addSuppressed((java.lang.Throwable)var13);
    java.lang.String var18 = var13.toString();
    var3.addSuppressed((java.lang.Throwable)var13);
    java.lang.String var20 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: "+ "'", var14.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: "+ "'", var18.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test79");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.String var6 = var5.toString();
    java.lang.String var7 = var5.toString();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    java.lang.String var10 = var9.toString();
    java.lang.String var11 = var9.toString();
    java.lang.String var12 = var9.toString();
    var5.addSuppressed((java.lang.Throwable)var9);
    var1.addSuppressed((java.lang.Throwable)var9);
    java.lang.Throwable[] var15 = var1.getSuppressed();
    java.lang.String var16 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: "+ "'", var2.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: "+ "'", var6.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test80");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test81");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(short)(-1));
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var9.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test82");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    java.lang.Object var7 = var1.dequeue();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    var9.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var12 = var9.new RingBufferIterator();
    var9.enqueue((java.lang.Object)true);
    exercise01.RingBuffer.RingBufferIterator var15 = var9.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var17 = var9.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0.0d+ "'", var7.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test83");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test84");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    int var7 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 1);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test85");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(short)(-1));
    java.lang.Object var6 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + (short)(-1)+ "'", var6.equals((short)(-1)));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test86");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.lang.Object var6 = var5.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0.0d+ "'", var6.equals(0.0d));

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test87");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    int var2 = var1.size();
    var1.enqueue((java.lang.Object)'4');
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

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test88");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.toString();
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var8 = var3.toString();
    java.lang.Throwable[] var9 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: "+ "'", var4.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: "+ "'", var6.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test89");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.toString();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("hi!");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.String var11 = var10.toString();
    java.lang.String var12 = var10.toString();
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("");
    java.lang.String var15 = var14.toString();
    java.lang.String var16 = var14.toString();
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.String var19 = var18.toString();
    java.lang.String var20 = var18.toString();
    java.lang.String var21 = var18.toString();
    var14.addSuppressed((java.lang.Throwable)var18);
    var10.addSuppressed((java.lang.Throwable)var18);
    var8.addSuppressed((java.lang.Throwable)var10);
    var3.addSuppressed((java.lang.Throwable)var10);
    exercise01.RingBufferException var27 = new exercise01.RingBufferException("");
    var3.addSuppressed((java.lang.Throwable)var27);
    java.lang.String var29 = var27.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: "+ "'", var6.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: "+ "'", var19.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "exercise01.RingBufferException: "+ "'", var29.equals("exercise01.RingBufferException: "));

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test90");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var5 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test91");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var3.toString();
    java.lang.Throwable[] var6 = var3.getSuppressed();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    java.lang.String var10 = var9.toString();
    java.lang.String var11 = var9.toString();
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("");
    java.lang.String var14 = var13.toString();
    java.lang.String var15 = var13.toString();
    java.lang.String var16 = var13.toString();
    var9.addSuppressed((java.lang.Throwable)var13);
    java.lang.String var18 = var13.toString();
    var3.addSuppressed((java.lang.Throwable)var13);
    exercise01.RingBufferException var21 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var23 = new exercise01.RingBufferException("");
    var21.addSuppressed((java.lang.Throwable)var23);
    java.lang.String var25 = var23.toString();
    java.lang.String var26 = var23.toString();
    exercise01.RingBufferException var28 = new exercise01.RingBufferException("hi!");
    exercise01.RingBufferException var30 = new exercise01.RingBufferException("");
    java.lang.String var31 = var30.toString();
    java.lang.String var32 = var30.toString();
    exercise01.RingBufferException var34 = new exercise01.RingBufferException("");
    java.lang.String var35 = var34.toString();
    java.lang.String var36 = var34.toString();
    exercise01.RingBufferException var38 = new exercise01.RingBufferException("");
    java.lang.String var39 = var38.toString();
    java.lang.String var40 = var38.toString();
    java.lang.String var41 = var38.toString();
    var34.addSuppressed((java.lang.Throwable)var38);
    var30.addSuppressed((java.lang.Throwable)var38);
    var28.addSuppressed((java.lang.Throwable)var30);
    var23.addSuppressed((java.lang.Throwable)var30);
    var13.addSuppressed((java.lang.Throwable)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: "+ "'", var14.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: "+ "'", var18.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "exercise01.RingBufferException: "+ "'", var26.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "exercise01.RingBufferException: "+ "'", var31.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "exercise01.RingBufferException: "+ "'", var32.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "exercise01.RingBufferException: "+ "'", var35.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "exercise01.RingBufferException: "+ "'", var36.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "exercise01.RingBufferException: "+ "'", var39.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "exercise01.RingBufferException: "+ "'", var40.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "exercise01.RingBufferException: "+ "'", var41.equals("exercise01.RingBufferException: "));

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test92");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.lang.Object var7 = var6.next();
    boolean var8 = var6.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0.0d+ "'", var7.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test93");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    var1.enqueue((java.lang.Object)0L);
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var8 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var7.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var10);
    int var12 = var1.size();
    int var13 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 3);

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test94");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var3.toString();
    java.lang.Throwable[] var6 = var3.getSuppressed();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    java.lang.Throwable[] var8 = var3.getSuppressed();
    java.lang.String var9 = var3.toString();
    java.lang.Throwable[] var10 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: "+ "'", var9.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test95");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test96");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var7 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    var6.enqueue((java.lang.Object)(short)(-1));
    boolean var11 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer.RingBufferIterator var13 = var1.new RingBufferIterator();
    boolean var14 = var13.hasNext();
    boolean var15 = var13.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test97");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBufferException var7 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    var7.addSuppressed((java.lang.Throwable)var9);
    java.lang.String var11 = var9.toString();
    java.lang.Throwable[] var12 = var9.getSuppressed();
    java.lang.String var13 = var9.toString();
    var1.enqueue((java.lang.Object)var13);
    exercise01.RingBuffer var16 = new exercise01.RingBuffer(100);
    var16.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var19 = var16.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var20 = var16.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var21 = var16.new RingBufferIterator();
    boolean var22 = var16.isEmpty();
    exercise01.RingBufferException var24 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var26 = new exercise01.RingBufferException("");
    var24.addSuppressed((java.lang.Throwable)var26);
    java.lang.String var28 = var26.toString();
    java.lang.Throwable[] var29 = var26.getSuppressed();
    java.lang.Throwable[] var30 = var26.getSuppressed();
    var16.enqueue((java.lang.Object)var26);
    var1.enqueue((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: "+ "'", var13.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "exercise01.RingBufferException: "+ "'", var28.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test98");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var4.hasNext();
    boolean var6 = var4.hasNext();
    boolean var7 = var4.hasNext();
    boolean var8 = var4.hasNext();
    boolean var9 = var4.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test99");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var4.hasNext();
    boolean var6 = var4.hasNext();
    boolean var7 = var4.hasNext();
    boolean var8 = var4.hasNext();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var4.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test100");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
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
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test101");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var5.hasNext();
    boolean var7 = var5.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test102");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    boolean var3 = var2.hasNext();
    boolean var4 = var2.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test103");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Iterator var6 = var1.iterator();
    var1.enqueue((java.lang.Object)true);
    int var9 = var1.size();
    int var10 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test104");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var4.hasNext();
    boolean var6 = var4.hasNext();
    boolean var7 = var4.hasNext();
    java.lang.Object var8 = var4.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 0.0d+ "'", var8.equals(0.0d));

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test105");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test106");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
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

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test107");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    exercise01.RingBufferException var7 = new exercise01.RingBufferException("");
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.toString();
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    java.lang.String var12 = var11.toString();
    java.lang.String var13 = var11.toString();
    java.lang.String var14 = var11.toString();
    var7.addSuppressed((java.lang.Throwable)var11);
    var3.addSuppressed((java.lang.Throwable)var11);
    var1.addSuppressed((java.lang.Throwable)var3);
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    java.lang.String var20 = var19.toString();
    java.lang.String var21 = var19.toString();
    java.lang.String var22 = var19.toString();
    var3.addSuppressed((java.lang.Throwable)var19);
    java.lang.String var24 = var3.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: "+ "'", var4.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: "+ "'", var9.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: "+ "'", var13.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: "+ "'", var14.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "exercise01.RingBufferException: "+ "'", var22.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "exercise01.RingBufferException: "+ "'", var24.equals("exercise01.RingBufferException: "));

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test108");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("exercise01.RingBufferException: hi!");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    var3.addSuppressed((java.lang.Throwable)var5);
    var1.addSuppressed((java.lang.Throwable)var3);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test109");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    int var2 = var1.size();
    var1.enqueue((java.lang.Object)1);
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    java.util.Iterator var7 = var1.iterator();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    var9.enqueue((java.lang.Object)0.0d);
    java.lang.Object var12 = var9.dequeue();
    exercise01.RingBuffer var14 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var15 = var14.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var16 = var14.new RingBufferIterator();
    var14.enqueue((java.lang.Object)(short)(-1));
    boolean var19 = var14.isEmpty();
    var9.enqueue((java.lang.Object)var19);
    exercise01.RingBuffer.RingBufferIterator var21 = var9.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 0.0d+ "'", var12.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test110");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    int var2 = var1.size();
    var1.enqueue((java.lang.Object)'4');
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    var6.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var9 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var6.new RingBufferIterator();
    var6.enqueue((java.lang.Object)(short)(-1));
    exercise01.RingBuffer.RingBufferIterator var13 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var6.new RingBufferIterator();
    java.util.Iterator var15 = var6.iterator();
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
    assertNotNull(var15);

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test111");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    boolean var6 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test112");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
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

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test113");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var3.toString();
    java.lang.Throwable[] var6 = var3.getSuppressed();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    var8.addSuppressed((java.lang.Throwable)var10);
    java.lang.String var12 = var10.toString();
    java.lang.Throwable[] var13 = var10.getSuppressed();
    java.lang.String var14 = var10.toString();
    var3.addSuppressed((java.lang.Throwable)var10);
    java.lang.String var16 = var3.toString();
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var20 = new exercise01.RingBufferException("");
    var18.addSuppressed((java.lang.Throwable)var20);
    java.lang.String var22 = var20.toString();
    java.lang.String var23 = var20.toString();
    exercise01.RingBufferException var25 = new exercise01.RingBufferException("hi!");
    exercise01.RingBufferException var27 = new exercise01.RingBufferException("");
    java.lang.String var28 = var27.toString();
    java.lang.String var29 = var27.toString();
    exercise01.RingBufferException var31 = new exercise01.RingBufferException("");
    java.lang.String var32 = var31.toString();
    java.lang.String var33 = var31.toString();
    exercise01.RingBufferException var35 = new exercise01.RingBufferException("");
    java.lang.String var36 = var35.toString();
    java.lang.String var37 = var35.toString();
    java.lang.String var38 = var35.toString();
    var31.addSuppressed((java.lang.Throwable)var35);
    var27.addSuppressed((java.lang.Throwable)var35);
    var25.addSuppressed((java.lang.Throwable)var27);
    var20.addSuppressed((java.lang.Throwable)var27);
    var3.addSuppressed((java.lang.Throwable)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: "+ "'", var14.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "exercise01.RingBufferException: "+ "'", var22.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "exercise01.RingBufferException: "+ "'", var23.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "exercise01.RingBufferException: "+ "'", var28.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "exercise01.RingBufferException: "+ "'", var29.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "exercise01.RingBufferException: "+ "'", var32.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "exercise01.RingBufferException: "+ "'", var33.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "exercise01.RingBufferException: "+ "'", var36.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "exercise01.RingBufferException: "+ "'", var37.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "exercise01.RingBufferException: "+ "'", var38.equals("exercise01.RingBufferException: "));

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test114");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var7 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var6.new RingBufferIterator();
    java.util.Iterator var11 = var6.iterator();
    java.util.Iterator var12 = var6.iterator();
    var1.enqueue((java.lang.Object)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test115");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test116");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    java.lang.Object var9 = var8.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 0.0d+ "'", var9.equals(0.0d));

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test117");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    exercise01.RingBufferException var7 = new exercise01.RingBufferException("");
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.toString();
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    java.lang.String var12 = var11.toString();
    java.lang.String var13 = var11.toString();
    java.lang.String var14 = var11.toString();
    var7.addSuppressed((java.lang.Throwable)var11);
    var3.addSuppressed((java.lang.Throwable)var11);
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var18 = var3.toString();
    exercise01.RingBufferException var20 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var22 = new exercise01.RingBufferException("");
    var20.addSuppressed((java.lang.Throwable)var22);
    var3.addSuppressed((java.lang.Throwable)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: "+ "'", var4.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: "+ "'", var9.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: "+ "'", var13.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: "+ "'", var14.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: "+ "'", var18.equals("exercise01.RingBufferException: "));

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test118");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test119");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(10);
    var1.enqueue((java.lang.Object)10);
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    java.lang.Object var11 = var1.dequeue();
    java.lang.Object var12 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0.0d+ "'", var11.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 10+ "'", var12.equals(10));

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test120");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Iterator var6 = var1.iterator();
    var1.enqueue((java.lang.Object)true);
    boolean var9 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test121");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.toString();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("hi!");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.String var11 = var10.toString();
    java.lang.String var12 = var10.toString();
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("");
    java.lang.String var15 = var14.toString();
    java.lang.String var16 = var14.toString();
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.String var19 = var18.toString();
    java.lang.String var20 = var18.toString();
    java.lang.String var21 = var18.toString();
    var14.addSuppressed((java.lang.Throwable)var18);
    var10.addSuppressed((java.lang.Throwable)var18);
    var8.addSuppressed((java.lang.Throwable)var10);
    var3.addSuppressed((java.lang.Throwable)var10);
    exercise01.RingBufferException var27 = new exercise01.RingBufferException("");
    var3.addSuppressed((java.lang.Throwable)var27);
    exercise01.RingBufferException var30 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var32 = new exercise01.RingBufferException("");
    var30.addSuppressed((java.lang.Throwable)var32);
    java.lang.String var34 = var32.toString();
    java.lang.Throwable[] var35 = var32.getSuppressed();
    java.lang.Throwable[] var36 = var32.getSuppressed();
    java.lang.Throwable[] var37 = var32.getSuppressed();
    var3.addSuppressed((java.lang.Throwable)var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: "+ "'", var6.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: "+ "'", var19.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "exercise01.RingBufferException: "+ "'", var34.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var37);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test122");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    boolean var8 = var1.isEmpty();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test123");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Iterator var6 = var1.iterator();
    var1.enqueue((java.lang.Object)true);
    int var9 = var1.size();
    var1.enqueue((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test124");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var7 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    var6.enqueue((java.lang.Object)(short)(-1));
    boolean var11 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var14 = new exercise01.RingBuffer(100);
    var14.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var17 = var14.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var18 = var14.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var19 = var14.new RingBufferIterator();
    exercise01.RingBuffer var21 = new exercise01.RingBuffer(100);
    var21.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var24 = var21.new RingBufferIterator();
    var14.enqueue((java.lang.Object)var24);
    java.util.Iterator var26 = var14.iterator();
    boolean var27 = var14.isEmpty();
    var1.enqueue((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test125");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
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
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test126");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(short)(-1));
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(100);
    var10.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var13 = var10.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var10.new RingBufferIterator();
    java.lang.Object var15 = var14.next();
    var1.enqueue((java.lang.Object)var14);
    int var17 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + 0.0d+ "'", var15.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 3);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test127");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
    boolean var7 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test128");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    java.lang.Object var8 = var1.dequeue();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    java.util.Iterator var10 = var1.iterator();
    boolean var11 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 0.0d+ "'", var8.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test129");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(10);
    exercise01.RingBufferException var7 = new exercise01.RingBufferException("");
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.toString();
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    java.lang.String var12 = var11.toString();
    java.lang.String var13 = var11.toString();
    exercise01.RingBufferException var15 = new exercise01.RingBufferException("");
    java.lang.String var16 = var15.toString();
    java.lang.String var17 = var15.toString();
    java.lang.String var18 = var15.toString();
    var11.addSuppressed((java.lang.Throwable)var15);
    var7.addSuppressed((java.lang.Throwable)var15);
    java.lang.Throwable[] var21 = var7.getSuppressed();
    var5.enqueue((java.lang.Object)var7);
    var1.addSuppressed((java.lang.Throwable)var7);
    exercise01.RingBufferException var25 = new exercise01.RingBufferException("exercise01.RingBufferException: ");
    var7.addSuppressed((java.lang.Throwable)var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: "+ "'", var2.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: "+ "'", var9.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: "+ "'", var13.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "exercise01.RingBufferException: "+ "'", var17.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: "+ "'", var18.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test130");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    int var2 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
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

  public void test131() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test131");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
    java.lang.Object var9 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + 0.0d+ "'", var9.equals(0.0d));

  }

  public void test132() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test132");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(100);
    var8.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var11 = var8.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer var14 = new exercise01.RingBuffer(100);
    int var15 = var14.size();
    var14.enqueue((java.lang.Object)1);
    java.util.Iterator var18 = var14.iterator();
    var1.enqueue((java.lang.Object)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test133() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test133");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)true);
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(100);
    var8.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var11 = var8.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var11);
    boolean var13 = var11.hasNext();
    java.lang.Object var14 = var11.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 0.0d+ "'", var14.equals(0.0d));

  }

  public void test134() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test134");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.lang.Object var6 = var5.next();
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
    assertTrue("'" + var6 + "' != '" + 0.0d+ "'", var6.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test135() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test135");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.toString();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("hi!");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.String var11 = var10.toString();
    java.lang.String var12 = var10.toString();
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("");
    java.lang.String var15 = var14.toString();
    java.lang.String var16 = var14.toString();
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.String var19 = var18.toString();
    java.lang.String var20 = var18.toString();
    java.lang.String var21 = var18.toString();
    var14.addSuppressed((java.lang.Throwable)var18);
    var10.addSuppressed((java.lang.Throwable)var18);
    var8.addSuppressed((java.lang.Throwable)var10);
    var3.addSuppressed((java.lang.Throwable)var10);
    java.lang.Throwable[] var26 = var10.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: "+ "'", var6.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: "+ "'", var19.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var26);

  }

  public void test136() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test136");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    java.lang.Object var8 = var1.dequeue();
    exercise01.RingBuffer.RingBufferIterator var9 = var1.new RingBufferIterator();
    boolean var10 = var9.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 0.0d+ "'", var8.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test137() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test137");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)true);
    java.lang.Object var7 = var1.dequeue();
    int var8 = var1.size();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var11 = var10.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var10.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var10.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var10.new RingBufferIterator();
    boolean var15 = var14.hasNext();
    boolean var16 = var14.hasNext();
    boolean var17 = var14.hasNext();
    var1.enqueue((java.lang.Object)var14);
    java.lang.Object var19 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0.0d+ "'", var7.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + true+ "'", var19.equals(true));

  }

  public void test138() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test138");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(100);
    var8.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var11 = var8.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var11);
    java.lang.Object var13 = var1.dequeue();
    exercise01.RingBuffer.RingBufferIterator var14 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + 0.0d+ "'", var13.equals(0.0d));

  }

  public void test139() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test139");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    int var2 = var1.size();
    int var3 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test140() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test140");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(10);
    exercise01.RingBufferException var7 = new exercise01.RingBufferException("");
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.toString();
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    java.lang.String var12 = var11.toString();
    java.lang.String var13 = var11.toString();
    exercise01.RingBufferException var15 = new exercise01.RingBufferException("");
    java.lang.String var16 = var15.toString();
    java.lang.String var17 = var15.toString();
    java.lang.String var18 = var15.toString();
    var11.addSuppressed((java.lang.Throwable)var15);
    var7.addSuppressed((java.lang.Throwable)var15);
    java.lang.Throwable[] var21 = var7.getSuppressed();
    var5.enqueue((java.lang.Object)var7);
    var1.addSuppressed((java.lang.Throwable)var7);
    exercise01.RingBufferException var25 = new exercise01.RingBufferException("");
    java.lang.String var26 = var25.toString();
    java.lang.String var27 = var25.toString();
    exercise01.RingBufferException var29 = new exercise01.RingBufferException("");
    java.lang.String var30 = var29.toString();
    java.lang.String var31 = var29.toString();
    java.lang.String var32 = var29.toString();
    var25.addSuppressed((java.lang.Throwable)var29);
    exercise01.RingBufferException var35 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var37 = new exercise01.RingBufferException("");
    var35.addSuppressed((java.lang.Throwable)var37);
    var29.addSuppressed((java.lang.Throwable)var35);
    exercise01.RingBufferException var41 = new exercise01.RingBufferException("");
    var29.addSuppressed((java.lang.Throwable)var41);
    var1.addSuppressed((java.lang.Throwable)var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: "+ "'", var2.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: "+ "'", var9.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: "+ "'", var13.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "exercise01.RingBufferException: "+ "'", var17.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: "+ "'", var18.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "exercise01.RingBufferException: "+ "'", var26.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "exercise01.RingBufferException: "+ "'", var27.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "exercise01.RingBufferException: "+ "'", var30.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "exercise01.RingBufferException: "+ "'", var31.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "exercise01.RingBufferException: "+ "'", var32.equals("exercise01.RingBufferException: "));

  }

  public void test141() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test141");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    java.lang.String var4 = var1.toString();
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    java.lang.String var7 = var6.toString();
    java.lang.String var8 = var6.toString();
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.String var11 = var10.toString();
    java.lang.String var12 = var10.toString();
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("");
    java.lang.String var15 = var14.toString();
    java.lang.String var16 = var14.toString();
    java.lang.String var17 = var14.toString();
    var10.addSuppressed((java.lang.Throwable)var14);
    var6.addSuppressed((java.lang.Throwable)var14);
    var1.addSuppressed((java.lang.Throwable)var6);
    java.lang.Throwable[] var21 = var6.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: "+ "'", var2.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: "+ "'", var4.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "exercise01.RingBufferException: "+ "'", var17.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);

  }

  public void test142() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test142");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(100);
    var7.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var10 = var7.new RingBufferIterator();
    java.util.Iterator var11 = var7.iterator();
    int var12 = var7.size();
    exercise01.RingBuffer var14 = new exercise01.RingBuffer(10);
    var7.enqueue((java.lang.Object)10);
    exercise01.RingBuffer.RingBufferIterator var16 = var7.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 1);

  }

  public void test143() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test143");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    boolean var5 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test144() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test144");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    boolean var2 = var1.isEmpty();
    boolean var3 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test145() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test145");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var3.toString();
    java.lang.Throwable[] var6 = var3.getSuppressed();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    java.lang.String var10 = var9.toString();
    java.lang.String var11 = var9.toString();
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("");
    java.lang.String var14 = var13.toString();
    java.lang.String var15 = var13.toString();
    java.lang.String var16 = var13.toString();
    var9.addSuppressed((java.lang.Throwable)var13);
    java.lang.String var18 = var13.toString();
    var3.addSuppressed((java.lang.Throwable)var13);
    exercise01.RingBufferException var21 = new exercise01.RingBufferException("hi!");
    exercise01.RingBufferException var23 = new exercise01.RingBufferException("");
    java.lang.String var24 = var23.toString();
    java.lang.String var25 = var23.toString();
    exercise01.RingBufferException var27 = new exercise01.RingBufferException("");
    java.lang.String var28 = var27.toString();
    java.lang.String var29 = var27.toString();
    exercise01.RingBufferException var31 = new exercise01.RingBufferException("");
    java.lang.String var32 = var31.toString();
    java.lang.String var33 = var31.toString();
    java.lang.String var34 = var31.toString();
    var27.addSuppressed((java.lang.Throwable)var31);
    var23.addSuppressed((java.lang.Throwable)var31);
    var21.addSuppressed((java.lang.Throwable)var23);
    java.lang.String var38 = var23.toString();
    var13.addSuppressed((java.lang.Throwable)var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: "+ "'", var14.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: "+ "'", var18.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "exercise01.RingBufferException: "+ "'", var24.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "exercise01.RingBufferException: "+ "'", var28.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "exercise01.RingBufferException: "+ "'", var29.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "exercise01.RingBufferException: "+ "'", var32.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "exercise01.RingBufferException: "+ "'", var33.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "exercise01.RingBufferException: "+ "'", var34.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "exercise01.RingBufferException: "+ "'", var38.equals("exercise01.RingBufferException: "));

  }

  public void test146() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test146");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)true);
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(100);
    var10.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var13 = var10.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var10.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test147() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test147");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var3.toString();
    java.lang.Throwable[] var6 = var3.getSuppressed();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    java.lang.String var10 = var9.toString();
    java.lang.String var11 = var9.toString();
    exercise01.RingBufferException var13 = new exercise01.RingBufferException("");
    java.lang.String var14 = var13.toString();
    java.lang.String var15 = var13.toString();
    java.lang.String var16 = var13.toString();
    var9.addSuppressed((java.lang.Throwable)var13);
    java.lang.String var18 = var13.toString();
    var3.addSuppressed((java.lang.Throwable)var13);
    java.lang.Throwable[] var20 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: "+ "'", var14.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: "+ "'", var18.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test148() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test148");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    exercise01.RingBufferException var7 = new exercise01.RingBufferException("");
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.toString();
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    java.lang.String var12 = var11.toString();
    java.lang.String var13 = var11.toString();
    java.lang.String var14 = var11.toString();
    var7.addSuppressed((java.lang.Throwable)var11);
    var3.addSuppressed((java.lang.Throwable)var11);
    var1.addSuppressed((java.lang.Throwable)var3);
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    java.lang.String var20 = var19.toString();
    java.lang.String var21 = var19.toString();
    java.lang.String var22 = var19.toString();
    var3.addSuppressed((java.lang.Throwable)var19);
    java.lang.Throwable[] var24 = var19.getSuppressed();
    java.lang.Throwable[] var25 = var19.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: "+ "'", var4.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: "+ "'", var9.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: "+ "'", var13.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: "+ "'", var14.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "exercise01.RingBufferException: "+ "'", var22.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test149() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test149");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    int var2 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Iterator var4 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test150() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test150");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.String var6 = var5.toString();
    java.lang.String var7 = var5.toString();
    java.lang.String var8 = var5.toString();
    var1.addSuppressed((java.lang.Throwable)var5);
    java.lang.String var10 = var1.toString();
    exercise01.RingBufferException var12 = new exercise01.RingBufferException("hi!");
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("");
    java.lang.String var15 = var14.toString();
    java.lang.String var16 = var14.toString();
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.String var19 = var18.toString();
    java.lang.String var20 = var18.toString();
    exercise01.RingBufferException var22 = new exercise01.RingBufferException("");
    java.lang.String var23 = var22.toString();
    java.lang.String var24 = var22.toString();
    java.lang.String var25 = var22.toString();
    var18.addSuppressed((java.lang.Throwable)var22);
    var14.addSuppressed((java.lang.Throwable)var22);
    var12.addSuppressed((java.lang.Throwable)var14);
    var1.addSuppressed((java.lang.Throwable)var12);
    exercise01.RingBufferException var31 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var33 = new exercise01.RingBufferException("");
    var31.addSuppressed((java.lang.Throwable)var33);
    java.lang.Throwable[] var35 = var33.getSuppressed();
    var12.addSuppressed((java.lang.Throwable)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: "+ "'", var2.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: "+ "'", var6.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: "+ "'", var19.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "exercise01.RingBufferException: "+ "'", var23.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "exercise01.RingBufferException: "+ "'", var24.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test151() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test151");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var1.isEmpty();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    var9.addSuppressed((java.lang.Throwable)var11);
    java.lang.String var13 = var11.toString();
    java.lang.Throwable[] var14 = var11.getSuppressed();
    java.lang.Throwable[] var15 = var11.getSuppressed();
    var1.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer.RingBufferIterator var17 = var1.new RingBufferIterator();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: "+ "'", var13.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

  public void test152() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test152");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.lang.Object var5 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 0.0d+ "'", var5.equals(0.0d));

  }

  public void test153() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test153");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    int var6 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test154() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test154");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(0);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var2 = var1.dequeue();
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }

  }

  public void test155() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test155");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    java.lang.Object var7 = var1.dequeue();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    var9.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var12 = var9.new RingBufferIterator();
    var9.enqueue((java.lang.Object)true);
    exercise01.RingBuffer.RingBufferIterator var15 = var9.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var17 = var1.iterator();
    exercise01.RingBuffer.RingBufferIterator var18 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0.0d+ "'", var7.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);

  }

  public void test156() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test156");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(10);
    var1.enqueue((java.lang.Object)10);
    exercise01.RingBuffer.RingBufferIterator var10 = var1.new RingBufferIterator();
    java.lang.Object var11 = var10.next();
    java.lang.Object var12 = var10.next();
    boolean var13 = var10.hasNext();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + 0.0d+ "'", var11.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 10+ "'", var12.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test157() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test157");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    boolean var7 = var1.isEmpty();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    var9.addSuppressed((java.lang.Throwable)var11);
    java.lang.String var13 = var11.toString();
    java.lang.Throwable[] var14 = var11.getSuppressed();
    java.lang.Throwable[] var15 = var11.getSuppressed();
    var1.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer.RingBufferIterator var17 = var1.new RingBufferIterator();
    java.util.Iterator var18 = var1.iterator();
    exercise01.RingBuffer var20 = new exercise01.RingBuffer(100);
    var20.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var23 = var20.new RingBufferIterator();
    java.util.Iterator var24 = var20.iterator();
    int var25 = var20.size();
    exercise01.RingBuffer var27 = new exercise01.RingBuffer(10);
    var20.enqueue((java.lang.Object)10);
    exercise01.RingBuffer.RingBufferIterator var29 = var20.new RingBufferIterator();
    boolean var30 = var20.isEmpty();
    var1.enqueue((java.lang.Object)var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: "+ "'", var13.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test158() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test158");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    int var2 = var1.size();
    var1.enqueue((java.lang.Object)1);
    java.lang.Object var5 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + 1+ "'", var5.equals(1));

  }

  public void test159() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test159");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Iterator var6 = var1.iterator();
    var1.enqueue((java.lang.Object)true);
    int var9 = var1.size();
    java.lang.Object var10 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + true+ "'", var10.equals(true));

  }

  public void test160() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test160");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.lang.Object var7 = var1.dequeue();
    boolean var8 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0.0d+ "'", var7.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test161() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test161");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(1);
    boolean var2 = var1.isEmpty();
    int var3 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test162() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test162");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)(short)(-1));
    exercise01.RingBuffer.RingBufferIterator var8 = var1.new RingBufferIterator();
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
    assertTrue("'" + var9 + "' != '" + 0.0d+ "'", var9.equals(0.0d));

  }

  public void test163() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test163");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    java.util.Iterator var4 = var1.iterator();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var7 = var6.new RingBufferIterator();
    int var8 = var6.size();
    java.util.Iterator var9 = var6.iterator();
    var1.enqueue((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);

  }

  public void test164() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test164");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    var1.enqueue((java.lang.Object)0L);
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var8 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var7.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var10);
    int var12 = var1.size();
    java.util.Iterator var13 = var1.iterator();
    java.util.Iterator var14 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);

  }

  public void test165() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test165");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    java.lang.Object var7 = var1.dequeue();
    int var8 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0.0d+ "'", var7.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test166() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test166");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.toString();
    exercise01.RingBufferException var8 = new exercise01.RingBufferException("hi!");
    exercise01.RingBufferException var10 = new exercise01.RingBufferException("");
    java.lang.String var11 = var10.toString();
    java.lang.String var12 = var10.toString();
    exercise01.RingBufferException var14 = new exercise01.RingBufferException("");
    java.lang.String var15 = var14.toString();
    java.lang.String var16 = var14.toString();
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    java.lang.String var19 = var18.toString();
    java.lang.String var20 = var18.toString();
    java.lang.String var21 = var18.toString();
    var14.addSuppressed((java.lang.Throwable)var18);
    var10.addSuppressed((java.lang.Throwable)var18);
    var8.addSuppressed((java.lang.Throwable)var10);
    var3.addSuppressed((java.lang.Throwable)var10);
    exercise01.RingBufferException var27 = new exercise01.RingBufferException("");
    var3.addSuppressed((java.lang.Throwable)var27);
    java.lang.Throwable[] var29 = var3.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: "+ "'", var6.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "exercise01.RingBufferException: "+ "'", var15.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "exercise01.RingBufferException: "+ "'", var19.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test167() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test167");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    var1.enqueue((java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);

  }

  public void test168() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test168");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.util.Iterator var4 = var1.iterator();
    int var5 = var1.size();
    int var6 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);

  }

  public void test169() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test169");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    java.lang.String var6 = var3.toString();
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var8 = var3.toString();
    java.lang.String var9 = var3.toString();
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("exercise01.RingBufferException: hi!");
    var3.addSuppressed((java.lang.Throwable)var11);
    java.lang.String var13 = var11.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: "+ "'", var4.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: "+ "'", var6.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: "+ "'", var9.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: exercise01.RingBufferException: hi!"+ "'", var13.equals("exercise01.RingBufferException: exercise01.RingBufferException: hi!"));

  }

  public void test170() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test170");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    boolean var6 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test171() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test171");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    java.lang.Object var7 = var1.dequeue();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    var9.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var12 = var9.new RingBufferIterator();
    var9.enqueue((java.lang.Object)true);
    exercise01.RingBuffer.RingBufferIterator var15 = var9.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var9);
    java.util.Iterator var17 = var1.iterator();
    java.util.Iterator var18 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0.0d+ "'", var7.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test172() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test172");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    var1.enqueue((java.lang.Object)0L);
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var8 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var7.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var12 = var10.next();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test173() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test173");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.String var6 = var5.toString();
    java.lang.String var7 = var5.toString();
    java.lang.String var8 = var5.toString();
    var1.addSuppressed((java.lang.Throwable)var5);
    java.lang.Throwable[] var10 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: "+ "'", var2.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: "+ "'", var6.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test174() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test174");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(10);
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    exercise01.RingBufferException var7 = new exercise01.RingBufferException("");
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.toString();
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    java.lang.String var12 = var11.toString();
    java.lang.String var13 = var11.toString();
    java.lang.String var14 = var11.toString();
    var7.addSuppressed((java.lang.Throwable)var11);
    var3.addSuppressed((java.lang.Throwable)var11);
    java.lang.Throwable[] var17 = var3.getSuppressed();
    var1.enqueue((java.lang.Object)var3);
    java.util.Iterator var19 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: "+ "'", var4.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: "+ "'", var9.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: "+ "'", var13.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: "+ "'", var14.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test175() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test175");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)true);
    var1.enqueue((java.lang.Object)3);
    java.util.Iterator var9 = var1.iterator();
    java.lang.Object var10 = var1.dequeue();
    exercise01.RingBuffer.RingBufferIterator var11 = var1.new RingBufferIterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + 0.0d+ "'", var10.equals(0.0d));

  }

  public void test176() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test176");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    java.lang.Object var4 = var1.dequeue();
    exercise01.RingBuffer var6 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var7 = var6.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var8 = var6.new RingBufferIterator();
    var6.enqueue((java.lang.Object)(short)(-1));
    boolean var11 = var6.isEmpty();
    var1.enqueue((java.lang.Object)var11);
    exercise01.RingBuffer.RingBufferIterator var13 = var1.new RingBufferIterator();
    boolean var14 = var13.hasNext();
    boolean var15 = var13.hasNext();
    java.lang.Object var16 = var13.next();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + 0.0d+ "'", var4.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);

  }

  public void test177() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test177");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    java.lang.Object var6 = var1.dequeue();
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var10 = var9.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var11 = var9.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var12 = var9.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var9.new RingBufferIterator();
    java.util.Iterator var14 = var9.iterator();
    var9.enqueue((java.lang.Object)true);
    int var17 = var9.size();
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    java.lang.String var20 = var19.toString();
    java.lang.String var21 = var19.toString();
    exercise01.RingBufferException var23 = new exercise01.RingBufferException("");
    java.lang.String var24 = var23.toString();
    java.lang.String var25 = var23.toString();
    java.lang.String var26 = var23.toString();
    var19.addSuppressed((java.lang.Throwable)var23);
    exercise01.RingBufferException var29 = new exercise01.RingBufferException("hi!");
    exercise01.RingBufferException var31 = new exercise01.RingBufferException("");
    java.lang.String var32 = var31.toString();
    java.lang.String var33 = var31.toString();
    exercise01.RingBufferException var35 = new exercise01.RingBufferException("");
    java.lang.String var36 = var35.toString();
    java.lang.String var37 = var35.toString();
    exercise01.RingBufferException var39 = new exercise01.RingBufferException("");
    java.lang.String var40 = var39.toString();
    java.lang.String var41 = var39.toString();
    java.lang.String var42 = var39.toString();
    var35.addSuppressed((java.lang.Throwable)var39);
    var31.addSuppressed((java.lang.Throwable)var39);
    var29.addSuppressed((java.lang.Throwable)var31);
    exercise01.RingBufferException var47 = new exercise01.RingBufferException("");
    java.lang.String var48 = var47.toString();
    java.lang.String var49 = var47.toString();
    java.lang.String var50 = var47.toString();
    var31.addSuppressed((java.lang.Throwable)var47);
    exercise01.RingBufferException var53 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var55 = new exercise01.RingBufferException("");
    var53.addSuppressed((java.lang.Throwable)var55);
    var31.addSuppressed((java.lang.Throwable)var53);
    var19.addSuppressed((java.lang.Throwable)var53);
    var9.enqueue((java.lang.Object)var19);
    var1.enqueue((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + 0.0d+ "'", var6.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "exercise01.RingBufferException: "+ "'", var24.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "exercise01.RingBufferException: "+ "'", var26.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "exercise01.RingBufferException: "+ "'", var32.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "exercise01.RingBufferException: "+ "'", var33.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "exercise01.RingBufferException: "+ "'", var36.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "exercise01.RingBufferException: "+ "'", var37.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "exercise01.RingBufferException: "+ "'", var40.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "exercise01.RingBufferException: "+ "'", var41.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "exercise01.RingBufferException: "+ "'", var42.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "exercise01.RingBufferException: "+ "'", var48.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "exercise01.RingBufferException: "+ "'", var49.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "exercise01.RingBufferException: "+ "'", var50.equals("exercise01.RingBufferException: "));

  }

  public void test178() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test178");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.String var6 = var5.toString();
    java.lang.String var7 = var5.toString();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    java.lang.String var10 = var9.toString();
    java.lang.String var11 = var9.toString();
    java.lang.String var12 = var9.toString();
    var5.addSuppressed((java.lang.Throwable)var9);
    var1.addSuppressed((java.lang.Throwable)var9);
    java.lang.Throwable[] var15 = var1.getSuppressed();
    java.lang.Throwable[] var16 = var1.getSuppressed();
    java.lang.Throwable[] var17 = var1.getSuppressed();
    exercise01.RingBufferException var19 = new exercise01.RingBufferException("");
    java.lang.String var20 = var19.toString();
    java.lang.String var21 = var19.toString();
    exercise01.RingBufferException var23 = new exercise01.RingBufferException("");
    java.lang.String var24 = var23.toString();
    java.lang.String var25 = var23.toString();
    java.lang.String var26 = var23.toString();
    var19.addSuppressed((java.lang.Throwable)var23);
    java.lang.String var28 = var19.toString();
    java.lang.Throwable[] var29 = var19.getSuppressed();
    var1.addSuppressed((java.lang.Throwable)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: "+ "'", var2.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: "+ "'", var6.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "exercise01.RingBufferException: "+ "'", var20.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "exercise01.RingBufferException: "+ "'", var24.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "exercise01.RingBufferException: "+ "'", var26.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "exercise01.RingBufferException: "+ "'", var28.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test179() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test179");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var3 = var1.new RingBufferIterator();
    int var4 = var1.size();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    java.util.Iterator var6 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);

  }

  public void test180() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test180");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.Throwable[] var5 = var3.getSuppressed();
    exercise01.RingBufferException var7 = new exercise01.RingBufferException("");
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.toString();
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    java.lang.String var12 = var11.toString();
    java.lang.String var13 = var11.toString();
    java.lang.String var14 = var11.toString();
    var7.addSuppressed((java.lang.Throwable)var11);
    java.lang.String var16 = var7.toString();
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("hi!");
    exercise01.RingBufferException var20 = new exercise01.RingBufferException("");
    java.lang.String var21 = var20.toString();
    java.lang.String var22 = var20.toString();
    exercise01.RingBufferException var24 = new exercise01.RingBufferException("");
    java.lang.String var25 = var24.toString();
    java.lang.String var26 = var24.toString();
    exercise01.RingBufferException var28 = new exercise01.RingBufferException("");
    java.lang.String var29 = var28.toString();
    java.lang.String var30 = var28.toString();
    java.lang.String var31 = var28.toString();
    var24.addSuppressed((java.lang.Throwable)var28);
    var20.addSuppressed((java.lang.Throwable)var28);
    var18.addSuppressed((java.lang.Throwable)var20);
    var7.addSuppressed((java.lang.Throwable)var18);
    var3.addSuppressed((java.lang.Throwable)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: "+ "'", var9.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: "+ "'", var13.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: "+ "'", var14.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "exercise01.RingBufferException: "+ "'", var21.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "exercise01.RingBufferException: "+ "'", var22.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "exercise01.RingBufferException: "+ "'", var25.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "exercise01.RingBufferException: "+ "'", var26.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "exercise01.RingBufferException: "+ "'", var29.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "exercise01.RingBufferException: "+ "'", var30.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "exercise01.RingBufferException: "+ "'", var31.equals("exercise01.RingBufferException: "));

  }

  public void test181() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test181");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    int var5 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test182() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test182");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var5 = var3.toString();
    java.lang.Throwable[] var6 = var3.getSuppressed();
    java.lang.Throwable[] var7 = var3.getSuppressed();
    java.lang.String var8 = var3.toString();
    exercise01.RingBuffer var10 = new exercise01.RingBuffer(100);
    var10.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var13 = var10.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var14 = var10.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var15 = var10.new RingBufferIterator();
    boolean var16 = var10.isEmpty();
    exercise01.RingBufferException var18 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var20 = new exercise01.RingBufferException("");
    var18.addSuppressed((java.lang.Throwable)var20);
    java.lang.String var22 = var20.toString();
    java.lang.Throwable[] var23 = var20.getSuppressed();
    java.lang.Throwable[] var24 = var20.getSuppressed();
    var10.enqueue((java.lang.Object)var20);
    exercise01.RingBufferException var27 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var29 = new exercise01.RingBufferException("");
    var27.addSuppressed((java.lang.Throwable)var29);
    var20.addSuppressed((java.lang.Throwable)var29);
    var3.addSuppressed((java.lang.Throwable)var29);
    exercise01.RingBufferException var34 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var36 = new exercise01.RingBufferException("");
    var34.addSuppressed((java.lang.Throwable)var36);
    java.lang.String var38 = var36.toString();
    java.lang.Throwable[] var39 = var36.getSuppressed();
    java.lang.Throwable[] var40 = var36.getSuppressed();
    java.lang.String var41 = var36.toString();
    exercise01.RingBuffer var43 = new exercise01.RingBuffer(100);
    var43.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var46 = var43.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var47 = var43.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var48 = var43.new RingBufferIterator();
    boolean var49 = var43.isEmpty();
    exercise01.RingBufferException var51 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var53 = new exercise01.RingBufferException("");
    var51.addSuppressed((java.lang.Throwable)var53);
    java.lang.String var55 = var53.toString();
    java.lang.Throwable[] var56 = var53.getSuppressed();
    java.lang.Throwable[] var57 = var53.getSuppressed();
    var43.enqueue((java.lang.Object)var53);
    exercise01.RingBufferException var60 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var62 = new exercise01.RingBufferException("");
    var60.addSuppressed((java.lang.Throwable)var62);
    var53.addSuppressed((java.lang.Throwable)var62);
    var36.addSuppressed((java.lang.Throwable)var62);
    exercise01.RingBufferException var67 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var69 = new exercise01.RingBufferException("");
    java.lang.String var70 = var69.toString();
    java.lang.String var71 = var69.toString();
    java.lang.String var72 = var69.toString();
    var67.addSuppressed((java.lang.Throwable)var69);
    java.lang.String var74 = var69.toString();
    java.lang.String var75 = var69.toString();
    var36.addSuppressed((java.lang.Throwable)var69);
    var3.addSuppressed((java.lang.Throwable)var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "exercise01.RingBufferException: "+ "'", var22.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "exercise01.RingBufferException: "+ "'", var38.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "exercise01.RingBufferException: "+ "'", var41.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "exercise01.RingBufferException: "+ "'", var55.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + "exercise01.RingBufferException: "+ "'", var70.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "exercise01.RingBufferException: "+ "'", var71.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "exercise01.RingBufferException: "+ "'", var72.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "exercise01.RingBufferException: "+ "'", var74.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + "exercise01.RingBufferException: "+ "'", var75.equals("exercise01.RingBufferException: "));

  }

  public void test183() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test183");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    var1.enqueue((java.lang.Object)0L);
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var8 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var9 = var7.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var10 = var7.new RingBufferIterator();
    var1.enqueue((java.lang.Object)var10);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.remove();
      fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  public void test184() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test184");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    exercise01.RingBuffer.RingBufferIterator var2 = var1.new RingBufferIterator();
    boolean var3 = var1.isEmpty();
    int var4 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test185() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test185");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("exercise01.RingBufferException: exercise01.RingBufferException: hi!");

  }

  public void test186() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test186");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.String var2 = var1.toString();
    exercise01.RingBufferException var4 = new exercise01.RingBufferException("");
    exercise01.RingBufferException var6 = new exercise01.RingBufferException("");
    var4.addSuppressed((java.lang.Throwable)var6);
    java.lang.String var8 = var6.toString();
    java.lang.Throwable[] var9 = var6.getSuppressed();
    java.lang.String var10 = var6.toString();
    var1.addSuppressed((java.lang.Throwable)var6);
    java.lang.Throwable[] var12 = var6.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: "+ "'", var2.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);

  }

  public void test187() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test187");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)true);
    int var7 = var1.size();
    exercise01.RingBuffer var9 = new exercise01.RingBuffer(100);
    var9.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var12 = var9.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var13 = var9.new RingBufferIterator();
    java.util.Iterator var14 = var9.iterator();
    int var15 = var9.size();
    var1.enqueue((java.lang.Object)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 1);

  }

  public void test188() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test188");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)true);
    java.lang.Object var7 = var1.dequeue();
    int var8 = var1.size();
    int var9 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + 0.0d+ "'", var7.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 1);

  }

  public void test189() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test189");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    exercise01.RingBuffer var5 = new exercise01.RingBuffer(10);
    exercise01.RingBufferException var7 = new exercise01.RingBufferException("");
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.toString();
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    java.lang.String var12 = var11.toString();
    java.lang.String var13 = var11.toString();
    exercise01.RingBufferException var15 = new exercise01.RingBufferException("");
    java.lang.String var16 = var15.toString();
    java.lang.String var17 = var15.toString();
    java.lang.String var18 = var15.toString();
    var11.addSuppressed((java.lang.Throwable)var15);
    var7.addSuppressed((java.lang.Throwable)var15);
    java.lang.Throwable[] var21 = var7.getSuppressed();
    var5.enqueue((java.lang.Object)var7);
    var1.addSuppressed((java.lang.Throwable)var7);
    java.lang.Throwable[] var24 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: "+ "'", var2.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: "+ "'", var9.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: "+ "'", var13.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "exercise01.RingBufferException: "+ "'", var16.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "exercise01.RingBufferException: "+ "'", var17.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: "+ "'", var18.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);

  }

  public void test190() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test190");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    var1.enqueue((java.lang.Object)true);
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    java.util.Iterator var8 = var1.iterator();
    java.util.Iterator var9 = var1.iterator();
    java.util.Iterator var10 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);

  }

  public void test191() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test191");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("");
    java.lang.String var2 = var1.toString();
    java.lang.String var3 = var1.toString();
    exercise01.RingBufferException var5 = new exercise01.RingBufferException("");
    java.lang.String var6 = var5.toString();
    java.lang.String var7 = var5.toString();
    exercise01.RingBufferException var9 = new exercise01.RingBufferException("");
    java.lang.String var10 = var9.toString();
    java.lang.String var11 = var9.toString();
    java.lang.String var12 = var9.toString();
    var5.addSuppressed((java.lang.Throwable)var9);
    var1.addSuppressed((java.lang.Throwable)var9);
    java.lang.Throwable[] var15 = var1.getSuppressed();
    java.lang.Throwable[] var16 = var1.getSuppressed();
    java.lang.Throwable[] var17 = var1.getSuppressed();
    java.lang.Throwable[] var18 = var1.getSuppressed();
    java.lang.Throwable[] var19 = var1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "exercise01.RingBufferException: "+ "'", var2.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "exercise01.RingBufferException: "+ "'", var3.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "exercise01.RingBufferException: "+ "'", var6.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "exercise01.RingBufferException: "+ "'", var7.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "exercise01.RingBufferException: "+ "'", var10.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "exercise01.RingBufferException: "+ "'", var11.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);

  }

  public void test192() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test192");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    int var2 = var1.size();
    var1.enqueue((java.lang.Object)1);
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBuffer var7 = new exercise01.RingBuffer(100);
    int var8 = var7.size();
    var7.enqueue((java.lang.Object)1);
    boolean var11 = var7.isEmpty();
    java.lang.Object var12 = var7.dequeue();
    var1.enqueue(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 1+ "'", var12.equals(1));

  }

  public void test193() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test193");


    exercise01.RingBufferException var1 = new exercise01.RingBufferException("hi!");
    exercise01.RingBufferException var3 = new exercise01.RingBufferException("");
    java.lang.String var4 = var3.toString();
    java.lang.String var5 = var3.toString();
    exercise01.RingBufferException var7 = new exercise01.RingBufferException("");
    java.lang.String var8 = var7.toString();
    java.lang.String var9 = var7.toString();
    exercise01.RingBufferException var11 = new exercise01.RingBufferException("");
    java.lang.String var12 = var11.toString();
    java.lang.String var13 = var11.toString();
    java.lang.String var14 = var11.toString();
    var7.addSuppressed((java.lang.Throwable)var11);
    var3.addSuppressed((java.lang.Throwable)var11);
    var1.addSuppressed((java.lang.Throwable)var3);
    java.lang.String var18 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "exercise01.RingBufferException: "+ "'", var4.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "exercise01.RingBufferException: "+ "'", var5.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "exercise01.RingBufferException: "+ "'", var8.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "exercise01.RingBufferException: "+ "'", var9.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "exercise01.RingBufferException: "+ "'", var12.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "exercise01.RingBufferException: "+ "'", var13.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "exercise01.RingBufferException: "+ "'", var14.equals("exercise01.RingBufferException: "));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "exercise01.RingBufferException: hi!"+ "'", var18.equals("exercise01.RingBufferException: hi!"));

  }

  public void test194() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test194");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var5 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var6 = var1.new RingBufferIterator();
    exercise01.RingBuffer.RingBufferIterator var7 = var1.new RingBufferIterator();
    boolean var8 = var1.isEmpty();
    boolean var9 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test195() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest0.test195");


    exercise01.RingBuffer var1 = new exercise01.RingBuffer(100);
    var1.enqueue((java.lang.Object)0.0d);
    exercise01.RingBuffer.RingBufferIterator var4 = var1.new RingBufferIterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    exercise01.RingBuffer var8 = new exercise01.RingBuffer(10);
    var1.enqueue((java.lang.Object)10);
    int var10 = var1.size();
    java.util.Iterator var11 = var1.iterator();
    java.lang.Object var12 = var1.dequeue();
    var1.enqueue((java.lang.Object)true);
    java.util.Iterator var15 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + 0.0d+ "'", var12.equals(0.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);

  }

}