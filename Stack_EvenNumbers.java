/**
 * Create a program that will input 10 Even Numbers and display
 * the first number that you entered from the stack.
 */

import java.util.*;

public class Stack_EvenNumbers {
    public static void main(String[] args) {
        Stack <Integer> stackEven = new Stack <Integer>();
        Scanner input = new Scanner(System.in);
        int intEvenNumber;
        boolean isInvalid;
        
        System.out.print("\n\n");
        for(int intIteration = 1; intIteration <= 10; intIteration++){
            do {
                isInvalid = false;
                System.out.print("Enter an even number " + intIteration + ": ");
                intEvenNumber = input.nextInt();

                if (intEvenNumber % 2 == 0)
                    stackEven.add(intEvenNumber);
                else {
                    System.out.println("\n\t>> Not an even number.\n");
                    isInvalid = true;
                }
            } while (isInvalid);
        }
        System.out.println("\nStack: " + stackEven);
        System.out.println("\n\tThe first number entered is: " + stackEven.firstElement());

        input.close();
    }
}