import java.util.Scanner;

public class TripPlanner 
{
    public static double timeToTravel(double milesToTravel, double travelSpeedMPH)
    {
        //5a. create a double variable named result.
        double result;

        //5b. This method needs to divide the milesToTravel by the travel speed and store this in the result variable.
        result = (milesToTravel) / (travelSpeedMPH);

        //5c. This method should be called from main() and return the result variable and the main method should display the result.
        return result;
    }
    public static void main(String [] args)
    {
        //1: create double variables
        double milesToTravel, travelSpeedMPH, travelMPG;

        //2. Prompt for the number of miles to travel and store it in the milesToTravel double variable.
        Scanner input = new Scanner(System.in); //this Scanner sets up what will accept the user's input
        System.out.print("Enter number of miles to travel: ");
        milesToTravel =  input.nextDouble();

        //3. Prompt for the travel speed and store it in the travelSpeedMPH double variable.
        System.out.print("Enter travel speed (MPH): ");
        travelSpeedMPH =  input.nextDouble();

        //4. Prompt for the travelMPG and store it in the travelMPG double variable .
        System.out.print("Enter travel MPG: ");
        travelMPG =  input.nextDouble();
        input.close();

        //5c. timeToTravel should be called from main() and return the result variable and the main method should display the result.
        //        double baggageFees = calculateMyBaggageFees(numOfBags, numOfPassengers);
        travelMPG = timeToTravel(milesToTravel, travelSpeedMPH);
        //        System.out.printf("The cost for baggage will be $%.2f", baggageFees);
        System.out.print("Time to travel will take " + travelMPG + " hours");
    }
}
