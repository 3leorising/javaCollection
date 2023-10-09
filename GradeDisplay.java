import java.util.Scanner;

public class GradeDisplay 
{
    public static void main(String [] args) 
    {
        // 1. Create a short integer  to store a grade.
        short grade;

        //2. Prompt for a grade ( 0-100).
        System.out.println("Enter grade (0-100): ");

        Scanner input = new Scanner(System.in); //this Scanner sets up what will accept the user's input
        //carModel =  input.nextLine(); //this assigns the car model variable with the input
        grade = input.nextShort();
        input.close();

        //3. Based on the grade given, use IF statements to display the letter grade associated with the numeric grade.
        if (grade >= 90 && grade <= 100)
        {
            System.out.println("The letter grade is A");
        } else
        if (grade >= 80 && grade <= 89)
        {
            System.out.println("The letter grade is B");
        } else
        if (grade >= 70 && grade <= 79)
        {
            System.out.println("The letter grade is C");
        } else
        if (grade >= 60 && grade <= 69)
        {
            System.out.println("The letter grade is D");
        } else
        if (grade <= 59)
        {
            System.out.println("The letter grade is F");
        }
    }
}
