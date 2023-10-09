public class AgeIn2030 
{
    public static void main(String[] args) 
    {
        String name = "Seleena"; //creaing and assigning variables
        int year = 2030;
        int currentYear = 2022;
        int currentAge = 18;
        int newAge;

        newAge = (currentAge +  (year  -  currentYear)); //this value will be stored in the integer variable (newAge)

        //Display "<student> will be age <age> in the year <year2030>" 
        System.out.println(name + " will be age " + newAge + " in the year " + year);
    }
}
