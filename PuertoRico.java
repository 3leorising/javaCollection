import java.util.Scanner;

public class PuertoRico 
{
    public static void main(String[] args)
    {
        //IMPORTANT INFO: An area of San Juan PR has a zip code of 00901 and a sales tax of 6%.

        
        //Step 1: create numeric variable to store a 5 digit zipcode
        int intZipCode;
        Scanner input = new Scanner(System.in); //a Scanner accepts keyboard input. This sets one up for this program :3

        //Step 2: prompt for San Juan zipcode
        System.out.print("Type the San Juan zipcode: ");
        intZipCode = input.nextInt(); //the scanner is recording the keyboard input! :D
        input.close();

        //Step 3: display the **unformatted** zipcode
        System.out.println("The unformatted zipcode is: " + intZipCode);

        //Step 4: Format and display the zip Format and display the zip code so that it has leading zeros and a size of 5code so that it has leading zeros and a size of 5
        System.out.printf("The formatted zipcode is: %05d", intZipCode);     //I didn't search it up, but it looks like %05d means 05 digits. DID I GET IT RIGHT? :3 
        System.out.println(); //this is just to send the next incoming text to the next line.

        //Step 5: My hotel charge is $55.00  Store this in a constant.
        final double HOTEL_CHARGE = 55.00; //this number will NEVER change (unless the economy changes). its in caps lock to differnetiate it!

        //Step 6: Create a double variable for my total cost.
        double totalCost; //this variable will likely change, so DONT assign it as a constant

        //Step 7: Calculate my total cost by multiplying my hotel charge by 1.06
        totalCost = HOTEL_CHARGE * 1.06; //the * sign is a multiplication sign. Idk what the 1.06 is supposed to represent...

        //Step 8: Display the unformatted total cost.
        System.out.println("The unformatted total cost is: $" + totalCost);

        //Step 9: Format and display the total cost rounded to 2 decimal places.
        System.out.printf("The formatted total cost is: $%.2f", totalCost);



    }
}
