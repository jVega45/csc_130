public class linear_node<T> {
    private linear_node<T> next;
    private T elem;

    public linear_node(){
        this.next = null;
        this.elem = null;
    }

    public linear_node(T elem){
        this.next = null;
        this.elem = elem;
    }

    public linear_node<T> get_next(){
        return this.next;
    }

    public void set_next(linear_node<T> node){
        this.next = node;
    }

    public T get_elem(){
        return this.elem;
    }

    public void set_elem(T elem){
        this.elem = elem;
    }
}
