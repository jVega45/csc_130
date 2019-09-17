package ms;

/**
 * Joshua Vega
 * Data Structures (csc_130)
 * submission date:9/16/2019
 */
public class Position {
    private int x;
    private int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void set_x(int val) { this.x = val; }
    public void set_y(int val) { this.y = val; }

    public int get_x(){ return x; }
    public int get_y(){ return y; }
}
