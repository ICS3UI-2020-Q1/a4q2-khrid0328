import java.util.Scanner;
/**
 * This program will prompt the user to enter in a positive integer. It will keep doing this until the user enters in a negative integer.
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // create scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for a positive integer or a negative integer to quit.
    System.out.println("Please enter a positive integer. Enter a negative integer to quit.");

    // create a variable for user input
    int integer = input.nextInt();

    // using a loop to keep the program running or quit
    while(integer > 0 ){

      System.out.println("Please enter a positive integer. Enter a negative integer to quit.");

      // initialize another variable for user input
      integer = input.nextInt();
      
    } System.out.println("All done!");
  }  
}

