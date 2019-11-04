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
import java.util.Scanner;

public class ProblemSet5 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO i haven't tested a single one of these godforsaken functions so gotta do that
        ProblemSet5 ps = new ProblemSet5();

        // System.out.println("\nEXERCISE 1\n");
        // System.out.println(ps.surroundMe(ps.inStr(), ps.inStr()));

        // System.out.println("\nEXERCISE 2\n");
        // System.out.println(ps.endsMeet(ps.inStr(), ps.inInt()));

        // System.out.println("\nEXERCISE 3\n");
        // System.out.println(ps.middleMan(ps.inStr()));

        // System.out.println("\nEXERCISE 4\n");
        // System.out.println(ps.isCentered(ps.inStr(), ps.inStr()));

        // System.out.println("\nEXERCISE 5\n");
        // System.out.println(ps.countMe(ps.inStr(), ps.inChar()));

        // System.out.println("\nEXERCISE 6\n");
        // System.out.println(ps.triplets(ps.inStr()));

        // System.out.println("\nEXERCISE 7\n");
        // System.out.println(ps.addMe(ps.inStr()));

        // System.out.println("\nEXERCISE 8\n");
        // System.out.println(ps.sequence(ps.inStr()));

        // System.out.println("\nEXERCISE 9\n");
        // System.out.println(ps.intertwine(ps.inStr(), ps.inStr()));

        // System.out.println("\nEXERCISE 10\n");
        // System.out.println(ps.isPalindrome(ps.inStr()));


        // int[] array = new int[5];
        // for (int i = 0; i < array.length; i++) {
        //     array[i] = i + 1;
        // }
        // System.out.println(array[5/2-1]);

        ps.surroundMe("cde\n", "abfg");
    }

    public String inStr() {
        System.out.print("Enter a string: ");
        return in.nextLine();
    }
    public char inChar() {
        System.out.print("Enter a character: ");
        char ans = in.next().charAt(0);
        in.nextLine();
        return ans;
    }
    public int inInt() {
        System.out.print("Enter an integer: ");
        int ans = in.nextInt();
        in.nextLine();
        return ans;
    }

    /*
     * Exercise 1.
     * 
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */

    public String surroundMe(String in, String out) {
        System.out.println();
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

    public String endsMeet(String text, int n) { // TODO redo correctly
        System.out.println();
        try {
            if (1 <= text.length() && text.length() <= 10 && 1 <= n && n <= text.length()) {
                char first = '0';
                for (int i = 0; i < n; i++) {
                    first = text.charAt(i);
                }
                char last = '0';
                for (int i = text.length() - 1; i > text.length() - n - 1; i--) {
                    last = text.charAt(i);
                }
                return String.valueOf(first) + String.valueOf(last);
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
        System.out.println();
        try {
            if (text.length() >= 3 && text.length() % 2 != 0) {
                return text.substring(((text.length() - 1) / 2) - 1, ((text.length() - 1) / 2) + 2);
            } else {
                return text;
            }
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
        System.out.println();
        try {
            if (text.length() % 2 != 0 && target.length() == 3 && target.equals(text.substring(((text.length() - 1) / 2) - 1, ((text.length() - 1) / 2) + 2))) {
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
        System.out.println();
        try {
            if (!Character.isLetter(suffix)) {
                return -1;
            }
            // text += " "; // TODO wait, do i need this?, idk how the fk anything works
            String[] anArrayWhoopDeDoo = text.split(" ");
            int count = 0;
            for (int i = 0; i < anArrayWhoopDeDoo.length; i++) {
                if (anArrayWhoopDeDoo[i].charAt(anArrayWhoopDeDoo[i].length() - 1) == suffix /*more like suffering, hahaa, am i rite????*/) {
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
    
    public int triplets(String text) { // TODO there's an issue here, and idk what it is
        System.out.println();
        try {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == text.charAt(i + 1) && text.charAt(i) == text.charAt(i + 2)) {
                    i+=3;
                    count++;
                }
            }
            return count;
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * Exercise 7.
     * 
     * Given a string, compute the sum of the digits in text.
     */
    
    public long addMe(String text) {
        System.out.println();
        try {
            int sum = 0;
            for (int i = 0; i < text.length(); i++) {
                if (Character.isDigit(text.charAt(i))) {
                    sum += Character.getNumericValue(text.charAt(i));
                }
            }
            return sum;
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * Exercise 8.
     * 
     * Given a string, compute the length of the longest sequence.
     */

    public long sequence(String text) { // TODO bad codes, fix plz
        System.out.println();
        try {
            int[] brainssssButArrayyssss = new int[text.length()];
            brainssssButArrayyssss[0] = 1;
            for (int i = 1; i < text.length(); i++) {
                if (text.charAt(i) == text.charAt(i - 0)) {
                    brainssssButArrayyssss[i] = brainssssButArrayyssss[i - 1] + 1;
                } else {
                    brainssssButArrayyssss[i] = 1;
                }
            }
            int answer = 0;
            for (int i = 0; i < brainssssButArrayyssss.length; i++) {
                answer = (brainssssButArrayyssss[i] > answer) ? brainssssButArrayyssss[i] : answer;
            }
            return answer;
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * Exercise 9.
     * 
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */

    public String intertwine(String a, String b) { // TODO halppppppppppppppp
        System.out.println();
        try {
            // String answer = StringUtils.repeat("*", a.length() + b.length());
            String[] arrLikeAPirate = new String[a.length() + b.length()];
            if (a.length() == b.length()) {
                // for (int i = 0; i < arrLikeAPirate.length; i += 2) {
                //     arrLikeAPirate[i] = Character.toString(a.charAt(i / 2));
                // }
                // for (int i = 1; i < arrLikeAPirate.length; i += 2) {
                //     arrLikeAPirate[i] = Character.toString(b.charAt(i / 2));
                // }
                for (int i = 0; i < a.length(); i++) {
                    arrLikeAPirate[i*2] = Character.toString(a.charAt(i));
                }
                for (int i = 0; i < b.length(); i++) {
                    arrLikeAPirate[i*2+1] = Character.toString(b.charAt(i));
                }
            }

            String answer = "";
            for (int i = 0; i < arrLikeAPirate.length; i++) {
                answer += arrLikeAPirate[i];
            }
            return answer;
        } catch (Exception e) {
            return null;
        }
    }

    /*
     * Exercise 10.
     * 
     * Given a string, determine whether or not it is a palindrome.
     */

    public boolean isPalindrome(String text) { // TODO do without illegal classes
        System.out.println();
        try {
            text = text.replaceAll("\\s+", ""); // TODO is this in those prohibited classes? hopefully, prob not?????????????????????
            if (text.substring(0, text.length() / 2).equals(text.substring(text.length() / 2 + 2, text.length() - 1))) { // THIS ISSSSS, GODDAMNIT, WHY MR. WILSON
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
