/**
 * Problem Set 3.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * conditional control structures. It's also your first introduction to methods,
 * so things look a little different. The main method is done for you. Lines 31-40
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
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

public class ProblemSet3 {
    
    private static Scanner in = new Scanner(System.in);
    private static DecimalFormat dec2 = new DecimalFormat("0.00");
    
    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();
                
        // comment out or uncomment as needed // TODO uncomment all exercises
        
        // ps.sign();          // executes Exercise 1
        // ps.parity();        // executes Exercise 2
        // ps.ordered();       // executes Exercise 3
        // ps.gpa();           // executes Exercise 4
        // ps.grade();         // executes Exercise 5
        // ps.cards();         // executes Exercise 6
        ps.leapYear();      // executes Exercise 7
        ps.state();         // executes Exercise 8
        ps.months();        // executes Exercise 9
        ps.salary();        // executes Exercise 10
        
        in.close();
    }
    
    /*
     * Exercise 1.
     * 
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */
    
    public void sign() {
        System.out.print("\nEnter an integer: ");
        int num = in.nextInt(); // TODO need to make it a long?
        in.nextLine();
        if (num > 0) {
            System.out.println("\nPositive.");
        } else if (num < 0) {
            System.out.println("\nNegative.");
        } else {
            System.out.println("\nZero.");
        }
    }
    
    /*
     * Exercise 2.
     * 
     * Prompt the user to enter an integer. Is it even or odd?
     */
    
    public void parity() {
        System.out.print("\nEnter an integer: ");
        int num = in.nextInt(); // TODO need to make it a long?
        in.nextLine();
        int output = num % 2;
        switch (output) {
            case 0:
                System.out.println("\nEven.");
                break;
            case 1:
                System.out.println("\nOdd.");
                break;
            default:
                System.out.println("\nUh, I don't know how this code even got executed."); // TODO probably should delele this
        }
    }
    
    /*
     * Exercise 3.
     * 
     * Prompt the user to enter three integers. How are the integers ordered?
     */
    
    public void ordered() {
        System.out.println("\nEnter three integers.");
        System.out.print("\nEnter integer: ");
        int a = in.nextInt();
        in.nextLine();
        System.out.print("Enter integer: ");
        int b = in.nextInt();
        in.nextLine();
        System.out.print("Enter integer: ");
        int c = in.nextInt();
        in.nextLine();

        if (a == b && b == c) {
            System.out.println("\nSame.");
        } else if (a < b && b < c) {
            System.out.println("\nStrictly increasing.");
        } else if (a <= b && b <= c) {
            System.out.println("\nIncreasing.");
        } else if (a >= b && b >= c) {
            System.out.println("\nDecreasing.");
        } else if (a > b && b > c) {
            System.out.println("\nStrictly decreasing.");
        } else {
            System.out.println("\nUnordered.");
        }
    }
    
    /*
     * Exercise 4.
     * 
     * Prompt the user to enter a letter grade. What's the corresponding GPA?
     */
    
    public void gpa() {
        double output = 0;
        System.out.print("\nEnter a letter grade: ");
        String input = in.nextLine().toUpperCase();

        final double a = 4;
        final double b = 3;
        final double c = 2;
        final double d = 1;
        final double f = 0;
        final double plus = 0.33;
        final double minus = -0.33;

        output += input.contains("+") ? plus : 0; // TODO look back to see if you can make this more efficient
        output += input.contains("-") ? minus : 0;
        output += input.contains("A") ? a : 0;
        output += input.contains("B") ? b : 0;
        output += input.contains("C") ? c : 0;
        output += input.contains("D") ? d : 0;
        output = input.contains("F") ? f : output;
        
        System.out.println("\nYour GPA is " + dec2.format(output) + ".");
    }
    
    /*
     * Exercise 5.
     * 
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */
    
    public void grade() { // TODO needs major revison
        final double hiA = 100; // TODO is this what he means by thresholds?
        final double loA = 90;
        final double hiB = 89;
        final double loB = 80;
        final double hiC = 79;
        final double loC = 70;
        final double hiD = 69;
        final double loD = 60;
        final double hiF = 50;
        final double loF = 0;

        System.out.print("\nEnter a grade: ");
        double input = in.nextDouble();
        in.nextLine();
        
        if (loA <= input && input <= hiA) {
            System.out.println("\nYou received an A.");
        } else if (loB <= input && input <= hiB) {
            System.out.println("\nYou received a B.");
        } else if (loC <= input && input <= hiC) {
            System.out.println("\nYou received a C.");
        } else if (loD <= input && input <= hiD) {
            System.out.println("\nYou received a D.");
        } else if (loF <= input && input <= hiF) {
            System.out.println("\nYou received a F.");
        } else if (input > 100) {
            System.out.println("\nGrades above 100 are invalid.");
        } else {
            System.out.println("\nGrades below 0 are invalid.");
        }
    }
    
    /*
     * Exercise 6.
     * 
     * Prompt the user to enter a playing card. What card was entered?
     */
    
    public void cards() {
        System.out.print("Enter a card: ");
        String input = in.nextLine().toUpperCase();
        String output = "\n";
        boolean suit = false;
        boolean rank = false;

        switch (input.charAt(0)) {
            case '2':
                output += "Two";
                rank = true;
                break;
            case '3':
                output += "Three";
                rank = true;
                break;
            case '4':
                output += "Four";
                rank = true;
                break;
            case '5':
                output += "Five";
                rank = true;
                break;
            case '6':
                output += "Six";
                rank = true;
                break;
            case '7':
                output += "Seven";
                rank = true;
                break;
            case '8':
                output += "Eight";
                rank = true;
                break;
            case '9':
                output += "Nine";
                rank = true;
                break;
            case 'T':
                output += "Ten";
                rank = true;
                break;
            case 'J':
                output += "Jack";
                rank = true;
                break;
            case 'Q':
                output += "Queen";
                rank = true;
                break;
            case 'K':
                output += "King";
                rank = true;
                break;
            case 'A':
                output += "Ace";
                rank = true;
                break;
        }
        output += " of ";
        switch (input.charAt(1)) {
            case 'C':
                output += "Clubs";
                suit = true;
                break;
            case 'D':
                output += "Diamonds";
                suit = true;
                break;
            case 'H':
                output += "Hearts";
                suit = true;
                break;
            case 'S':
                output += "Spades";
                suit = true;
                break;
        }
        if (!rank) { // TODO should we display both messages if both are true?
            output = "\nThat is not a valid suit.";
        } else if (!suit) {
            output = "\nThat is not a valid rank.";
        } // TODO also should we show an error message if the input is longer than 2 chars?
        System.out.println(output);
    }
    
    /*
     * Exercise 7.
     * 
     * Prompt the user to enter a year. Is it a leap year or not?
     */
    
    public void leapYear() {
        System.out.print("\nEnter a year: ");
        int year = in.nextInt(); // TODO make it a long?

        if (year % 4 == 0 && year % 100 > 0 || year % 400 == 0) {
            System.out.println("\n" + year + " is a leap year.");
        } else {
            System.out.println("\n" + year + " is not a leap year.");
        }
    }
    
    /*
     * Exercise 8.
     * 
     * Prompt the user to enter a temperature. At that temperature, is water a solid,
     * liquid, or gas?
     */
    
    public void state() {

    }
    
    /*
     * Exercise 9.
     * 
     * Prompt the user to enter a month. How many days are in that month?
     */
    
    public void months() {        

    }
    
    /*
     * Exercise 10.
     * 
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */
    
    public void salary() {

    }
}