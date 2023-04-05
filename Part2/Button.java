package part2.mediator;

public class Button extends UIControl {
    private boolean isEnabled;

    public Button(Mediator mediator) {
        super(mediator);
    }
    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
