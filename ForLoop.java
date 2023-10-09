import java.util.Scanner;


public class ForLoop
{
    public static void main(String [] args )
    {
        double currentBalance;
        double newBalance = 0;
        final double INTEREST_RATE = 1.05;
        int yearCount;

        // Prompt user to input number of years
        Scanner input = new Scanner(System.in); //this Scanner sets up what will accept the user's input
        System.out.println("Number of years to invest: ");
        yearCount = input.nextInt();

        // Prompt user to input the amount they want to invest in
        System.out.println("Amount to invest: ");
        currentBalance = input.nextDouble();

        // Assign currentBalance to newBalance
        currentBalance = newBalance;

        // Adjust and display the year count and its new balance
        for(int i = 1; i <= yearCount ; newBalance = newBalance * INTEREST_RATE)
        {
            System.out.print("\nYear " + i + " balance: ");
            System.out.printf("balance = $%.2f", newBalance);
            i++; // Increase the year number by 1, in order to reach the condition and exit the loop
        }
        input.close(); // this closes the scanner from accepting anymore input

    }
}