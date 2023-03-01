package part2.decorator;

public class ConcreteMainDecorator extends Decorator{
		
	public ConcreteMainDecorator(Component fileToBeAdjusted) {
		super(fileToBeAdjusted);
	}
	public String draw() {
		return super.draw() + ( " main");
	}
}
