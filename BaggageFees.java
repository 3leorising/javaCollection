import java.util.Scanner;

public class BaggageFees {

    public static double calculateMyBaggageFees(int numOfBags, int numOfPassengers) {
        //this value method calculates the excess bag fees, excluding 2 free bags per passenger
        
        // 3. calculate the fees
        final int freeBagsPerPass = 2; 
        int numOfFreeBags = numOfPassengers * freeBagsPerPass; //this calculates the free bags that will be excluded from the final price
        int excessBags = numOfBags - numOfFreeBags; //this excludes the free bags from the final price

        final double excessBagFee = 75.00; //this is the fee for each excess bag each passenger carries
        final double noExcessBags = 0.00; //this is just in case there are no excess bags. There will be no fee

        double totalBagFees = excessBagFee * excessBags; //this calculates the baggage fee
        if (totalBagFees > 0)
        {
            return totalBagFees; //the total baggage fee will be returned to the main method
        } else return noExcessBags; //if the total turns out to be $0.00, then that will be returned to the main method instead

    }

    public static void main(String [] args) {
        // 1A. Create integers to store the number of Passengers and also the total number of bags
        int numOfPassengers, numOfBags;

        // 1B. Prompt for the number of passengers on a ticket.
        System.out.print("Enter number of passengers on your ticket: ");
        Scanner input = new Scanner(System.in); //this Scanner sets up what will accept the user's input
        numOfPassengers = input.nextInt();

        // 1C. Prompt for the total number of bags for all passengers on a ticket.
        System.out.print("Enter number of bags for this ticket: ");
        numOfBags = input.nextInt();
        input.close();

        // 2. Pass the number of passengers and the number of bags to a value method
        double baggageFees = calculateMyBaggageFees(numOfBags, numOfPassengers);

        // 3.  Display the cost for baggage.
        System.out.printf("The cost for baggage will be $%.2f", baggageFees);
    }
    
}
