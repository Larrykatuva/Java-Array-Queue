
public class Queue {
	private int maxSize;
	private int[] arr;
	private int front;
	private int rear;
	private int nItems;
	
	/**
	 * Class constructor
	 * @param size
	 */
	public Queue(int size) {
		this.maxSize = size;
		this.arr = new int[this.maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	
	/**
	 * Inserting a value in front of the queue
	 * @param value
	 */
	public void insert(int value) {
		if(this.rear == this.maxSize -1) {
			this.rear = -1;
		}
		this.arr[++this.rear] = value;
		this.nItems++;
	}
	
	
	/**
	 * Removing the front value out of the queue
	 * @return integer
	 */
	public int remove() {
		int temp = this.arr[this.front++];
		if(this.front == this.maxSize) {
			this.front = 0;
		}
		this.nItems--;
		return temp;
	}
	
	/**
	 * Checking the queue front value
	 * @return integer
	 */
	public int peekFront() {
		return this.arr[this.front];
	}
	
	
	/**
	 * Checking if the queue is empty
	 * @return boolean
	 */
	public boolean isEmpty() {
		return this.nItems == 0;
	}
	
	/**
	 * Checking if the queue is full
	 * @return boolean
	 */
	public boolean isFull() {
		return this.nItems == this.maxSize;
	}
	
	
	/**
	 * Checking the size of the queue
	 * @return integer
	 */
	public int size() {
		return this.nItems;
	}
	
	
	/**
	 * Displaying all queue values
	 */
	public void displayQueue() {
		while(!this.isEmpty()) {
			int front = this.remove();
			System.out.println(front);
		}
	}
}
