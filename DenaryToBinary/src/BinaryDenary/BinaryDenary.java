/*
Caroline Hsu - 2/13/2023 
This programs takes a denary user input and converts it to a binary number and vice versa.
 */
package BinaryDenary;

import java.util.Scanner;

public class BinaryDenary
{

  public static void main(String[] args)
  {
    // declare variables 
    int choice;
    int number;
    String binaryNumber;
    // declare scanner for input
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter 1 to convert binary to denary and 0 for "
        + "denary to binary: ");
    choice = input.nextInt();
    // if the choice wants to conver binary to denary
    if (choice == 1)
    {
      // ask for the binary number
      System.out.println("What is your binary number you would like to convert?");
      binaryNumber = input.next();
      int result = 0;
      int power = 0;
      // loop through for the length and subtract one for iteration
      for (int i = binaryNumber.length() - 1; i >= 0; i--)
      {
        // if the binary number at character at index i is 1
        if (binaryNumber.charAt(i) == '1')
        {
          // use power class for 2 to the resulting power and add one for iteration
          result += power(2, power);
        }
        power++;
      }
      // print result for the users
      System.out.println("Your binary number of " + binaryNumber + " in denary is: " + result);
    }
    else
    {
      // ask for denary number
      System.out.println("What is your denary number you would like to convert?");
      number = input.nextInt();
      String binary = "";
      // while the number input is greater than 0
      while (number > 0)
      {
        // ask for remainder and add to the binary string and divde by two
        binary = (number % 2) + binary;
        number = number / 2;
      }
      // print for the users
      System.out.println("Your denary number of " + number + " converted to binary"
          + " is " + binary);
    }

  }

  // power class because we can't use math class :(
  public static int power(int base, int exponent)
  {
    // for loop to loop through the amount of times the exponenet needs
    int result = 1;
    for (int i = 0; i < exponent; i++)
    {
      result *= base;
    }
    // return the result
    return result;
  }

}
