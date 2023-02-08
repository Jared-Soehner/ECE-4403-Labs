package part1;

public class Clip implements Component{
	private String clipFile;
	public Clip(String aClipFile) {
		this.clipFile=aClipFile;
	}
	public String getContent() {
		return clipFile;
	}
	public Component clone() {
		return new Clip(this.clipFile);
	}

}
