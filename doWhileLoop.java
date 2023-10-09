import java.util.Scanner;

public class doWhileLoop 
{
    public static void main(String [] args )
    {
        //1. Create a String variable named menuChoice. 
        String menuChoice;
        Scanner input = new Scanner(System.in); //this Scanner sets up what will accept the user's input

        //2. Display 3 options for your program inside a do-while loop, then a statement asking for an answer
        do 
        {
            System.out.println("A. Buy stock");
            System.out.println("B. Sell stock");
            System.out.println("X. Exit");
            System.out.print("Enter your selection: ");
            
            //3. Prompt for the value menuChoice.
            menuChoice =  input.nextLine();
            
            if (menuChoice.equals("A"))
            {
                System.out.println("Buy stock");
            } else
            if (menuChoice.equals("B"))
            {
                System.out.println("Sell Stock");
            } else
            {
                System.out.println("Invalid Selection");
            }
        } while (!menuChoice.equals("X"));
        input.close();
    }
}