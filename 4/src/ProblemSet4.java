/**
 * Problem Set 4.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * iterative control structures. The `main` method is done for you. Lines 30-39
 * trigger each of the predefined methods, which you can think of as self-contained
 * executable pieces of logic. Write your code for each exercise in the
 * corresponding method.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the *Deliverables* section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;
import java.text.DecimalFormat;

import javax.print.attribute.standard.NumberOfInterveningJobs;

public class ProblemSet4 {
    
    private static Scanner in = new Scanner(System.in);
    private static DecimalFormat dec2 = new DecimalFormat("#,##0.##");
    
    public static void main(String[] args) {
        ProblemSet4 ps = new ProblemSet4();
        
        // comment out or uncomment as needed // TODO uncomment all exercises
        
        // ps.sum();
        // ps.reverse();
        // ps.digits();
        // ps.average();
        ps.prime();
        ps.fibonacci();
        ps.factors();
        ps.mario();
        ps.luigi();
        ps.credit();
                
        in.close();
    }
    
    /*
     * Exercise 1.
     * 
     * Prompt the user to enter two integers. The first integer is a lower bound, and
     * the second integer is an upper bound.
     * 
     * Compute the sum of all even integers between the lower and upper bounds,
     * including the bounds themselves.
     */
    
    public void sum() {
        System.out.println();
        int lo;
        int hi;
        do {
            System.out.print("Lower bound: ");
            lo = in.nextInt();
            in.nextLine();
            System.out.print("Upper bound: ");
            hi = in.nextInt();
            in.nextLine();
        } while (lo > hi);
        int sum = 0;
        for (int i = lo; i <= hi; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("\n" + dec2.format(sum) + ".\n");
    }
    
    /*
     * Exercise 2.
     * 
     * Prompt the user to enter a positive integer. Print the digits of this integer
     * in reverse order.
     */
    
    public void reverse() {
        int input;
        do {
            System.out.print("Positive integer: ");
            input = in.nextInt();
            in.nextLine();
        } while (input < 1);
        String num = Integer.toString(input);
        String output = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            output += num.charAt(i) + ", ";
        }
        System.out.println("\n" + output.substring(0, output.length() - 2) + ".\n");
    }
    
    /*
     * Exercise 3.
     * 
     * Prompt the user to enter a positive integer. Compute the sum of all of the odd
     * digits in the integer.
     */
    
    public void digits() {
        int input;
        do {
            System.out.print("Positive integer: ");
            input = in.nextInt();
            in.nextLine();
        } while (input < 1);
        String num = Integer.toString(input);
        int output = 0;
        for (int i = 0; i <= num.length() - 1; i++) { // 929409
            if (Character.getNumericValue(num.charAt(i)) % 2 != 0) { // TODO am uneasy about using .getNumericValue - figure out why (int) doesn't work
                output += Character.getNumericValue(num.charAt(i));
            }
        }
        System.out.println("\n" + output + ".\n");
    }
    
    /*
     * Exercise 4.
     * 
     * Prompt the user to enter a series of non-negative integers. When the user
     * enters a negative integer, you can assume he or she is done entering values.
     * What is the average of the values entered?
     */
    
    public void average() {
        int num;
        String input = "";
        do {
            System.out.print("Non-negative integer: ");
            num = in.nextInt();
            input += (num > -1) ? num + "," : "";
            in.nextLine();
        } while (num > -1);
        double sum = 0;
        String[] allInputs = input.split(",");
        for (int i = 0; i < allInputs.length; i++) {
            sum += Double.parseDouble(allInputs[i]);
        }
        System.out.println("\n" + dec2.format(sum / allInputs.length) + ".\n");
    }
    
    /*
     * Exercise 5.
     * 
     * Prompt the user to enter a non-negative integer. Is this number prime?
     */
    
    public void prime() { // TODO gotta fix everything
        int input;
        do {
            System.out.print("Non-negative integer: ");
            input = in.nextInt();
            in.nextLine();
        } while (input < 0);
        boolean prime = true;
        for (int i = 1; i < Math.sqrt(input); i++) {
            System.out.println(input);
            System.out.println(i);
            // prime = (input % i == 0) ? false : prime;
            if (input % i == 0) {
                prime = false;
            }
        }
        if (prime) {
            System.out.println("Prime.\n");
        } else {
            System.out.println("Not prime.\n");
        }
        // System.out.println("\n" + ((prime) ? "Prime.\n" : "Not prime.\n"));
    }
    
    /*
     * Exercise 6.
     * 
     * Prompt the user to enter a positive integer in the range [1, 92]. If the
     * integer the user enters is called n, what is the nth Fibonacci number?
     */
    
    public void fibonacci() {

    }
    
    /*
     * Exercise 7.
     * 
     * Prompt the user to enter a positive integer. What are its factors?
     */
    
    public void factors() {

    }
    
    /*
     * Exercise 8.
     * 
     * Prompt the user to enter an integer between 1 and 24 (inclusive). Print a Super
     * Mario-style half-pyramid of the specified height.
     */
    
    public void mario() {        

    }
    
    /*
     * Exercise 9.
     * 
     * Prompt the user to enter an odd integer between 1 and 24 (inclusive). Print a
     * Super Mario-style full pyramid of the specified height.
     */
    
    public void luigi() {

    }
    
    /*
     * Exercise 10.
     * 
     * Prompt the user to enter a credit card number (not a real one!). According to
     * Luhn's algorithm, is the credit card number valid?
     */
    
    public void credit() {
        
    }
}