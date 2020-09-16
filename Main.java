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
    int firstInteger = input.nextInt();

    //Get the users second integer
    int secondInteger = input.nextInt();

    //
    int pink = firstInteger % secondInteger;

    
  }
}
