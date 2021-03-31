package algorithms.mazeGenerators;

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
                if (isWall(pos)) {System.out.print('1'); }
                if (!isWall(pos)) {System.out.print('0'); }
                else if (isStart(pos)) { System.out.print('S'); }
                else if (isEnd(pos)) { System.out.print('E'); }
            }
            System.out.print('\n');
        }
        // █ ░ - symbols for empty and full cells, maybe we used it in future
        return null;

    }
}
