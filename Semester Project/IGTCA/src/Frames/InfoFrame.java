package Frames;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import Project.Player;

/**
 * This frame is only for displaying info in a text area window
 * @author Manuel, Brandon, Brandon
 *
 */
public class InfoFrame extends JFrame{
	ArrayList<Player> playerList;
	String info;

	public  InfoFrame (String title, String info) {
		this.info = info;
		
		//set frame properties
		this.setTitle(title);
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);		
		//call private helper method to create the components
		createComponents();
	}
	
	private void createComponents() {
		JTextArea boardTextArea = new JTextArea(20,40);
		boardTextArea.setText(info);
		boardTextArea.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane(boardTextArea);
		JButton closeButton = new JButton("Close");
		closeButton.addActionListener(new CloseButtonListener());
		
		//create panel and add components
		JPanel panel = new JPanel();
		panel.add(scrollPane);
		panel.add(closeButton);	

		//add the panel to this frame
		this.add(panel);
	}
	/**
	 * When StartButton is clicked. Players are made and mainGame Frame starts
	 *
	 */
	class CloseButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent click) {
			
			// getting access to the button that generated the click event
			Component button = (Component) click.getSource();				
			//getting access to the frame in which the button is found
			JFrame frame = (JFrame) SwingUtilities.getRoot(button);		
			frame.dispose(); //close this frame
		}			
	}
}
