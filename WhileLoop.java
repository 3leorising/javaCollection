import java.util.Scanner;

public interface WhileLoop {

    public static void main(String [] args )
    {
        //Step 1: Create an int variable named currentBalance and assign it the value of 0.
        int currentBalance = 0;

        //Step 2: Create an int variable named amountToSaveEachMonth.
        int amountToSaveEachMonth;

        //Step 3: Prompt "Enter amount to save each month:" and assign the result to the int variable in step 2.
        Scanner input = new Scanner(System.in); //this Scanner sets up what will accept the user's input
        System.out.print("Enter amount to save each month: ");
        amountToSaveEachMonth =  input.nextInt();

        //Step 4: Create an int variable name numberOfMonthsToSave.
        int numberOfMonthsToSave;

        //Step 5: Prompt "Enter the number of months to save:" and store the input value into the variable in step 4.
        System.out.print("Enter the number of months to save: ");
        numberOfMonthsToSave =  input.nextInt();
        input.close();

        //Step 6: Create an int variable named currentSavingsMonth and assign it the value of 1.
        int currentSavingsMonth = 1;

        //Step 7: Using a while loop, do the following while the currentSavingsMonth <= numberOfMonthsToSave
        while (currentSavingsMonth <= numberOfMonthsToSave)
        {
            //Step 7a: Add the amountToSaveEachMonth to the current balance.
            currentBalance = currentBalance + amountToSaveEachMonth;

            //Step 7b: Display the currentSavingsMonth and the current balance
            System.out.println("For month " + currentSavingsMonth + ", the balance is $" + currentBalance);

            //Step 7c: Add 1 to the currentSavingsMonth
            //note to self: dont forget to add the iteration next time you make a loop. you nearly broke your laptop by playing an infinite loop when you ran the program at Step 7b....
            currentSavingsMonth++;
        }
    }
    
}
