# Problem Set 2

It's time to put your skills to the test. This problem set focuses on prompting the user for information, manipulating that information, and printing it in specific formats.

## Getting Started

To get started, create a [GitHub](https://github.com/) repository to store your code. When you're finished, clone my skeleton to get all of the starter code and instructions. Setup a remote to push your code to your repository instead of mine.

### Setup

1. Login to your GitHub account and create a new repository named `pset-2`.
2. In the terminal, navigate to your `APCSA` directory on the `Desktop`.
```
$ cd ~/Desktop/APCSA
```
3. Clone my skeleton repository into a directory named `pset-2`.
```
$ git clone git@github.com:ap-java-ucvts/pset-2-skeleton.git pset-2
```
4. Change into your newly created `pset-2` directory.
```
$ cd pset-2
```
5. Overwrite the remote, which originally points at my skeleton repository.
```
$ git remote rename origin upstream
```
6. Add a new remote that points at your `pset-2` repository. Replace `YOUR-USERNAME` with your actual username.
```
$ git remote add origin git@github.com:YOUR-USERNAME/pset-2.git
```
7. Open up the `ProblemSet2.java` file in the text editor of your choice.

That's a lot of comments. Read each one carefully, as they are designed to point you in the right direction for each exercise.

## Exercises

The specifications for each exercise are outlined below. Your job is to write lines of code to produce answers to my questions. Each exercise requires that you ask the user to enter one or more values. Your code must meet the requirements set forth in this section (as well as the *Deliverables* section).

Work through these exercises on your own. Experiment, make mistakes, ask questions, and fix your mistakes. It's the only way to get good at programming.

### Exercise 1

Prompt the user to enter the following information (in order): first name, last name, grade, age, and hometown. Then, print each value in the specified format.

![Exercise 1 Output](https://github.com/ap-java-ucvts/pset-2-skeleton/blob/master/images/pset-2-exercise-1.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* `if` statements, `switch` statements, and loops are not permitted.

### Exercise 2

Given a dollar amount in the range [0.00, 1.00], print the number of dollar bills, quarters, dimes, nickels, and pennies needed to produce this amount.

![Exercise 2 Output](https://github.com/ap-java-ucvts/pset-2-skeleton/blob/master/images/pset-2-exercise-2.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* Use a constant to represent the value of a dollar.
* Use a constant to represent the value of a quarter.
* Use a constant to represent the value of a dime.
* Use a constant to represent the value of a nickel.
* `if` statements, `switch` statements, and loops are not permitted.

### Exercise 3

Given a dollar amount in the range [0.00, 20.00], print the smallest number of bills and coins needed to produce this amount.

![Exercise 3 Output](https://github.com/ap-java-ucvts/pset-2-skeleton/blob/master/images/pset-2-exercise-3.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* Reuse the constant previously declared to represent the value of a dollar.
* Reuse the constant previously declared to represent the value of a quarter.
* Reuse the constant previously declared to represent the value of a dime.
* Reuse the constant previously declared to represent the value of a nickel.
* Use a constant to represent the value of a ten dollar bill.
* Use a constant to represent the value of a five dollar bill.
* `if` statements, `switch` statements, and loops are not permitted.

### Exercise 4

Given a number of inches, print the equivalent number of miles, yards, feet, and inches.

![Exercise 4 Output](https://github.com/ap-java-ucvts/pset-2-skeleton/blob/master/images/pset-2-exercise-4.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* Use a constant to represent the number of inches in a mile.
* Use a constant to represent the number of inches in a yard.
* Use a constant to represent the number of inches in a foot.
* `if` statements, `switch` statements, and loops are not permitted.

### Exercise 5

Given a number of centimeters, print the equivalent number of kilometers, meters, and centimeters.

![Exercise 5 Output](https://github.com/ap-java-ucvts/pset-2-skeleton/blob/master/images/pset-2-exercise-5.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* Use a constant to represent the number of centimeters in a kilometer.
* Use a constant to represent the number of centimeters in a meter.
* `if` statements, `switch` statements, and loops are not permitted.

### Exercise 6

Given a diameter, print the area and circumference of the corresponding circle.

![Exercise 6 Output](https://github.com/ap-java-ucvts/pset-2-skeleton/blob/master/images/pset-2-exercise-6.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* Format the area the two decimals.
* Format the circumference to two decimals.
* `if` statements, `switch` statements, and loops are not permitted.

### Exercise 7

Given a length and width, print the area, perimeter, and diagonal of the corresponding rectangle.

![Exercise 7 Output](https://github.com/ap-java-ucvts/pset-2-skeleton/blob/master/images/pset-2-exercise-7.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* Format the area the two decimals.
* Format the perimeter to two decimals.
* Format the diagonal to two decimals.
* `if` statements, `switch` statements, and loops are not permitted.

### Exercise 8

Given a side length, print the area and perimeter of the corresponding hexagon.

![Exercise 8 Output](https://github.com/ap-java-ucvts/pset-2-skeleton/blob/master/images/pset-2-exercise-8.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* Format the area the two decimals.
* Format the perimeter to two decimals.
* `if` statements, `switch` statements, and loops are not permitted.

### Exercise 9

Given a string, reverse and print the first and second halves of that string.

![Exercise 9 Output](https://github.com/ap-java-ucvts/pset-2-skeleton/blob/master/images/pset-2-exercise-9.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* `if` statements, `switch` statements, and loops are not permitted.

### Exercise 10

Given a first, middle, and last name, print the corresponding initials.

![Exercise 10 Output](https://github.com/ap-java-ucvts/pset-2-skeleton/blob/master/images/pset-2-exercise-10.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* `if` statements, `switch` statements, and loops are not permitted.

## Deliverables

Your code should produce the following output.

<span>
  <img src="https://github.com/ap-java-ucvts/pset-2-skeleton/blob/master/images/pset-2-all-1.png" alt="Problem Set 2a Output" width="49.75%"/> <img src="https://github.com/ap-java-ucvts/pset-2-skeleton/blob/master/images/pset-2-all-2.png" alt="Problem Set 2b Output" width="49.75%"/>
</span>

## Deadline

Please read very carefully. Historically, most students lose points on problem sets for simply failing to read the instructions and requirements.

* October 1, 2019, at 11:59pm.

If you submit your problem set at midnight (i.e., October 2, 2019, at 12:00am), it is considered **late**!

### Submission Requirements

* Your code **must** compile. Code that fails to meet this minimum requirement will not be accepted.
* There must be **at least** 5 unique commits to your repository.
* Your code must meet each requirement outlined in the *Exercises* and *Deliverables* sections.
* Your code must adhere to the course style guidelines.

Happy coding!
