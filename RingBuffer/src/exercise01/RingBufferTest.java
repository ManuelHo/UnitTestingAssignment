package exercise01;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Test;

public class RingBufferTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	//Can i intialize the object
	@Test
	public void testinitialize()
	{
		RingBuffer<Object> rb = new RingBuffer<Object>(2);
		assertNotNull(rb);
	}
	
	//queuing and dequing = same
	@Test
	public void testEnqueue1() throws RingBufferException
	{
		RingBuffer<String> rb = new RingBuffer<String>(5);
		rb.enqueue("test");
		assertEquals("test",rb.dequeue());
			
	}
	
	@Test
	//check the Size = the Itemcount of the Buffer
	public void testSize1() throws RingBufferException
	{
		RingBuffer<Integer> rb = new RingBuffer<Integer>(3);
		rb.enqueue(2);
		rb.enqueue(1);
		assertEquals(2, rb.size());
	}
	
	@Test
	//check size after a item has been removed
	public void testSize2() throws RingBufferException
	{
		RingBuffer<Integer> rb = new RingBuffer<Integer>(3);
		rb.enqueue(11);
		rb.enqueue(22);
		rb.dequeue();
		rb.enqueue(33);
		assertEquals(2,rb.size());
		
	}
	
	@Test
	//Check if the IsEmpty does work 
	public void testIsEmpty() throws RingBufferException
	{
		RingBuffer<Object> rb = new RingBuffer<Object>(3);
		Object o = new Object();
		rb.enqueue(o);
		rb.dequeue();
		assertEquals(true, rb.isEmpty());
	}
	
	
	
	//Adding more elements to RingBuffer class than possible
	@Test(expected=RingBufferException.class)
	public void testEnqueue2() throws RingBufferException 
	{
		RingBuffer<Integer> rb = new RingBuffer<Integer>(3);
		rb.enqueue(3);
		rb.enqueue(3);
		rb.enqueue(5);
		rb.enqueue(6);
		
	}
	
	//Removing more elements 
	@Test(expected=RingBufferException.class)
	public void testDequeue1() throws RingBufferException
	{
		RingBuffer<String> rb = new RingBuffer<String>(3);
		rb.enqueue("A new and great String");
		rb.dequeue();
		rb.dequeue();
			
	}
	
	
	//Enquing and dequing multiple elements in different order 
	@Test
	public void testIsEmpty2() throws RingBufferException
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
	

	
	//test if the methods gives back an iterator
	@Test 
	public void testIterator()
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

	//test hasNext false after creating a Interator on an empty RingBuffer
	@Test
	public void testIteratorHasNext()
	{
		RingBuffer<Integer> rb = new RingBuffer<Integer>(3);
		Iterator ib = rb.iterator();
		assertEquals(false,ib.hasNext());
	}
	
	//test the next Function if there is no next ITem 
	@Test (expected=java.util.NoSuchElementException.class)
	public void testIteratorNext()
	{
		RingBuffer<Integer> rb = new RingBuffer<Integer>(3);
		Iterator ib = rb.iterator();
		ib.next();
	}

	//test the removeFunction of the Iterator
	@Test (expected = UnsupportedOperationException.class)
	public void restIteratorRemove()
	{
		RingBuffer<Integer> rb = new RingBuffer<Integer>(3);
		Iterator ib = rb.iterator();
		ib.remove();
	}
	
	//test the Iterator Next function if the items are given back in correct order. 
	@Test
	public void testIteratorNext2() throws RingBufferException
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
