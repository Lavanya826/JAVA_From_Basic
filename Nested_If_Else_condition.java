                                 //NESTED IF ELSE CONDITION

The 'If' condition is present in another 'If' condition is known as nested if else condition.

/*
------------------------------------------------
QUESTION 1: Vowel, Consonant or Not an Alphabet
------------------------------------------------
Given:
char ch = 'A';
Write a program to check:
1. If the character is an alphabet:
      - If the character is a vowel (A, E, I, O, U)
            → print "Vowel"
      - Otherwise
            → print "Consonant"
2. If the character is not an alphabet:
      - Print "Not an Alphabet"
*/
import java.util.Scanner;
class Nested{
  public static void main(String [] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a Charater");
    char ch=s.next().charAt(0);
    if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
      if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
        System.out.println("Its a vowels");
      }
      else{
        System.out.println("Its a consonant");
      } 
    }
    else{
      System.out.println("Its not a alphabet");
    }
  }
}
/*
------------------------------------------------
QUESTION 2: Student Result
------------------------------------------------

Given:
int marks = 75;
Write a program to check:
1. If the student has passed (marks >= 40):
      - If marks are 75 or above → print "Distinction"
      - Otherwise → print "Pass"
2. If marks are below 40:
      - Print "Fail"
*/
class Demo{
  public static void main(String [] args){
    int marks=75;
    if(marks>=40){
      if(marks>=75){
        System.out.println("Distinction");
      }
      else{
        System.out.println("Pass");
      }
    }
    else{
      System.out.println("Fail");
    }
  }
}

/*
------------------------------------------------
QUESTION 3: Login System
------------------------------------------------
Given:
String username = "admin";
String password = "1234";
Write a program to check:
1. If the username is correct:
      - If the password is correct → print "Login Successful"
      - Otherwise → print "Wrong Password"
2. If the username is incorrect:
      - Print "Wrong Username"
*/
class Login{
  public static void main(String [] args){
    String username="admin";
    String password="1234";
    if (username=="admin"){
      if(password=="1234"){
        System.out.println("Login Successful");
      }
      else{
        System.out.println("Wrong Password");
      }
    }
    else{
      System.out.println("Wrong username");
    }
  }
}

/*
------------------------------------------------
QUESTION 4: Age Category
------------------------------------------------

Given:
int age = 25;
Write a program to check:

1. If age is 18 or above:
      - If age is 60 or above → print "Senior Citizen"
      - Otherwise → print "Adult"

2. If age is below 18:
      - Print "Minor"

Expected Output:
Adult
*/


/*
------------------------------------------------
QUESTION 5: Number Classification
------------------------------------------------

Given:
int num = -8;

Write a program to check:

1. If the number is not zero:
      - If the number is positive → print "Positive"
      - Otherwise → print "Negative"

2. If the number is zero:
      - Print "Zero"

Expected Output:
Negative
*/


/*
------------------------------------------------
QUESTION 6: ATM Withdrawal
------------------------------------------------

Given:
int balance = 5000;
int withdraw = 3000;

Write a program to check:

1. If the withdrawal amount is positive:
      - If withdraw amount is less than or equal to balance
          → print "Withdrawal Successful"
      - Otherwise
          → print "Insufficient Balance"

2. If withdrawal amount is not positive:
      - Print "Invalid Amount"

Expected Output:
Withdrawal Successful
*/


/*
------------------------------------------------
QUESTION 7: Exam Eligibility
------------------------------------------------

Given:
int attendance = 80;
boolean medicalCertificate = false;

Write a program to check:

1. If attendance is 75 or above:
      - If medicalCertificate is true → print "Eligible"
      - Otherwise → print "Eligible"
      
2. If attendance is below 75:
      - If medicalCertificate is true → print "Eligible with Medical Certificate"
      - Otherwise → print "Not Eligible"

Expected Output:
Eligible
*/

