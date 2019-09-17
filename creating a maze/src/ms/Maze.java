package ms;
/**
 * Joshua Vega
 * Data Structures (csc_130)
 * submission date:9/15/2019
 */

import java.util.*;
import java.io.*;

public class Maze {

    private static final int TRIED = 2;
    private static final int PATH = 3;
    private int num_rows, num_col;
    private int[][] grid;

    /**
    Constructor for the Maze class. Loads a maze from the gicen file.
     Throws an exception if the given file is not found.
     @param filename the name of the file to load
     @throws FileNotFoundException if the given file is not found.
     */
    public Maze(String filename) throws FileNotFoundException{
        Scanner scan = new Scanner(new File(filename));
        int num_rows = scan.nextInt();
        int num_col = scan.nextInt();
        int i, j;

        grid = new int[num_rows][num_col];
        for(i=0; i<num_rows; i++){
            for(j=0; j<num_col; j++){
                grid[i][j] = scan.nextInt();
            }
        }
    }

    /**
     Marks the specified position in the maze as TRIED
     @param row the index of the row to try
     @param col the index of the column to try
     */

    public void tryPosition (int row, int col){
        grid[row][col] = TRIED;
    }

    /**
     Return the number of rows in this maze
     @return the number of tows in this maze
     */
    public int getRows(){ return grid.length; }

    /**
     Return the number of columns in this maze
     @return number of columns in the maze
     */
    public int getColumns(){ return grid[0].length; }

    /**
     Marks a given position in the maze as part of the PATH
     @param row the index of the row to mark as part of the PATH
     @param col the index of the column to mark as part of the PATH
     */
    public void markPath(int row, int col){ grid[row][col] = PATH; }
    /**
     Determines if a specific location is valid. A valid location is one that is on the grid,
     is not blocked, and has not been TRIED.
     @param row the row to checked
     @param column the column to be checked
     @return true is the location is valid
     */
    public boolean valid_position(int row, int column){
        boolean result = false;
        if(row>=0 && row<grid.length && column>=0 && column<grid[row].length){
            //check if cell is not blocked and not previously tried
            if(grid[row][column] == 1) { result = true ; }
        }
        return result;
    }

    /**
     Returns the maze/grid as a string.
     @return a string representation of the maze
     */

    public String toString(){
        String result = "\n";
        int row, column;
        for(row=0; row<grid.length; row++){
            for(column=0; column<grid.length; column++){
                result += grid[row][column] + " ";
            }
            result += "\n";
        }
        return result;
    }
}
