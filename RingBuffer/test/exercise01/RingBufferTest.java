package exercise01;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

/**
 * @author mwe
 *
 */
public class RingBufferTest {

	private RingBuffer<String> stringBuffer;
	private RingBuffer<Integer> integerBuffer;

	@Before
	public void initRingBuffer() {
		stringBuffer = new RingBuffer<>(5);
		integerBuffer = new RingBuffer<>(3);
	}

	// /**
	// * Test if constructor returns object
	// *
	// */
	// @Test
	// public void testinitialize() {
	// RingBuffer<Object> rb = new RingBuffer<Object>(2);
	// assertNotNull(rb);
	// }

	/**
	 * Check if item is returned by previously empty RingBuffer
	 * 
	 * @throws RingBufferException
	 */
	@Test
	public void testEnqueue() throws RingBufferException {
		stringBuffer.enqueue("test");
		assertEquals("test", stringBuffer.dequeue());

	}

	/**
	 * Check if RingBuffer computes size correctly
	 * 
	 * @throws RingBufferException
	 */
	@Test
	public void testSize() throws RingBufferException {
		integerBuffer.enqueue(2);
		integerBuffer.enqueue(1);
		assertEquals(2, integerBuffer.size());
	}

	/**
	 * Check if RingBuffer returns size correctly when RingBuffer is empty
	 * 
	 * @throws RingBufferException
	 */
	@Test
	public void testSizeEmpty() throws RingBufferException {
		assertEquals(0, integerBuffer.size());
	}

	/**
	 * Check number of elements in queue after removing item
	 * 
	 * @throws RingBufferException
	 */
	@Test
	public void testSizeDequeue() throws RingBufferException {
		integerBuffer.enqueue(11);
		integerBuffer.enqueue(22);
		integerBuffer.dequeue();
		integerBuffer.enqueue(33);
		assertEquals(2, integerBuffer.size());
	}

	/**
	 * Check if the RingBuffer is empty after removing last element
	 * 
	 * @throws RingBufferException
	 */
	@Test
	public void testIsEmpty() throws RingBufferException {
		integerBuffer.enqueue(1);
		integerBuffer.dequeue();
		assertEquals(true, integerBuffer.isEmpty());
	}

	/**
	 * Check if RingBufferException is thrown on overflow
	 * 
	 * @throws RingBufferException
	 */
	@Test(expected = RingBufferException.class)
	public void testEnqueueRingBufferException() throws RingBufferException {
		integerBuffer.enqueue(3);
		integerBuffer.enqueue(3);
		integerBuffer.enqueue(5);
		integerBuffer.enqueue(6);
	}

	/**
	 * Check if RingBufferException is thrown on dequeuing when buffer is empty
	 * 
	 * @throws RingBufferException
	 */
	@Test(expected = RingBufferException.class)
	public void testDequeueRingBufferException() throws RingBufferException {
		stringBuffer.enqueue("A new and great String");
		stringBuffer.dequeue();
		stringBuffer.dequeue();
	}

	/**
	 * Check correct element is dequeued after dequeuing more elements than size
	 * of RingBuffer
	 * 
	 * @throws RingBufferException
	 */
	@Test
	public void testDequeueCircularBehaviour() throws RingBufferException {
		integerBuffer.enqueue(1);
		integerBuffer.enqueue(2);
		integerBuffer.enqueue(3);
		integerBuffer.dequeue();
		integerBuffer.dequeue();
		integerBuffer.enqueue(4);
		integerBuffer.enqueue(5);
		integerBuffer.dequeue();
		assertEquals(Integer.valueOf(4), integerBuffer.dequeue());
	}

	/**
	 * Check if RingBuffer adds element correctly after buffer was full
	 * 
	 * @throws RingBufferException
	 */
	@Test
	public void testEnqueueCircularBehaviour() throws RingBufferException {
		integerBuffer.enqueue(1);
		integerBuffer.enqueue(2);
		integerBuffer.enqueue(3);
		integerBuffer.dequeue();
		integerBuffer.enqueue(4);
		assertEquals(Integer.valueOf(2), integerBuffer.dequeue());
	}

	// TODO: check if needed...
	/**
	 * Check if RingBuffer is empty after enqueuing and dequeuing some elements
	 * 
	 * @throws RingBufferException
	 */
	@Test
	public void testIsEmptyEnqueueDequeue() throws RingBufferException {
		integerBuffer.enqueue(1);
		integerBuffer.enqueue(2);
		integerBuffer.enqueue(3);
		integerBuffer.dequeue();
		integerBuffer.enqueue(4);
		integerBuffer.dequeue();
		integerBuffer.dequeue();
		integerBuffer.dequeue();
		assertEquals(true, integerBuffer.isEmpty());
	}

	/** Check if Iterator returned != null
 	 * 
	 */
	@Test
	public void testIteratorNotNull() {
		assertNotNull(integerBuffer.iterator());
		assertNotNull(stringBuffer.iterator());
	}

	/**
	 * Check if the iterator returns the correct values
	 * 
	 * @throws RingBufferException
	 */
	@Test
	public void testIteratorNext() throws RingBufferException {
		integerBuffer.enqueue(1);
		integerBuffer.enqueue(7);
		integerBuffer.enqueue(5);
		Iterator<Integer> iterator = integerBuffer.iterator();
		iterator.next();
		iterator.next();
		assertEquals(iterator.next(), Integer.valueOf(5));
	}

	/**
	 * Check if hasNext method of iterator returns false when the RingBuffer is
	 * empty
	 */
	@Test
	public void testIteratorHasNextEmptyBuffer() {
		Iterator<Integer> iterator = integerBuffer.iterator();
		assertEquals(false, iterator.hasNext());
	}

	/**
	 * Check if NoSuchElementException is thrown when calling next method of
	 * iterator when RingBuffer is empty
	 */
	@Test(expected = java.util.NoSuchElementException.class)
	public void testIteratorNextEmptyBuffer() {
		Iterator<Integer> iterator = integerBuffer.iterator();
		iterator.next();
	}

	/**
	 * Check if UnsupportedOperationException is thrown when remove method of
	 * iterator is called
	 */
	@Test(expected = UnsupportedOperationException.class)
	public void testIteratorRemove() {
		Iterator<Integer> iterator = integerBuffer.iterator();
		iterator.remove();
	}

}
