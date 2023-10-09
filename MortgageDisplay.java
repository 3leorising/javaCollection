import java.util.Scanner;

public class MortgageDisplay 
{
    public static void main(String [] args) {
        //Create a boolean variable to store the Residence requirement. 
        boolean isResident = false;

        //Prompt the user to "Enter 1 if the Home will be the primary residence, or 0 if not the primary residence". Store the result of step 2 into a byte variable.
        Byte result;

        
        Scanner input = new Scanner(System.in); //this Scanner sets up what will accept the user's input
        System.out.print("Enter 1 if the Home will be the primary residence, or 0 if not the primary residence: ");
        result =  input.nextByte();  

        //Set the boolean variable from step 1 to true or false depending on value in step 2.
        if (result == 1)
        {
            isResident = true;
        }

        //Create an int variable to store the credit score.
        int creditScore;

        //Prompt for the credit score and store it in the variable created in step 5.
        System.out.print("Enter your credit score: ");
        creditScore =  input.nextInt();  
        input.close();

        //If the residency and credit score qualify, then display "Qualifies for the loan".  Otherwise display "Does not qualify for the loan".
        if ((isResident == true)  && (creditScore >= 563))
        {
            System.out.print("Qualifies for the Loan.");
        } else
        {
            System.out.print("Does not qualify for the Loan.");
        }
    }
    
}
