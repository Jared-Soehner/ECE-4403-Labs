package part1;

public class concreteCommandSetText implements Command {
    private final videoEditor videoEditor;
    private final String oldText;
    private final String newText;
    
    public concreteCommandSetText(videoEditor videoEditor, String newText) {
        this.videoEditor = videoEditor;
        this.oldText = videoEditor.getText();
        this.newText = newText;
    }
    
    @Override
    public void execute() {
        videoEditor.setText(newText);
    }
    
    @Override
    public void undo() {
        videoEditor.setText(oldText);
    }
}