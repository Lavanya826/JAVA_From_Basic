                                   //If Else If Statements
If and Else if statement is used when we want multiple condition and only one result should be excuted.

                        //Rule: Use only if, else if, and else. No Scanner.

/*
1.Write a Java program without Scanner:
temperature = 35
If temperature is above 40 → print "Very Hot"
If temperature is 30–40 → print "Hot"
If temperature is 20–29 → print "Normal"
Otherwise → print "Cold"    */

  class Demo{
  public static void main(String [] args){
    int temp=35;
    if(temp >40){
      System.out.println("Its very hot");
    }
    else if(temp>=30){
      System.out.println("Its hot");
    }
    else if(temp>=20){
      System.out.println("Its Normal");
    }
    else{
      System.out.println("Its cold");
    }
  }
}

/*
2.Write a program to print:

Positive → "Positive"
Negative → "Negative"
Zero → "Zero" 
int num = 15; */

class Demo{
  public static void main(String [] args){
    int num=15;
    if(num>0){
      System.out.println("It is positive");
    }
    else if(num<0){
      System.out.println("It is negative");
    }
    else{
      System.out.println("It is neutral");
    }
  }
}


/*
3.0–12 → "Child"
13–19 → "Teenager"
20–59 → "Adult"
60 or above → "Senior Citizen" 
int age = 20; */

class Number{
  public static void main(String [] args){
    int age=20;
    if(age<=12){
      System.out.println("It is child");
    }
    else if(age<=19){
      System.out.println("It is teenager");
    }
    else if(age<=59){
      System.out.println("It is adult");
    }
    else{
      System.out.println("It is senior citizen");
    }
  }
}


/*
4.90–100 → "Excellent"
75–89 → "Very Good"
60–74 → "Good"
40–59 → "Pass"
Below 40 → "Fail" 
int marks = 68;*/

class Marks{
  public static void main(String [] args){
    int marks=68;
    if (marks>=90){
      System.out.println("Excellent");
    }
     else if(marks>=75){
      System.out.println("Very good");
    }
     else if(age>=60){
      System.out.println("Good");
    }
     else if(age>=40){
      System.out.println("Pass");
    }
    else{
      System.out.println("Fail");
    }
  }
}

/*
5.0–100 → "Low Usage"
101–200 → "Medium Usage"
201–300 → "High Usage"
Above 300 → "Very High Usage" 
int units = 250; */

class Units{
  public static void main(String [] args){
    int units=250;
    if (units<=100){
      System.out.println("low usage");
    }
     else if(units<=200){
      System.out.println("medium usage");
    }
     else if(units<=300){
      System.out.println("High usage");
    }
     else{
      System.out.println("Very high usage");
    }
  }
}
