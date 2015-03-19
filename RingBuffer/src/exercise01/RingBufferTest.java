package exercise01;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class RingBufferTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	//testen ob intialisieren funktioniert
	@Test
	public void testRingBuffer1()
	{
		RingBuffer<Object> rb = new RingBuffer<Object>(2);
		assertNotNull(rb);
	}
	
	// add  more elements to ringbuffer than  possible
	@Test(expected=RingBufferException.class)
	public void testRingBuffer2() throws RingBufferException 
	{
		RingBuffer<Integer> rb = new RingBuffer<Integer>(3);
		rb.enqueue(3);
		rb.enqueue(3);
		rb.enqueue(5);
		rb.enqueue(6);
		
	}
	
	@Test
	//check size of Ringbuffer
	public void testRingBuffer3() throws RingBufferException
	{
		RingBuffer<Integer> rb = new RingBuffer<Integer>(3);
		rb.enqueue(2);
		rb.enqueue(1);
		assertEquals(2, rb.size());
	}
	
	@Test
	//check isEmpty
	public void testRingBuffer4() throws RingBufferException
	{
		RingBuffer<Object> rb = new RingBuffer<Object>(3);
		Object o = new Object();
		rb.enqueue(o);
		rb.dequeue();
		assertEquals(true, rb.isEmpty());
	}
	
	//test remove more elements than the queue has
	@Test(expected=RingBufferException.class)
	public void testRingBuffer5() throws RingBufferException
	{
		RingBuffer<String> rb = new RingBuffer<String>(3);
		rb.enqueue("A new and great String");
		rb.dequeue();
		rb.dequeue();
		
		
	
	}
	
	//hinzufügen und löschen von elementen bei mehr elementen als der buffer beinhaltet
	@Test
	public void testRingBuffer6() throws RingBufferException
	{
		RingBuffer<Integer> rb = new RingBuffer<Integer>(3);
		rb.enqueue(1);
		rb.enqueue(2);
		rb.enqueue(3);
		rb.dequeue();
		rb.enqueue(4);
		rb.dequeue();
		rb.dequeue();
		rb.dequeue();
		assertEquals(true, rb.isEmpty());
		
		
	}
	
	//queuing and dequing = same
	@Test
	public void testRingBuffer7() throws RingBufferException
	{
		RingBuffer<String> rb = new RingBuffer<String>(5);
		rb.enqueue("test");
		assertEquals("test",rb.dequeue());
		
		
		
	}
	
	@Test
	public void testRingbuffer8()
	{
		RingBuffer<Integer> rb = new RingBuffer<Integer>(3);
		assertNotNull(rb.iterator());
		
		

		/*rb.dequeue()
		rb.enqueue(item);
		rb.forEach(action);
		rb.isEmpty()
		rb.iterator()
		rb.size()
		rb.spliterator()
		*/
		
		
		
		
	}

	@Test
	public void testRingBuffer9()
	{
		RingBuffer<Integer> rb = new RingBuffer<Integer>(3);
		Iterator ib = rb.iterator();
		assertEquals(false,ib.hasNext());
	}
	
	@Test (expected=java.util.NoSuchElementException.class)
	public void testRingBuffer10()
	{
		RingBuffer<Integer> rb = new RingBuffer<Integer>(3);
		Iterator ib = rb.iterator();
		ib.next();
	}
	/*
	final test with a collection with several items, make sure the iterator goes through each item, in the correct order (if there is one)
	remove all elements from the collection: collection is now empty
	*/
	
	@Test (expected = UnsupportedOperationException.class)
	public void testRingBuffer11()
	{
		RingBuffer<Integer> rb = new RingBuffer<Integer>(3);
		Iterator ib = rb.iterator();
		ib.remove();
	}
	
	@Test
	public void testRingBuffer12() throws RingBufferException
	{
		RingBuffer<Integer> rb = new RingBuffer<Integer>(3);
		rb.enqueue(1);
		rb.enqueue(7);
		rb.enqueue(5);
		Iterator ib = rb.iterator();
		ib.next();
		ib.next();
		assertEquals(ib.next(),5);
	}
	
	
	
}
