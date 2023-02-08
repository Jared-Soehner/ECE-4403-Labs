package part1;

public class Text implements Component{
	private String content;
	
	public Text(String content) {
		this.content = content;
	}
	public String getContent() {
		return content;
	}
	public Component clone() {
		return new Text(this.content);
	}
}
