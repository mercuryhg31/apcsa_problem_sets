# Problem Set 1

It's time to put your skills to the test. This problem set focuses on using primitive data types, variables, and basic operators and functions.

## Getting Started

To get started, create a [GitHub](https://github.com/) repository to store your code. When you're finished, clone my skeleton to get all of the starter code and instructions. Setup a remote to push your code to your repository instead of mine.

### Setup

1. Login to your GitHub account and create a new repository named `pset-1`.
2. In the terminal, navigate to your `APCSA` directory on the `Desktop`.
```
$ cd ~/Desktop/APCSA
```
3. Clone my skeleton repository into a directory named `pset-1`.
```
$ git clone git@github.com:ap-java-ucvts/pset-1-skeleton.git pset-1
```
4. Change into your newly created `pset-1` directory.
```
$ cd pset-1
```
5. Overwrite the remote, which originally points at my skeleton repository.
```
$ git remote rename origin upstream
```
6. Add a new remote that points at your `pset-1` repository. Replace `YOUR-USERNAME` with your actual username.
```
$ git remote add origin git@github.com:YOUR-USERNAME/pset-1.git
```
7. Open up the `ProblemSet1.java` file in the text editor of your choice.

That's a lot of comments. Read each one carefully, as they are designed to point you in the right direction for each exercise.

## Exercises

The specifications for each exercise are outlined below. Unlike last time, there's is almost no code written for you. Your job is to write lines of code to produce answers to my questions. Your code must meet the requirements set forth in this section (as well as the *Deliverables* section).

Work through these exercises on your own. Experiment, make mistakes, ask questions, and fix your mistakes. It's the only way to get good at programming.

### Exercise 1

What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?

![Exercise 1 Output](https://github.com/ap-java-ucvts/pset-1-skeleton/blob/master/images/pset-1-exercise-1.png)

* Insert one line feed above and below the desired output.
* Use a constant to represent the length of the sheet.
* Use a constant to represent the width of the sheet.
* Use a constant to represent the conversion factor between inches and millimeters.
* Round the square millimeters to two decimals.
* Format the square millimeters with separating commas.
* `if` statements, `switch` statements, and loops are not permitted.

### Exercise 2

What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?

![Exercise 2 Output](https://github.com/ap-java-ucvts/pset-1-skeleton/blob/master/images/pset-1-exercise-2.png)

* Insert one line feed above and below the desired output.
* Reuse the constant previously declared to represent the length of the sheet.
* Reuse the constant previously declared to represent the width of the sheet.
* Use a constant to represent the conversion factor between inches and centimeters.
* Round the centimeters to two decimals.
* `if` statements, `switch` statements, and loops are not permitted.

### Exercise 3

What is the length of the diagonal (in inches) between two corners on an 8.5-by-11-inch sheet of paper?

![Exercise 3 Output](https://github.com/ap-java-ucvts/pset-1-skeleton/blob/master/images/pset-1-exercise-3.png)

* Insert one line feed above and below the desired output.
* Reuse the constant previously declared to represent the length of the sheet.
* Reuse the constant previously declared to represent the width of the sheet.
* Round the inches to two decimals.
* `if` statements, `switch` statements, and loops are not permitted.

### Exercise 4

Given the grading policy and the homework, quiz, and test grades I received, what marking period grade will I get?

The grading policy defines the following weights.
* Homework, 15%
* Quizzes, 35%
* Tests, 50%

![Exercise 4 Output](https://github.com/ap-java-ucvts/pset-1-skeleton/blob/master/images/pset-1-exercise-4.png)

* Insert one line feed above and below the desired output.
* Use a constant to represent the weight of the homework category.
* Use a constant to represent the weight of the quiz category.
* Use a constant to represent the weight of the test category.
* Do not change the data types of the variables declared and initialized in the skeleton code.
* Round the grade to two decimals.
* `if` statements, `switch` statements, and loops are not permitted.

### Exercise 5

I make $12.50/hour working as a cashier at a local supermarket. How much money will I make this week?

Here are the days and hours I worked this week.
* Monday, 7.5 hours
* Tuesday, 8 hours
* Wednesday, 10.5 hours
* Thursday, 9.5 hours
* Friday, 6 hours
* Saturday, 11.5 hours
* Sunday, 0 hours

![Exercise 5 Output](https://github.com/ap-java-ucvts/pset-1-skeleton/blob/master/images/pset-1-exercise-5.png)

* Insert one line feed above and below the desired output.
* Use a constant to represent the hourly wage.
* Round the dollar amount to two decimal places.
* Format the dollar amount with a dollar sign.
* `if` statements, `switch` statements, and loops are not permitted.

### Exercise 6

What is my take-home pay each check? I make $117,000/year and get paid twice per month.

My pay period deductions are as follows.
* Federal income tax, 24.0%
* State income tax, 6.37%
* 401k contribution (pre-tax), 7.0%

![Exercise 6 Output](https://github.com/ap-java-ucvts/pset-1-skeleton/blob/master/images/pset-1-exercise-6.png)

* Insert one line feed above and below the desired output.
* Use a constant to represent my salary.
* Use a constant to represent the federal tax rate.
* Use a constant to represent the state tax rate.
* Use a constant to represent my pre-tax 401k contribution.
* Round the dollar amount to two decimals.
* Format the dollar amount with a dollar sign.
* Format the dollar amount with separating commas.
* `if` statements, `switch` statements, and loops are not permitted.

### Exercise 7

I am planning a class trip next month.  How many buses do I need, and how many people will be on the last bus?

Here are the logistics of the trip.
* 273 students
* 28 teachers (including myself)
* 54-passenger capacity
* All buses are filled to capacity before moving to the next bus

![Exercise 7 Output](https://github.com/ap-java-ucvts/pset-1-skeleton/blob/master/images/pset-1-exercise-7.png)

* Insert one line feed above and below the desired output.
* Use a constant to represent the number of students going on the trip.
* Use a constant to represent the number of teachers going on the trip.
* Use a constant to represent the capacity of each bus.
* `if` statements, `switch` statements, and loops are not permitted.

### Exercise 8

What is the surface area of a standard Cornhole board? The board is 48-by-24 inches, with a hole 6-inches in diameter.

![Exercise 8 Output](https://github.com/ap-java-ucvts/pset-1-skeleton/blob/master/images/pset-1-exercise-8.png)

* Insert one line feed above and below the desired output.
* Use a constant to represent the length of the board.
* Use a constant to represent the width of the board.
* Use a constant to represent the diameter of the hole.
* Round the square inches to two decimals.
* Format the square inches with separating commas.
* `if` statements, `switch` statements, and loops are not permitted.

### Exercise 9

Are the years 2020, 2100, and 2400 leap years?

* Insert one line feed above and below the desired output.
A leap year is defined as any given year that meets the following requirements.
* divisible by 4
* divisible by 4, but not by 100
* divisible by 4 and not by 100, unless divisible by 400

![Exercise 9 Output](https://github.com/ap-java-ucvts/pset-1-skeleton/blob/master/images/pset-1-exercise-9.png)

* Use a single variable to represent the year.
* Use a single variable to represent whether the year is a leap year.
* `if` statements, `switch` statements, and loops are not permitted.

### Exercise 10

According the National Weather Service, wind chill is defined by the following formula.
* *35.74 + 0.6215t + (0.4275t - 35.75)v<sup>0.16</sup>*

If `t` (temperature) is 38°F, and `v` (wind speed) is 14 MPH, what is the wind chill?

![Exercise 10 Output](https://github.com/ap-java-ucvts/pset-1-skeleton/blob/master/images/pset-1-exercise-10.png)

* Insert one line feed above and below the desired output.
* Round the wind chill to one decimal.
* `if` statements, `switch` statements, and loops are not permitted.

## Deliverables

Your code should produce the following output.

![Problem Set 1 Output](https://github.com/ap-java-ucvts/pset-1-skeleton/blob/master/images/pset-1-all.png)

## Deadline

Please read very carefully. Historically, most students lose points on problem sets for simply failing to read the instructions and requirements.

* September 23, 2019, at 11:59pm.

If you submit your problem set at midnight (i.e., September 24, 2019, at 12:00am), it is considered **late**!

### Submission Requirements

* Your code **must** compile. Code that fails to meet this minimum requirement will not be accepted.
* There must be **at least** 5 unique commits to your repository.
* Your code must meet each requirement outlined in the *Exercises* and *Deliverables* sections.
* Your code must adhere to the course style guidelines.

Happy coding!
