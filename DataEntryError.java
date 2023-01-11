import java.util.*;


/**
   Simple program asks a user for their age, expecting an integer response
*/

public class DataEntryError
{
   public static void main(String[] args) 
   {
   
            int age;
      
            System.out.println("How old are you?");
            age = getAge();
            while (age <= 0 || age > 125)
            {
                System.out.println("Please enter a valid age.");
                age = getAge();
            }
            System.out.println(age + " is a great age to be!");
            
         
   }
   
   public static int getAge()
   {
      Scanner kb = new Scanner(System.in);
      int age;
      
      
         /***************************************************************
         /
         /    TASK:
         /
         /       The assignment of the age variable relies on correct user input.
         /       If the user enters characters instead of digits, a runtime.  
         /       error causes the program to stop immediately.
         /
         /       Note that this will not cause
         /       a syntax error when you compile your program!!!
         /      
         /       To catch this and exit gracefully, add a try clause
         /       BEFORE the assignment of the age variable.
         /
         /       Add a catch clause for a generic exception and let the
         /       user know they must enter a whole number only.  Then, set 
         /       age to 0 and let your program continue, picking up on the
         /       validation loop.
         /*****************************************************************/
         try
         {
            age = kb.nextInt();
         }   
         
           /***************************************************************
         /
         /    TASK:
         /
         /       Add a catch clause here for a generic exception and let the
         /       user know they must enter a whole number only.  Then, set 
         /       age to 0 and let your program continue, returning the value
         /        of age to main() where it is then validated.
         /*****************************************************************/
         
         catch(Exception e)
         {
        
              age = 0;

                 
         }

         
         //If anything other than a number is entered, the catch clause should set
         //the age to 0.
         
         //Once age is set - either what is entered by the user OR a 0 set by the
         //catch clause, return it
                  return age;
   }
      
   
}
   
   