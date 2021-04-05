package algorithms.mazeGenerators;

import java.util.ArrayList;
import java.util.List;

public class Maze {

    private Position start;
    private Position end;
    private int rows;
    private int cols;
    private int[][] grid;
    private boolean Solved;


    public Maze(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public void setStart(Position start) {
        this.start = start;
    }

    public void setEnd(Position end) {
        this.end = end;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public Position getStartPosition()
    {
        return start;
    }

    public Position getGoalPosition()
    {
        return end;
    }

    public int[][] getGrid() {
        return grid;
    }

    public void setCell(Position p, int n)
    {
        int row = p.getRowIndex();
        int col = p.getColumnIndex();
        grid[row][col] = n;
    }

    public ArrayList<Position> validMoves(Position p)
    {
        ArrayList posList= new ArrayList<Position>();

        int pRow = p.getRowIndex();
        int pCol = p.getColumnIndex();

        Position up = new Position(pRow-1, pCol);
        Position down = new Position(pRow+1, pCol);
        Position right = new Position(pRow, pCol+1);
        Position left = new Position(pRow, pCol-1);

        if(isValidMove(up)){posList.add(up);}
        if(isValidMove(down)){posList.add(down);}
        if(isValidMove(right)){posList.add(right);}
        if(isValidMove(left)){posList.add(left);}

        return posList;
    }

    boolean isValidMove(Position p)
    {
        int pRow = p.getRowIndex();
        int pCol = p.getColumnIndex();

        if (pRow < 0 || pCol < 0 || pRow > rows || pCol > cols){return false;}
        if (isWall(p)){return false;}
        return true;
    }
    boolean isWall (Position p){
        if(grid [p.getRowIndex()] [p.getColumnIndex()] == 1)
        {
            return true;
        }
        return false;
    }

    boolean isStart (Position p){
        if(p.getRowIndex() == start.getRowIndex() && p.getColumnIndex() == start.getColumnIndex())
        {
            return true;
        }
        return false;
    }

    boolean isEnd (Position p){
        if(p.getRowIndex() == end.getRowIndex() && p.getColumnIndex() == end.getColumnIndex())
        {
            return true;
        }
        return false;
    }

    void Print()
    {
        toString();
    }

    @Override
    public String toString() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Position pos = new Position(i,j);
                if (isStart(pos)) { System.out.print('S'); }
                else if (isEnd(pos)) { System.out.print('E'); }
                else if (isWall(pos)) {System.out.print('1'); }
                else if (!isWall(pos)) {System.out.print('0'); }
//                if (isWall(pos)) {System.out.print('█'); }
//                if (!isWall(pos)) {System.out.print('░'); }
                //MAZE

            }
            System.out.println();
        }
        // █ ░ - symbols for empty and full cells, maybe we used it in future
        return null;

    }
}
