# Problem Set 5
It's time to put your skills to the test. This problem set focuses on using built-in methods, most notable of the String class. It is also your first introduction to methods that accept parameters and return values. The `main` method is declared, but it is up to you to implement. Write your code for each exercise in the corresponding method. Make sure you test your code thoroughly.

[Skeleton Repository](https://github.com/ap-java-ucvts/pset-5-skeleton)

## Getting Started

To get started, create a [GitHub](https://github.com/) repository to store your code. When you're finished, clone my skeleton to get all of the starter code and instructions. Setup a remote to push your code to your repository instead of mine.

### Setup

1. Login to your GitHub account and create a new repository named `pset-5`.
2. In the terminal, navigate to your `APCSA` directory on the `Desktop`.
```
$ cd ~/Desktop/APCSA
```
3. Clone my skeleton repository into a directory named `pset-5`.
```
$ git clone git@github.com:ap-java-ucvts/pset-5-skeleton.git pset-5
```
4. Change into your newly created `pset-5` directory.
```
$ cd pset-5
```
5. Overwrite the remote, which originally points at my skeleton repository.
```
$ git remote rename origin upstream
```
6. Add a new remote that points at your `pset-5` repository. Replace `YOUR-USERNAME` with your actual username.
```
$ git remote add origin git@github.com:YOUR-USERNAME/pset-5.git
```
7. Open up the `ProblemSet5.java` file in the text editor of your choice.

That's a lot of comments. Read each one carefully, as they are designed to point you in the right direction for each exercise.

## Exercises

The specifications for each exercise are outlined below. Your job is to write lines of code to produce answers to my questions. Each exercise requires that you ask the user to enter one or more values. Your code must meet the requirements set forth in this section.

Work through these exercises on your own. Experiment, make mistakes, ask questions, and fix your mistakes. It's the only way to get good at programming.

### Exercise 1

Given two strings, return a new string built by surrounding `in` with the first and last two characters of `out`. Return `in` unchanged if any of the following requirements are not met.

* `in` must not be `null`.
* `out` must not be `null`.
* `out` must be exactly four characters.

### Exercise 2

Given a string and an integer, return a new string that represents the first and last `n` characters of `text`. Return `text` unchanged if any of the following requirements are not met.

* `text` must not be `null`.
* `text` must be between 1 and 10 characters (inclusive).
* `n` must be a positive integer between 1 and the length of `text` (inclusive).

### Exercise 3

Given a string, return a new string using the middle three characters of `text`. Return `text` unchanged if any of the following requirements are not met.

* `text` must not be `null`.
* `text` must have an odd length of at least three characters.

### Exercise 4

Given two strings, determine whether or not `target` is equivalent to the middle three characters of `text`. Return `false` if any of the following requirements are not met.

* `text` must not be `null`.
* `text` must have an odd length of at least three characters.
* `target` must not be `null`.
* `target` must be exactly three characters.

### Exercise 5

Given a string and a character, compute the number of words that end in suffix. Return `-1` if any of the following requirements are not met.

* `text` must not be `null`.
* `suffix` must be a character in the English alphabet.

Treat the `suffix` case-sensitively. A word is defined as a sequence of characters that starts and ends in a single space. The only exception to this is if the word is either the first or last word in the string. There will never be more than one consecutive space in the string, and no other whitespace characters will appear in the string.

### Exercise 6

Given a string, compute the number of triplets in text. Return `-1` if any of the following requirements are not met.

* `text` must not be `null`.

A triplet is defined as the appearance of three consecutive characters (i.e., "aaa"). Triplets are case-sensitive.

### Exercise 7

Given a string, compute the sum of the digits in text. Return `-1` if any of the following requirements are not met.

* `text` must not be `null`.

Ignore characters that are not digits (effectively treating them as zeroes). All digits are assumed to be positive.

### Exercise 8

Given a string, compute the length of the longest sequence. Return `-1` if any of the following requirements are not met.

* `text` must not be `null`.

A sequence is defined as one or more consecutive characters. These characters must be identical, and are case-sensitive.

### Exercise 9

Given two strings, return a new string built by intertwining each of the characters of a and b. Return `null` if any of the following requirements are not met.

* `a` must not be `null`.
* `b` must not be `null`.

### Exercise 10

Given a string, determine whether or not it is a palindrome. Return `false` if any of the following requirements are not met.

* `text` must not be `null`.

A palindrome is case-sensitive. Use of the `StringBuilder` or `StringBuffer` classes is strictly prohibited.

## Deadline

Please read very carefully. Historically, most students lose points on problem sets for simply failing to read the instructions and requirements.

* November 6, 2019, at 11:59pm.

If you submit your problem set at midnight (i.e., November 7, 2019, at 12:00am), it is considered **late**!

### Submission Requirements

* Your code **must** compile. Code that fails to meet this minimum requirement will not be accepted.
* There must be **at least** 10 unique commits to your repository.
* Your code must meet each requirement outlined in the *Exercises* section.
* Your code must adhere to the course style guidelines.

Happy coding!
