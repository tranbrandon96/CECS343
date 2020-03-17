package Project;


public abstract class Card
{
	private String name;
	private String description;
	
	/** Default Constructor
	 * 
	 */
	public Card()
	{
		name = " ";
		description = " ";
	}
	
	/** Type Conversion Constructor
	 * 
	 * @param name Card Name
	 * @param description Card Description
	 */
	public Card(String name, String description)
	{
		this.name = name;
		this.description = description;
	}
	
	/** Get Card Name
	 * 
	 * @return Card Name
	 */
	public String getCardName()
	{
		return name;
	}
	
	/** Get Card Description
	 * 
	 * @return Special Card
	 */ 
	public String getCardDescription()
	{
		return description;
	}
	
	/** Set Card Name
	 * 
	 * @param name Card Name
	 */
	public void setCardName(String name)
	{
		this.name = name;
	}
	
	/** Set Card Description
	 * 
	 * @param description Card Description
	 */
	public void setCardDescription(String description)
	{
		this.description = description;
	}
	
	public String toString()
	{
		return ("Name: " + name +
				"\nDescription: " + description);
	}
}
