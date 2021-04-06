package algorithms.mazeGenerators;

import search.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*EmptyMazeGenerator m = new EmptyMazeGenerator();
        Maze tmp = m.generate(4,3);
        tmp.toString();

        IMazeGenerator my = new MyMazeGenerator();*/
        IMazeGenerator mg = new MyMazeGenerator();
        Maze maze = mg.generate(15, 15);
        maze.Print();
        //System.out.print(mg.toString());

        SearchableMaze searchableMaze = new SearchableMaze(maze);
        ASearchingAlgorithm BFS = new BreadthFirstSearch();
        Solution solution = BFS.solve(searchableMaze);

        ASearchingAlgorithm DFS = new DepthFirstSearch();
        Solution solution2 = DFS.solve(searchableMaze);
        //ArrayList<AState> solutionPath = dfs;

        //Searchable i = ((ISearchable) tmpMy);
        //d.solve(tmpMy);

        System.out.print("bye bye");


    }
}
