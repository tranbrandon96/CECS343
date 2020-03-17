package Frames;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
/**
 * This class creates a frame representing a Welcome Screen
 * @author Brandon, Brandon, Manuel
 *
 */
public class WelcomeScreenFrame extends JFrame {
	/**
	 * Constructor only creates the frame
	 */
	public WelcomeScreenFrame() {
			//call private helper method to create the components
			createComponents();
			//set frame properties
			this.setTitle("Welcome Screen");
			this.setSize(500,500);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/**
	 * create the components for a frame
	 */
	private void createComponents() {
		//Instantiate the components
		JButton newGameButton = new JButton("New Game");
		JButton quitButton = new JButton("Quit");
		//add listeners
		ActionListener newGameListener = new NewGameButtonListener();
		newGameButton.addActionListener(newGameListener);
		ActionListener quitListener = new quitButtonListener();
		quitButton.addActionListener(quitListener);
		//add buttons to panel
		JPanel panel = new JPanel();
		panel.add(newGameButton);
		panel.add(quitButton);

		//add the panel to this frame
		this.add(panel);		
	}
	
	/**INNER ACTION LISTENER CLASS FOR newGameButton
	 * Starts a new game if button is clicked
	 */
	class NewGameButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent click) {
			// getting access to the button that generated the click event
			Component button = (Component) click.getSource();				
			//getting access to the frame in which the button is found
			JFrame frame = (JFrame) SwingUtilities.getRoot(button);
			
			NewGameFrame n = new NewGameFrame();//create a NewGameFrame
			n.setVisible(true); //this makes the frame visible				
			frame.dispose(); //close this frame
		}
	}
	
	/**INNER ACTION LISTENER CLASS FOR quitButton
	 * Exits the application if button is clicked
	 *
	 */
	class quitButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent click) {
			//quit the application
			System.exit(0);
		}		
	}		
	public static void main(String[] args) {
		WelcomeScreenFrame w = new WelcomeScreenFrame();
		w.setVisible(true); //this makes the frame visible
		
	}
}
