package Project;

public class GroupCard extends Card
{
	private String specialAbility;
	private int power;
	private int resistance;
	private int income;
	private int connectOut;
	private int connectIn;
	private int id;
	
	/** Default Constructor
	 * 
	 */
	public GroupCard()
	{
		super();
		specialAbility = "";
		power = 0;
		resistance = 0;
		income = 0;
		connectOut = 0;
		connectIn = 0;
		id = 0;
	}
	
	/** Type Conversion Constructor
	 * 
	 * @param name Group Card Name 
	 * @param description Group Card Description
	 * @param specialAbility Group Card Special Ability
	 * @param power Group Card Power
	 * @param resistance Group Card Resistance
	 * @param income Group Card Income
	 * @param connectOut Group Card Connect Out
	 * @param connectIn Group Card Connect In
	 * @param id Group Card ID
	 */
	public GroupCard(String name, String description, String specialAbility, int power, int resistance, int income, int connectOut, int connectIn, int id)
	{
		super(name,description);
		this.specialAbility = specialAbility;
		this.power = power;
		this.resistance = resistance;
		this.income = income;
		this.connectOut = connectOut;
		this.connectIn = connectIn;
		this.id = id;
	}
	
	/** Print Group Card 
	 * 
	 */
	public String toString()
	{
		return (super.toString() + 
				"\nSpecial Ability: " + specialAbility +
				"\nPower: " + power +
				"\nResistance: " + resistance +
				"\nIncome: " + income);
	}
	
	public static void main (String[] args)
	{
		Card americanAutoAsso = new GroupCard("American Autoduel Association", "Violent Weird", "None", 1, 5, 1, 1, 1, 1);
		Card antiNucAct = new GroupCard("Anti-Nuclear Activists", "Liberal", "+2 on any attempt to destroy Nuclear Power Companies", 2, 5, 1, 1, 1, 2);
		Card antiWarAct = new GroupCard ("Antiwar Activists", "Peaceful Liberal", "None", 0, 3, 1, 0, 1, 3);
		Card bigMedia = new GroupCard("Big Media", "Liberal Strait", "None", 4, 6, 3, 3, 1, 4);
		Card boySprouts = new GroupCard ("Boy Sprouts", "Strait Peaceful", "None", 0, 3, 1, 0, 1, 5);
		Card california = new GroupCard ("California", "Liberal Weird Government", "None", 5, 4, 5, 2, 1, 6);
		Card cflaio = new GroupCard ("CFL-AIO", "Liberal", "None", 6, 5, 3, 3, 1, 7);
		Card chinCampDon = new GroupCard ("Chinese Campaign Donors", "Communist", "Treat this group as Government when it attempts to control a Government group", 3, 2, 3, 2, 1, 8);
		Card cia = new GroupCard ("CIA", "Government Violent", "None", 6, 5, 0, 3, 1, 9);
		Card cloneArr  = new GroupCard ("Clone Arrangers", "Violent Communist Criminal", "+3 on any attempt to destroy any group", 6, 6, 1, 2, 1, 10);
		Card comicBooks = new GroupCard ("Comic Books", "Weird Violent", "None", 1, 1, 2, 1, 1, 11);
		Card congrWives = new GroupCard ("Congressional Wives", "Conservative Strait", "None", 1, 4, 1, 1, 1, 12);
		Card convStores = new GroupCard ("Convenience Stores", "Strait", "None", 1, 4, 3, 1, 1, 13);
		Card copyShops = new GroupCard ("Copy Shops", "Peaceful", "None", 1, 3, 4, 1, 1, 14);
		Card cycleGangs = new GroupCard ("Cycle Gangs", "Violent Weird", "+2 on any attempt to destroy any group", 0, 4, 0, 0, 1, 15);
		Card democrats = new GroupCard ("Democrats", "Liberal", "None", 5, 4, 3, 2, 1, 16);
		Card ecoGuerrillas = new GroupCard ("Eco-Guerrillas", "Liberal Violent Weird", "None", 0, 6, 1, 0, 1, 17);
		Card emptyVee = new GroupCard ("Empty Vee", "None", "None", 3, 3, 4, 2, 1, 18);
		Card evlGen4BetTmw = new GroupCard ("Evil Geniuses for a Better Tomorow", "Violent Weird", "+4 for any attempt to control, neutralize, or destroy the Orbital Mind Control Lasers", 2, 6, 3, 0, 1, 19);
		Card fastFoodChains = new GroupCard ("Fast Food Chains", "Strait", "None", 2, 4, 3, 1, 1, 20);
		Card fbi = new GroupCard ("F.B.I.", "Government Strait", "None", 4, 6, 0, 2, 1, 21);
		Card fedReserve = new GroupCard ("Federal Reserve", "Government", "When it transfers money, that money can go to any gorup in the same Power Structure", 5, 7, 6, 2, 1, 22);
		Card feminists = new GroupCard ("Feminists", "Liberal", "+3 on any attempt to control any Liberal group", 2, 2, 1, 1, 1, 23);
		Card flendishFlour = new GroupCard ("Flendish Flouridators", "Communist Fanatic", "None", 3, 5, 1, 2, 1, 24);
		Card flatEarthers = new GroupCard ("Flat Earthers", "Weird Conservatives", "None", 1, 2, 1, 1, 1, 25);
		Card fnordMtrCmp = new GroupCard ("Fnord Motor Company", "Peaceful", "None", 2, 4, 2, 1, 1, 26);
		Card fratOrders = new GroupCard ("Fraternal Orders", "Conservatives", "None", 3, 5, 2, 1, 1, 27);
		Card girlieMag = new GroupCard ("Girlie Magazines", "Liberal", "None", 2, 2, 3, 1, 1, 28);
		Card goldFanciers = new GroupCard ("Goldfish Fanciers", "Peaceful Fanatic", "None", 0, 4, 1, 0, 1, 29);
		Card gunLobby = new GroupCard ("Gun Loby", "Conservative Violent", "Normal resistance 3; against any Liberal, Communist, or Weird group, resistance 10", 1, 3, 1, 2, 1, 30);
		Card hackers = new GroupCard ("Hackers", "Weird Fanatic", "+3 on any attempt to neutralize any group", 1, 4, 2, 1, 1, 31);
		Card healthFoodStores = new GroupCard ("Health Food Stores", "Liberal", "+2 on any attempts to control Anti-Nuclear Activists", 1, 3, 2, 1, 1, 32);
		Card hollywood = new GroupCard ("Hollywood", "Liberal", "None", 2, 0, 5, 2, 1, 33);
		Card intellectuals = new GroupCard ("Intellectuals", "Weird Fanatic", "None", 0, 3, 1, 0, 1, 34);
		Card intlCocSmug = new GroupCard ("International Cocaine Smugglers", "Criminal", "+4 on any attempt to entrol Punk Rockers, Cycle Gangs, or Hollywood", 3, 5, 5, 3, 1, 35);
		Card intlCommConsp = new GroupCard ("International Comunist Conspiracy", "Communist", "+3 on any attempt to control any Communist group", 7, 8, 6, 3, 1, 36);
		Card irs = new GroupCard ("I.R.S.", "Criminal Government", "Owning player may tax each opponent 2MB on his own income phase. Tax may come from any group. If a player has no money, he owes no tax", 5, 5, 10, 2, 1, 37);
		Card junkMail = new GroupCard ("Junk Mail", "Criminal", "+4 on any attempt to control the Post Office", 1, 3, 2, 1, 1, 38);
		Card kgb = new GroupCard ("KGB", "Communist Violent", "+2 on any attempt to destroy any group", 2, 6, 0, 1, 1, 39);
		Card kkk = new GroupCard ("KKK", "Conservative Violent", "None", 2, 5, 1, 1, 1, 40);
		Card l4Society = new GroupCard ("L-4 Society", "Weird", "+4 for direct control, neutralization, or destruction of Orbital Mind Control Lasers", 1, 2, 0, 1, 1, 41);
		Card libertarians = new GroupCard ("Libertarians", "Fanatic", "None", 1, 4, 1, 1, 1, 42);
		Card loanSharks = new GroupCard ("Loan Sharks", "Criminal Violent", "None", 5, 5, 6, 1, 1, 43);
		Card locPolDep = new GroupCard ("Local Police Department", "Conservative Strait Violent", "None", 0, 4, 1, 0, 1, 44);
		Card madisonAve = new GroupCard ("Madison Avenue", "None", "+5 on any attempt to control Big Media or Empty Vee", 3, 3, 2, 2, 1, 45);
		Card mafia = new GroupCard ("The Mafia", "Criminal Violent", "+3 for direct control of any Criminal group", 7, 7, 6, 3, 1, 46);
		Card menInBlack = new GroupCard ("The Men In Black", "Criminal Weird", "None", 2, 6, 1, 0, 1, 47);
		Card militia = new GroupCard ("Militia", "Violent Conservative", "+6 on any attempt to destroy any Communist group", 2, 4, 2, 2, 1, 48);
		Card moonies = new GroupCard ("Moonies", "Peaceful Fanatic", "None", 2, 4, 3, 1, 1, 49);
		Card moralMinority = new GroupCard ("Moral Minority", "Conservative Strait Fanatic", "None", 2, 1, 2, 1, 1, 50);
		Card morticians = new GroupCard ("Morticians", "Strait Peaceful", "None", 0, 4, 1, 0, 1, 51);
		Card multOilComp = new GroupCard ("Multinational Oil Companies", "None", "None", 6, 4, 8, 3, 1, 52);
		Card nephOfGod = new GroupCard ("Nephews of God", "Conservative Fanatic", "None", 0, 4, 2, 0, 1, 53);
		Card newYork = new GroupCard ("New York", "Violent Criminal Government", "None", 7, 8, 3, 3, 1, 54);
		Card nucPwrComp = new GroupCard ("Nuclear Power Companies", "Conservatives", "None", 4, 4, 3, 1, 1, 55);
		Card orbMindCtrlLasers = new GroupCard ("Orbital Mind Control Lasers", "Communist", "On his turn, owner can add, remove, or reverse an alignment of any one other group in play; change lasts for that turn only", 4, 5, 0, 2, 1, 56);
		Card pta = new GroupCard ("Parent/Teacher Aggiomeration", "Peacful Conservative Strait", "None", 0, 5, 1, 0, 1, 57);
		Card pentagon = new GroupCard ("Pentagon", "Government Violent Strait", "None", 6, 6, 2, 3, 1, 58);
		Card phoneComp = new GroupCard ("The Phone Company", "None", "None", 5, 6, 3, 2, 1, 59);
		Card phonePhreaks = new GroupCard ("Phone Phreaks", "Criminal Liberal", "+3 on any attempts to control, neutralize, or destory the Phone Company", 1, 1, 1, 0, 1, 60);
		Card postOffice = new GroupCard ("Post Office", "Government", "None", 4, 3, 1, 1, 1, 61);
		Card proSports = new GroupCard ("Professional Sorts", "Violent Fanatic", "None", 2, 4, 3, 2, 1, 62);
		Card psychiatrists = new GroupCard ("Psychiatrists", "Weird", "None", 0, 6, 2, 0, 1, 63);
		Card punkRockers = new GroupCard ("Punk Rockers", "Weird", "None", 0, 4, 1, 0, 1, 64);
		Card recyclers = new GroupCard ("Recyclers", "Liberal", "Pay 5 MB from this groupu to drawn an extra card on your turn. This is not an action", 2, 2, 3, 1, 1, 65);
		Card republicans = new GroupCard ("Republicans", "Conservative", "None", 4, 4, 4, 3, 1, 66);
		Card robotSeaMon = new GroupCard ("Robot Sea Monsters", "Violent Communist", "None", 0, 6, 2, 0, 1, 67);
		Card sciFiFans = new GroupCard ("Science Fiction Fans", "Weird", "+2 on any attempt to control any Weird group", 0, 5, 1, 0, 1, 68);
		Card semiLibArmy = new GroupCard ("Semiconscious Liberation Army", "Crimal Violent Liberal Weird Communist", "+1 on any attempt to destroy any group", 0, 8, 0, 0, 1, 69);
		Card smof = new GroupCard ("S.M.O.F.", "Weird", "+5 for direct control of S.F. Fans. +2 for direct control of Trekkies", 1, 1, 0, 2, 1, 70);
		Card socForCreativeAnarchism = new GroupCard ("Society for Creative Anarchism", "Violent Weird", "None", 0, 4, 1, 0, 1, 71);
		Card southAmNazis = new GroupCard ("South American Nazis", "Conservative Violent", "None", 4, 6, 2, 2, 1, 72);
		Card survivalists = new GroupCard ("Survivalists", "Conservative Violent Fanatic", "+2 Resistance to all owner's other groups", 0, 6, 2, 0, 1, 73);
		Card tabloids = new GroupCard ("Tabloids", "", "", 0 , 0, 0,0 ,0, 74);
		Card texas = new GroupCard ("Texas", "Violent Conservative Government", "None", 6, 6, 4, 2, 1, 75);
		Card tobAndLiqComp = new GroupCard ("Tobacco & Liquor Companies", "Strait", "None", 4, 3, 3, 2, 1, 76);
		Card trekkies = new GroupCard ("Trekkies", "Weird Fanatic", "None", 0, 4, 3, 0, 1, 77);
		Card triLibCommission = new GroupCard ("Triliberal Commission", "Liberal Strait", "None", 5, 6, 3, 2, 1, 78);
		Card tvPreachers = new GroupCard ("TV Preachers", "Strait Fanatic", "+3 for direct control of the Moral Minority", 3, 6, 4, 2, 1, 79);
		Card underGroundNews = new GroupCard ("UndergroundNewspapers", "Communist Liberal", "None", 1, 5, 0, 1, 1, 80);
		Card unitedNations = new GroupCard ("The United Nations", "Liberal", "None", 1, 3, 3, 1, 1, 81);
		Card videoGames = new GroupCard ("Video Games", "None", "+3 for direct control of Convenience Stores", 2, 3, 7, 1, 1, 82);
		Card yuppies = new GroupCard ("Yuppies", "Conservative", "None", 1, 4, 5, 1, 1, 83);
}
}