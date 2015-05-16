package exercise01;

import junit.framework.*;

public class RingBufferWrapperRandoopTest1 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperRandoopTest1.test1");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.lang.Object var2 = var1.dequeue();
    int var3 = var1.size();
    exercise01.RingBufferWrapper var5 = new exercise01.RingBufferWrapper(1);
    boolean var6 = var5.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    java.lang.Object var8 = var1.dequeue();
    java.util.Iterator var9 = var1.iterator();
    exercise01.RingBufferWrapper var11 = new exercise01.RingBufferWrapper(1);
    var1.enqueue((java.lang.Object)var11);
    int var13 = var11.size();
    java.lang.Object var14 = var11.dequeue();
    java.util.Iterator var15 = var11.iterator();
    boolean var16 = var11.isEmpty();
    java.util.Iterator var17 = var11.iterator();
    boolean var18 = var11.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + true+ "'", var8.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperRandoopTest1.test2");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.lang.Object var2 = var1.dequeue();
    int var3 = var1.size();
    exercise01.RingBufferWrapper var5 = new exercise01.RingBufferWrapper(1);
    boolean var6 = var5.isEmpty();
    var1.enqueue((java.lang.Object)var6);
    boolean var8 = var1.isEmpty();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(1);
    int var11 = var10.size();
    boolean var12 = var10.isEmpty();
    boolean var13 = var10.isEmpty();
    exercise01.RingBufferWrapper var15 = new exercise01.RingBufferWrapper(10);
    java.lang.Object var16 = var15.dequeue();
    int var17 = var15.size();
    int var18 = var15.size();
    var10.enqueue((java.lang.Object)var15);
    var1.enqueue((java.lang.Object)var10);
    java.lang.Object var21 = var10.dequeue();
    exercise01.RingBufferWrapper var23 = new exercise01.RingBufferWrapper(1);
    java.util.Iterator var24 = var23.iterator();
    boolean var25 = var23.isEmpty();
    exercise01.RingBufferWrapper var27 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var28 = var27.iterator();
    var27.enqueue((java.lang.Object)true);
    var23.enqueue((java.lang.Object)var27);
    int var32 = var27.size();
    java.lang.Object var33 = var27.dequeue();
    java.lang.Object var34 = var27.dequeue();
    var10.enqueue((java.lang.Object)var27);
    boolean var36 = var10.isEmpty();
    exercise01.RingBufferWrapper var38 = new exercise01.RingBufferWrapper(2);
    boolean var39 = var38.isEmpty();
    exercise01.RingBufferWrapper var41 = new exercise01.RingBufferWrapper(1);
    java.util.Iterator var42 = var41.iterator();
    boolean var43 = var41.isEmpty();
    java.util.Iterator var44 = var41.iterator();
    java.util.Iterator var45 = var41.iterator();
    int var46 = var41.size();
    int var47 = var41.size();
    int var48 = var41.size();
    exercise01.RingBufferWrapper var50 = new exercise01.RingBufferWrapper(1);
    java.util.Iterator var51 = var50.iterator();
    boolean var52 = var50.isEmpty();
    java.lang.Object var53 = var50.dequeue();
    java.util.Iterator var54 = var50.iterator();
    var41.enqueue((java.lang.Object)var50);
    exercise01.RingBufferWrapper var57 = new exercise01.RingBufferWrapper(1);
    java.util.Iterator var58 = var57.iterator();
    boolean var59 = var57.isEmpty();
    exercise01.RingBufferWrapper var61 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var62 = var61.iterator();
    var61.enqueue((java.lang.Object)true);
    var57.enqueue((java.lang.Object)var61);
    exercise01.RingBufferWrapper var67 = new exercise01.RingBufferWrapper(10);
    java.lang.Object var68 = var67.dequeue();
    int var69 = var67.size();
    exercise01.RingBufferWrapper var71 = new exercise01.RingBufferWrapper(1);
    boolean var72 = var71.isEmpty();
    var67.enqueue((java.lang.Object)var72);
    java.lang.Object var74 = var67.dequeue();
    java.util.Iterator var75 = var67.iterator();
    var57.enqueue((java.lang.Object)var75);
    var41.enqueue((java.lang.Object)var57);
    var38.enqueue((java.lang.Object)var57);
    java.lang.Object var79 = var38.dequeue();
    var10.enqueue(var79);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + true+ "'", var33.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var62);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + true+ "'", var74.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var75);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var79);

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperRandoopTest1.test3");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    exercise01.RingBufferWrapper var5 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var6 = var5.iterator();
    var5.enqueue((java.lang.Object)true);
    var1.enqueue((java.lang.Object)var5);
    int var10 = var5.size();
    java.lang.Object var11 = var5.dequeue();
    java.lang.Object var12 = var5.dequeue();
    int var13 = var5.size();
    exercise01.RingBufferWrapper var15 = new exercise01.RingBufferWrapper(1);
    int var16 = var15.size();
    java.util.Iterator var17 = var15.iterator();
    var15.enqueue((java.lang.Object)'#');
    boolean var20 = var15.isEmpty();
    java.util.Iterator var21 = var15.iterator();
    java.util.Iterator var22 = var15.iterator();
    exercise01.RingBufferWrapper var24 = new exercise01.RingBufferWrapper(10);
    java.lang.Object var25 = var24.dequeue();
    int var26 = var24.size();
    exercise01.RingBufferWrapper var28 = new exercise01.RingBufferWrapper(1);
    boolean var29 = var28.isEmpty();
    var24.enqueue((java.lang.Object)var29);
    java.lang.Object var31 = var24.dequeue();
    java.util.Iterator var32 = var24.iterator();
    exercise01.RingBufferWrapper var34 = new exercise01.RingBufferWrapper(1);
    var24.enqueue((java.lang.Object)var34);
    java.util.Iterator var36 = var34.iterator();
    var15.enqueue((java.lang.Object)var34);
    var5.enqueue((java.lang.Object)var34);
    boolean var39 = var34.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + true+ "'", var11.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + true+ "'", var31.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperRandoopTest1.test4");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    boolean var2 = var1.isEmpty();
    java.util.Iterator var3 = var1.iterator();
    java.lang.Object var4 = var1.dequeue();
    boolean var5 = var1.isEmpty();
    java.lang.Object var6 = var1.dequeue();
    boolean var7 = var1.isEmpty();
    java.util.Iterator var8 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperRandoopTest1.test5");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    java.util.Iterator var2 = var1.iterator();
    int var3 = var1.size();
    boolean var4 = var1.isEmpty();
    exercise01.RingBufferWrapper var6 = new exercise01.RingBufferWrapper(1);
    int var7 = var6.size();
    java.util.Iterator var8 = var6.iterator();
    java.util.Iterator var9 = var6.iterator();
    int var10 = var6.size();
    java.lang.Object var11 = var6.dequeue();
    java.util.Iterator var12 = var6.iterator();
    var1.enqueue((java.lang.Object)var12);
    boolean var14 = var1.isEmpty();
    java.util.Iterator var15 = var1.iterator();
    java.util.Iterator var16 = var1.iterator();
    boolean var17 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperRandoopTest1.test6");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    var1.enqueue((java.lang.Object)true);
    int var5 = var1.size();
    exercise01.RingBufferWrapper var7 = new exercise01.RingBufferWrapper(1);
    int var8 = var7.size();
    java.util.Iterator var9 = var7.iterator();
    java.util.Iterator var10 = var7.iterator();
    exercise01.RingBufferWrapper var12 = new exercise01.RingBufferWrapper(1);
    java.util.Iterator var13 = var12.iterator();
    boolean var14 = var12.isEmpty();
    java.util.Iterator var15 = var12.iterator();
    var7.enqueue((java.lang.Object)var12);
    exercise01.RingBufferWrapper var18 = new exercise01.RingBufferWrapper(10);
    java.lang.Object var19 = var18.dequeue();
    boolean var20 = var18.isEmpty();
    java.util.Iterator var21 = var18.iterator();
    java.lang.Object var22 = var18.dequeue();
    boolean var23 = var18.isEmpty();
    int var24 = var18.size();
    var12.enqueue((java.lang.Object)var18);
    var1.enqueue((java.lang.Object)var18);
    java.util.Iterator var27 = var18.iterator();
    java.lang.Object var28 = var18.dequeue();
    int var29 = var18.size();
    int var30 = var18.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == 0);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperRandoopTest1.test7");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    int var2 = var1.size();
    java.lang.Object var3 = var1.dequeue();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    java.lang.Object var7 = var1.dequeue();
    exercise01.RingBufferWrapper var9 = new exercise01.RingBufferWrapper(100);
    int var10 = var9.size();
    exercise01.RingBufferWrapper var12 = new exercise01.RingBufferWrapper(1);
    boolean var13 = var12.isEmpty();
    var9.enqueue((java.lang.Object)var12);
    int var15 = var12.size();
    java.util.Iterator var16 = var12.iterator();
    exercise01.RingBufferWrapper var18 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var19 = var18.iterator();
    var18.enqueue((java.lang.Object)true);
    int var22 = var18.size();
    java.lang.Object var23 = var18.dequeue();
    boolean var24 = var18.isEmpty();
    boolean var25 = var18.isEmpty();
    var12.enqueue((java.lang.Object)var25);
    java.util.Iterator var27 = var12.iterator();
    java.lang.Object var28 = var12.dequeue();
    java.util.Iterator var29 = var12.iterator();
    var1.enqueue((java.lang.Object)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + true+ "'", var23.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + true+ "'", var28.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var29);

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperRandoopTest1.test8");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(100);
    int var2 = var1.size();
    exercise01.RingBufferWrapper var4 = new exercise01.RingBufferWrapper(1);
    boolean var5 = var4.isEmpty();
    var1.enqueue((java.lang.Object)var4);
    int var7 = var4.size();
    boolean var8 = var4.isEmpty();
    int var9 = var4.size();
    int var10 = var4.size();
    exercise01.RingBufferWrapper var12 = new exercise01.RingBufferWrapper(1);
    java.util.Iterator var13 = var12.iterator();
    boolean var14 = var12.isEmpty();
    java.util.Iterator var15 = var12.iterator();
    java.util.Iterator var16 = var12.iterator();
    int var17 = var12.size();
    boolean var18 = var12.isEmpty();
    int var19 = var12.size();
    var4.enqueue((java.lang.Object)var19);
    exercise01.RingBufferWrapper var22 = new exercise01.RingBufferWrapper(1);
    int var23 = var22.size();
    boolean var24 = var22.isEmpty();
    var22.enqueue((java.lang.Object)"hi!");
    var4.enqueue((java.lang.Object)var22);
    java.lang.Object var28 = var22.dequeue();
    int var29 = var22.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "hi!"+ "'", var28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperRandoopTest1.test9");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.lang.Object var2 = var1.dequeue();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    boolean var5 = var1.isEmpty();
    java.util.Iterator var6 = var1.iterator();
    java.util.Iterator var7 = var1.iterator();
    java.util.Iterator var8 = var1.iterator();
    var1.enqueue((java.lang.Object)false);
    exercise01.RingBufferWrapper var12 = new exercise01.RingBufferWrapper(1);
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    var1.enqueue((java.lang.Object)var12);
    java.lang.Object var16 = var1.dequeue();
    exercise01.RingBufferWrapper var18 = new exercise01.RingBufferWrapper(10);
    java.lang.Object var19 = var18.dequeue();
    boolean var20 = var18.isEmpty();
    java.util.Iterator var21 = var18.iterator();
    java.lang.Object var22 = var18.dequeue();
    boolean var23 = var18.isEmpty();
    exercise01.RingBufferWrapper var25 = new exercise01.RingBufferWrapper(1);
    int var26 = var25.size();
    java.util.Iterator var27 = var25.iterator();
    java.util.Iterator var28 = var25.iterator();
    var18.enqueue((java.lang.Object)var25);
    boolean var30 = var18.isEmpty();
    boolean var31 = var18.isEmpty();
    int var32 = var18.size();
    var1.enqueue((java.lang.Object)var32);
    exercise01.RingBufferWrapper var35 = new exercise01.RingBufferWrapper(100);
    int var36 = var35.size();
    exercise01.RingBufferWrapper var38 = new exercise01.RingBufferWrapper(1);
    boolean var39 = var38.isEmpty();
    var35.enqueue((java.lang.Object)var38);
    var1.enqueue((java.lang.Object)var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + false+ "'", var16.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperRandoopTest1.test10");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    int var2 = var1.size();
    boolean var3 = var1.isEmpty();
    var1.enqueue((java.lang.Object)"hi!");
    java.lang.Object var6 = var1.dequeue();
    java.lang.Object var7 = var1.dequeue();
    java.lang.Object var8 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "hi!"+ "'", var6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var8);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperRandoopTest1.test11");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var2 = var1.iterator();
    var1.enqueue((java.lang.Object)true);
    int var5 = var1.size();
    java.lang.Object var6 = var1.dequeue();
    int var7 = var1.size();
    java.util.Iterator var8 = var1.iterator();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(100);
    int var11 = var10.size();
    exercise01.RingBufferWrapper var13 = new exercise01.RingBufferWrapper(1);
    boolean var14 = var13.isEmpty();
    var10.enqueue((java.lang.Object)var13);
    exercise01.RingBufferWrapper var17 = new exercise01.RingBufferWrapper(1);
    int var18 = var17.size();
    boolean var19 = var17.isEmpty();
    var17.enqueue((java.lang.Object)"hi!");
    java.lang.Object var22 = var17.dequeue();
    var13.enqueue((java.lang.Object)var17);
    int var24 = var17.size();
    var1.enqueue((java.lang.Object)var24);
    int var26 = var1.size();
    java.util.Iterator var27 = var1.iterator();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + true+ "'", var6.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "hi!"+ "'", var22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var27);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRingBufferWrapperRandoopTest1.test12");


    exercise01.RingBufferWrapper var1 = new exercise01.RingBufferWrapper(1);
    java.util.Iterator var2 = var1.iterator();
    boolean var3 = var1.isEmpty();
    java.util.Iterator var4 = var1.iterator();
    java.util.Iterator var5 = var1.iterator();
    int var6 = var1.size();
    int var7 = var1.size();
    int var8 = var1.size();
    exercise01.RingBufferWrapper var10 = new exercise01.RingBufferWrapper(1);
    java.util.Iterator var11 = var10.iterator();
    boolean var12 = var10.isEmpty();
    java.lang.Object var13 = var10.dequeue();
    java.util.Iterator var14 = var10.iterator();
    var1.enqueue((java.lang.Object)var10);
    exercise01.RingBufferWrapper var17 = new exercise01.RingBufferWrapper(1);
    java.util.Iterator var18 = var17.iterator();
    boolean var19 = var17.isEmpty();
    exercise01.RingBufferWrapper var21 = new exercise01.RingBufferWrapper(10);
    java.util.Iterator var22 = var21.iterator();
    var21.enqueue((java.lang.Object)true);
    var17.enqueue((java.lang.Object)var21);
    exercise01.RingBufferWrapper var27 = new exercise01.RingBufferWrapper(10);
    java.lang.Object var28 = var27.dequeue();
    int var29 = var27.size();
    exercise01.RingBufferWrapper var31 = new exercise01.RingBufferWrapper(1);
    boolean var32 = var31.isEmpty();
    var27.enqueue((java.lang.Object)var32);
    java.lang.Object var34 = var27.dequeue();
    java.util.Iterator var35 = var27.iterator();
    var17.enqueue((java.lang.Object)var35);
    var1.enqueue((java.lang.Object)var17);
    java.util.Iterator var38 = var17.iterator();
    exercise01.RingBufferWrapper var40 = new exercise01.RingBufferWrapper(1);
    int var41 = var40.size();
    java.util.Iterator var42 = var40.iterator();
    var40.enqueue((java.lang.Object)(byte)1);
    boolean var45 = var40.isEmpty();
    int var46 = var40.size();
    boolean var47 = var40.isEmpty();
    exercise01.RingBufferWrapper var49 = new exercise01.RingBufferWrapper(10);
    java.lang.Object var50 = var49.dequeue();
    java.lang.Object var51 = var49.dequeue();
    var40.enqueue((java.lang.Object)var49);
    var17.enqueue((java.lang.Object)var40);
    int var54 = var40.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + true+ "'", var34.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 1);

  }

}
