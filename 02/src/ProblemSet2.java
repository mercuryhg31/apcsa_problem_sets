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
import java.text.DecimalFormat;

public class ProblemSet2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat dec2 = new DecimalFormat("#.00");

        /*
         * Exercise 1.
         * 
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */
        System.out.print("\nEnter your first name: "); // first name
        String firstName = in.nextLine();

        System.out.print("Enter your last name: "); // last name
        String lastName = in.nextLine();

        System.out.print("Enter your grade: "); // grade
        int grade = in.nextInt();
        in.nextLine();

        System.out.print("Enter your age: "); // age
        int age = in.nextInt();
        in.nextLine();

        System.out.print("Enter your hometown: "); // hometown
        String hometown = in.nextLine();

        System.out.println("\nNAME\t : " + firstName + " " + lastName);
        System.out.println("GRADE\t : " + grade);
        System.out.println("AGE\t : " + age);
        System.out.println("HOMETOWN : " + hometown);

        /*
         * Exercise 2.
         * 
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */
        final double dollar = 1.00;
        final double quarter = 0.25;
        final double dime = 0.10;
        final double nickel = 0.05;

        System.out.print("\nEnter a dollar amount: ");
        double moneyInput = in.nextDouble();
        in.nextLine();

        int dollarAmnt = (int) Math.floor(moneyInput / dollar);
        double leftover = moneyInput % dollar;
        int quarterAmnt = (int) Math.floor(leftover / quarter);
        leftover %= quarter;
        int dimeAmnt = (int) Math.floor(leftover / dime);
        leftover %= dime;
        int nickelAmnt = (int) Math.floor(leftover / nickel);
        leftover %= nickel;
        int pennyAmnt = (int) (leftover / 0.01);

        System.out.println("\nDOLLARS\t : " + dollarAmnt);
        System.out.println("QUARTERS : " + quarterAmnt);
        System.out.println("DIMES\t : " + dimeAmnt);
        System.out.println("NICKELS\t : " + nickelAmnt);
        System.out.println("PENNIES\t : " + pennyAmnt);

        /*
         * Exercise 3.
         * 
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */
        final double tenDollar = 10.00;
        final double fiveDollar = 5.00;
        
        System.out.print("\nEnter a dollar amount: ");
        moneyInput = in.nextDouble();
        in.nextLine();

        int tenDollarAmnt = (int) Math.floor(moneyInput / tenDollar);
        leftover = moneyInput % tenDollar;

        int fiveDollarAmnt = (int) Math.floor(leftover / fiveDollar);
        leftover %= fiveDollar;

        dollarAmnt = (int) Math.floor(leftover / dollar);
        leftover %= dollar;

        quarterAmnt = (int) Math.floor(leftover / quarter);
        leftover %= quarter;

        dimeAmnt = (int) Math.floor(leftover / dime);
        leftover %= dime;

        nickelAmnt = (int) Math.floor(leftover / nickel);
        leftover %= nickel;

        pennyAmnt = (int) (leftover / 0.01);

        int bills = tenDollarAmnt + fiveDollarAmnt + dollarAmnt;
        int coins = quarterAmnt + dimeAmnt + nickelAmnt + pennyAmnt;

        System.out.println("\nBILLS : " + bills);
        System.out.println("COINS : " + coins);

        /*
         * Exercise 4.
         * 
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */
        final double inMi = 63360; // inches in a mile
        final double inYd = 36; // inches in a yard
        final double inFt = 12; // inches in a foot

        System.out.print("\nEnter a number of inches: ");
        double inchesInput = in.nextDouble();
        in.nextLine();
        
        int mileAmnt = (int) Math.floor(inchesInput / inMi);
        leftover = inchesInput % inMi;

        int yardAmnt = (int) Math.floor(leftover / inYd);
        leftover %= inYd;

        int footAmnt = (int) Math.floor(leftover / inFt);
        leftover %= inFt;

        System.out.println("\nMILES  : " + mileAmnt);
        System.out.println("YARDS  : " + yardAmnt);
        System.out.println("FEET   : " + footAmnt);
        System.out.println("INCHES : " + (int) leftover);

        /*
         * Exercise 5.
         * 
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */
        final double cmKm = 100000; // centimeters in a kilometer
        final double cmM = 100; // centimeters in a meter

        System.out.print("\nEnter a number of centimeters: ");
        double cmInput = in.nextDouble();
        in.nextLine();
        
        int kmAmnt = (int) Math.floor(cmInput / cmKm);
        leftover = cmInput % cmKm;

        int mAmnt = (int) Math.floor(leftover / cmM);
        leftover %= cmM;

        System.out.println("\nKILOMETERS  : " + kmAmnt);
        System.out.println("METERS      : " + mAmnt);
        System.out.println("CENTIMETERS : " + (int) leftover);
        
        /*
         * Exercise 6.
         * 
         * Given a diameter, print the area and circumference of the corresponding circle.
         */
        System.out.print("\nEnter a diameter: ");
        double diameter = in.nextDouble();
        in.nextLine();

        System.out.println("\nAREA\t      : " + dec2.format(Math.PI * Math.pow((diameter/2), 2)));
        System.out.println("CIRCUMFERENCE : " + dec2.format(Math.PI * diameter));

        /*
         * Exercise 7.
         * 
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */
        System.out.print("\nEnter a length: ");
        double rectLength = in.nextDouble();
        in.nextLine();
        System.out.print("Enter a width: ");
        double rectWidth = in.nextDouble();
        in.nextLine();

        System.out.println("\nAREA\t  : " + dec2.format(rectLength * rectWidth));
        System.out.println("PERIMETER : " + dec2.format(rectLength * 2 + rectWidth * 2));
        System.out.println("DIAGONAL  : " + dec2.format(Math.sqrt(Math.pow(rectLength, 2) + Math.pow(rectWidth, 2))));

        /*
         * Exercise 8.
         * 
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */
        System.out.print("\nEnter a side length: ");
        double sideLength = in.nextDouble();
        in.nextLine();

        System.out.println("\nAREA\t  : " + dec2.format(Math.pow(sideLength, 2) * (3 * Math.sqrt(3) / 2)));
        System.out.println("PERIMETER : " + dec2.format(sideLength * 6));
        
        /*
         * Exercise 9.
         * 
         * Given a string, reverse and print the first and second halves of that string.
         */
        System.out.print("\nEnter a String: ");
        String strInput = in.nextLine();
        int cutLine = (int) Math.floor(strInput.length() / 2);

        System.out.print("\n" + strInput.substring(cutLine));
        System.out.print(strInput.substring(0, cutLine) + "\n");
        
        /*
         * Exercise 10.
         * 
         * Given a first, middle, and last name, print the corresponding initials.
         */
        System.out.print("\nEnter your first name: ");
        firstName = in.nextLine();
        System.out.print("Enter your middle name: ");
        String middleName = in.nextLine();
        System.out.print("Enter your last name: "); // TODO resolve skipping line issue
        lastName = in.nextLine();

        System.out.println("\n" + firstName.charAt(0) + middleName.charAt(0) + lastName.charAt(0));
        
        in.close();
    }
}