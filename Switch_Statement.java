                              //SWITCH_STATEMENTS

A switch statement is used when you want to check one value against multiple fixed values.
/*
================================================
        SWITCH STATEMENT PRACTICE
================================================

Instructions:
1. Use switch statement.
2. Do not use Scanner.
3. Use break after each case.
4. Use default for invalid input.
5. Solve each question separately.
*/


/*
------------------------------------------------
QUESTION 1: Day of the Week
------------------------------------------------

Given:
int day = 3;
Write a program using switch to print:
1 → "Monday"
2 → "Tuesday"
3 → "Wednesday"
4 → "Thursday"
5 → "Friday"
6 → "Saturday"
7 → "Sunday"
If the number is not between 1 and 7:
→ "Invalid Day"

*/
class Day{
  public static void main(String [] args){
    int day=3;
    switch(day){
      case 1:System.out.println("Monday");
        break;
      case 2:System.out.println("Tuesday");
        break;
      case 3:System.out.println("Wednesday");
        break;
      default :System.out.println("Invalid Day");
    }
  }
}
                    //OR WITH SCANNER

import java.util.Scanner;
class Day{
  public static void main(String [] args){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter no between 1-4 : ");
    int day=s.nextInt();
    switch(day){
      case 1:System.out.println("Monday");
        break;
      case 2:System.out.println("Tuesday");
        break;
      case 3:System.out.println("Wednesday");
        break;
      default :System.out.println("Invalid Day");
    }
  }
}
/*
------------------------------------------------
QUESTION 2: Vowel
------------------------------------------------
Given:
char ch = 'A';
Write a program using switch to check:
A → "Vowel"
E → "Vowel"
I → "Vowel"
O → "Vowel"
U → "Vowel"
If the character is not a vowel:
→ "Not a Vowel"
*/
class Alphabet{
  public static void main(String [] args){
    char ch='A';
    switch(ch){
      case 1:System.out.println("Vowel");
        break;
      case 2:System.out.println("Vowel");
        break;
      case 3:System.out.println("Vowel");
        break;
      case 4:System.out.println("Vowel");
        break;
      case 5:System.out.println("Vowel");
        break;
      default:System.out.println("Not a vowel");
    }
  }
}
              //WITH SCANNER CLASS
import java.util.Scanner;
class Alphabet{
  public static void main(String [] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter charater : ");
    char ch=s.next().charAt(0);
    switch(ch){
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        System.out.println("Its a vowels");
        break;
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U': 
        System.out.println("Its a vowels");
        break;
      default:
        System.out.println("Its a consonant");
    }
  }
}

/*
------------------------------------------------
QUESTION 3: Calculator
------------------------------------------------

Given:
int a = 20;
int b = 5;
char operator = '+';

Write a program using switch:

'+' → Addition
'-' → Subtraction
'*' → Multiplication
'/' → Division

Expected Output:
25
*/


/*
------------------------------------------------
QUESTION 4: Month
------------------------------------------------

Given:
int month = 4;

Write a program using switch to print:

1 → "January"
2 → "February"
3 → "March"
4 → "April"
5 → "May"
6 → "June"
7 → "July"
8 → "August"
9 → "September"
10 → "October"
11 → "November"
12 → "December"

If the number is not between 1 and 12:
→ "Invalid Month"

Expected Output:
April
*/


/*
------------------------------------------------
QUESTION 5: Menu Selection
------------------------------------------------

Given:
int choice = 2;

Write a program using switch:

1 → "Pizza"
2 → "Burger"
3 → "Pasta"
4 → "Sandwich"
5 → "Coffee"

For any other number:
→ "Invalid Choice"

Expected Output:
Burger
*/


/*
------------------------------------------------
QUESTION 6: Number to Word
------------------------------------------------

Given:
int num = 5;

Write a program using switch:

1 → "One"
2 → "Two"
3 → "Three"
4 → "Four"
5 → "Five"

For any other number:
→ "Invalid Number"

Expected Output:
Five
*/

/*
================================================
                 END
================================================
*/
