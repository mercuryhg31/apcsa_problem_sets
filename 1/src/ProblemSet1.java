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
import java.lang.Math;

public class ProblemSet1 {
    
    public static DecimalFormat dec2 = new DecimalFormat("#,###.00");
    public static DecimalFormat mon = new DecimalFormat("$#,###.00");
    public static DecimalFormat dec1 = new DecimalFormat("#,###.0");
    public static void main(String[] args) {
        
        /*
         * Exercise 1.
         * 
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */
        final double convInMm = 25.4; // in to mm
        final double paperLen = 11;
        final double paperWid = 8.5;
        double area = paperLen * paperWid * Math.pow(convInMm, 2);
        System.out.println("\n"+ dec2.format(area) + " square millimeters.\n");
        
        /*
         * Exercise 2.
         * 
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */
        final double convInCm = 2.54; // in to cm
        double perimeter = 2 * (paperLen*convInCm) + 2 * (paperWid*convInCm);
        System.out.println("\n" + dec2.format(perimeter) + " centimeters.\n");
        
        /*
         * Exercise 3.
         * 
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */
        double diag = Math.sqrt(Math.pow(paperWid, 2) + Math.pow(paperLen, 2));
        System.out.println("\n" + dec2.format(diag) + " inches.\n");

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

        System.out.println("\n" + dec2.format(fin) + "%.\n");
        
        /*
         * Exercise 5.
         * 
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */
        final double wage = 12.5;
        double hours = 7.5 + 8 + 10.5 + 9.5 + 6 + 11.5 + 0;
        System.out.println("\n" + mon.format(hours * wage) + ".\n");
        
        /*
         * Exercise 6.
         * 
         * What is my take-home pay each check?
         */
        final double sal = 117000 / 24;
        final double fedTax = .24;
        final double stateTax = .0637;
        final double f01k = .07;

        double pay = sal - (sal*f01k);
        pay -= (pay*stateTax);
        pay -= (pay*fedTax);

        System.out.println("\n$" + dec2.format(pay) + ".\n");
        
        /*
         * Exercise 7.
         * 
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */
        final double students = 273;
        final double teachers = 28;
        final double buscap = 54;

        int buses = (int) (Math.ceil((students + teachers) / buscap));
        int leftover = (int) ((students + teachers) % buscap);

        System.out.println("\n" + buses + " buses are needed, with " + leftover + " passengers on the last bus.\n");
        
        /*
         * Exercise 8.
         * 
         * What is the surface area of a standard Cornhole board?
         */
        final double cornLen = 48;
        final double cornWid = 24;
        final double cornDm = 6;

        double face = (cornLen * cornWid) - (Math.PI * Math.pow((cornDm/2), 2));

        System.out.println("\n" + dec2.format(face) + " square inches.\n");
        
        /*
         * Exercise 9.
         * 
         * Are the years 2020, 2100, and 2400 leap years?
         */
        int t020 = 2020;
        int t100 = 2100;
        int t400 = 2400;
        
        boolean twtw = t020 % 4 == 0;
        twtw = t020 % 100 != 0 || t020 % 400 == 0;

        boolean twon = t100 % 4 == 0;
        twon = t100 % 100 != 0 || t100 % 400 == 0;

        boolean tfor = t400 % 4 == 0;
        tfor = t400 % 100 != 0 || t400 % 400 == 0;
        
        System.out.println("\n" + t020 + " is a leap year..." + twtw + ".");
        System.out.println(t100 + " is a leap year..." + twon + ".");
        System.out.println(t400 + " is a leap year..." + tfor + "." + "\n");
        
        /*
         * Exercise 10.
         * 
         * What is the wind chill?
         */
        double t = 38;
        double v = 14;
        double windChill = 35.74 + 0.6215*(t) + (0.4275*(t) - 35.75)*(Math.pow(v, 0.16));
        
        System.out.println("\n" + dec1.format(windChill) + " degrees.\n");
    }
}