import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloSmileyProgram {
         public static void main(String[] args) {
                  // Create a JFrame (window)
                  JFrame frame = new JFrame("Hello, Smiley!");
                  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the window is closed
                  frame.setSize(500, 200); // Set the size of the window

                  // Create a JPanel (container for components)
                  JPanel panel = new JPanel();

                  // Create a JLabel for "Hello, World!" text
                  JLabel helloLabel = new JLabel("Hello, World!");
                  helloLabel.setFont(new Font("Arial", Font.ITALIC, 40)); // Set font and style for the text

                  // Create a JLabel for a smiley face (you can use an emoji or any other image)
                  JLabel smileyLabel = new JLabel("\uD83D\uDE00"); // Emoji for a smiling face

                  // Create a JButton
                  JButton button = new JButton("Click Me");

                  // Add an ActionListener to the button
                  button.addActionListener(new ActionListener() {
                           @Override
                           public void actionPerformed(ActionEvent e) {
                                    // This code will be executed when the button is clicked
                                    System.out.println("Button Clicked!");
                           }
                  });

                  // Add the labels and button to the panel
                  panel.add(helloLabel);
                  panel.add(smileyLabel);
                  panel.add(button);

                  // Add the panel to the frame
                  frame.add(panel);

                  // Make the frame visible
                  frame.setVisible(true);
         }
}
