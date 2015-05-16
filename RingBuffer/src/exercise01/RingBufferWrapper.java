package exercise01;

import java.util.Iterator;

public class RingBufferWrapper<Item> {

	private RingBuffer<Item> ringBuffer;

	public RingBufferWrapper(int capacity) {
		ringBuffer = new RingBuffer<>(capacity);
	}

	public boolean isEmpty() {
		// preconditions start
		boolean oldringBufferStatus = ringBuffer.isEmpty();
		// preconditions end

		boolean ringBufferStatus = ringBuffer.isEmpty();

		// postconditions start
		assert ringBufferStatus == oldringBufferStatus;
		if (ringBufferStatus)
			assert ringBufferStatus == (ringBuffer.size() == 0);
		// postconditions end

		return ringBufferStatus;
	}

	public int size() {
		// preconditions start
		int oldRingBufferSize = ringBuffer.size();
		// preconditions end

		int ringBufferSize = ringBuffer.size();

		// postconditions start
		assert ringBufferSize == oldRingBufferSize;
		assert (ringBufferSize > 0) == !ringBuffer.isEmpty();
		// postconditions end

		return ringBufferSize;
	}

	public void enqueue(Item item) throws RingBufferException {
		ringBuffer.enqueue(item);
		// TODO
		// RingBufferException actual = null;
		// RingBufferException expected = (!ringBuffer.isEmpty()) ? null
		// : new RingBufferException("Ring buffer overflow");
		//
		// int oldRingBufferSize = ringBuffer.size();
		//
		// try {
		// ringBuffer.enqueue(item);
		// assert (ringBuffer.size() == (oldRingBufferSize - 1) );
		// }catch (RingBufferException e){
		// actual = e;
		// }
		//
		// assert actual == expected;
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
			assert (ringBuffer.size() == (oldRingBufferSize - 1));
			assert (ringBuffer.size() == 0) == ringBuffer.isEmpty();
			// postconditions if no exception occurs end
		} catch (RingBufferException e) {
			actual = e;
		}

		// postconditions if exception occurs
		if (actual == null)
			assert actual == expected;
		else
			assert actual.getMessage().equalsIgnoreCase(expected.getMessage());
		// postconditions if exception occurs end

		return dequeuedItem;
	}

	public Iterator<Item> iterator() {
		// preconditions start
		Iterator<Item> oldIterator = ringBuffer.iterator();
		// preconditions end

		Iterator<Item> iterator = ringBuffer.iterator();

		// postconditions start
		assert iterator.hasNext() == oldIterator.hasNext();
		assert iterator.hasNext() == !ringBuffer.isEmpty();
		// postconditions end

		return iterator;
	}

}
