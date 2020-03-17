package Project;

import java.util.*;

import IlluminatiCards.IlluminatiCard;

public class Player 
{
	// Attributes of player
	private ArrayList<Card> playerHand;
	private String icon;
	private String name;
	private int income;
	private IlluminatiCard illCard;
	private int actionCounter;
	private boolean freeAction;
	
	private Map<IlluminatiCard, GroupCard> northStructure = new HashMap<IlluminatiCard, GroupCard>();
	private Map<IlluminatiCard, GroupCard> southStructure = new HashMap<IlluminatiCard, GroupCard>();
	private Map<IlluminatiCard, GroupCard> eastStructure = new HashMap<IlluminatiCard, GroupCard>();
	private Map<IlluminatiCard, GroupCard> westStructure = new HashMap<IlluminatiCard, GroupCard>();
	
	public Player()
	{
		playerHand = new ArrayList<Card>();
		icon = "";
		name = "";
		income = 0;
		illCard = null;
		actionCounter = 0;
		freeAction = false;
		northStructure = null;
		southStructure = null;
		eastStructure = null;
		westStructure = null;
	}
	
	public Player(String icon, String name, int income, IlluminatiCard illCard, int actionCounter, boolean freeAction, 
			Map<IlluminatiCard, GroupCard> northStructure, Map<IlluminatiCard, GroupCard> southStructure, Map<IlluminatiCard, GroupCard> eastStructure, Map<IlluminatiCard, GroupCard> westStructure)
	{
		this.icon = icon;
		this.name = name;
		this.income = income;
		this.illCard = illCard;
		this.actionCounter = actionCounter;
		this.freeAction = freeAction;
		this.northStructure = northStructure;
		this.southStructure = southStructure;
		this.eastStructure = eastStructure;
		this.westStructure = westStructure;
	}
	
	/**
	 * Method to get amount of Card objects in player's 'hand'
	 * @return playerHand.size() - total amount of Card objects
	 * **/
	public int getPlayerHandSize() 
	{ 
		return playerHand.size(); 
	} 
	
	/**
	 * Method to play player's first Card then remove from hand
	 * @return card - Card object
	 * **/
	public Card playCard() 
	{ 
		Card card = playerHand.get(0);
		playerHand.remove(0);
		return card;
		
	}
	
	/** Get Player Hand
	 * 
	 * @return Players hand
	 */
	public ArrayList<Card> getPlayerHand()
	{
		return playerHand;
	}
	
	/** Get Player Icon
	 * 
	 * @return Player Icon
	 */
	public String getIcon()
	{
		return icon;
	}
	
	/** Get Player Name
	 * 
	 * @return Player Name
	 */
	public String getName()
	{
		return name;
	}
	
	/** Get Player Income
	 * 
	 * @return Player Income
	 */
	public int getIncome()
	{
		return income;
	}
	
	/** Get Illuminati Card
	 * 
	 * @return Illuminati Card
	 */
	public IlluminatiCard getIlluminatiCard()
	{
		return illCard;
	}
	
	/** Get Action Counter
	 * 
	 * @return Action Counter
	 */
	public int getActionCounter()
	{
		return actionCounter;
	}
	
	/** Get Free Action
	 * 
	 * @return Free Action
	 */
	public boolean getFreeAction()
	{
		return freeAction;
	}
	
	/** Get North Structure
	 * 
	 * @return North Structure
	 */
	public Map<IlluminatiCard,GroupCard> getNorthStructure()
	{
		return northStructure;
	}
	
	/** Get South Structure
	 * 
	 * @return South Structure
	 */
	public Map<IlluminatiCard,GroupCard> getSouthStructure()
	{
		return southStructure;
	}
	
	/** Get East Structure
	 * 
	 * @return East Structure
	 */
	public Map<IlluminatiCard,GroupCard> getEastStructure()
	{
		return eastStructure;
	}
	
	/** Get West Structure
	 * 
	 * @return West Structure
	 */
	public Map<IlluminatiCard,GroupCard> getWestStructure()
	{
		return westStructure;
	}
	
	/** Set Player Icon
	 * 
	 * @param icon Player Icon
	 */
	public void setIcon(String icon)
	{
		this.icon = icon;
	}
	
	/** Set Name
	 * 
	 * @param name Player Name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/** Set Income
	 * 
	 * @param income Player Income
	 */
	public void setIncome(int income)
	{
		this.income = income;
	}
	
	/** Set IlluminatiCard 
	 * 
	 * @param illCard Illuminati Card
	 */
	public void setIlluminatiCard(IlluminatiCard illCard)
	{
		this.illCard = illCard;
	}
	
	/** Set Action Counter
	 * 
	 * @param actionCounter Action Counter
	 */
	public void setActionCounter(int actionCounter)
	{
		this.actionCounter = actionCounter;
	}
	
	/** Set Free Action
	 * 
	 * @param freeAction Free Action
	 */
	public void setFreeAction(boolean freeAction)
	{
		this.freeAction = freeAction;
	}
	
	/** Set North Structure
	 * 
	 * @param northStructure North Structure
	 */
	public void setNorthStructure(Map<IlluminatiCard, GroupCard> northStructure)
	{
		this.northStructure = northStructure;
	}
	
	/** Set South Structure
	 * 
	 * @param southStructure South Structure
	 */
	public void setSouthStructure(Map<IlluminatiCard, GroupCard> southStructure)
	{
		this.southStructure = southStructure;
	}
	
	/** Set East Structure 
	 * 
	 * @param eastStructure East Structure
	 */
	public void setEastStructure(Map<IlluminatiCard, GroupCard> eastStructure)
	{
		this.eastStructure = eastStructure;
	}
	
	/** Set West Structure 
	 * 
	 * @param westStructure West Structure
	 */
	public void setWestStructure(Map<IlluminatiCard, GroupCard> westStructure)
	{
		this.westStructure = westStructure;
	}
	public String toString(){ 
		return ("Name: " + getName() + "\n\t IlluminatiCard: " + illCard.getName() + "\n\t Income:" + getIncome()  );
	}
}
