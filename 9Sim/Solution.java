import java.util.Scanner;
import java.util.Arrays;
public class Solution
{

public static void main(String[] args)
{
Sim[] cards = new Sim[5];

Scanner sc = new Scanner(System.in);

for(int i = 0;i<5;i++)
{
int simId = sc.nextInt();sc.nextLine();
String customerName = sc.nextLine();
double balance = sc.nextDouble();
double ratePerSecond = sc.nextDouble();sc.nextLine();
String circle = sc.nextLine();

cards[i] = new Sim(simId,customerName, balance,ratePerSecond, circle);
}

String circle1 = sc.nextLine();
String circle2 = sc.nextLine();

Sim[] result = transferCustomerCircle(cards, circle1, circle2);

for(Sim s: result)
System.out.println(s.getSimId()+" "+s.getCustomerName()+" "
+s.getCircle() + " " + s.getRatePerSecond());

}

public static Sim[] transferCustomerCircle(Sim[] cards, String circle1, String circle2)
{
//method logic
 
  // sorting the Sim objects in descending order of ratePerSecond
 for(int i=0;i<cards.length;i++){
  for(int j=1;j<cards.length;j++){
    if(cards[j-1].getRatePerSecond()<cards[j].getRatePerSecond()){
      // swapping in descending order
        Sim temp = cards[j-1];
        cards[j-1] = cards[j];
        cards[j]=temp;
       }
  }
 }
  
  Sim[] res = new Sim[0];
  for(int i=0;i<cards.length;i++){
   if(circle1.equalsIgnoreCase(cards[i].getCircle())){
     res = Arrays.copyOf(res,res.length+1);
     cards[i].setCircle(circle2);
     res[res.length-1] = cards[i];
   }
  }
  return res;
}
}

class Sim
{
//code to build Sim class
  
  private int simId;
  private String customerName,circle;
  private double balance,ratePerSecond;
  
  Sim(int simId,String customerName,double balance,double ratePerSecond,String circle){
   this.simId = simId;
    this.customerName = customerName;
    this.balance = balance;
    this.ratePerSecond = ratePerSecond;
    this.circle = circle;
  }
  
  int getSimId(){
  return simId;
  }
  
  String getCustomerName(){
  return customerName;
  }
  
  double getBalance(){
  return balance;
  }
  
  double getRatePerSecond(){
  return ratePerSecond;
  }

  String getCircle(){
  return circle;
  }
  
  void setCircle(String circle){
  this.circle = circle;
  }
  
}
            
