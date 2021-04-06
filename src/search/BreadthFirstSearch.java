package search;

import java.util.ArrayList;

public class BreadthFirstSearch extends ASearchingAlgorithm {
    ArrayList<AState> statesArray; //Collecting the list of nodes we currently work on
    ArrayList<AState> visitedArray; //Visited nodes
    public BreadthFirstSearch(){
        super("BFS Algorithm"); //Calling to ASearchingAlogoritm constructor
        this.statesArray = new ArrayList<>(); // Define the list of the nodes

    }

    public BreadthFirstSearch(String algoName){//Constructor
        super(algoName);
        this.statesArray = new ArrayList<>();
    }
    public Solution solve(ISearchable domain) {
        AState currentState;//Pointer ro a Astate object
        ArrayList<AState>visited = new ArrayList<>(); //Collecting the visited nodes
        statesArray.add(domain.getStartState());//Starting from start position
       // for(int i=0;statesArray.size()!=0;i=0) //Running over the nodes to check their successors
        while (statesArray.get(0)!=null)
        {
            currentState= statesArray.get(0);//Taking the first object
            visited.add(currentState);//Adding the tested node to our visited list
            this.getNumberOfNodesEvaluated++; //Increasing the number of the nodes we visited
            if(currentState.equals(domain.getGoalState())) {
                Solution sol = new Solution(currentState);//Our condition to stop the loop
                return sol;
            }
            ArrayList<AState> possible;//Define our possible list
            possible=domain.getAllPossibleStates(currentState);//Getting possible nodes
            for(int j =0;j<possible.size();j++) //Running of possible nodes
            {
                if(!visited.contains(possible.get(j))) {
               // if (!statesArray.contains(possible.get(j))) {//If we didn't visit this node
                    {
                        statesArray.add(possible.get(j)); //Collecting the relevant nodes
                        possible.get(j).setMyFather(currentState);//Creating the relationship between the node and his father
                    }
             //   }
                }
            }
            statesArray.remove(0); //Deleting the head of the list
        }
        return null;
    }

}

