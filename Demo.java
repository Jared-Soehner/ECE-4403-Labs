package part1;

public class Demo {
	public static void main(String[] args) {
		Timeline timeline = new Timeline();
		Text text = new Text("Hello");
		Clip clip = new Clip("Some Clip");
		timeline.add(text);
		timeline.add(clip);
		
		ContextMenu menu = new ContextMenu(timeline);
		menu.duplicate(text);
		menu.duplicate(text);
		menu.duplicate(clip);
		timeline.printComponents();
	}

}
