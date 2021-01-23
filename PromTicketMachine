import java.util.Scanner;
import java.util.ArrayList;

class studentList {
	public String[] participantName;
	public String participantClass;
	public String participantNumber;
	public String groupSize;
}

public class PromTicketAssign {
	public static String generatePassword(int passwordStrength) { 
		String password = "", characters = "ADCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		
		for (int i = 0; i < passwordStrength; i++) { //select a random character
			if (i % 5 == 0 && i > 0) password += "-";
			int rand = (int) (Math.random() * characters.length());
			password += characters.substring(rand, rand + 1);
		}
		return password;
	}

	public PromTicketAssign() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String[] fPrice = new String[] { "$65.00", "$98.00", "$163.00" };
		String[] sPrice = new String[] { "$55.00", "$83.00", "$138.00" };
		String[] jPrice = new String[] { "$45.00", "$68.00", "$113.00" };
		String[] snPrice = new String[] { "$40.00", "$60.00", "$100.00" };
		
		
		String[] classOptions = new String[] { "Freshman", "Sophomore", "Junior", "Senior" };
		String ticketClass = "";
		ArrayList<studentList> classList = new ArrayList<studentList>();
		
		String finalPrice = "";
		
		//Ask for name
		Scanner input = new Scanner(System.in);
		int saleCount = 0;
		
		while (true) {
			System.out.println("Welcome to the Prom Ticket Station! What would you like to do? \n"
					+ "  - 1: Add student to list \n"
					+ "  - 2: View list \n"
					+ "  - 3: Terminate program");
			//get input
			String userAction = input.nextLine();
			
			if (userAction.equals("3")) break; //end program
			
			//List all students, student numbers, and number of guests
			if (userAction.equals("2")) {
				System.out.println("Student List: \n "
						+ "");
				for (int i = 0; i < classList.size(); i++) {
					System.out.println("  - Student Name: " + classList.get(i).participantName[0] + " " + classList.get(i).participantName[1] 
							+ ", Student Number: " + classList.get(i).participantNumber + ", Group Size: " + classList.get(i).groupSize);
					System.out.println();
				}
			}
			//Add student to list
			if (userAction.equals("1")) {
				classList.add(new studentList());
				System.out.println("What is the name of the student? \n"
						+ "  - [example: \'John Doe]\'");
				
				classList.get(saleCount).participantName = input.nextLine().split(" ");
				System.out.println("Thank you! Which class ticket will they be purchasing?");
				
				boolean selectedCorrectly = false;
				
				while (!selectedCorrectly) {
					System.out.println("  - Freshman \n"
							+ "  - Sophomore \n"
							+ "  - Junior \n"
							+ "  - Senior \n");
					classList.get(saleCount).participantClass = input.nextLine();
					
					for (int i = 0; i < 4; i++) {
						if (classList.get(saleCount).participantClass.toUpperCase().equals(classOptions[i].toUpperCase())) {
							selectedCorrectly = true;
							break;
						}
					}
					//return
					if (selectedCorrectly) break;
					System.out.println("Please select one of the following options..");
				}
				
				selectedCorrectly = false;
				
				while (!selectedCorrectly) {
					System.out.println("You've selected " + classList.get(saleCount).participantClass + "! \n"
							+ "How many guests will you be bringing? \n"
							+ "  - They may bring up to 4 guests.");
					
					classList.get(saleCount).groupSize = input.nextLine();
					
					for (int i = 1; i < 5; i++) {
						if (classList.get(saleCount).groupSize.equals(String.valueOf(i))) {
							selectedCorrectly = true;
							break;
						}
					}
					//return
					if (selectedCorrectly) break;
				}
				
				if (classList.get(saleCount).participantClass.toUpperCase().equals("FRESHMAN")) {
					if (classList.get(saleCount).groupSize.equals("1")) finalPrice = fPrice[0];
					if (classList.get(saleCount).groupSize.equals("2")) finalPrice = fPrice[1];
					if (classList.get(saleCount).groupSize.equals("3")) finalPrice = fPrice[2];
					if (classList.get(saleCount).groupSize.equals("4")) finalPrice = fPrice[2];
				}
				if (classList.get(saleCount).participantClass.toUpperCase().equals("SOPHOMORE")) {
					if (classList.get(saleCount).groupSize.equals("1")) finalPrice = sPrice[0];
					if (classList.get(saleCount).groupSize.equals("2")) finalPrice = sPrice[1];
					if (classList.get(saleCount).groupSize.equals("3")) finalPrice = sPrice[2];
					if (classList.get(saleCount).groupSize.equals("4")) finalPrice = sPrice[2];
				}
				if (classList.get(saleCount).participantClass.toUpperCase().equals("JUNIOR")) {
					if (classList.get(saleCount).groupSize.equals("1")) finalPrice = jPrice[0];
					if (classList.get(saleCount).groupSize.equals("2")) finalPrice = jPrice[1];
					if (classList.get(saleCount).groupSize.equals("3")) finalPrice = jPrice[2];
					if (classList.get(saleCount).groupSize.equals("4")) finalPrice = jPrice[2];
				}

				if (classList.get(saleCount).participantClass.toUpperCase().equals("SENIOR")) {
					if (classList.get(saleCount).groupSize.equals("1")) finalPrice = snPrice[0];
					if (classList.get(saleCount).groupSize.equals("2")) finalPrice = snPrice[1];
					if (classList.get(saleCount).groupSize.equals("3")) finalPrice = snPrice[2];
					if (classList.get(saleCount).groupSize.equals("4")) finalPrice = snPrice[2];
				}
				classList.get(saleCount).participantNumber = generatePassword(10);

				
				System.out.println(classList.get(saleCount).participantName[0] + " " + classList.get(saleCount).participantName[1]
						+ " purchased a " + classList.get(saleCount).participantClass.toLowerCase() + " ticket for " + finalPrice 
				+ ". The confirmation number for this sale is " + classList.get(saleCount).participantNumber + ".");
				
				saleCount++;
			}
		}
	}
}
