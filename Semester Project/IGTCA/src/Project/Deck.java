package Project;

import java.util.*;

public class Deck 
{
	private ArrayList<GroupCard> groupCardList;
	private ArrayList<SpecialCard> specialCardList;
	private ArrayList<GroupCard> groupCardShuffled;
	private ArrayList<SpecialCard> specialCardShuffled;
	
	/** Default Constructor
	 * 
	 */
	public Deck()
	{
		groupCardList = new ArrayList<GroupCard>();
		specialCardList = new ArrayList<SpecialCard>();
	}
	
	/** Type Conversion Constructor
	 * 
	 * @param groupCardList
	 * @param specialCardList
	 */
	public Deck(ArrayList<GroupCard> groupCardList, ArrayList<SpecialCard> specialCardList)
	{
		this.groupCardList = groupCardList;
		this.specialCardList = specialCardList;
	}
	
	/** Shuffle Entire Deck which includes group cards and special cards
	 * 
	 */
	public void shuffleDeck()
	{
		ArrayList<GroupCard> newGroupCardDeck = new ArrayList<GroupCard>();
        int k = 0;
        while (groupCardList.size() > 0) 
        {
            Random RNG  = new Random();
            k = RNG.nextInt(groupCardList.size());
            GroupCard removedCard = groupCardList.remove(k);
            newGroupCardDeck.add(removedCard);
        }
        
        groupCardShuffled = newGroupCardDeck;
        
		ArrayList<SpecialCard> newSpecialCardDeck = new ArrayList<SpecialCard>();
        int l = 0;
        while (groupCardList.size() > 0) 
        {
            Random RNG  = new Random();
            l = RNG.nextInt(specialCardList.size());
            SpecialCard removedCard = specialCardList.remove(l);
            newSpecialCardDeck.add(removedCard);
        }
        
        specialCardShuffled = newSpecialCardDeck;     
        
	}
	
	/** Draw Random Card from Deck
	 * 
	 * @return Return back a group card or special card
	 */
	public Card drawCard()
	{
		shuffleDeck();
		Random RNG = new Random();
		int randomInteger = RNG.nextInt(groupCardShuffled.size() + specialCardShuffled.size());
		if (randomInteger < 83)
		{
			return groupCardShuffled.remove(randomInteger);
		}
		return specialCardShuffled.remove(randomInteger);
	}

	

	

}
