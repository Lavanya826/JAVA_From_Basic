                                                                         //BREAK 
-break is use to..break the iteration
-break is only  use in loops and switch
Q1.Print numbers from 1 to 10, but stop when the number becomes 6.
class Num{
  public static void main(String [] args){
    for(int i=1;i<=10;i++){
      if(i==6){
        break;
      }System.out.println(i);
  }
}
}

Q2. Find the first number divisible by 7 between 1 and 50.
class Num{
  public static void main(String [] args){
    for(int i=1;i<=50;i++){
      if(i%7==0){
        System.out.println(i);
        break;
      }
    }
  }
}
                                                                        //CONTINUE
continue: continue is use to skip the current iteration and move next one.
                                                                        //LABEL_BREAK
label_break:label break uses keyword outside the loop..when we end that keyword..then whole loop ends.
