package Frames;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import IlluminatiCards.*;
import Project.Player;
import Project.Music;
/**
 * This frame sets up a New Game
 * This frame retrieves the number of player's and their info
 * @author Manuel, Brandon, Brandon
 *
 */
public class NewGameFrame extends JFrame {
	ArrayList<JTextField> playerTextFields; 			//input field for player names
	ArrayList<JComboBox<String>> playerIconOptionList; 	//ComboBox containing Icon choices
	ArrayList<JLabel> nameJLabelList;					//Text label on the panel
	ArrayList<JLabel> iconcJLabelList;					//Text labels for icon boxes on the panel
	ArrayList<Player> playerList;						//list of Players playing
	ArrayList<IlluminatiCard> illuminatiList;			//List of Illuminati Cards
	JComboBox<String> playerNumOptions;					//ComboBox containing player # count choices
	Music musicObject;
	/**
	 * Creates frame and initializes ArrayList
	 */
	public NewGameFrame() {	
		playerTextFields = new ArrayList<JTextField>();
		playerIconOptionList = new ArrayList<JComboBox<String>>();
		nameJLabelList = new ArrayList<JLabel>();
		iconcJLabelList = new ArrayList<JLabel>();
		playerList = new ArrayList<Player>();
		musicObject = new Music();
		buildIlluminatiList();
		//set frame properties
		this.setTitle("New Game Screen");
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		//call private helper method to create the components
		createComponents();
	}
	
	/**
	 * instantiate the components
	 */
	private void createComponents() {
		JButton startButton = new JButton("Start");
		//dropbox for choosing number of players
		String[] playerNum = {"3","4","5","6","7","8"};
		playerNumOptions = new JComboBox<String>(playerNum);
		
		//dropbox for choosing song to play
		String[] music = {"Song 1","Song 2","Song 3"};
		JComboBox<String> musicOptions = new JComboBox<String>(music);
		
		String[] playerIcon = {"Monkey","Chicken","Frog","Horse",};
		for (int i = 1; i < 9; i++) {
			//creating textfield for player name and dropbox for choosing player's icon
			playerTextFields.add(new JTextField("Player" + i));
			playerIconOptionList.add(new JComboBox<String>(playerIcon));
		}		
		
		//CREATE EVENT LISTENER OBJECT
		startButton.addActionListener(new StartButtonListener());
		playerNumOptions.addActionListener(new playerNumOptionsListener());
		musicOptions.addActionListener(new musicOptionsListener());
		
		//Create the PANEL and add components
		JPanel panel = new JPanel();
		panel.add(new JLabel("Music Options:"));
		panel.add(musicOptions);
		panel.add(new JLabel("Number of Players:"));
		panel.add(playerNumOptions);
		
		//Create Components 8 times for 8 max Players
		for (int i = 0; i < 8; i++) {
			nameJLabelList.add(new JLabel("Enter Player" + (i+1) + " name:"));
			panel.add(nameJLabelList.get(i));
			panel.add(playerTextFields.get(i));
			
			iconcJLabelList.add(new JLabel("Choose Player" + (i+1) + " Icon:"));
			panel.add(iconcJLabelList.get(i));
			panel.add(playerIconOptionList.get(i));
		}				
		panel.add(startButton);
		
		//SET VISIBLE
		for(int i = 3; i < 8; i++) {
			playerTextFields.get(i).setVisible(false);
			playerIconOptionList.get(i).setVisible(false);
			nameJLabelList.get(i).setVisible(false);
			iconcJLabelList.get(i).setVisible(false);
		}
		
		//add panel to frame
		this.add(panel);
	}
	/**
	 * Builds arrayList with all Illminati cards
	 */
	private void buildIlluminatiList() {
		illuminatiList = new ArrayList<IlluminatiCard>();
		illuminatiList.add(new TheBavarianIlluminati());
		illuminatiList.add(new TheBermudaTriangle());
		illuminatiList.add(new TheDiscordianSociety());
		illuminatiList.add(new TheGnomesOfZurich());
		illuminatiList.add(new TheNetwork());
		illuminatiList.add(new TheServantsofCthulhu());
		illuminatiList.add(new TheSocietyofAssasins());
		illuminatiList.add(new TheUFOs());
	}
	/**
	 * Removes a random Illuminati from arraylist and adds it to the 
	 * @return illuCard - Illuminati Card randomly removed from arrayList
	 */
	private IlluminatiCard getRandomIlluminati() {		
        int k = 0;
        Random random  = new Random();
        k = random.nextInt(illuminatiList.size());
        IlluminatiCard illuCard = illuminatiList.remove(k);
        if (illuCard.getName().compareTo("TheUFOs") == 0) {
        	k = random.nextInt(illuminatiList.size());
        	illuCard.setSpecialGoals(illuminatiList.get(k).getSpecialGoals());
        }
		return illuCard;		
	}
	
	/**
	 * When StartButton is clicked. Players are made and mainGame Frame starts
	 *
	 */
	class StartButtonListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent click) {
			//get number of players
			int choice = playerNumOptions.getSelectedIndex() + 3;
			//create Player object and add to arrayList semi-randomly
			for (int i = 0; i < choice; i++) {
				String icon = playerIconOptionList.get(i).getSelectedItem().toString();
				String playerName = playerTextFields.get(i).getText();
				IlluminatiCard illuCard = getRandomIlluminati();
				int income = illuCard.getIncome();
				Random random  = new Random();
			    int k = random.nextInt(1);
			    Player player = new Player(icon, playerName, income, illuCard, 1, true, null, null, null, null);
			    if (k == 0) {playerList.add(k, player);}
			    else {playerList.add(player);}
				
				
			}
			String playerIlluminatiInfo = "";
			for (int i = 0; i < playerList.size(); i ++) {
				Player player = playerList.get(i);
				playerIlluminatiInfo += player + "\n\tSpecial Goal: " + 
				player.getIlluminatiCard().getSpecialGoals() + "\n";
			}
			musicObject.soundTheHorns();
			MainGameScreen m = new MainGameScreen(playerList);
			m.setVisible(true);
			InfoFrame infoFrame = new InfoFrame("Player&Illminati Info", playerIlluminatiInfo);
			infoFrame.setVisible(true);
			// getting access to the button that generated the click event
			Component button = (Component) click.getSource();				
			//getting access to the frame in which the button is found
			JFrame frame = (JFrame) SwingUtilities.getRoot(button);		
			frame.dispose(); //close this frame
		}			
	}
	//INNER EVENT LISTENER CLASS FOR musicOptions DropDown
	class musicOptionsListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent click) {	
			JComboBox<String> cb = (JComboBox<String>) click.getSource();
			int choice = cb.getSelectedIndex();
			String song = (choice == 0) ? "song1.mp3" : (choice == 1) ? "song2.mp3" : "song3.mp3";
			musicObject.playSong(song);
		}			
	}
	/**INNER EVENT LISTENER CLASS FOR playerNumOption DropDown.
	 * Sets components to invisible or visible depending on number of players* 
	 *
	 */
	class playerNumOptionsListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent click) {
			// getting access to the comboBox that generated the click event
			JComboBox<String> cb = (JComboBox<String>) click.getSource();
			int choice = cb.getSelectedIndex() + 3;
			for(int i = 3; i < 8; i++) {
				playerTextFields.get(i).setVisible(false);
				playerIconOptionList.get(i).setVisible(false);
				nameJLabelList.get(i).setVisible(false);
				iconcJLabelList.get(i).setVisible(false);
			}
			for(int i = 3; i <= (choice - 1); i++) {
				playerTextFields.get(i).setVisible(true);
				playerIconOptionList.get(i).setVisible(true);
				nameJLabelList.get(i).setVisible(true);
				iconcJLabelList.get(i).setVisible(true);
			}			
		}			
	}
}
