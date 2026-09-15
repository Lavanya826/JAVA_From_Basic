                                                  //IF_STATEMENTS 
-If statement in java is a conditional statement which helps the programmer in making a decision whether to execute a block of code or not 
based on certain condition is known as IF statement. 
-Syntax:
if(condition) {
    // statements
}

-What type of condition can we use in if?
→ The condition must result in a boolean value (true or false).

-Can we use an integer directly as a condition in Java?
→ NO.Java does not treat 10 as true. The condition must be boolean.

-What happens if the condition is false?
→ The statements inside the if block are skipped.

//PROBLEMS
1.Take a number and print "Positive" if the number is greater than 0.
class Integer{
  public static void main(String [] args){
    int a=3;
    if(a>0){
      System.out.println(a + " is Positive");
    }
  }
}

2.Take a number and print "Negative" if the number is less than 0.
class Negative{
  public static void main(String [] args){
    int b=-1;
    if(b<0){
      System,out.println("Negative");
    }
  }
}

3.Take a number and print "Greater than 10" if it is greater than 10.
class Number{
  public static void main(String [] args){
    int a=89;
    if(a>10){
      System.out.println("greater than 10");
    }
  }
}

4.Take age and print "Adult" if age is 18 or above.
class Adult{
  public static void main(String [] args){
    int age=54;
    if (age>=18){
    System.out.println("Adult");
    }
  }
}
  
5.Take marks and print "Pass" if marks are 40 or above.
class Marks{
  public static void main(String [] args){
    int marks=67;
    if(marks>=40){
      System.out.println("Pass");
    }
  }
}

6.Take a number and print "Even" if the number is divisible by 2.
class Even{
  public static void main(String [] args){
    int a=26;
    if(a%2==0){
      System.out.println("Even");
    }
  }
}









  
