package exercise01;

import junit.framework.*;

public class RingBufferWrapperWithIteratorRandoopTest2 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test1");


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
    java.lang.Object var28 = var1.dequeue();
    
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
    assertNotNull(var28);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test2");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    int var7 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test3");


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
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var1.new RingBufferIteratorWrapper();
    
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

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test4");


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
    java.lang.Object var18 = var15.next();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test5");


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
    exercise01.RingBufferWrapper var46 = new exercise01.RingBufferWrapper(1);
    boolean var47 = var46.isEmpty();
    boolean var48 = var46.isEmpty();
    int var49 = var46.size();
    int var50 = var46.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var51 = var46.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var46);
    exercise01.RingBufferWrapper var54 = new exercise01.RingBufferWrapper(1);
    boolean var55 = var54.isEmpty();
    int var56 = var54.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var57 = var54.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var58 = var54.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var60 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var61 = var60.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var62 = var60.new RingBufferIteratorWrapper();
    int var63 = var60.size();
    exercise01.RingBufferWrapper var65 = new exercise01.RingBufferWrapper(0);
    int var66 = var65.size();
    int var67 = var65.size();
    boolean var68 = var65.isEmpty();
    boolean var69 = var65.isEmpty();
    int var70 = var65.size();
    boolean var71 = var65.isEmpty();
    java.util.Iterator var72 = var65.iterator();
    var60.enqueue((java.lang.Object)var65);
    var54.enqueue((java.lang.Object)var65);
    int var75 = var54.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var76 = var54.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var76);
    boolean var78 = var76.hasNext();
    
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
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test6");


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
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var14 = var1.new RingBufferIteratorWrapper();
    
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

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test7");


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
    java.util.Iterator var30 = var1.iterator();
    exercise01.RingBufferWrapper var32 = new exercise01.RingBufferWrapper(0);
    int var33 = var32.size();
    int var34 = var32.size();
    boolean var35 = var32.isEmpty();
    boolean var36 = var32.isEmpty();
    int var37 = var32.size();
    boolean var38 = var32.isEmpty();
    java.util.Iterator var39 = var32.iterator();
    java.util.Iterator var40 = var32.iterator();
    var1.enqueue((java.lang.Object)var32);
    
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
    assertTrue(var33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test8");


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
    boolean var36 = var1.isEmpty();
    int var37 = var1.size();
    
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
    assertTrue(var37 == 2);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test9");


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
    java.util.Iterator var26 = var1.iterator();
    int var27 = var1.size();
    
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
    assertNotNull(var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test10");


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
    boolean var19 = var5.isEmpty();
    java.util.Iterator var20 = var5.iterator();
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test11");


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
    boolean var19 = var5.isEmpty();
    boolean var20 = var5.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var21 = var5.new RingBufferIteratorWrapper();
    
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
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test12");


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
    java.lang.Object var12 = var1.dequeue();
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
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test13");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    int var7 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test14");


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
      java.lang.Object var26 = var25.next();
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

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test15");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
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
    assertTrue(var4 == 0);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test16");


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
    boolean var15 = var13.hasNext();
    java.lang.Object var16 = var13.next();
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test17");


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
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var13 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var14 = var13.next();
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
    assertTrue(var12 == 0);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test18");


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
    java.lang.Object var32 = var1.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var33 = var1.new RingBufferIteratorWrapper();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var34 = var1.dequeue();
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

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test19");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    
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
    assertTrue(var10 == 0);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test20");


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
    int var30 = var1.size();
    exercise01.RingBufferWrapper var32 = new exercise01.RingBufferWrapper(10);
    exercise01.RingBufferWrapper var34 = new exercise01.RingBufferWrapper(0);
    int var35 = var34.size();
    int var36 = var34.size();
    boolean var37 = var34.isEmpty();
    boolean var38 = var34.isEmpty();
    int var39 = var34.size();
    boolean var40 = var34.isEmpty();
    var32.enqueue((java.lang.Object)var40);
    var1.enqueue((java.lang.Object)var40);
    boolean var43 = var1.isEmpty();
    
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
    assertTrue(var30 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test21");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var4.new RingBufferIteratorWrapper();
    boolean var9 = var4.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var10 = var4.new RingBufferIteratorWrapper();
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
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var27 = var12.new RingBufferIteratorWrapper();
    java.lang.Object var28 = var27.next();
    boolean var29 = var27.hasNext();
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
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test22");


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
    int var27 = var1.size();
    java.lang.Object var28 = var1.dequeue();
    exercise01.RingBufferWrapper var30 = new exercise01.RingBufferWrapper(100);
    boolean var31 = var30.isEmpty();
    exercise01.RingBufferWrapper var33 = new exercise01.RingBufferWrapper(0);
    int var34 = var33.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var35 = var33.new RingBufferIteratorWrapper();
    var30.enqueue((java.lang.Object)var33);
    boolean var37 = var30.isEmpty();
    int var38 = var30.size();
    int var39 = var30.size();
    int var40 = var30.size();
    boolean var41 = var30.isEmpty();
    java.lang.Object var42 = var30.dequeue();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var43 = var30.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper var45 = new exercise01.RingBufferWrapper(0);
    int var46 = var45.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var47 = var45.new RingBufferIteratorWrapper();
    java.util.Iterator var48 = var45.iterator();
    java.util.Iterator var49 = var45.iterator();
    int var50 = var45.size();
    var30.enqueue((java.lang.Object)var45);
    java.util.Iterator var52 = var30.iterator();
    boolean var53 = var30.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var54 = var30.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var54);
    
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
    assertTrue(var27 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test23");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    int var2 = var1.size();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var7 = var1.iterator();
    int var8 = var1.size();
    java.util.Iterator var9 = var1.iterator();
    java.util.Iterator var10 = var1.iterator();
    java.util.Iterator var11 = var1.iterator();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var12 = var1.new RingBufferIteratorWrapper();
    boolean var13 = var12.hasNext();
    
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
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test24");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    boolean var2 = var1.isEmpty();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(0);
    int var5 = var4.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var6 = var4.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var4);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var8 = var1.new RingBufferIteratorWrapper();
    java.util.Iterator var9 = var1.iterator();
    int var10 = var1.size();
    java.lang.Object var11 = var1.dequeue();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(100);
    boolean var14 = var13.isEmpty();
    exercise01.RingBufferWrapper var16 = new exercise01.RingBufferWrapper(0);
    int var17 = var16.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var18 = var16.new RingBufferIteratorWrapper();
    var13.enqueue((java.lang.Object)var16);
    boolean var20 = var16.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var21 = var16.new RingBufferIteratorWrapper();
    java.util.Iterator var22 = var16.iterator();
    var1.enqueue((java.lang.Object)var16);
    var1.enqueue((java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test25");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(0);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var2 = var1.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var3 = var1.new RingBufferIteratorWrapper();
    int var4 = var1.size();
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
    assertTrue(var4 == 0);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test26");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    exercise01.RingBufferWrapper var3 = new exercise01.RingBufferWrapper(0);
    int var4 = var3.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var3.new RingBufferIteratorWrapper();
    java.util.Iterator var6 = var3.iterator();
    var1.enqueue((java.lang.Object)var3);
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
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var23 = var9.new RingBufferIteratorWrapper();
    java.lang.Object var24 = var23.next();
    java.lang.Object var25 = var23.next();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.enqueue(var25);
      fail("Expected exception of type exercise01.RingBufferException");
    } catch (exercise01.RingBufferException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
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
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test27");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    boolean var4 = var1.isEmpty();
    java.util.Iterator var5 = var1.iterator();
    java.util.Iterator var6 = var1.iterator();
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
    java.util.Iterator var20 = var8.iterator();
    java.util.Iterator var21 = var8.iterator();
    var1.enqueue((java.lang.Object)var8);
    exercise01.RingBufferWrapper var24 = new exercise01.RingBufferWrapper(0);
    int var25 = var24.size();
    int var26 = var24.size();
    boolean var27 = var24.isEmpty();
    java.util.Iterator var28 = var24.iterator();
    boolean var29 = var24.isEmpty();
    boolean var30 = var24.isEmpty();
    boolean var31 = var24.isEmpty();
    int var32 = var24.size();
    var8.enqueue((java.lang.Object)var24);
    int var34 = var24.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
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
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test28");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    exercise01.RingBufferWrapper var3 = new exercise01.RingBufferWrapper(0);
    int var4 = var3.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var5 = var3.new RingBufferIteratorWrapper();
    java.util.Iterator var6 = var3.iterator();
    var1.enqueue((java.lang.Object)var3);
    int var8 = var3.size();
    int var9 = var3.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test29");


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
    java.util.Iterator var14 = var1.iterator();
    boolean var15 = var1.isEmpty();
    exercise01.RingBufferWrapper var17 = new exercise01.RingBufferWrapper(100);
    boolean var18 = var17.isEmpty();
    exercise01.RingBufferWrapper var20 = new exercise01.RingBufferWrapper(0);
    int var21 = var20.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var22 = var20.new RingBufferIteratorWrapper();
    var17.enqueue((java.lang.Object)var20);
    var17.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var27 = new exercise01.RingBufferWrapper(0);
    int var28 = var27.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var29 = var27.new RingBufferIteratorWrapper();
    java.util.Iterator var30 = var27.iterator();
    var17.enqueue((java.lang.Object)var27);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var32 = var27.new RingBufferIteratorWrapper();
    boolean var33 = var27.isEmpty();
    var1.enqueue((java.lang.Object)var27);
    int var35 = var1.size();
    exercise01.RingBufferWrapper var37 = new exercise01.RingBufferWrapper(1);
    boolean var38 = var37.isEmpty();
    int var39 = var37.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var40 = var37.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var41 = var37.new RingBufferIteratorWrapper();
    var1.enqueue((java.lang.Object)var37);
    
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
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperWithIteratorRandoopTest2.test30");


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
    boolean var17 = var1.isEmpty();
    exercise01.RingBufferWrapper var19 = new exercise01.RingBufferWrapper(100);
    boolean var20 = var19.isEmpty();
    exercise01.RingBufferWrapper var22 = new exercise01.RingBufferWrapper(0);
    int var23 = var22.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var24 = var22.new RingBufferIteratorWrapper();
    var19.enqueue((java.lang.Object)var22);
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var26 = var19.new RingBufferIteratorWrapper();
    java.lang.Object var27 = var19.dequeue();
    boolean var28 = var19.isEmpty();
    exercise01.RingBufferWrapper var30 = new exercise01.RingBufferWrapper(100);
    boolean var31 = var30.isEmpty();
    exercise01.RingBufferWrapper var33 = new exercise01.RingBufferWrapper(0);
    int var34 = var33.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var35 = var33.new RingBufferIteratorWrapper();
    var30.enqueue((java.lang.Object)var33);
    var30.enqueue((java.lang.Object)10.0f);
    exercise01.RingBufferWrapper var40 = new exercise01.RingBufferWrapper(0);
    int var41 = var40.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var42 = var40.new RingBufferIteratorWrapper();
    java.util.Iterator var43 = var40.iterator();
    var30.enqueue((java.lang.Object)var40);
    boolean var45 = var30.isEmpty();
    boolean var46 = var30.isEmpty();
    java.util.Iterator var47 = var30.iterator();
    exercise01.RingBufferWrapper var49 = new exercise01.RingBufferWrapper(100);
    boolean var50 = var49.isEmpty();
    exercise01.RingBufferWrapper var52 = new exercise01.RingBufferWrapper(0);
    int var53 = var52.size();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var54 = var52.new RingBufferIteratorWrapper();
    var49.enqueue((java.lang.Object)var52);
    boolean var56 = var49.isEmpty();
    int var57 = var49.size();
    int var58 = var49.size();
    var30.enqueue((java.lang.Object)var58);
    exercise01.RingBufferWrapper var61 = new exercise01.RingBufferWrapper(0);
    int var62 = var61.size();
    int var63 = var61.size();
    boolean var64 = var61.isEmpty();
    java.util.Iterator var65 = var61.iterator();
    boolean var66 = var61.isEmpty();
    boolean var67 = var61.isEmpty();
    boolean var68 = var61.isEmpty();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var69 = var61.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var70 = var61.new RingBufferIteratorWrapper();
    exercise01.RingBufferWrapper.RingBufferIteratorWrapper var71 = var61.new RingBufferIteratorWrapper();
    int var72 = var61.size();
    var30.enqueue((java.lang.Object)var72);
    boolean var74 = var30.isEmpty();
    var19.enqueue((java.lang.Object)var30);
    var1.enqueue((java.lang.Object)var19);
    int var77 = var1.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 4);

  }

}
