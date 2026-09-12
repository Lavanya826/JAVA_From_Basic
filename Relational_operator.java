# Java Relational Operators – Practice Questions

Relational Operators:
`>`, `<`, `>=`, `<=`, `==`, `!=`

---

## 🟢 EASY

### Q1. Greater Than
Take two integers and check whether the first number is greater than the second number.

Example:
Input: `10 5`
Output: `true`
  
class Integer{
  public static void main(String [] args){
    int a=8,b=9;
    System.out.println(a>b);
  }
}

### Q2. Less Than
Take two integers and check whether the first number is less than the second number.

Example:
Input: `5 10`
Output: `true`

class Interger2{
  public static void main(String [] args){
    int a=5,b=10;
    System.out.println(a<b);
  }
}

### Q3. Equal Numbers
Take two integers and check whether both numbers are equal.

Example:
Input: `10 10`
Output: `true`

class Integer3{
  public static void main(String [] args){
    int a=10,b=10;
    System.out.println(a==b);
  }
}

### Q4. Not Equal
Take two integers and check whether the numbers are not equal.

Example:
Input: `10 20`
Output: `true`

class Interger4{
  public static void main(String [] args){
    int a=10,b=20;
    System.out.println(a!=b);
  }
}
//USING SCANNER CLASS
import java.util.Scanner;
class Interger4{
  public static void main(String [] args){
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the number : ");
    int a=s.nextInt();
    System.out.print("Enter the number : ");
    int b=s.nextInt();
    System.out.println(a==b);
  }
}


### Q5. Greater Than or Equal
Take a number and check whether it is greater than or equal to 50.

Example:
Input: `50`
Output: `true`

class Equal{
  public static void main(String [] args){
    int a=50;
    System.out.println(a>=50);
  }
}

### Q6. Less Than or Equal
Take a number and check whether it is less than or equal to 100.

Example:
Input: `80`
Output: `true`

class Equal{
  public static void main(String [] args){
    int a=50;
    System.out.println(a<=100);
  }
}

## 🟡 MEDIUM

### Q7. Voting Eligibility
Take a person's age and check whether the person is eligible to vote.

Condition:
Age should be greater than or equal to 18.

Example:
Input: `20`
Output: `true`

class Equal{
  public static void main(String [] args){
    int a=20;
    System.out.println(a>=18);
  }
}

### Q8. Passing Marks
Take a student's marks and check whether the student has passed.

Condition:
Marks should be greater than or equal to 40.

Example:
Input: `55`
Output: `true`

class Equal{
  public static void main(String [] args){
    int a=55;
    System.out.println(a>=40);
  }
}

### Q9. Positive Number
Take an integer and check whether it is greater than 0.

Example:
Input: `15`
Output: `true`

class Equal{
  public static void main(String [] args){
    int a=15;
    System.out.println(a>=6);
  }
}

### Q10. Negative Number
Take an integer and check whether it is less than 0.

Example:
Input: `-5`
Output: `true`

class Equal{
  public static void main(String [] args){
    int a=5;
    System.out.println(a>0);
  }
}

