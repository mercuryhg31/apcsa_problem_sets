# Problem Set 3

It's time to put your skills to the test. This problem set focuses on using conditional control structures. It's also your first introduction to methods, so things look a little different. The `main` method is done for you. Lines 31-40 trigger each of the predefined methods, which you can think of as self-contained executable pieces of logic. Write your code for each exercise in the corresponding method.

## Getting Started

To get started, create a [GitHub](https://github.com/) repository to store your code. When you're finished, clone my skeleton to get all of the starter code and instructions. Setup a remote to push your code to your repository instead of mine.

### Setup

1. Login to your GitHub account and create a new repository named `pset-3`.
2. In the terminal, navigate to your `APCSA` directory on the `Desktop`.
```
$ cd ~/Desktop/APCSA
```
3. Clone my skeleton repository into a directory named `pset-3`.
```
$ git clone git@github.com:ap-java-ucvts/pset-3-skeleton.git pset-3
```
4. Change into your newly created `pset-3` directory.
```
$ cd pset-3
```
5. Overwrite the remote, which originally points at my skeleton repository.
```
$ git remote rename origin upstream
```
6. Add a new remote that points at your `pset-3` repository. Replace `YOUR-USERNAME` with your actual username.
```
$ git remote add origin git@github.com:YOUR-USERNAME/pset-3.git
```
7. Open up the `ProblemSet3.java` file in the text editor of your choice.

That's a lot of comments. Read each one carefully, as they are designed to point you in the right direction for each exercise.

## Exercises

The specifications for each exercise are outlined below. Your job is to write lines of code to produce answers to my questions. Each exercise requires that you ask the user to enter one or more values. Your code must meet the requirements set forth in this section (as well as the *Deliverables* section).

Work through these exercises on your own. Experiment, make mistakes, ask questions, and fix your mistakes. It's the only way to get good at programming.

### Exercise 1

Prompt the user to enter an integer. Is it positive, negative, or zero?

There are three possible outputs.
* `Positive.`
* `Negative.`
* `Zero.`

Your code must work for all integers in the range [-2<sup>31</sup> - 1, 2<sup>31</sup>].

![Exercise 1 Output](https://github.com/ap-java-ucvts/pset-3-skeleton/blob/master/images/pset-3-exercise-1.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.

### Exercise 2

Prompt the user to enter an integer. Is it even or odd?

There are two possible outputs.
* `Even.`
* `Odd.`

Remember, 0 is an even number. Your code must work for all integers in the range [-2<sup>31</sup> - 1, 2<sup>31</sup>].

![Exercise 2 Output](https://github.com/ap-java-ucvts/pset-3-skeleton/blob/master/images/pset-3-exercise-2.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.

### Exercise 3

Prompt the user to enter three integers. How are the integers ordered?

There are five possible outputs.
* `Strictly increasing.`, where each integer is greater than the previous.
* `Increasing.`, where each integer is greater than or equal to the previous.
* `Decreasing.`, where each integer is less than or equal to the previous.
* `Strictly decreasing.`, where each integer is less than the previous.
* `Unordered.`, where none of the above applies.

Your code must work for all integers in the range [-2<sup>31</sup> - 1, 2<sup>31</sup>].

![Exercise 3 Output](https://github.com/ap-java-ucvts/pset-3-skeleton/blob/master/images/pset-3-exercise-3.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.

### Exercise 4

Prompt the user to enter a letter grade. What's the corresponding GPA?

There are two possible outputs.
* `Your GPA is #.##.`
* `That's not a valid letter grade.`

Letter grades are given the following numeric equivalents.
* `A` is worth 4.00 points.
* `B` is worth 3.00 points.
* `C` is worth 2.00 points.
* `D` is worth 1.00 points.
* `F` is worth 0.00 points.

Letter grades may or may not be suffixed with a `+` or `-`. With a few exceptions, a `+` adds 0.33 points to the baseline value of that letter, while a `-` subtracts 0.33 points. There is no `F+` or `F-`, and the maximum grade point is 4.00 (meaning an `A` and `A+` are scored the same). Your code must be case-insensitive.

![Exercise 4 Output](https://github.com/ap-java-ucvts/pset-3-skeleton/blob/master/images/pset-3-exercise-4.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* Use constants to represent the fixed values for A, B, C, D, and F. No magic numbers.
* Use a constant to represent the point addition/deduction for the optional `+`/`-`. No magic numbers.
* Round the GPA to two decimals.

### Exercise 5

Prompt the user to enter a grade. What's the corresponding letter grade?

There are four possible outputs.
* `You received a X.`
* `You received an X.`
* `Grades above 100 are invalid.`
* `Grades below 0 are invalid.`

The grading policy is defined as follows.
* 90-100 constitutes an A.
* 80-89 constitutes a B.
* 70-79 constitutes a C.
* 60-69 constitutes a D.
* 0-59 constitutes an F.
* All other grades are invalid.

Your code must support fractional grades, and your output must be grammatically correct.

![Exercise 5 Output](https://github.com/ap-java-ucvts/pset-3-skeleton/blob/master/images/pset-3-exercise-5.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* Use constants to represent the thresholds as needed. No magic numbers.

### Exercise 6

Prompt the user to enter a playing card. What card was entered?

There are four possible suites.
* `Clubs`
* `Diamonds`
* `Hearts`
* `Spades`

There are 13 possible ranks.
* `Two`
* `Three`
* `Four`
* `Five`
* `Six`
* `Seven`
* `Eight`
* `Nine`
* `Ten`
* `Jack`
* `Queen`
* `King`
* `Ace`

Possible inputs will be a combination of ranks and suits, where ranks are written as `2-9`, `T`, `J`, `Q`, `K`, or `A`, and suits are written as `C`, `D`, `H`, or `S`.

There are three possible outputs.
* `Rank of Suit.`
* `That's not a valid suit.`
* `That's not a valid rank.`

Your code must be case-insensitive.

![Exercise 6 Output](https://github.com/ap-java-ucvts/pset-3-skeleton/blob/master/images/pset-3-exercise-6.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.

### Exercise 7

Prompt the user to enter a year. Is it a leap year or not?

There are two possible outputs.
* `X is a leap year.`
* `X is not a leap year.`

Your code must support years in the range [0, 2<sup>31</sup>].

![Exercise 7 Output](https://github.com/ap-java-ucvts/pset-3-skeleton/blob/master/images/pset-3-exercise-7.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.

### Exercise 8

Prompt the user to enter a temperature. At that temperature, is water a solid, liquid, or gas?

There are four possible outputs.
* `Solid.`
* `Liquid.`
* `Gas.`
* `That's not a valid scale.`

Your code must support Celsius and Fahrenheit temperature, which are designated by the scale (`C` for Celsius, and `F` for Fahrenheit). Your code must be case-insensitive.
     
![Exercise 8 Output](https://github.com/ap-java-ucvts/pset-3-skeleton/blob/master/images/pset-3-exercise-8.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* Use constants to represent the freezing and boiling points as needed. No magic numbers.

### Exercise 9

Prompt the user to enter a month. How many days are in that month?

There are four possible outputs.
* `28 or 29 days.`
* `30 days.`
* `31 days.`
* `That's not a valid month.`

Your code must recongnize months fully spelled out, abbreviated to the first three letters, or abbreviated to the first four latters. It must be case-insensitive.

![Exercise 9 Output](https://github.com/ap-java-ucvts/pset-3-skeleton/blob/master/images/pset-3-exercise-9.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.

### Exercise 10

Prompt the user to enter a wage and hours worked. How much money will be made?

There are three possible outputs.
* `You'll make $#,###.## this week.`
* `Your wage must be greater than or equal to $0.00/hour.`
* `Your hours must be greater than or equal to 0.0.`

![Exercise 10 Output](https://github.com/ap-java-ucvts/pset-3-skeleton/blob/master/images/pset-3-exercise-10.png)

* Insert one line feed above and below the desired output.
* Insert one line feed between the prompts and the printed values.
* Use constants to represent the overtime thresholds and pay multiplier as needed. No magic numbers.
* Round the dollar amount to two decimals.
* Format the dollar amount with separating commas.

## Deliverables

Your code should produce the following output.

![Problem Set 3 Output](https://github.com/ap-java-ucvts/pset-3-skeleton/blob/master/images/pset-3-all.png)

## Deadline

Please read very carefully. Historically, most students lose points on problem sets for simply failing to read the instructions and requirements.

* October 13, 2019, at 11:59pm.

If you submit your problem set at midnight (i.e., October 14, 2019, at 12:00am), it is considered **late**!

### Submission Requirements

* Your code **must** compile. Code that fails to meet this minimum requirement will not be accepted.
* There must be **at least** 5 unique commits to your repository.
* Your code must meet each requirement outlined in the *Exercises* and *Deliverables* sections.
* Your code must adhere to the course style guidelines.

Happy coding!
