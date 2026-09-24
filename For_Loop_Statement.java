                          //FOR LOOP STATEMENT

For loop is used when we want to repeat a block of code multiple times.
For example while printing pattern...we were doing this...System.out.println(" * ")...but now if there are 5000 lines then we wont type
  the line one by one instead we will use for loop.
SYNTAX:
  for( iteration ; condition ; updation){
    //statement
  }
PROGRAM:
Level 1 — Basic
  
1. Print numbers from 1 to 10.
class Demo{
  public static void main(String [] args){
    for( int a=1; a<=10; a++){
      System.out.println(a);
    }
  }
}

2. Print numbers from 10 to 1.
class Demo{
  public static void main(String [] args){
    for(int b=10;b>=1 ;b--){
      System.out.println(b);
    }
  }
}
3. Print numbers from 1 to 20.
class Demo{
  public static void main(String [] args){
    for(int c=1;c<=20 ;c++){
      System.out.println(c);
    }
  }
}

4. Print all even numbers from 1 to 20.
class Demo{
  public static void main(String [] args){
    for(int c=2;c<=20 ;c+=2){
      System.out.println(c);
    }
  }
}

5. Print all odd numbers from 1 to 20.
class Demo{
  public static void main(String [] args){
    for(int c=1;c<=20 ;c+=2){
      System.out.println(c);
    }
  }
}

6.Print even number 10 to 1
import java.util.Scanner;
class Even{
  public static void main(String [] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter sp :");
    int sp=s.nextInt();
    System.out.println("Enter ep :");
    int ep=s.nextInt();
    for(int i=10;i>=1;i--){
      if(i%2==0){
        System.out.println(i);
      }
    }
  }
}
