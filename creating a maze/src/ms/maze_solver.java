package ms;
/**
 * Joshua Vega
 * Data Structures (csc_130)
 * submission date:9/12/2019
 */

import java.util.*;

public class maze_solver {
    private Maze maze;

    /**
     Constructor for the maze_solver class.
     */
    public maze_solver(Maze maze){ this.maze = maze; }

    /**
     Attempts to recursively travers the maze. Inserts special characters indicating
     locations that have been TRIED and that eventually become part if tge solution PATH.

     @return true if the maze has been solved
     */
    public boolean traverse(){
        boolean done = false;
        int row=0, column=0;
        Position pos = new Position(row, column);
        Deque<Position> stack = new LinkedList<Position>();
        stack.push(pos);

        while (!(done) && !stack.isEmpty()){
            pos = stack.pop();
            maze.tryPosition(pos.get_x(), pos.get_y());
            if(pos.get_x() == maze.getRows()-1 && pos.get_y() == maze.getColumns()-1){
                done = true;
            }
            else{
                push_new_pos(pos.get_x() - 1, pos.get_y(), stack);
                push_new_pos(pos.get_x() + 1, pos.get_y(), stack);
                push_new_pos(pos.get_x(), pos.get_y() - 1, stack);
                push_new_pos(pos.get_x(), pos.get_y() + 1, stack);
            }
        }
        return done;
    }

    /**
     Push a new attempted move onto the stack
     @param x represents x coordinate
     @param y represents y coordinate
     @param stack the working stack of moves with the grid
     @return stack of moves within the grid
     */
    private void push_new_pos(int x, int y, Deque<Position> stack){
        Position npos = new Position(x, y);
        if (maze.valid_position(x,y)) { stack.push(npos); }
    }
}
