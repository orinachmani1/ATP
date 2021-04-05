package search;

import algorithms.mazeGenerators.Position;

public class MazeState extends AState {

    Position curPosition;

    public MazeState(){
        curPosition = null;
    }

    public MazeState(Position pos){
        super(pos.toString());
        curPosition =new Position(pos);
    }

    public Position getCurPosition() {
        return curPosition;
    }

    public void setCurPosition(Position curPosition) {
        this.curPosition = curPosition;
    }
}
