package search;

import java.util.HashSet;

public abstract class ASearchingAlgorithm implements ISearchingAlgorithm {

    String name;
    int numOfEvaluatedNodes;
    //HashSet<AState>;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumberOfNodesEvaluated() {
        return numOfEvaluatedNodes;
    }
}
