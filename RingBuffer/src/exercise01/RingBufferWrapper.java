package exercise01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RingBufferWrapper<Item> {

	private RingBuffer<Item> ringBuffer;

	private int capacity;

	public RingBufferWrapper(int capacity) {
		ringBuffer = new RingBuffer<>(capacity);
		this.capacity = capacity;
	}

	public boolean isEmpty() {
		// preconditions start
		boolean oldringBufferStatus = ringBuffer.isEmpty();
		// preconditions end

		boolean ringBufferStatus = ringBuffer.isEmpty();

		// postconditions start
		assert ringBufferStatus == oldringBufferStatus : "Incorrect status of buffer";
		if (ringBufferStatus)
			assert ringBufferStatus == (ringBuffer.size() == 0) : "Size not correct";
		// postconditions end

		return ringBufferStatus;
	}

	public int size() {
		// preconditions start
		int oldRingBufferSize = ringBuffer.size();
		// preconditions end

		int ringBufferSize = ringBuffer.size();

		// postconditions start
		assert ringBufferSize == oldRingBufferSize : "Incorrect status of buffer";
		assert (ringBufferSize > 0) == !ringBuffer.isEmpty() : "Size not correct";
		// postconditions end

		return ringBufferSize;
	}

	public void enqueue(Item item) throws RingBufferException {
		// preconditions start
		RingBufferException actual = null;
		RingBufferException expected = (ringBuffer.size() == capacity) ? new RingBufferException(
				"Ring buffer overflow") : null;

		int oldRingBufferSize = ringBuffer.size();
		// preconditions end

		try {
			ringBuffer.enqueue(item);
			// postcondition if no exception
			assert (ringBuffer.size() == (oldRingBufferSize + 1)) : "Size not correct";
		} catch (RingBufferException e) {
			actual = e;
		}

		if (actual == null)
			assert actual == expected : "There should be no exception";
		else {
			// postconditions if exception occurs
			assert actual.getMessage().equalsIgnoreCase(expected.getMessage()) : "Exceptions do not match";
			throw actual;
		}
	}

	public Item dequeue() throws RingBufferException {
		// preconditions start
		RingBufferException actual = null;
		RingBufferException expected = (!ringBuffer.isEmpty()) ? null
				: new RingBufferException("Ring buffer underflow");

		int oldRingBufferSize = ringBuffer.size();
		Item dequeuedItem = null;
		// preconditions end

		try {
			dequeuedItem = ringBuffer.dequeue();
			// postconditions if no exception occurs start
			assert (ringBuffer.size() == (oldRingBufferSize - 1)) : "Size not correct";
			assert (ringBuffer.size() == 0) == ringBuffer.isEmpty() : "RingBuffer should be empty";
			// postconditions if no exception occurs end
		} catch (RingBufferException e) {
			actual = e;
		}

		// postconditions if exception occurs
		if (actual == null)
			assert actual == expected : "There should be no exception";
		else {
			assert actual.getMessage().equalsIgnoreCase(expected.getMessage()) : "Exceptions do not match";
			throw actual;
		}
		// postconditions if exception occurs end

		return dequeuedItem;
	}

	public Iterator<Item> iterator() {
		// preconditions start
		Iterator<Item> oldIterator = ringBuffer.iterator();
		// preconditions end

		Iterator<Item> iterator = ringBuffer.iterator();

		// postconditions start
		assert iterator.hasNext() == oldIterator.hasNext() : "hasNext of iterator does not match old result";
		assert iterator.hasNext() == !ringBuffer.isEmpty() : "hasNext must not return same result as isEmpty";
		// postconditions end

		return new RingBufferIteratorWrapper();
	}

	public class RingBufferIteratorWrapper implements Iterator<Item> {

		Iterator<Item> iterator;

		public RingBufferIteratorWrapper() {
			iterator = ringBuffer.iterator();
		}

		public boolean hasNext() {
			// preconditions start
			boolean oldHasNext = iterator.hasNext();
			// preconditions end

			boolean newHasNext = iterator.hasNext();

			// postconditions start
			assert oldHasNext == newHasNext : "state of iterator has changed";
			// postconditions end

			return iterator.hasNext();
		}

		public void remove() {
			// preconditions start
			UnsupportedOperationException actual = null;
			// preconditions end

			try {
				iterator.remove();
			} catch (UnsupportedOperationException e) {
				actual = e;
			}

			// postconditions start
			assert (actual instanceof UnsupportedOperationException);
			// postconditions end
			throw actual;
		}

		public Item next() {
			// preconditions start
			NoSuchElementException actual = null;
			Item nextItem = null;
			// preconditions end
			try {
				nextItem = iterator.next();
			} catch (NoSuchElementException e) {
				actual = e;
			}
			if (actual != null) {
				assert (actual instanceof NoSuchElementException);
				throw actual;
			}
			return nextItem;

		}
	}

}
