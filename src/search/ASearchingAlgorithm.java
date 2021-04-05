package search;

public abstract class ASearchingAlgorithm implements ISearchingAlgorithm {

    String name;
    int numOfEvaluatedNodes;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNumberOfNodesEvaluated() {
        return numOfEvaluatedNodes;
    }
}
