package part2.mediator;

public abstract class UIControl {
    private Mediator mediator;

    public UIControl(Mediator mediator) {
        this.mediator = mediator;
    }

    public void controlChanged() {
        mediator.notify(this);
    }
}