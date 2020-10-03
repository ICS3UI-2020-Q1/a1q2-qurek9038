import java.util.Scanner;
/**
 *This program asks the user for two numbers and then calculates the quotient of that number and the remainder
 * @author Khazina
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create a Scanner for user input
    Scanner input = new Scanner(System.in);

    //Ask the user for two integers 
    System.out.println("Please enter in two integers, on seperate lines, to divide.");

    //Get the users first integer
    int firstIn = input.nextInt();

    //Get the users second integer
    int secondIn = input.nextInt();

    //Determine variable and calculate the quotient
    int quotient = firstIn / secondIn;

    //Determine variable and calculate the remainder
    int remainder = firstIn % secondIn;

    //Display the final answer and remainder 
    System.out.println (firstIn + "/" + secondIn + " is " + quotient + " with a remainder of " + remainder + ".");



    
  }
}
