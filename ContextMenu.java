package part1;

public class ContextMenu {
	private Timeline timeline;
	
	public ContextMenu(Timeline timeline) {
		this.timeline = timeline;
	}
	public void duplicate(Component component) {
		if(component instanceof Text) {
			timeline.add(component.clone());
			System.out.println("Duplicating Text");
		}
		else if (component instanceof Audio) {
			timeline.add(component.clone());
			System.out.println("Duplicating Audio");
		}
		else if (component instanceof Clip) {
			timeline.add(component.clone());
			System.out.println("Duplicating Clip");
		}
		else
			System.out.println("Unsure what this Component is");
	}

}
