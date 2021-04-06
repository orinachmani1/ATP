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

    @Override
    public boolean equals(Object obj) {
        if (obj == null){return false;}
        if (!(obj instanceof MazeState)){return false;}
        return ((MazeState)obj).curPosition.equals(curPosition);
    }

    @Override
    public String toString() {
        return curPosition.toString();
    }
}
