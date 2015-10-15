import javax.swing.JOptionPane;

public class Assignment3 {

	public static void main(String[] args) {
		String userInput = "";
		String userPassword = "";
		String[] corUsername = { "Bryan", "Nicole", "Brandon" };
		String[] corPassword = { "1", "2", "3" };
		int LIMIT = 2;
		int tries = 0;
		int userindex = 0;
		int passindex = 0;

		userInput = JOptionPane.showInputDialog("Enter your username.");

		while (tries < LIMIT) {
			if (corUsername.equals(userInput)
					&& corPassword.equals(userPassword)) {
				JOptionPane.showInputDialog("Please enter your password.");
				if (!corUsername.equals(userInput)) {
				} else {
					JOptionPane.showMessageDialog(null,
							"Contact Administrator.");

				}
			}

		}
	}
}