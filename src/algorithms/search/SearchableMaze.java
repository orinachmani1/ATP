package algorithms.search;

import algorithms.mazeGenerators.Maze;
import algorithms.mazeGenerators.Position;

import java.util.ArrayList;

public class SearchableMaze implements ISearchable {
    MazeState start;
    MazeState goal;
    Maze maze;
    int rows;
    int cols;


    public SearchableMaze(Maze maze)
    {
        this.maze = maze;
        start = new MazeState(maze.getStartPosition());
        goal = new MazeState(maze.getGoalPosition());
        rows = maze.getRows();
        cols = maze.getCols();
    }

    @Override
    public AState getStartState() {
        return start;
    }

    @Override
    public AState getGoalState() {
        return goal;
    }

    @Override
    public ArrayList<AState> getAllPossibleStates(AState s) {

        Position curPos = ((MazeState)s).getCurPosition();
        ArrayList<Position> validMoves = maze.validMoves(curPos);
        if (validMoves.isEmpty()){return null;}

        ArrayList<AState> PossibleStates = new ArrayList<AState>();
        for (Position vm : validMoves) {
            AState state = new MazeState(vm);//legal casting??
            PossibleStates.add(state);
        }

        return PossibleStates;
    }
}
