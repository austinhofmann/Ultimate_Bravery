import java.util.Random;


public class items {

	public String name; 
	public String iconUrl;
	public String availability;
	public String tier;
	public String stats;
	public String passive1;
	public String passive2;
	public String passive3;
	public String passive4;
	public String passive5;
	public String menu;
	public String itemCost;
	public String sellValue;
	
	
		
	public int id;
	public static items[] itemsArray = new items[100];
	
	//Method to get random boots. High must be 1 higher than the desired index
	//VALID INDEXES ARE 1 TO 6
	public static int getBoots(){
		Random r = new Random();
		int Low = 1;
		int High = 7;
		int R = r.nextInt(High-Low) + Low;
		return R;
	}
	
	//Constructor
	public items(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String k, String l, String m){
		name = a;
		iconUrl = b;
		availability = c;
		tier = d;
		stats = e;
		passive1 = f;
		passive2 = g;
		passive3 = h;
		passive4 = i;
		passive5 = j;
		menu = k;
		itemCost = l;
		sellValue = m;
	}
	
	//Methods to return Strings for items
	public static String getName(items a){
		return a.name;
	}
	
	public static String getIconUrl(items a){
		return a.iconUrl;
	}
	
	public static String getAvailability(items a){
		return a.availability;
	}
	
	public static String getTier(items a){
		return a.tier;
	}
	
	public static String getStats(items a){
		return a.stats;
	}
	
	public static String getPassive1(items a){
		return a.passive1;
	}
	
	public static String getPassive2(items a){
		return a.passive2;
	}
	
	public static String getPassive3(items a){
		return a.passive3;
	}
	
	public static String getPassive4(items a){
		return a.passive4;
	}
	
	public static String getPassive5(items a){
		return a.passive5;
	}
	
	public static String getMenu(items a){
		return a.menu;
	}
	
	public static String getItemCost(items a){
		return a.itemCost;
	}
	
	public static String getSellValue(items a){
		return a.sellValue;
	}

	
	
	public static void main(String[] args) {
		
		
		itemsArray[0] = new items("Boots of Speed", "http://img1.wikia.nocookie.net/__cb20130319090217/leagueoflegends/images/4/4e/Boots_of_Speed_item.png", "Common", "Basic", null, "Unique - Enhanced Movement: +25 movement speed", null, null, null, null, "Movement", "325g", "227g");
		itemsArray[1] = new items("Berserker's Greaves", "http://img4.wikia.nocookie.net/__cb20130116005955/leagueoflegends/images/b/bd/Berserker%27s_Greaves_item.png", "Common", "Advanced", "+20% atttack speed", "Unique - Enhanced Movement: +45 movement speed", null, null, null, null, "Attack > Attack Speed \nMovement", "900g (175g)", "630g");
		itemsArray[2] = new items("Boots of Mobility", "http://img2.wikia.nocookie.net/__cb20130319090211/leagueoflegends/images/9/90/Boots_of_Mobility_item.png", "Common", "Advanced", null, "Unique - Enhanced Movement: +25 movement speed. Increases to +105 movement speed when out of combat for 5 seconds.", null, null, null, null, "Movement", "800g (475g)", "560g");
		itemsArray[3] = new items("Boots of Swiftness", "http://img2.wikia.nocookie.net/__cb20130319090224/leagueoflegends/images/6/69/Boots_of_Swiftness_item.png", "Common", "Advanced", null, "Unique - Enhanced Movement: +60 movement speed.", "Unique - Slow Resist: Movement slowing effects are reduced by 25%", null, null, null, "Movement", "1000g (675g)", "700g");
		itemsArray[4] = new items("Mercury's Treads", "http://img1.wikia.nocookie.net/__cb20130319090758/leagueoflegends/images/9/96/Mercury%27s_Treads_item.png", "Common", "Advanced", "+25 magic resistance", "Unique - Enhanced Movement: +45 movement speed", "Unique - Tenacity: the duration of stuns, slows, taunts, fears, silences, blinds, and immobilizes are reduced by 35%.", null, null, null, "Defense > Magic Resist \nMovement", "1200g (475g)", "840g");
		itemsArray[5] = new items("Ninja Tabi", "http://img2.wikia.nocookie.net/__cb20130319091031/leagueoflegends/images/3/35/Ninja_Tabi_item.png", "Common", "Advanced", "+25 armor", "Unique - Enhanced Movement: +45 movement speed.", "Unique: Blocks 10% of the damage from basic attacks.", null, null, null, "Defense > Armor \nMovement", "1000g (375g)", "700g");
		itemsArray[6] = new items("Sorcerer's Shoes", "http://img2.wikia.nocookie.net/__cb20130319091505/leagueoflegends/images/6/60/Sorcerer%27s_Shoes_item.png", "Common", "Advanced", "+15 magic penetration", "Unique - Enhanced Movement: +45 movement speed.", null, null, null, null, "Movement", "1100g (775g)", "770g");

		
		
		System.out.println("done creating items");
	}


}