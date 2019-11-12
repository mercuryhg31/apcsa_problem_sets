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

        // EXERCISE 1
        System.out.println("\nEXERCISE 1\n");
        System.out.println(ps.surroundMe("cde", "abfg"));
        System.out.println(ps.surroundMe("cd\ne", "abfg"));
        System.out.println(ps.surroundMe("", "abfg"));
        System.out.println(ps.surroundMe(null, "####"));
        System.out.println(ps.surroundMe("abc", null));
        System.out.println(ps.surroundMe("abc", "123") + "\n");

        // EXERCISE 2
        System.out.println("\nEXERCISE 2\n");
        System.out.println(ps.endsMeet("abcdefg", 2));
        System.out.println(ps.endsMeet("a\nbcdefg", 2));
        System.out.println(ps.endsMeet(null, 2));
        System.out.println(ps.endsMeet("", 2));
        System.out.println(ps.endsMeet("abc", -1) + "\n");

        // EXERCISE 3
        System.out.println("\nEXERCISE 3\n");
        System.out.println(ps.middleMan("abcdefg"));
        System.out.println(ps.middleMan(""));
        System.out.println(ps.middleMan(null));
        System.out.println(ps.middleMan("12"));
        System.out.println(ps.middleMan("a") + "\n");

        // EXERCISE 4
        System.out.println("\nEXERCISE 4\n");
        System.out.println(ps.isCentered("abcdefg", "cde"));
        System.out.println(ps.isCentered("abcd\nfg", "cd\n"));
        System.out.println(ps.isCentered("abcdefg", "abc"));
        System.out.println(ps.isCentered(null, "abc"));
        System.out.println(ps.isCentered("abcd", "abc"));
        System.out.println(ps.isCentered("abc", null));
        System.out.println(ps.isCentered("abcdefg", "cd") + "\n");

        // EXERCISE 5
        System.out.println("\nEXERCISE 5\n");
        System.out.println(ps.countMe("I am an example sentence", 'e'));
        System.out.println(ps.countMe(null, 'a'));
        System.out.println(ps.countMe("abc$ def$", '$') + "\n");

        // EXERCISE 6
        System.out.println("\nEXERCISE 6\n");
        System.out.println(ps.triplets("aaabbbccc"));
        System.out.println(ps.triplets("aaabbbccc\n\n\n"));
        System.out.println(ps.triplets("aaa\nbbb\nccc"));
        System.out.println(ps.triplets("aaa\n\n\nbbbccc"));
        System.out.println(ps.triplets("aaaa"));
        System.out.println(ps.triplets("abc"));
        System.out.println(ps.triplets(null) + "\n");

        // EXERCISE 7
        System.out.println("\nEXERCISE 7\n");
        System.out.println(ps.addMe("123 abc 123"));
        System.out.println(ps.addMe("123 abc 12\n3"));
        System.out.println(ps.addMe("abcdefghijk"));
        System.out.println(ps.addMe(null) + "\n");

        // EXERCISE 8
        System.out.println("\nEXERCISE 8\n");
        System.out.println(ps.sequence("abbcccdddd"));
        System.out.println(ps.sequence("abbcccdddd\n\n\n\n\n"));
        System.out.println(ps.sequence("aAabBbBb"));
        System.out.println(ps.sequence(""));
        System.out.println(ps.sequence(null) + "\n");

        // EXERCISE 9
        System.out.println("\nEXERCISE 9\n");
        System.out.println(ps.intertwine("aceg", "bdfh"));
        System.out.println(ps.intertwine("ace\ng", "bdfh"));
        System.out.println(ps.intertwine("abc", "12345"));
        System.out.println(ps.intertwine(null, "abcd"));
        System.out.println(ps.intertwine("abcd", null));
        System.out.println(ps.intertwine(null, null) + "\n");
        
        // EXERCISE 10
        System.out.println("\nEXERCISE 10\n");
        System.out.println(ps.isPalindrome("racecar"));
        System.out.println(ps.isPalindrome("rac\ne\ncar"));
        System.out.println(ps.isPalindrome("Madam"));
        System.out.println(ps.isPalindrome(null));
    }

    /*
     * Exercise 1.
     * 
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */

    public String surroundMe(String in, String out) {
        if (in == null || out == null) {return in;}
        if (out.length() == 4) {
            try {
                return Character.toString((out.charAt(0))) + Character.toString(out.charAt(1)) + in + Character.toString(out.charAt(out.length() - 2)) + Character.toString(out.charAt(out.length() - 1));
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
            if (text.isEmpty() || text == null || 1 > n || n > text.length()) {return text;}
            String output = "";
            for (int i = 0; i < n; i++) {
                output += Character.toString(text.charAt(i));
            }
            for (int i = text.length() - n; i < text.length(); i++) {
                output += Character.toString(text.charAt(i));
            }
            return output;
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
        try {
            if (text.length() % 2 != 0 && text.length() >= 3 && target.length() == 3 && target.equals(text.substring(((text.length() - 1) / 2) - 1, ((text.length() - 1) / 2) + 2))) {
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
            if (!('a' <= suffix && suffix <= 'z') && !('A' <= suffix && suffix <= 'Z')) {
                return -1;
            }
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
    
    public int triplets(String text) {
        if (text == null) {return -1;}
        int count = 0;
        for (int i = 0; i < text.length() - 2; i++) {
            if (Character.toString(text.charAt(i)).equals(Character.toString(text.charAt(i + 1))) && Character.toString(text.charAt(i)).equals(Character.toString(text.charAt(i + 2)))) {
                count++;
            }
        }
        return count;
    }

    /*
     * Exercise 7.
     * 
     * Given a string, compute the sum of the digits in text.
     */
    
    public long addMe(String text) {
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

    public long sequence(String text) {
        try {
            if (text.isEmpty()) {return 0;}
            int[] brainssssButArrayyssss = new int[text.length()];
            brainssssButArrayyssss[0] = 1;
            for (int i = 1; i < text.length(); i++) {
                if (Character.toString(text.charAt(i)).equals(Character.toString(text.charAt(i - 1)))) {
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

    public String intertwine(String a, String b) {
        if (a == null || b == null) {return null;}
        try {
            String[] arrLikeAPirate = new String[a.length() + b.length()];
            int primLeng = (a.length() > b.length()) ? b.length() * 2 : a.length() * 2;
            int aIdx = 0;
            int bIdx = 0;
            for (int i = 0; i < primLeng; i++) {
                if (i % 2 == 0) {
                    arrLikeAPirate[i] = Character.toString(a.charAt(aIdx));
                    aIdx++;
                } else {
                    arrLikeAPirate[i] = Character.toString(b.charAt(bIdx));
                    bIdx++;
                }
            }
            String leftoverStr = (a.length() > b.length()) ? a : b;
            int leftoverIdx = (a.length() > b.length()) ? aIdx : bIdx;
            for (int i = primLeng; i < arrLikeAPirate.length; i++) {
                arrLikeAPirate[i] = Character.toString(leftoverStr.charAt(leftoverIdx));
                leftoverIdx++;
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
        try {
            String endStr = text.substring(text.length() / 2 + 1, text.length());
            String end = "";
            for (int i = endStr.length() - 1; i > -1; i--) {
                end += endStr.charAt(i);
            }
            if (text.substring(0, text.length() / 2).equals(end)) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
