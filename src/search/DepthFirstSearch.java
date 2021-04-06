package search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

//based on https://www.youtube.com/watch?v=8UM1HziG3hw

public class DepthFirstSearch extends ASearchingAlgorithm {

    public DepthFirstSearch() {
        name = "DeptFirstSearch";
    }

    @Override
    public Solution solve(ISearchable problemToSolve) {

        if(problemToSolve==null){return null;}

        HashSet<String> visited = new HashSet<>();
        Stack<AState> stack = new Stack<>();
        AState start = problemToSolve.getStartState();
        stack.push(start);

        AState goal = problemToSolve.getGoalState();

        boolean solved=false;
        while (!stack.isEmpty()&& !solved)
        {
            AState cur = stack.pop();
            if(cur==null){break;}
            if (!(visited.contains(cur.toString())))
            {
                visited.add(cur.toString());
                numOfEvaluatedNodes++;
                if (!goal.equals(cur))
                {
                    ArrayList<AState> neighbors = problemToSolve.getAllPossibleStates(cur);
                    if (!(neighbors == null))
                    {
                        for (AState state: neighbors) {
                            if (!visited.contains(state.toString()))
                            {
                                state.setMyFather(cur);
                                stack.push(state);
                            }
                        }
                    }
                }
                else
                    {
                        goal.setMyFather(cur);
                        solved=true;
                    }
            }

        }
        return getSolutionPath(goal,start);
    }
}
