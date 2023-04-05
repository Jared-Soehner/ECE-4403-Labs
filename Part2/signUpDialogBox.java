package part2.mediator;

public class signUpDialogBox implements Mediator {
    TextBox usernameTextBox;
    TextBox passwordTextBox;
    CheckBox termsCheckBox;
    Button signUpButton;

    public signUpDialogBox() {
        // Initialize the UI elements
        usernameTextBox = new TextBox(this);
        passwordTextBox = new TextBox(this);
        termsCheckBox = new CheckBox(this);
        signUpButton = new Button(this);
    }

    // Implementation of the Mediator interface method
    @Override
    public void notify(UIControl sender) {
        if (sender == usernameTextBox || sender == passwordTextBox || sender == termsCheckBox) {
            signUpButton.setEnabled(isValidForm());
        } else if (sender == signUpButton) {
            signUp();
        }
    }

    // Check if the form is valid
    private boolean isValidForm() {
        return !usernameTextBox.getContent().isEmpty()
                && !passwordTextBox.getContent().isEmpty()
                && termsCheckBox.isChecked();
    }

    // Handle the sign-up action
    private void signUp() {
        // TODO: Implement sign-up logic
    }
}