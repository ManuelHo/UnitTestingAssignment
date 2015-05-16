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
		//TODO
//		RingBufferException actual = null;
//		RingBufferException expected = (!ringBuffer.isEmpty()) ? null
//				: new RingBufferException("Ring buffer overflow");
//
//		int oldRingBufferSize = ringBuffer.size();
//		
//		try {			
//			ringBuffer.enqueue(item);
//			assert (ringBuffer.size() == (oldRingBufferSize - 1) );
//		}catch (RingBufferException e){
//			actual = e;
//		}
//		
//		assert actual == expected;
	}

	public Item dequeue() throws RingBufferException {
//		// preconditions start
//		assert !ringBuffer.isEmpty();
//		int oldRingBufferSize = ringBuffer.size();
//		// preconditions end
//
//		Item dequeuedItem = ringBuffer.dequeue();
//		
//		//postconditions start
//		assert ringBuffer.size() == oldRingBufferSize + 1;
//		assert (ringBuffer.size() == 0) == ringBuffer.isEmpty();
//		// postconditions end
//
//		return dequeuedItem;
		
		RingBufferException actual = null;
		RingBufferException expected = (!ringBuffer.isEmpty()) ? null
				: new RingBufferException("Ring buffer underflow");

		int oldRingBufferSize = ringBuffer.size();
		Item dequeuedItem = null;
		
		try {
			dequeuedItem = ringBuffer.dequeue();
			assert (ringBuffer.size() == (oldRingBufferSize - 1) );
		}catch (RingBufferException e){
			actual = e;
		}
		
		assert actual.getMessage().equalsIgnoreCase(expected.getMessage());
		return dequeuedItem;
	}

	public Iterator<Item> iterator() {
		return ringBuffer.iterator();
	}

}
