package part2.decorator;

public class Demo {
	
	public static void main(String[] args) {
		boolean error = true;
		boolean main = true;
		Component file = new simpleFile();
		if (error) file = new ConcreteErrorDecorator(file);
		if (main) file = new ConcreteMainDecorator(file);
		System.out.println(file.draw());
    }
}
