package lab10Part2;

public class DrivingState implements TravelModeState {
    public Object getEta() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }
}