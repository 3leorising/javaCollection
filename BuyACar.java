import java.util.Scanner;

public class BuyACar {

    public static void calcTotal(String carModel, double monthlyPayment, int months)
    {
        //Create a void method (Per Chapter 4) that has the 3 parameters: Car model, Montly payment, and number of months

        //The method in step 2 should calculate my total costs( MonthlyPayment* Nbrof Months).
        double totalCost = (monthlyPayment) * (months);

        //Display the message: "I am looking for a <CarModel> car that I can pay <MonthlyPayment> per month for <NbrOfMonths> months. My total cost would be <Step3Result>"
        System.out.print("I am looking for a " + (carModel));
        System.out.printf(" car that I can pay $%.2f", (monthlyPayment));
        System.out.print(" per month for " + (months) + " months. ");
        System.out.printf("My total cost would be $%.2f", totalCost); //make sure the total cost is formatted to 2 decimal places
    }

    public static void main(String [] args) {
        //Create a variable for a car model
        String carModel;
        
        //Prompt for a car model, then assign the input to the car model variable
        Scanner input = new Scanner(System.in); //this Scanner sets up what will accept the user's input

        System.out.print("Enter a car model: ");
        carModel =  input.nextLine(); //this assigns the car model variable with the input
        
        //Create a variable to store your Expected Monthly Payment.
        double monthlyPayment;

        //Prompt for the Expected Monthly Payment and assign the input to this variable.
        System.out.print("Enter the expected monthly payment: $");
        monthlyPayment = input.nextDouble();

        //Create a variable to store the number of months you plan to make payments. 
        int months;

        //Prompt for the number of payments and assign the input to this variable.
        System.out.print("Enter the number of months you plan to make payments: ");
        months = input.nextInt();
        input.close();


        //Call the void method
        //printTime(hour, minute);
        calcTotal(carModel, monthlyPayment, months);


    }
    
}
