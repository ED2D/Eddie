
public class AboutMeScript {
	//store all information in an array
	static String info[] = { "Name: Eddie Hunter", "Age: 17", "Occupation: Retail Worker, Student", "Favorite activities: Making games on free time"};
	
	public static void main(String args[]) {
		//run a for loop that logs each part of my information, then create a space between each information
		for (int i = 0; i < info.length; i++) {
			System.out.println(info[i]);
			System.out.println();
		}
	}
}