public class DriveACar 
{
    public static void seatbeltMirrors()
    {
        System.out.println("Strap seat belt, check mirrors");
        //Step 1: Create a method that displays "Strap seat belt, check mirrors".
    }

    public static void driveToDestination()
    {
        System.out.println("Drive to destination....");
        //Step 2: Create a method that displays "Drive to destination....".
    }
    public static void unlockCar()
    {
        System.out.println("Unlock your car");
        //Step 3: Create a method that displays "Unlock your car".
    }

    public static void startEngine()
    {
        System.out.println("Start car's engine");
        //Step 4: Create a method that displays "Start car's engine".
    }

    public static void findCar()
    {
        System.out.println("Find your car");
        //Step 5:  Create a method that displays "Find your car".
    }

    public static void searchAddress()
    {
        System.out.println("Give address to GPS");
        //Step 6: Create a method that displays "Give address to GPS".
    }

    public static void main(String[] args)
    {
        //Step 7: Call each of these methods from main() in the order that you believe these tasks should be done.
        findCar(); //step 5
        unlockCar(); //step 3
        startEngine(); //step 4
        seatbeltMirrors(); //step 1
        searchAddress(); //step 6
        driveToDestination(); //step 2


    }
}
