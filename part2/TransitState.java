package lab10Part2;

public class TransitState implements TravelModeState {
    public Object getEta() {
        System.out.println("Calculating ETA (transit)");
        return 3;
    }
}
