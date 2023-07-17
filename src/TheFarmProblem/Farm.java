package TheFarmProblem;

public class Farm {
    public int animals(int chickens, int cow, int pig) {
        int totalLegs = 0;
        int noOfChickenLegs = chickens * 2;
        int noOfCowLegs = cow * 4;
        int noOfPigLegs = pig * 4;
        totalLegs = (noOfChickenLegs + noOfCowLegs + noOfPigLegs);
        return totalLegs;
    }
}
