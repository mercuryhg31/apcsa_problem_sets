/**
 * Problem Set 5.
 * 
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 * 
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section.
 * 
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet5 {
    
    public static void main(String[] args) {
        
    }
    
    /*
     * Exercise 1.
     * 
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */
    
    public String surroundMe(String in, String out) {
        if (out.length() == 4) {
            try {
                return out.charAt(0) + in + out.charAt(out.length() - 1);
            } catch (Exception e) {
                return in;
            }
        } else {
            return in;
        }
    }
    
    /*
     * Exercise 2.
     * 
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */
    
    public String endsMeet(String text, int n) {
        try {
            if (1 <= text.length() && text.length() <= 10 && 1 <= n && n <= text.length()) {
                char first = '0';
                for (int i = 0; i < n; i++) {
                    first = text.charAt(i);
                }
                char last = '0';
                for (int i = n; i > 0; i--) {
                    last = text.charAt(i);
                }
                return first + last;
            } else {
                return text;
            }
        } catch (Exception e) {
            return text;
        }
    }
    
    /*
     * Exercise 3.
     * 
     * Given a string, return a new string using the middle three characters of text.
     */
    
    public String middleMan(String text) {
        try {
            // if (text.length() >= 3) {
                return text.charAt(text.length() / 2) + text.charAt(text.length() / 2 + 1) + text.charAt(text.length() / 2 + 2);
            // } else {
            //     return text;
            // }
        } catch (Exception e) {
            return text;
        }
    }
    
    /*
     * Exercise 4.
     * 
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */
    
    public boolean isCentered(String text, String target) {
        try {
            if (target.equals(text.charAt(text.length() / 2) + text.charAt(text.length() / 2 + 1) + text.charAt(text.length() / 2 + 2))) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
    /*
     * Exercise 5.
     * 
     * Given a string and a character, compute the number of words that end in suffix.
     */
    
    public int countMe(String text, char suffix) {
        try {
            text += " "; // TODO wait, do i need this?, idk how the fk anything works
            text = text.toUpperCase(); suffix = Character.toUpperCase(suffix);
            String[] anArrayWhoopDeDoo = text.split(" ");
            int count = 0;
            for (int i = 0; i < anArrayWhoopDeDoo.length; i++) {
                if (anArrayWhoopDeDoo[i].charAt(anArrayWhoopDeDoo[i].length - 1) == suffix /*more like suffering, hahaa, am i rite????*/) {
                    count++;
                }
            }
            return count;
        } catch (Exception e) {
            return -1;
        }
    }
    
    /*
     * Exercise 6.
     * 
     * Given a string, compute the number of triplets in text.
     */
    
    public int triplets(String text) {

    }
    
    /*
     * Exercise 7.
     * 
     * Given a string, compute the sum of the digits in text.
     */
    
    public long addMe(String text) {

    }
    
    /*
     * Exercise 8.
     * 
     * Given a string, compute the length of the longest sequence.
     */
    
    public long sequence(String text) {

    }
    
    /*
     * Exercise 9.
     * 
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */
    
    public String intertwine(String a, String b) {

    }
    
    /*
     * Exercise 10.
     * 
     * Given a string, determine whether or not it is a palindrome.
     */
    
    public boolean isPalindrome(String text) {

    }
}
