package exercise01;

import java.util.Iterator;

public class RingBufferWrapper<Item> {
	
	private RingBuffer<Item> ringBuffer;
	
	public RingBufferWrapper(int capacity) {
		ringBuffer = new RingBuffer<>(capacity);
	}

	public boolean isEmpty() {
		return ringBuffer.isEmpty();
	}

	public int size() {
		return ringBuffer.size();
	}

	public void enqueue(Item item) throws RingBufferException {
		ringBuffer.enqueue(item);
	}

	public Item dequeue() throws RingBufferException {
		return ringBuffer.dequeue();
	}

	public Iterator<Item> iterator() {
		return ringBuffer.iterator();
	}
	
	

}
