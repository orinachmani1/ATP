package algorithms.search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;

public class BreadthFirstSearch extends ASearchingAlgorithm {
    //ArrayList<AState> statesArray; //Collecting the list of nodes we currently work on
    ArrayList<AState> visitedArray; //Visited nodes


    public BreadthFirstSearch() {
        name = "BreadthFirstSearch";
    }

    public Solution solve(ISearchable problemToSolve) {

        AState start = problemToSolve.getStartState();
        AState goal = problemToSolve.getGoalState();

        ArrayList<AState> statesArray = new ArrayList<>();
        HashSet<String> visited = new HashSet<>();

        //AState currentState;//Pointer ro a Astate object
        statesArray.add(start);//Starting from start position
        boolean solved = false;

        while (statesArray.size() > 0 && !solved) {
            AState currentState = statesArray.get(0);//Taking the first object
            if (!visited.contains(currentState.toString())) {
                visited.add(currentState.toString());
                numOfEvaluatedNodes++;
                if (!goal.equals(currentState)) {
                    ArrayList<AState> neighbors = problemToSolve.getAllSuccessors(currentState);
                    if (!(neighbors == null)) {
                        for (AState state : neighbors) {
                            if (!visited.contains(state.toString())) {
                                state.setMyFather(currentState);
                                statesArray.add(state);
                                //numOfEvaluatedNodes++;
                            }
                        }
                    }
                    statesArray.remove(0);
                } else {
                    goal.setMyFather(currentState);
                    solved = true;
                }
            }
        }
        return getSolutionPath(goal, start);

    }
}


//            visited.add(currentState.toString());//Adding the tested node to our visited list
//            this.numOfEvaluatedNodes++; //Increasing the number of the nodes we visited
//            if(currentState.equals(problemToSolve.getGoalState())) {
//                break;
//            }
//            ArrayList<AState> possible;//Define our possible list
//            possible=problemToSolve.getAllPossibleStates(currentState);//Getting possible nodes
//            for(int j =0;j<possible.size();j++) //Running of possible nodes
//            {
//                if(!visited.contains(possible.get(j).toString())) {
//                    // if (!statesArray.contains(possible.get(j))) {//If we didn't visit this node
//                    {
//                        statesArray.add(possible.get(j)); //Collecting the relevant nodes
//                        possible.get(j).setMyFather(currentState);//Creating the relationship between the node and his father
//                    }
//                    //   }
//                }
//            }
//            statesArray.remove(0); //Deleting the head of the list
//        }


