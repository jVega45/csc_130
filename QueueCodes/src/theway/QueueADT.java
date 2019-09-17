/**
 * Joshua Vega
 * Data Structures (csc_130)
 * submission date:9/16/2019
 */
package theway;
public interface QueueADT<T> {
    /**
     Adds one element to the rear of this queue.
     @param element the element to be added to the rear of the queue
     */
    public void enqueue(T element);
    /**
     Removes and returns the element at the front of this queue.
     @return the element at the front of the queue
     */
    public T dequeue();

    /**
     Returns without removing the element at the front of this queue.
     @return the first element of the queue
     */
    public T first();
    /**
     Returns if this queue contains zero elements.
     @return true if this queue is empty
     */
    public boolean isEmpty();
    /**
     Returns the number of elements in this queue.
     @return the integer representation of the size of the queue
     */
    public int size();
    /**
     Returns a string representation of the queue.
     @return the queue as a string
     */
    public String toString();
}
