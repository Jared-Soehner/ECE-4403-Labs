package lab10Part2;

public class DirectionService {
    private TravelModeState travelModeState;

    public DirectionService(TravelModeState travelModeState) {
        this.travelModeState = travelModeState;
    }

    public void setTravelModeState(TravelModeState travelModeState) {
        this.travelModeState = travelModeState;
    }

    public Object getEta() {
        return travelModeState.getEta();
    }
}
