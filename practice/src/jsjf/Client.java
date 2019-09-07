package jsjf;

public class Client {

    public static void main(String[] args){
        test_push();
        test_pop();
        test_empty();
        test_print();
    }

    private static void test_print(){
        System.out.println("--------");
        System.out.println("Testing print function to display the stack");
        System.out.println("--------");
        array_stack<String> stack_one = new array_stack<>();
        String name_1 = "Billy";
        String name_2 = "Rebecca";
        String name_3 = "Jenny";
        String name_4 = "Tobby";
        String name_5 = "Kyle";

        stack_one.push(name_1);
        stack_one.push(name_2);
        stack_one.push(name_3);
        stack_one.push(name_4);
        stack_one.push(name_5);
        System.out.println(stack_one);
    }

    private static void test_empty(){
        System.out.println("--------");
        System.out.println("Testing empty function for the stack");
        System.out.println("--------");
        stack_ADT<Integer> stack_two = new array_stack<Integer>();
        System.out.println("this new stack should be empty and this is: " + stack_two.is_empty());
        System.out.println(stack_two);
        stack_two.push(25);
        System.out.println("now the is empty function should return false and is: " + stack_two.is_empty());
        System.out.print(stack_two);
        stack_two.pop();
        System.out.println("is empty function should return true and is: " + stack_two.is_empty());
        System.out.print(stack_two);
    }

    private static void test_pop(){
        System.out.println("--------");
        System.out.println("Explicitly testing testing multiple pops from the stack");
        System.out.println("--------");
        stack_ADT<Integer> stack_three = new array_stack<Integer>();

        int x = 0;
        while(x<9){
            stack_three.push(x);
            x++;
        }
        System.out.println(stack_three);
        int eight = stack_three.pop();
        System.out.println("Eight: " + eight);
        System.out.println(stack_three);

        int seven = stack_three.pop();
        System.out.println("Seven: " + seven);
        System.out.println(stack_three);

        int six = stack_three.pop();
        System.out.println("Six: " + six);
        System.out.println(stack_three);
    }

    private static void test_push(){
        System.out.println("--------");
        System.out.println("Testing more pushes onto the stack");
        System.out.println("--------");

        stack_ADT<Integer> stack_four = new array_stack<Integer>();
        int y = 0;
        while(y<12){
            stack_four.push(y);
            y++;
        }
        System.out.println(stack_four);
    }
}
