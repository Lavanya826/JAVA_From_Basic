//check the harshad number
class Demo{
  public static void main(String [] args){
    int num=18;
    int sum=0;
    int temp=num;
    while(num!=0){
      int dig=num%10;
      sum=sum+dig;
      num=num/10;
    }
    if(temp%sum==0){
      System.out.println("harshad number");
    }else{
      System.out.println("Not harshad number");
    }
  }
}


//check the number is xylem or phoyem
class Num{
  public static void main(String [] args){
    int num=12326;
    int sum1=0;
    int sum2=0;
    int dig=num%10;
    num=num/10;
    int temp=dig;
    while(num>9){
      int digit=num%10;
      sum1=sum1+digit;
      num=num/10;
    }
    sum2=num+temp;
    if(sum2==sum1){
      System.out.println("Xylem number");
    }else{
      System.out.println("Ployem number");
    }
  }
}




















