package lab10Part2;

public class WalkingState implements TravelModeState {
    public Object getEta() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }
}
