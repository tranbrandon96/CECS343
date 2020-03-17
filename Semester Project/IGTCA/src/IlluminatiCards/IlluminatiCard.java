package IlluminatiCards;

import java.util.*;
/** 
 * This is an abstract class of Illuminati Cards that will branch off to the concrete classes of each and every illuminati card
 * @author Brandon Tran
 *
 */
public abstract class IlluminatiCard
{
	// Power Structures: Each Illuminati card has a power structures that resembles how they control groups and build their infrastructure.
	
	// String variable to print to the user what the special ability of the Illuminati card that they have received by the system.
	private String specialAbility;
	
	// Integer variable for power and resistance of each Illuminati card
	private int power;
	private int resistance;
	
	// Integer variable for income to show what the income associated with the Illuminati card
	private int income;
	
	// String variable to print to the user what the special goal of the Illuminati card that they must obtain in order to win the game
	private String specialGoals;
	
	private String name;
	
	/** Default Contructor
	 * 
	 */
	public IlluminatiCard()
	{
		name = "";
		specialAbility = "";
		power = 0;
		resistance = 0;
		income = 0;
		specialGoals = "";
	}
	
	/** Type Conversion Constructor
	 * 
	 * @param specialAbilty Illuminati card's special ability
	 * @param power Illuminati card's power
	 * @param resistance Illuminati card's resistance
	 * @param specialGoals Illuminati card's special goals
	 */
	public IlluminatiCard(String name, String specialAbilty, int power, int resistance, int income, String specialGoals)
	{
		this.name = name;
		this.specialAbility = specialAbility;
		this.power = power;
		this.resistance = resistance;
		this.income = income;
		this.specialGoals = specialGoals;
	}
	/**
	 * getter method for name
	 * @return name - name of the illuminiati card
	 */
	public String getName()
	{
		return name;
	}
	/** Get Special Ability
	 * 
	 * @return Illuminati card's special ability
	 */
	public String getSpecialAbility()
	{
		return specialAbility;
	}
	
	/** Get Power
	 * 
	 * @return Illuminati card's power
	 */
	public int getPower()
	{
		return power;
	}
	
	/** Get Resistance 
	 * 
	 * @return Illuminati card's resistance
	 */
	public int getResistance()
	{
		return resistance;
	}
	
	/** Get Income 
	 * 
	 * @return Illuminati card's income
	 */
	public int getIncome()
	{
		return income;
	}
	
	/** Get Special Goals
	 * 
	 * @return Illuminati card's special goals
	 */
	public String getSpecialGoals()
	{
		return specialGoals;
	}
	/**
	 * Setter method for name
	 * @param name - Illuminati card's name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/** Set Special Ability
	 * 
	 * @param specialAbility Illuminati card's special ability
	 */
	public void setSpecialAbility(String specialAbility)
	{
		this.specialAbility = specialAbility;
	}
	
	/** Set Power
	 * 
	 * @param power Illuminati card's power
	 */
	public void setPower(int power)
	{
		this.power = power;
	}
	
	/** Set Resistance 
	 * 
	 * @param resistance Illuminati card's resistance
	 */
	public void setResistance(int resistance)
	{
		this.resistance = resistance;
	}
	
	public void setIncome(int income)
	{
		this.income = income;
	}
	
	/** Set Special Goal
	 * 
	 * @param specialGoals Illuminati card's special goal
	 */
	public void setSpecialGoals(String specialGoals)
	{
		this.specialGoals = specialGoals;
	}
	
	/** Print Special Ability
	 * 
	 * @return Illuminati card's special ability
	 */
	public String printSpecialAbility()
	{
		return "Special Ability: " + specialAbility;
	}
	
	/** Print Special Goals
	 * 
	 * @return Illuminati card's special goals
	 */
	public String printSpecialGoals()
	{
		return "Special Goals: " + specialGoals;
	}
	
	
}