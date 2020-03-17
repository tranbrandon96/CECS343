package Frames;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import Project.Deck;
import Project.Player;

/**
 * This class creates a main screen for main game sequences and board display
 * @author Brandon, Brandon, Manuel
 *
 */
public class MainGameScreen extends JFrame{	
	ArrayList<Player> playerList;
	ArrayList<JLabel> playerLabelList;//Displays name,income,etc. of player
	JTextField inputField; //a textbox for entering input
	JButton drawButton;
	JButton freeActionButton;
	JButton actionButton;
	JButton transferMoneyButton;
	JButton chooseSpecialActionButton;
	JButton addTargetButton;
	Deck deck;
	int turnCounter; //keeps track of which player's turn it is
	int BOARD_WIDTH = 30;
	int BOARD_HEIGHT = 15;
	String [][] board = new String[BOARD_WIDTH][BOARD_HEIGHT];

	public MainGameScreen(ArrayList<Player> playerList) {
		//Player location on board:
		//Player1:3,3
		//Player2:10,3
		//Player3:17,3
		//Player4:24,3
		//Player5:3,10
		//Player6:10,10
		//Player7:17,10
		//Player8:24,10
		this.playerList = playerList;
		playerLabelList = new ArrayList<JLabel>();
		turnCounter = 1;
		deck = new Deck();
		
		//assign whole board with empty "." spaces
		for (int y = 0; y < BOARD_HEIGHT; y++) {
			for (int x = 0; x < BOARD_WIDTH; x++) {
				board[x][y] = ".";
			}
		}		
		//assign all playing Players onto the board
		for (int i = 0; i < playerList.size(); i++) {
			if (i < 4) { board[3 + (7*i)][3] = "P"+ (i + 1);}
			else { board[3 + (7*(i-4))][10] = "P"+ (i + 1);}
		}
		
		//set frame properties
		this.setTitle("New Game Screen");
		this.setSize(1700,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				
		//call private helper method to create the components
		createComponents();
	}
	/**
	 * This method Updates the board's current state to a string
	 * @return string - a string of the board state
	 */
	private String boardToString() {
		String string = "Player" + turnCounter + "'s turn.";
		string = "\n-";
		for (int x = 0; x < 30; x++) {
			string += "\t" + x;
		}
		string += "\n";
		for (int y = 0; y < 15; y++) {
			string += y;
			for (int x = 0; x < 30; x++) {
				string += "\t" + board[x][y];
			}
			string += "\n";
		}
		return string;
	}
	/**
	 * Creates the Components for a panel to go into a frame
	 */
	private void createComponents() {
		JTextArea boardTextArea = new JTextArea(20,150);
		boardTextArea.setText(boardToString());
		boardTextArea.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane(boardTextArea);		
		inputField = new JTextField(20);
		drawButton = new JButton("Draw");
		freeActionButton = new JButton("Activate Free Action");
		actionButton = new JButton("Activate Action");
		transferMoneyButton = new JButton("TransferMoney");
		chooseSpecialActionButton = new JButton("Activate Special Action");
		addTargetButton = new JButton("Add Target");
		JButton cardInfoHelp = new JButton("Card Info Help");
		
		//set listeners
		drawButton.addActionListener(new DrawButtonListener());
		freeActionButton.addActionListener(new FreeActionButtonListener());
		actionButton.addActionListener(new ActionButtonListener());
		transferMoneyButton.addActionListener(new TransferMoneyButtonListener());
		chooseSpecialActionButton.addActionListener(new SpecialActionButtonListener());
		addTargetButton.addActionListener(new AddTargetButtonListener());
		cardInfoHelp.addActionListener(new CardInfoHelpListener());
		
		//set visible		
		drawButton.setVisible(true);
		inputField.setVisible(false);
		freeActionButton.setVisible(false);
		actionButton.setVisible(false);
		transferMoneyButton.setVisible(false);
		chooseSpecialActionButton.setVisible(false);
		addTargetButton.setVisible(false);
		
		//create panel and add components
		JPanel panel = new JPanel();
		for(int i = 0; i < playerList.size(); i ++) {
			//Make a label for the Player's info
			playerLabelList.add(new JLabel("" + playerList.get(i)));
			panel.add(playerLabelList.get(i));
			JButton playerFreeActionButton = new JButton(playerList.get(i).getName() + "'s Free Action");
			playerFreeActionButton.addActionListener(new PlayerFreeActionButton(playerList.get(i)));
			panel.add(playerFreeActionButton);
		}
		panel.add(scrollPane);
		panel.add(inputField);
		panel.add(drawButton);
		panel.add(freeActionButton);
		panel.add(actionButton);
		panel.add(transferMoneyButton);
		panel.add(chooseSpecialActionButton);
		panel.add(addTargetButton);

		

		//add the panel to this frame
		this.add(panel);
	}
	
	/**
	 * When DrawButton is clicked, FaceUpFaceDownFrame is made.
	 * This Button will turn invisible
	 */
	class DrawButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent click) {
			//draw the card
			// getting access to the button that generated the click event
			Component button = (Component) click.getSource();
			button.setVisible(false);
			actionButton.setVisible(true);
			freeActionButton.setVisible(true);
			//display hand on a InfoFrame
		}			
	}
	
	/**
	 * When PlayerFreeActionButton is clicked, PlayerFreeAction is made.
	 */
	class PlayerFreeActionButton implements ActionListener{
		private Player player;
		public PlayerFreeActionButton(Player player) {
			this.player = player;
		}
		@Override
		public void actionPerformed(ActionEvent click) {
						
		}			
	}
	/**
	 * When FreeActionButton is clicked, FreeAction Frame is created and free action counter is dealt with
	 * This Button will turn invisible
	 */
	class FreeActionButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent click) {
			FreeActionFrame freeAction = new FreeActionFrame(playerList, turnCounter);
			// getting access to the button that generated the click event
			Component button = (Component) click.getSource();
			button.setVisible(false);
		}			
	}
	
	/**
	 * When ActionButton is clicked, Choose Action frame is created.
	 * This Button will turn invisible
	 */
	class ActionButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent click) {
			ActionButtonFrame freeAction = new ActionButtonFrame(playerList, turnCounter);
			// getting access to the button that generated the click event
			Component button = (Component) click.getSource();
			button.setVisible(false);
			transferMoneyButton.setVisible(true);
		}			
	}
	
	/**
	 * When TransferMoneyButton is clicked, TransferMoney frame is created.
	 * This Button will turn invisible
	 * 
	 */
	class TransferMoneyButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent click) {
			TransferMoneyFrame freeAction = new TransferMoneyFrame(playerList, turnCounter);
			// getting access to the button that generated the click event
			Component button = (Component) click.getSource();
			button.setVisible(false);
			freeActionButton.setVisible(false);
			chooseSpecialActionButton.setVisible(true);
			
		}			
	}
	/**
	 * When ChooseSpecialActionButton is clicked, ChooseSpecialAction frame is created.
	 * This Button will turn invisible
	 *
	 */
	class SpecialActionButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent click) {
			SpecialActionFrame freeAction = new SpecialActionFrame(playerList, turnCounter);
			// getting access to the button that generated the click event
			Component button = (Component) click.getSource();
			button.setVisible(false);
			addTargetButton.setVisible(true);
		}			
	}
	
	/**
	 * When AddTargetButton is clicked, Add Target Frame is created.
	 * This Button will turn invisible
	 *
	 */
	class AddTargetButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent click) {
			AddTargetFrame freeAction = new AddTargetFrame(playerList, turnCounter);
			turnCounter++;
			if (turnCounter > playerList.size()) {turnCounter = 0;}
			// getting access to the button that generated the click event
			Component button = (Component) click.getSource();
			button.setVisible(false);	
			drawButton.setVisible(true);
		}			
	}
	
	/**
	 * When CardInfoHelp Button is clicked. Card Info Help Frame is created
	 * Button will never turn invisible
	 *
	 */
	class CardInfoHelpListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent click) {
			InfoFrame infoFrame = new InfoFrame("Card Legend", "TODO");
				
		}			
	}
}
