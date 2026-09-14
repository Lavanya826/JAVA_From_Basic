//Example 1.Create class vote and check whether raju is eligible to vote or not if his age=32.
  class Vote{
  public static void main (String [] args){
    int age=32;
    String res=(age>=18)? "eligible" : "not eligible";
    System.out.println(res);
  }
  }

//Example 2: Check even or odd
  class Numbers{
  public static void main(String [] args){
    int a=-7;
    String result=(a<=0)? "Its odd number" : "Its even number";
    System.out .println(result);
  }
  }
 
//Example 3: Find greater number
  class Highestno{
  public static void main (String [] args){
    int a=32;
    int b=90;
    String res=(a>b)? "a is lower":"b is higher";
    System.out.println(res);
  }
  }



//SACNNER CLASS USING TERNARY OPERATOR
//check whether triangle is right angled, obtuse angled or acute angled.
import java.util.Scanner;
class Demo{
  public static void main(String [] args){
    Scanner s= new Scanner(System.in);
    System.out.print("Enter all 3 sides : ");
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    String res=(c*c=a*a+b*b)?"RIGHT ANGLE": //3 4 5 
               (c*c>a*a+b*b)?"OBTUSE ANGLE": //3 4 6
               "ACUTE ANGLE";
    System.out.println(res);
  }
}

//Cheack whether triangle is Equilateral, Isosceles or Scalene.
import java.util.Scanner;
class Demo{
  public static void main(String [] args){
    Scanner s= new Scanner(System.in);
    System.out.print("Enter all 3 sides : ");
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    String res=(a==b && b==c)?"EQUILATERAL": //3 4 5 
               (a==b || b==c || c==a)?"ISOSALES": //3 4 6
               "SCALAR";
    System.out.println(res);
  }
}

//Cheack whether triangle is Positive,Negative and Neutral.
import java.util.Scanner;
class Demo{
  public static void main(String [] args){
    Scanner s= new Scanner(System.in);
    System.out.print("Enter all 3 sides : ");
    int a=s.nextInt();
    String res=(a<0)?("negative"):
               (a>0)?("positive"):
                ("neutral");
    System.out.println(res);
  }
}
