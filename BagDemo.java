
import java.util.Scanner;
public class BagDemo {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		Bag myBag = new Bag();
		int option;
		do {
			System.out.println("Press 1 to change the name of the bag.");
			System.out.println("Press 2 to add an item to the bag.");
			System.out.println("Press 3 to change the  maximum weight of the bag.");
			System.out.println("Press 4 to view all information about the bag.");
			System.out.println("Press 5 to end the program.");
			option = keyboard.nextInt();
			
			if(option == 1) {
				System.out.println("Whats the name of the bag?");
				String newName = keyboard.next();
				
				myBag.setName(newName);
			}
			else if(option == 2) {
				System.out.println("Enter the weight of the item.");
				double newWeight = keyboard.nextDouble();
				
				myBag.addItem(newWeight);
			}
			else if(option == 3) {
				System.out.println("Enter the new maximum weight.");
				double newMaximumWeight = keyboard.nextDouble();
				
				myBag.setMaximumWeight(newMaximumWeight);
			}
			else if(option == 4) {
				System.out.println("Name of the bag: " + myBag.getName());
				System.out.println("Current weight of the bag: " + myBag.getCurrentWeight());
				System.out.println("Maximum weight of the bag: " + myBag.getMaximumWeight());
			}
			else if(option == 5) {
				System.out.println("Goodbye!");
			}
			else if(option < 1 || option > 5) {
				System.out.println("Error! You only have 5 options!");
			}
		}while(option != 5);
		
	 }
}
