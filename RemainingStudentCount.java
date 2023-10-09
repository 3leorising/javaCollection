public class RemainingStudentCount 
{
    public static void main(String[] args) 
    {
        String name = "Seleena"; //instructed variable assignments
        int totalStudents = 66;
        
        //If NCTC floor 5 has X number of classrooms that each have a maximum number of 20 students per classroom.

        //Calculate the number of full class rooms that are needed to support this number.
        int fullRooms = 66 / 20;

        //Calculate the number of students who do not make up a full class room. ( Use Modulus)
        int remainingStudents = 66 % 20;

        //Display your name, the number of students enrolled, the number of full classrooms and the number of remaining students
        System.out.println("My name is " + name + ". NCTC's 5th floor has " + totalStudents + " students. There are " + fullRooms + " full rooms, and " + remainingStudents + " remaining students");

    } 
}
