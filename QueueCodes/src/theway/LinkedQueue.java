package theway;
/**
 * Joshua Vega
 * Data Structures (csc_130)
 * submission date:9/16/2019
 */
public class LinkedQueue<T> implements QueueADT<T> {
    private int count;
    private linear_node<T> head, tail;

    public LinkedQueue(){
        count = 0;
        head = tail = null;
    }

    public void enqueue(T key){
        linear_node<T> temp = new linear_node<T>(key);

        if(this.tail == null){
            this.head = this.tail = temp;
            return;
        }

        this.tail.next = temp;
        this.tail = temp;
        count++;
    }

    public T dequeue(){
        if(this.head == null) { return null; }
        linear_node<T> temp = this.head;
        this.head = this.head.next;

        if(this.head == null){ this.tail = null; }
        return (T) temp;
    }


    public T first(){

        if(this.head == null){
            System.out.println("No items in the queue...program termination to follow");
            System.exit(1);
        }
        return (T) this.head;
    }

    public  boolean isEmpty(){
        return ((this.count == 0));
    }

    public int size(){ return this.count; }

    public String toString() {
        String result = "";
        linear_node current = this.head;

        while(current != null){
            result += (current.get_elem()).toString() + " ";
            current = current.get_next();
        }
        return result;
    }
}
