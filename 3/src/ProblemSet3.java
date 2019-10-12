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
    private static DecimalFormat dec2 = new DecimalFormat("#,##0.00");
    
    public static void main(String[] args) {
        ProblemSet3 ps = new ProblemSet3();
                
        // comment out or uncomment as needed // TODO uncomment all exercises
        
        // ps.sign();          // executes Exercise 1
        // ps.parity();        // executes Exercise 2
        // ps.ordered();       // executes Exercise 3
        // ps.gpa();           // executes Exercise 4
        // ps.grade();         // executes Exercise 5
        ps.cards();         // executes Exercise 6
        // ps.leapYear();      // executes Exercise 7
        // ps.state();         // executes Exercise 8
        // ps.months();        // executes Exercise 9
        // ps.salary();        // executes Exercise 10
        
        in.close();
    }
    
    /*
     * Exercise 1.
     * 
     * Prompt the user to enter an integer. Is it positive, negative, or zero?
     */
    
    public void sign() {
        System.out.print("\nEnter an integer: ");
        int num = in.nextInt();
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
        int num = in.nextInt();
        in.nextLine();
        if (num % 2 == 0) {
            System.out.println("\nEven.");
        } else {
            System.out.println("\nOdd.");
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
        } else if (a > b && b > c) {
            System.out.println("\nStrictly decreasing.");
        } else if (a >= b && b >= c) {
            System.out.println("\nDecreasing.");
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
        double grade = 0;
        boolean valid = false;
        System.out.print("\nEnter a letter grade: ");
        String input = in.nextLine().toUpperCase();

        final double a = 4;
        final double b = 3;
        final double c = 2;
        final double d = 1;
        final double f = 0;
        final double plus = 0.33;
        final double minus = -0.33;

        switch (input.charAt(0)) {
            case 'A':
                grade = a;
                valid = true;
                break;
            case 'B':
                grade = b;
                valid = true;
                break;
            case 'C':
                grade = c;
                valid = true;
                break;
            case 'D':
                grade = d;
                valid = true;
                break;
            case 'F':
                grade = f;
                valid = true;
        }
        try {
            switch (input.charAt(1)) {
                case '+':
                    grade += (grade == 4) ? 0 : plus;
                    break;
                case '-':
                    grade += minus;
                    break;
                default:
                    valid = false;
            }
        } catch (Exception e) {}
        
        valid = (input.length() > 2 || (input.charAt(0) == 'F' && input.length() > 1)) ? false : valid;

        if (valid) {
            System.out.println("\nYour GPA is " + dec2.format(grade) + ".");
        } else {
            System.out.println("\nThat's not a valid letter grade.");
        }
    }
    
    /*
     * Exercise 5.
     * 
     * Prompt the user to enter a grade. What's the corresponding letter grade?
     */
    
    public void grade() {
        final double hiA = 100;
        final double loA = 90;
        final double loB = 80;
        final double loC = 70;
        final double loD = 60;
        final double loF = 0;

        System.out.print("\nEnter a grade: ");
        double input = in.nextDouble();
        in.nextLine();

        if (loA <= input && input <= hiA) {
            System.out.println("\nYou received an A.");
        } else if (loB <= input && input < loA) {
            System.out.println("\nYou received a B.");
        } else if (loC <= input && input < loB) {
            System.out.println("\nYou received a C.");
        } else if (loD <= input && input < loC) {
            System.out.println("\nYou received a D.");
        } else if (loF <= input && input < loD) {
            System.out.println("\nYou received an F.");
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
        System.out.print("\nEnter a card: ");
        String input = in.nextLine().toUpperCase();
        String suit = "";
        String rank = "";
        if (input.length() > 2) {
            System.out.println("\nThat's not a valid input.");
        } else {
            switch (input.charAt(1)) {
                case 'C':
                    suit = "Clubs";
                    break;
                case 'D':
                    suit = "Diamonds";
                    break;
                case 'H':
                    suit = "Hearts";
                    break;
                case 'S':
                    suit = "Spades";
                    break;
                default:
                    System.out.println("\nThat's not a valid suit.");
                    return;
            }
            switch (input.charAt(0)) {
                case '2':
                    rank = "Two";
                    break;
                case '3':
                    rank = "Three";
                    break;
                case '4':
                    rank = "Four";
                    break;
                case '5':
                    rank = "Five";
                    break;
                case '6':
                    rank = "Six";
                    break;
                case '7':
                    rank = "Seven";
                    break;
                case '8':
                    rank = "Eight";
                    break;
                case '9':
                    rank = "Nine";
                    break;
                case 'T':
                    rank = "Ten";
                    break;
                case 'J':
                    rank = "Jack";
                    break;
                case 'Q':
                    rank = "Queen";
                    break;
                case 'K':
                    rank = "King";
                    break;
                case 'A':
                    rank = "Ace";
                    break;
                default:
                    System.out.println("\nThat's not a valid rank.");
                    return;
            }
            System.out.println("\n" + rank + " of " + suit + ".");
        }
    }
    
    /*
     * Exercise 7.
     * 
     * Prompt the user to enter a year. Is it a leap year or not?
     */
    
    public void leapYear() {
        System.out.print("\nEnter a year: ");
        int year = in.nextInt();

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
        System.out.print("\nEnter a temperature: ");
        double temp = in.nextDouble();
        in.nextLine();
        System.out.print("Enter a scale: ");
        String scale = in.nextLine().toUpperCase();
        String output = "\n";

        switch (scale.charAt(0)) {
            case 'F':
                if (temp <= 32) {
                    output += "Solid.";
                } else if (temp >= 212) {
                    output += "Gas.";
                } else {
                    output += "Liquid.";
                }
                break;
            case 'C':
                if (temp <= 0) {
                    output += "Solid.";
                } else if (temp >= 100) {
                    output += "Gas.";
                } else {
                    output += "Liquid.";
                }
            break;
        }

        if (!scale.equals("F") && !scale.equals("C")) { // TODO should I do this, or should I allow for anything to be typed as long as the first char is F or C? (like farhenheit or celcius?) // error message
            output = "\nThat's not a valid scale.";
        }
        System.out.println(output);
    }
    
    /*
     * Exercise 9.
     * 
     * Prompt the user to enter a month. How many days are in that month?
     */
    
    public void months() {
        System.out.print("\nEnter a month: ");
        String input = in.nextLine().toUpperCase();

        String jan = "JANUARY";
        String feb = "FEBRUARY";
        String mar = "MARCH";
        String apr = "APRIL";
        String may = "MAY";
        String jun = "JUNE";
        String jul = "JULY";
        String aug = "AUGUST";
        String sep = "SEPTEMBER";
        String oct = "OCTOBER";
        String nov = "NOVEMBER";
        String dec = "DECEMBER";

        if (monCheck(input, jan) || monCheck(input, mar) || monCheck(input, may) || monCheck(input, jul) || monCheck(input, aug) || monCheck(input, oct) || monCheck(input, dec)) {
            System.out.println("\n31 days.");
        } else if (monCheck(input, feb)) {
            System.out.println("\n28 or 29 days.");
        } else if (monCheck(input, apr) || monCheck(input, jun) || monCheck(input, sep) || monCheck(input, nov)) {
            System.out.println("\n30 days.");
        } else {
            System.out.println("\nThat's not a valid month.");
        }
    }

    boolean monCheck(String input, String mon) {
        boolean a = input.equals(mon);
        boolean b = false;
        boolean c = false;
        try {
            b = input.equals(mon.substring(0, 3));
        } catch (Exception e) {}
        try {
            c = input.equals(mon.substring(0, 4));
        } catch (Exception e) {}
        return a || b || c;
    }
    
    /*
     * Exercise 10.
     * 
     * Prompt the user to enter a wage and hours worked. How much money will be made?
     */
    
    public void salary() { // (1.5*12*17.75) + 710
        System.out.print("\nWage: ");
        double wage = in.nextDouble();
        in.nextLine();
        System.out.print("Hours: ");
        double hours = in.nextDouble();
        in.nextLine();

        double pay = 40 * wage + ((hours - 40) * 1.5 * wage);

        if (wage < 0) {
            System.out.println("\nYour wage must be greater than or equal to $0.00/hour.");
        } else if (hours < 0) {
            System.out.println("\nYour hours must be greater than or equal to 0.0."); // TODO also do I need to display both messages once again?
        } else {
            System.out.println("\nYou'll make $" + dec2.format(pay) + " this week."); // TODO  oh wait, but I don't understand this excersise at all, so yay
        }
    }
}