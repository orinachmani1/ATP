package search;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    private ArrayList<AState> solutionPath;
    public Solution(AState state){
        this.solutionPath=new ArrayList<>();
        while(state!=null){
           this.solutionPath.add(0,state);
           state=state.getMyFather();
        }
    }
}
