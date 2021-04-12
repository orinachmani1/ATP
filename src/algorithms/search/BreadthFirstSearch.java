package algorithms.search;

import java.util.ArrayList;
import java.util.HashSet;

public class BreadthFirstSearch extends ASearchingAlgorithm {
    ArrayList<AState> statesArray;
    HashSet <String> visited;
    double totalCost;

    public BreadthFirstSearch() {
        name = "BreadthFirstSearch";
    }

    public Solution solve(ISearchable problemToSolve) {

        AState start = problemToSolve.getStartState();
        AState goal = problemToSolve.getGoalState();

        this.statesArray = new ArrayList<>();
        this.visited = new HashSet<>();
        statesArray.add(start);
        boolean solved = false;

        while (statesArray.size() > 0 && !solved) {
            AState currentState = statesArray.remove(0);
            if (!visited.contains(currentState.toString())) {
                visited.add(currentState.toString());
                numOfEvaluatedNodes++;
                if (!goal.equals(currentState)) {
                    ArrayList<AState> neighbors = problemToSolve.getAllPossibleStates(currentState);
                    addNeighborsToOpenList(neighbors,currentState);
                }
                else {
                    goal.setMyFather(currentState);
                    solved = true;
                }
            }
        }
        return getSolutionPath(goal, start);

    }

    //update father + add to open list
    public void addNeighborsToOpenList(ArrayList<AState> neighbors, AState currentState) {
        if (!(neighbors == null)) {
            for (AState state : neighbors) {
                if (!visited.contains(state.toString())) {
                    if(this.getName().equals("BestFirstSearch"))
                    {
                        totalCost = state.getCost() + currentState.getCost();
                        state.setCost(totalCost);
                    }
                    state.setMyFather(currentState);
                    statesArray.add(state);
                }
            }
        }
    }
}