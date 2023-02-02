package java1.michaelellislab6;

import java.util.Scanner;

/**
 * Project created on
 * @author Michael Ellis
 */
public class MichaelEllisLab6 
{

    public static void main(String[] args) 
    {
        boolean keepGoing = true;
        int userSelection, userInput, firstNumber, secondNumber;
        final int maxValue = 12;
        boolean userValue = true;
        char operationChar;
        String operation;
        int userAnswer;
        
        System.out.println("Welcome to Michael Ellis's "
                + "Arithmetic Quiz!");
        
        do {
            System.out.println("Please choose from the following"
                    + " options:");
            System.out.println("1. Addition Quiz");
            System.out.println("2. Multiplication Quiz");
            System.out.println("3. Addition Table");
            System.out.println("4. Multiplication Table");
            System.out.println("5. Exit the Program");
            Scanner keyboard = new Scanner(System.in);
            userSelection = keyboard.nextInt();

            switch(userSelection)
            {
                case 1:do 
                {
                        System.out.println("Please enter a value between 1-12");
                        userInput = keyboard.nextInt();
                        if(userInput > maxValue || userInput <= 0)
                        {
                            userValue = true;
                        } else 
                        {
                            userValue = false;
                        }        
                } while(userValue);
                int gotRight = 0;
                for(int counter = 1; counter <= maxValue; counter++)
                {
                    System.out.println("Please solve for " + userInput
                            + " + " + counter);
                    userAnswer = keyboard.nextInt();
                    int expectedAnswer = userInput + counter;
                    if (userAnswer == expectedAnswer) 
                    {
                        gotRight++;
                    }
                    
                    
                }
                
                System.out.println("You got " + gotRight + " correct answers !");
                
                
                        break;
                case 2: do 
                        {
                            System.out.println("Please enter a value between 1-12");
                        userInput = keyboard.nextInt();
                        if(userInput > maxValue || userInput <= 0)
                        {
                            userValue = true;
                        } else 
                        {
                            userValue = false;
                        }     
                        int gotRightMultiply = 0;
                        for (int newCounter = 0; newCounter <= maxValue; newCounter++)
                        {
                            System.out.println("Please solve for " + userInput + " * " 
                            + newCounter);
                            int newUserAnswer = keyboard.nextInt();
                            int newExpectedAnswer = userInput * newCounter; 
                            if(newUserAnswer == newExpectedAnswer)
                            {
                                gotRightMultiply++;
                            }
                        }
                        System.out.println("You got " + gotRightMultiply + " correct!");
                        
                        } while(userValue);
                        break;
                                               
                case 3: System.out.print("    |");
                        for(int columnHead = 1; columnHead <= maxValue; columnHead++)
                        {
                            System.out.print(columnHead + " ");
                        }
                        System.out.println("\n----+---------------------------");
                        for(int row = 1; row <= maxValue; row++)
                        {
                            System.out.println(row + "|");
                            
                            for (int column = 1; column <= maxValue; column++)
                            {
                                System.out.print(row + column + " ");
                              
                            }
                        }
                        System.out.println();
                        break;
                case 4: System.out.print("    |");
                        for(int columnHead = 1; columnHead <= maxValue; columnHead++)
                        {
                            System.out.print(columnHead + " ");
                        }
                        System.out.println("\n----+---------------------------");
                        for(int row = 1; row <= maxValue; row++)
                        {
                            System.out.println(row + "|");
                            
                            for (int column = 1; column <= maxValue; column++)
                            {
                                System.out.print(row * column + " ");
                              
                            }
                        }
                        System.out.println();
                        break;
                case 5: keepGoing = false;
                        break;
                default: System.out.println("Invalid choice");
                        break;
            }
            
            
            
        } while (keepGoing);
        
        System.out.println("Thank you for using Michael Ellis's"
                + " arithmetic quiz program.");

    }
}
