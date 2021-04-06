package search;

import java.util.HashSet;

public abstract class ASearchingAlgorithm implements ISearchingAlgorithm {
    protected  String name;
    int getNumberOfNodesEvaluated;
    public ASearchingAlgorithm(String name) {
        this.name = name;
        this.getNumberOfNodesEvaluated =0;
    }





    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumberOfNodesEvaluated() {
        return getNumberOfNodesEvaluated;
    }
}
