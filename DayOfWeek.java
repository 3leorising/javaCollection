import java.util.Scanner;


public class DayOfWeek 
{
    public static void main(String [] args )
    {
        // Create a string array for the days of the week
        String[] DAY_OF_WEEKS;
        DAY_OF_WEEKS = new String[7];
        // Assign each element of the array to a day of the week
        DAY_OF_WEEKS[0] = "Sunday";
        DAY_OF_WEEKS[1] = "Monday";
        DAY_OF_WEEKS[2] = "Tuesday";
        DAY_OF_WEEKS[3] = "Wednesday";
        DAY_OF_WEEKS[4] = "Thursday";
        DAY_OF_WEEKS[5] = "Friday";
        DAY_OF_WEEKS[6] = "Saturday";

        // Prompt the user to enter a value of 1-7 for its assigned day of the week
        int dayInput; // this records the user's input 
        Scanner input = new Scanner(System.in); //this Scanner sets up what will accept the user's input
        System.out.println("Enter a number from 1-7: ");
        dayInput = input.nextInt();
        
        --dayInput; // this adjusts the input value to fit the array's size. Java arrays begin at 0, but I didn't offer 0 as the smallest choice for input. I offered 1 as the smallest choice! This mathy math makes the user's input go down by 1

        // Confirm if the input is within the array's range, then display its associated day of the week. If not, display an error
        if ((dayInput >= 0) && (dayInput <= 6))
        {
            System.out.println(DAY_OF_WEEKS[dayInput]);

        }
        else
        {
            System.out.println("Invalid Entry");
        }
        input.close(); // this closes the scanner from accepting anymore input
    }   
}
