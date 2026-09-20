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
========================================================
        SWITCH STATEMENT - AREA CALCULATOR
========================================================

Write a Java program using Scanner and switch statement
to calculate the area of different shapes.
Display the following menu:

1. Triangle
2. Circle
3. Rectangle
4. Square
Take the user's choice using Scanner.
Based on the choice, calculate the area using the
following formulas:

1. Triangle:
   Area = 0.5 × base × height
2. Circle:
   Area = 3.14 × radius × radius
3. Rectangle:
   Area = length × breadth
4. Square:
   Area = side × side

If the user enters any choice other than 1, 2, 3, or 4,
print:
"Invalid Choice"

*/

import java.util.Scanner;
class Shapes{
  public static void main(String [] args){
    Scanner s=new Scanner(System.in);
    System.out.println("1.Triangle");
    System.out.println("2.Circle");
    System.out.println("3.Rectangle");
    System.out.println("4.Square");
    System.out.print("Enter your choice : ");
    int choice=s.nextInt();
    switch(choice){
      case 1:
        System.out.print("Enter base : ");
        double base=s.nextDouble();
        System.out.print("Enter height : ");
        double height=s.nextDouble();
        double triangle=0.5*base*height;
        System.out.println("Area of triangle is " + triangle);
      case 2:
        System.out.print("Enter radius : ");
        double base=s.nextDouble();
        double circle=3.14*radius*radius;
        System.out.println("Area of circle is " + circle);
    }
    
  }
}
