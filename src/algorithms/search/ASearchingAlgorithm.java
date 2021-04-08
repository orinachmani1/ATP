package algorithms.search;

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

    public Solution getSolutionPath(AState goalState, AState startState)
    {
        Solution route = new Solution();
        AState current = goalState;

        while (!current.equals(startState))
        {
            current = current.getMyFather();
            route.addStateToSolution(current);
            if(current == null){return null;}
        }
        route.addStateToSolution(startState);
        return route;
    }
}
