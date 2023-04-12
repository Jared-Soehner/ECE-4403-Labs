package lab10Part2;

public class BicyclingState implements TravelModeState {
    public Object getEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }
}