package search;

public interface ISearchingAlgorithm {
    public String getName();
    public int getNumberOfNodesEvaluated();
    public Solution solve(ISearchable problemToSolve);
}
