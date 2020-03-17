package Project;

public class SpecialCard extends Card
{
	private String name;
	private String description;
	private int id;
	
	/** Default Constructor
	 * 
	 */
	public SpecialCard()
	{
		super();
		String name = " ";
		String description = " ";
		int id = 0;
	}
	
	/** Type Conversion Constructor
	 * 
	 * @param name Special Card Name 
	 * @param description Special Card Description
	 * @param id Special Card ID
	 */
	public SpecialCard(String name, String description, int id)
	{
		super(name, description);
		this.id = id;
	}
	
	/** Print Special Card
	 * 
	 */
	public String toString()
	{
		return (super.toString());
	}
	
	public static void main (String[] args)
	{
		Card assassination = new SpecialCard("Assasination", "Play this card immediately after the dice are rolled on any attempt (by any player) to destroy, control, or neutralize. That roll is immediately changed, retoactively, to a 2", 1);
		Card bribery = new SpecialCard("Brinery", "Play this card during your turn to automatically take control of any one uncontrolled group. Playing this card counts as an action", 2);
		Card compEspionage = new SpecialCard("Computer Espionage", "Play this card at any time to either count the money on any one group card OR examine all of one player's special cards", 3);
		Card deepAgent = new SpecialCard("Deep Agent", "Play this card after privilege has been invoked. The privilege is totally abolished. That attack cannot be made privileged", 4);
		Card interference1 = new SpecialCard("Interference", "You may interfere withone privileged attack. No other players may interfere", 5);
		Card interference2 = new SpecialCard("Interference", "You may interfere withone privileged attack. No other players may interfere", 6);
		Card marketManip = new SpecialCard("Market Manipulation", "Play this card during your income phase to double all your groups' incomes, for that turn only. This card does not allow the I.R.S. to collect twice, or require the Post Office to pay twice", 7);
		Card mediaCampaign = new SpecialCard("Media Campaign", "Play this card at any time to revive a group from the \\(dead)// pile. It becomes uncontrolled. (If the Servants of Cthulhu destroyed the group, it still counts as a destroyed group for victory. If they destroy it again, it counts again!)", 8);
		Card murphysLaw = new SpecialCard("Murphy's Law", "Play this card immediately after the dice are rolled on any attempt (by any player) to destroy, control, or neutralize. That roll is immediately changed, retroactively, to a 12.", 9);
		Card secManWasntMeant = new SpecialCard("Secrets Man Was Not Meant To Know", "Play this card when any other Special card is played, for ANY purpose. That card is immediately neutralized; it has no effect. Both cards are discarded.", 10);
		Card senateInvestCom = new SpecialCard("Senate Investigating Committee", "Play this card at the beginning of any other player's turn. That player loses his turn completely.", 11);
		Card slushFund = new SpecialCard("Slush Fund", "Exchange this card, at any time, for 15MB to be placed in your Illuminati treasury.", 12);
		Card swissBank = new SpecialCard("Swiss Bank Account", "Exchange this card, at any time, for 25MB to be placed in your Illuminati treasury.", 13);
		Card whisperingCamp = new SpecialCard("Whispering Campaign", "You may attempt to destroy a single group with Power 0. Roll attacking power vs. defending resistance, but a successful attack destroys the target. Playing this card is not an action, but the attack itself is an action.", 14);
		Card whiteCollarCrime = new SpecialCard("White Collar Crime", "Play this card at any time to reorganize all your money freely - that is, any amount(s) may be moved between any groups. You also get an extra 5MB which may be placed anywhere.", 15);
	}
}
