package search;

public class AState {
    AState myFather;
    double cost;
    String stateName;

    public AState(){
        cost = 0;
        myFather = null;
        stateName = null;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public AState getMyFather() {
        return myFather;
    }

    public double getCost() {
        return cost;
    }

    public void setMyFather(AState myFather) {
        this.myFather = myFather;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
