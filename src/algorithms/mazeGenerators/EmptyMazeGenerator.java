package algorithms.mazeGenerators;

public class EmptyMazeGenerator extends AMazeGenerator
{
    @Override
    public Maze generate(int rows, int cols) {

        
        int[][] emptymaze = new int[rows][cols];

        for (int i =0 ; i<rows;i++)
        {
            for (int j=0; j<cols;j++)
                emptymaze[i][j] = 0;

        }
        Maze maze= new Maze();
        maze.genmazer=emptymaze;
        Maze maze1 = maze;
        return maze1;

    }
}
