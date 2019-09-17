package ms;

import java.io.*;
import java.util.*;

/**
 * Joshua Vega
 * Data Structures (csc_130)
 * submission date:9/16/2019
 */
public class maze_tester {
    /**
     * Creates a new maze, prints its original form, attempts to solve it, and
     * prints out its final form.
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of the file containing the maze: ");
        String filename = scan.nextLine();

        Maze labyrinth = new Maze(filename);

        System.out.println(labyrinth);

        maze_solver solver = new maze_solver(labyrinth);
        if(solver.traverse()){
            System.out.println("The maze was successfully traversed!");
        }
        else{
            System.out.println("There is no possible path.");
        }
        System.out.println(labyrinth);
    }
}