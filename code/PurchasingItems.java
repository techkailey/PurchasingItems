// Kailey Bergeron
// September 28th, 2021

import java.util.Scanner;

public class PurchasingItems { //purchasing items for the Kailey Show
	public static void main(String[] args) { // indicate method main

		Scanner input = new Scanner(System.in);
		
		// initialize variables 
		double currentMoney = 50.50; //amount that the user currently has to spend.
		double total = 0; // amount spent
		double tickets = 12.50; // declare price of each ticket
		double popcorn = 4.75; // declare price of each oder of popcorn
		double drinks = 3.25; // declare price of each drink
		boolean enter = true; // boolean variable to exit loop
		int ticketTotal = 0; // variable used to count amount of tickets purchased
		int popcornTotal = 0; // variable used to count amount of popcorn purchased
		int drinkTotal = 0; // variable used to count amount of drinks purchased

		System.out.println("Welcome to the Kailey Show!"); // 

		while (enter == true) { // total can not be greater than 40
			// menu, output the user information about the prices of the products
			System.out.println("Type the number of the option you would like. To finish making purchases, type 5");
			System.out.println("Purchase three tickets, get the fourth one half off!");
			System.out.println("1) one ticket (12.50), when purchasing four or more (6.50)"); // formatted print to adjust ticket price in command window
			System.out.println("2) large popcorn (4.75)");
			System.out.println("3) large drink (3.25)");
			// get input from the user on what they would like to purchase
			System.out.println("What would you like to purchase?");
			int purchase = input.nextInt();
			// create a way for the user to escape loop
			if ( purchase == 5) {
				enter = false; // boolean expression
			}
			// if statement, prints out quantity of items
			if (purchase == 1) {
				// if statement for ticket selection
				System.out.println("How many tickets would you like to purchase?");
				int ticketAmount = input.nextInt(); // initialize ticket amount
				// when purchasing 4 or more tickets, the user gets half off 
				if (ticketAmount >= 4){
					tickets /= 2; // divide ticket price by two
				}
				ticketTotal = ticketTotal + ticketAmount; // use equation to get the total amount of tickets purchased
				double costTickets = ticketAmount * tickets; // to find the cost of the tickets, multiply the amount of tickets by the price of the tickets
				total += costTickets; // add the costs of the tickets to the total amount spent
				currentMoney = currentMoney - costTickets; //the user balance is equal to the starting balance subtracted by the cost of the tickets
				if (ticketAmount >= 4) { // bring ticket price back to original price before discount
					tickets *= 2;
				}
				if (currentMoney <= 0){ 
					// if user balance is less than or equal to zero
					System.out.println("You do not have enough money to purchase this item.");
					// add costTickets back to the user balance because the input cannot be used 
					currentMoney = currentMoney + costTickets; 
				}
				System.out.printf("Your balance is: $%.2f%n", currentMoney); // display user balance
			}
			if (purchase == 2) { // if statement for popcorn selection 
				System.out.println("How many orders of large popcorns would you like?");
				//initialize the variable for the quanitiy of popcorn orders
				int popcornAmount = input.nextInt();
				popcornTotal = popcornTotal + popcornAmount; // popcornTotal is the total amount of popcorn purchased by the user
				double costPopcorn = popcornAmount * popcorn; // the cost  of the popcorn is the amount multiplied by the price
				total += costPopcorn; // add the total amount spent on popcorn to the total spent all together
				currentMoney = currentMoney - costPopcorn; // subtract the amount spent on popcorn from the user balance to get new balance
				if (currentMoney <= 0){ // new user balance cannot be less than or equal to zero
					System.out.println("You do not have enough money to purchase this item.");
					// add costPopcorn back to the user balance because the input cannot be used
					currentMoney = currentMoney + costPopcorn; 
				}
				System.out.printf("Your balance is: $%.2f%n", currentMoney); //diplay user balance on command window
			}
			if (purchase == 3) { // if statement for drink selection 
				System.out.println("How many large drinks would you like?");
				int drinkAmount = input.nextInt(); // initialize variable for number of drinks purchased 
				drinkTotal = drinkTotal + drinkAmount; 
				double costDrink = drinkAmount * drinks; //the total cost for the drinks is the amount of drinks purchased multiplied by the price of each drink
				total += costDrink; // add total amount spent on drinks to the total spent all together
				currentMoney = currentMoney - costDrink; // subtract amount spent on drinks from the user balance to get new balance
				if (currentMoney <= 0){ // new user balance cannot be less than or equal to zero
					System.out.println("You do not have enough money to purchase this item.");
					// add costDrink back to the user balance because input cannot be used
					currentMoney = currentMoney + costDrink;
				}
				System.out.printf("Your balance is: $%.2f%n", currentMoney);
			}
		} 		
		// end of shopping, display items purchased
		System.out.println("Thank you, enjoy the show!");
		System.out.printf("Your balance is: $%.2f%n", currentMoney); // remaining balance after purchases
		System.out.printf("Purchased: %d tickets%n", ticketTotal); // total ampunt of tickets purchased 
		System.out.printf("Purchased: %d orders of popcorn%n", popcornTotal); // total amount of popcorn purchased 
		System.out.printf("Purchased: %d drinks%n", drinkTotal); // total amount of drinks purchased
	} // end main method 
} // end of class HW2