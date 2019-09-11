/**
 * Joshua Vega
 * Data Structures (csc_130)
 * submission date:9/10/2019
 */

import gta.generic_ADT;
import gta.generic_addition;

public class Client {
    public static void main(String[] args){
        integer_sum();
        double_sum();
        float_sum();
        string_sum();
        long_sum();
    }

    private static void integer_sum(){
        generic_ADT<Integer> sum = new generic_addition<Integer>();
        int operand_1 = 22;
        int operand_2 = 3;
        sum.set_sum(operand_1+operand_2);
        System.out.println(sum.add_strings() + "\n");
    }

    private static void double_sum(){
        generic_ADT<Double> sum = new generic_addition<Double>();
        double op_1 = 3.456d;
        double op_2 = 29988.2d;
        sum.set_sum(op_1+op_2);
        System.out.println(sum.add_strings() + "\n");
    }


    private static void float_sum(){
        generic_ADT<Float> sum = new generic_addition<Float>();
        float op_1 = 2.998f;
        float op_2 = 12.012f;
        sum.set_sum(op_1+op_2);
        System.out.println(sum.add_strings() + "\n");
    }

    private static void string_sum(){
        generic_ADT<String> sum = new generic_addition<String>();
        String op_1 = "Johnny";
        String op_2 = "BeGood";
        sum.set_sum(op_1+op_2);
        System.out.println(sum.add_strings() + "\n");
    }

    private static void long_sum(){
        generic_ADT<Long> sum = new generic_addition<Long>();
        long op_1 = 12345678l;
        long op_2 = 18765432l;
        sum.set_sum(op_1+op_2);
        System.out.println(sum.add_strings() + "\n");

    }
}
