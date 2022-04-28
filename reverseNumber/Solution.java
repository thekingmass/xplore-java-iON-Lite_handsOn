import java.util.Scanner;
class MyClass{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int rev=0;
    int n=num;
    while(n!=0){
      int temp=n%10;
      rev = rev*10+temp;
      n=n/10;
    }
    System.out.println("Reverse of the number is "+rev);
  } 
}
