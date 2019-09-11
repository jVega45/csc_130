/**
 * Joshua Vega
 * Data Structures (csc_130)
 * submission date:9/10/2019
 */

package gta;
public class generic_addition<T> implements generic_ADT<T>{
    private T sum;

    @Override
    public void set_sum(T value){ this.sum = value; }

    @Override
    public String add_strings(){
        String result = "The sum is: ";
        result += this.sum;
        return result;
    }
}
