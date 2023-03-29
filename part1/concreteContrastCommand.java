package part1;

public class concreteContrastCommand implements Command {
    private final videoEditor videoEditor;
    private final float oldContrast;
    private final float newContrast;
    
    public concreteContrastCommand(videoEditor videoEditor, float newContrast) {
        this.videoEditor = videoEditor;
        this.oldContrast = videoEditor.getContrast();
        this.newContrast = newContrast;
    }
    
    public void execute() {
        videoEditor.setContrast(newContrast);
    }
    
    public void undo() {
        videoEditor.setContrast(oldContrast);
    }
}