package part2.decorator;

public class Decorator implements Component{
	private final Component fileToBeAdjusted;
	
	public Decorator(Component fileToBeAdjusted) {
		this.fileToBeAdjusted = fileToBeAdjusted;
	}		
	public String draw() {
		return fileToBeAdjusted.draw();
	}

}
