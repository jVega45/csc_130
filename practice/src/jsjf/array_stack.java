package jsjf;

public class array_stack<T> implements stack_ADT<T> {

    private T[] stack;
    private int top;
    private final static int SIZE_LIMIT = 50;

    @SuppressWarnings("unchecked")
    public array_stack(){
        this.stack = (T[]) new Object[SIZE_LIMIT];
        this.top = 0;
    }

    @Override
    public void push(T element){
        if(this.size() == stack.length){
            expand_limit();
        }
        stack[top] = element;
        top++;
    }

    private void expand_limit(){
        int index;
        @SuppressWarnings("unchecked")
        T[] larger = (T[])(new Object[this.stack.length*2]);
        for(index=0; index<this.stack.length; index++){
            larger[index] = this.stack[index];
        }
        this.stack = larger;
    }

    @Override
    public T pop(){
        if(is_empty()){
            throw new RuntimeException("Cannot pop anything off an empty stack");
        }
        top--;
        T result = this.stack[this.top];
        this.stack[this.top] = null;
        return result;
    }

    @Override
    public T peek(){
        if(is_empty()){
            throw new RuntimeException("Cannot peek at an element when stack is empty");
        }
        return this.stack[this.top-1];
    }

    @Override
    public boolean is_empty(){
        return this.top == 0;
    }

    @Override
    public int size(){
        return this.top;
    }

    @Override
    public String traverse(){
        String elements = "[";
        int i;

        for(i=0; i<this.top; i++){
            if(i==this.top-1){
                elements += this.stack[i];
            }
            if(i<this.top-1){
                elements += this.stack[i] + ",";
            }
        }
        elements += "]";
        return elements;
    }

}
