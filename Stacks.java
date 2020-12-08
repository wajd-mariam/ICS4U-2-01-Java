/*
* Copyright (c) 2020
*
* The Stack file adds integer added by the 
* user to the stack array.
* 
* @author  Wajd Mariam
* @version 1.0
* @since   2020/12/07
*/

// Imports Java Classes:
import java.util.Scanner;


class Stacks {
  public static void main(String[] args) {

    // Declaring the stackArray using WajdStack Class
    WajdStack stackArray = new WajdStack();
    // Try Catch Statement:
    try {
      // Input
      // Getting an integer from the user:
      Scanner input1 = new Scanner(System.in);
      System.out.print("Enter a number to add to the stack: ");
      int userInput = input1.nextInt();

      // Process
      // Pushing the integer inputted  to the stack:
      stackArray.push(userInput);

      // Output
      // ASsuring that the integer was added to the stack:
      System.out.println("The number " + stackArray.addedNumber() + " has been pushed.");
      // Error Catch statement:
    } catch (Exception e) {
      System.out.println("An error occured"); 
    }
  }
}