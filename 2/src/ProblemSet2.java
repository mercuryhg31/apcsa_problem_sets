/**
 * Problem Set 2.
 * 
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         * 
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */
        // System.out.print("\nEnter your first name: "); // first name // TODO uncomment ex 1
        // String firstName = in.nextLine();

        // System.out.print("Enter your last name: "); // last name
        // String lastName = in.nextLine();

        // System.out.print("Enter your grade: "); // grade
        // int grade = in.nextInt();
        // in.nextLine();

        // System.out.print("Enter your age: "); // age
        // int age = in.nextInt();
        // in.nextLine();

        // System.out.print("Enter your hometown: "); // hometown
        // String hometown = in.nextLine();

        // System.out.println("\nNAME\t : " + firstName + " " + lastName);
        // System.out.println("GRADE\t : " + grade);
        // System.out.println("AGE\t : " + age);
        // System.out.println("HOMETOWN : " + hometown);

        /*
         * Exercise 2.
         * 
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */
        // final double dollar = 1.00; // TODO uncomment ex 2 (I GOT THIS CODE TO WORK THE FIRST TIME I TESTED IT, HOLY HELL, WHAT THE HECKKKKK??? I KNOW THIS IS A BAD COMMENT BUT SORRY MR. WILSON, AHHHHHH, I'LL DELETE IT WHEN I SUBMIT, !!!)
        // final double quarter = 0.25;
        // final double dime = 0.10;
        // final double nickel = 0.05;

        // System.out.print("\nEnter a dollar amount: ");
        // double moneyInput = in.nextDouble();
        // in.nextLine();

        // int dollarAmnt = (int) Math.floor(moneyInput / dollar);
        // double leftover = moneyInput % dollar;
        // int quarterAmnt = (int) Math.floor(leftover / quarter);
        // leftover %= quarter;
        // int dimeAmnt = (int) Math.floor(leftover / dime);
        // leftover %= dime;
        // int nickelAmnt = (int) Math.floor(leftover / nickel);
        // leftover %= nickel;
        // int pennyAmnt = (int) (leftover / 0.01);

        // System.out.println("DOLLARS\t: " + dollarAmnt);
        // System.out.println("QUARTERS: " + quarterAmnt);
        // System.out.println("DIMES\t: " + dimeAmnt);
        // System.out.println("NICKELS\t: " + nickelAmnt);
        // System.out.println("PENNIES\t: " + pennyAmnt + "\n");

        /*
         * Exercise 3.
         * 
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */
        // final double tenDollar = 10.00; // TODO uncomment ex 3
        // final double fiveDollar = 5.00;
        
        // System.out.print("\nEnter a dollar amount: ");
        // moneyInput = in.nextDouble();
        // in.nextLine();

        // int tenDollarAmnt = (int) Math.floor(moneyInput / tenDollar);
        // leftover = moneyInput % tenDollar;

        // int fiveDollarAmnt = (int) Math.floor(leftover / fiveDollar);
        // leftover %= fiveDollar;

        // dollarAmnt = (int) Math.floor(leftover / dollar);
        // leftover %= dollar;

        // quarterAmnt = (int) Math.floor(leftover / quarter);
        // leftover %= quarter;

        // dimeAmnt = (int) Math.floor(leftover / dime);
        // leftover %= dime;

        // nickelAmnt = (int) Math.floor(leftover / nickel);
        // leftover %= nickel;

        // pennyAmnt = (int) (leftover / 0.01);

        // int bills = tenDollarAmnt + fiveDollarAmnt + dollarAmnt;
        // int coins = quarterAmnt + dimeAmnt + nickelAmnt + pennyAmnt;

        // System.out.println("BILLS : " + bills);
        // System.out.println("COINS : " + coins + "\n");

        /*
         * Exercise 4.
         * 
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */


        
        /*
         * Exercise 5.
         * 
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */
        

        
        /*
         * Exercise 6.
         * 
         * Given a diameter, print the area and circumference of the corresponding circle.
         */
        


        /*
         * Exercise 7.
         * 
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */
        

        
        /*
         * Exercise 8.
         * 
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */
        

        
        /*
         * Exercise 9.
         * 
         * Given a string, reverse and print the first and second halves of that string.
         */
        

        
        /*
         * Exercise 10.
         * 
         * Given a first, middle, and last name, print the corresponding initials.
         */
        

        
        in.close();
    }
}