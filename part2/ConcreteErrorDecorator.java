package part2.decorator;

public class ConcreteErrorDecorator extends Decorator {
	
	public ConcreteErrorDecorator(Component fileToBeAdjusted) {
		super(fileToBeAdjusted);
	}
	public String draw() {
		return super.draw() +( " {error icon}");
	}
}
