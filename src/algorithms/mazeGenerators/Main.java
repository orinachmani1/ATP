package algorithms.mazeGenerators;

import algorithms.search.*;
import algorithms.mazeGenerators.IMazeGenerator;

public class Main {
    public static void main(String[] args) {
        /*EmptyMazeGenerator m = new EmptyMazeGenerator();
        Maze tmp = m.generate(4,3);
        tmp.toString();*/
        //createMaze();
        IMazeGenerator mg = new MyMazeGenerator();
        Maze maze = mg.generate(21, 21);
        maze.print();
        //System.out.print(mg.toString());

        SearchableMaze searchableMaze = new SearchableMaze(maze);
        ASearchingAlgorithm BFS = new BreadthFirstSearch();
        Solution solution = BFS.solve(searchableMaze);

        ASearchingAlgorithm DFS = new DepthFirstSearch();
        Solution solution2 = DFS.solve(searchableMaze);
        //ArrayList<AState> solutionPath = dfs;

        System.out.print("bye bye");


    }
}
