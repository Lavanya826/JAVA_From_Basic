//NUMBER PROGRAMS
//SPY NUMBER
class Spy{
    public static void main(String [] args){
        int num=123;
        int product=1;
        int sum=0;
        while(num>0){
            int dig=num%10;
            sum=sum+dig;
            product=product*dig;
            num=num/10;
        }
        if(product==sum){
            System.out.println("Its is a spy no " + "product is : " + product + " sum is : " + sum);
        }else{
            System.out.println("It is not a spy number");
        }
    }
}
