//1.check whether the character alphabet is vowel or consonant, if it is not both then print it is not a alphabet
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
