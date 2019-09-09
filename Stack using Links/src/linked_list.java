public class linked_list<T> implements stack_ADT<T> {
    private int count;
    private linear_node top;

    /**
     * Constructor
     */
    public linked_list(){
        this.count = 0;
        this.top = null;
    }

    public void push(T element){
        linear_node temp = new linear_node(element);
        temp.set_next(this.top);
        this.top = temp;
        this.count++;
    }

    public T pop(){
        if(is_empty()){
            throw new RuntimeException("Cannot pop anything off from an empty stack");
        }
        T result = (T) this.top.get_elem();
        this.top = this.top.get_next();
        this.count--;

        return result;
    }

    public T peek(){
        if(is_empty()){
            throw new RuntimeException(("cannot peek on an empty stack"));
        }
        return (T) this.top.get_elem();
    }

    public int size(){
        return this.count;
    }

    public String to_string(){
        String result = "";
        linear_node current = this.top;

        while(current != null){
            result += (current.get_elem()).toString() + "\n";
            current = current.get_next();
        }
        return result;
    }

    public boolean is_empty(){
        return (this.count == 0);
    }
}
