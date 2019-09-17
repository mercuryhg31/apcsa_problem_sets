/**
 * Problem Set 1.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 * 
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

// import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ProblemSet1 {
    
    public static DecimalFormat dec = new DecimalFormat("##,###.00");
    public static void main(String[] args) {
        
        /*
         * Exercise 1.
         * 
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */
        final double conInMm = 25.4; // in to mm
        final double len = 11;
        final double wid = 8.5;
        double area = len * wid * Math.pow(conInMm, 2);
        System.out.println("\n"+ dec.format(area) + " square millimeters.\n");
        
        /*
         * Exercise 2.
         * 
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
        final double convInCm = 2.54; // in to cm
        double perimeter = 2 * (len*convInCm) + 2 * (wid*convInCm);
        System.out.println("\n" + dec.format(perimeter) + " centimeters.\n");
        
        /*
         * Exercise 3.
         * 
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */
        double diag = Math.sqrt(Math.pow(wid, 2) + Math.pow(len, 2));
        System.out.println("\n" + dec.format(diag) + " inches.\n");

        /*
         * Exercise 4.
         * 
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */
        
        int homework1 = 88;
        int homework2 = 91;
        int homework3 = 0;
        int quiz1 = 84;
        int quiz2 = 89;
        int quiz3 = 93;
        int test1 = 74;
        int test2 = 87;
        int test3 = 82;
        
        final double hw = .15;
        final double qz = .35;
        final double tt = .5;
        
        double homework = ((double) (homework1 + homework2 + homework3)) / 3;
        double quiz = ((double) (quiz1 + quiz2 + quiz3)) / 3;
        double test = ((double) (test1 + test2 + test3)) / 3;

        double fin = (homework * hw) + (quiz * qz) + (test * tt);

        System.out.println("\n" + dec.format(fin) + "%.\n");
        
        /*
         * Exercise 5.
         * 
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */
        final double wage = 12.5;
        double hours = 7.5 + 8 + 10.5 + 9.5 + 6 + 11.5 + 0; // TODO check if needs to be separated into different days
        System.out.println("\n$" + dec.format(hours * wage) + ".\n");
        
        /*
         * Exercise 6.
         * 
         * What is my take-home pay each check?
         */
        final double sal = 117000;
        final double fedTax = .24;
        final double stateTax = .0637;
        final double f01k = .07;

        double pay = sal - (sal*f01k);
        pay -= (pay*stateTax);
        pay -= (pay*fedTax);

        System.out.println("\n$" + dec.format(pay) + ".\n"); // TODO to be finished
        
        /*
         * Exercise 7.
         * 
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */
        
        
        
        /*
         * Exercise 8.
         * 
         * What is the surface area of a standard Cornhole board?
         */
        
        
        
        /*
         * Exercise 9.
         * 
         * Are the years 2020, 2100, and 2400 leap years?
         */
        
        
        
        /*
         * Exercise 10.
         * 
         * What is the wind chill?
         */
        
        
        
    }
}