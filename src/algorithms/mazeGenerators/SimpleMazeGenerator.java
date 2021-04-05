package algorithms.mazeGenerators;

import java.util.Random;

public class SimpleMazeGenerator extends AMazeGenerator
{
    @Override

    public Maze generate(int rows, int cols) {
        int[][] simplemaze = new int[rows][cols];
        Random randomNum = new Random();
        Position startPos = new Position(0,randomNum.nextInt(cols-1));
        Position endPos = new Position(randomNum.nextInt(rows-1),cols-1);
        simplemaze[startPos.getRowIndex()][startPos.getColumnIndex()]=0;
        simplemaze[endPos.getRowIndex()][endPos.getColumnIndex()]=0;
        for (int i =0;i<rows;i++){
            for (int j =0;j<cols;j++){
                if (j==0&&i==0)
                    continue;
              if ( j==endPos.getRowIndex() || i==startPos.getColumnIndex() ){  simplemaze[i][j]=0; }
              else {
                  if(randomNum.nextInt(100)>50){simplemaze[i][j]=1; }
                  else simplemaze[i][j]=0;
              }
            }
        }
        Maze maze= new Maze(rows, cols);
        maze.setGrid(simplemaze);
        maze.setStart(startPos);
        maze.setEnd(endPos);
        return maze;
        //MAZE
    }
}
