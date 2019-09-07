package jsjf;

/**
 * Practice project from video tutorial 09/04/2019
 */

public interface stack_ADT<T> {
    /**
     * Adds an element to the top of the stack
     * @param element element to be put on the stack
     */
    public void push(T element);

    /**
     * Removes an element from the top of the stack
     * @return the element removed from the stack
     */
    public T pop();

    /**
     * Returns the top element of the stack
     * @return the reference/address of the top element
     */
    public T peek();

    /**
     * Checks if the stack is empty
     * @return true or false
     */
    public boolean is_empty();

    /**
     * @returns the count of elements in the stack
     */
    public int size();

    /**
     * traverse the linked list
     * @return a string of all the elements
     */
    public String traverse();
}
