import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class UppercaseApp extends JFrame implements ActionListener {
    private JTextField inputTextField;
    private JLabel resultLabel;

    public UppercaseApp() {
        // Set layout for the frame
        setLayout(null);

        // Create input text field
        inputTextField = new JTextField();
        inputTextField.setBounds(20, 20, 200, 20);

        // Create show button
        JButton showButton = new JButton("Show");
        showButton.setBounds(20, 50, 80, 30);

        // Create result label
        resultLabel = new JLabel();
        resultLabel.setBounds(20, 90, 200, 20);

        // Add components to the frame
        add(inputTextField);
        add(showButton);
        add(resultLabel);

        // Add action listener to the button
        showButton.addActionListener(this);

        // Set frame properties
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Uppercase App");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Show")) {
            // Get the input text from the text field
            String inputText = inputTextField.getText();

            // Convert the input string to uppercase
            String resultText = inputText.toUpperCase();

            // Display the result in the label
            resultLabel.setText("Uppercase: " + resultText);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(UppercaseApp::new);
    }
}
