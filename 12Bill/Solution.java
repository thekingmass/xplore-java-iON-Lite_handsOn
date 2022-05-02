import java.util.Scanner;
public class MyClass
{

 public static void main(String[] args)
 {
  // code to read values 
   
   Scanner sc = new Scanner(System.in);
   int nu = sc.nextInt();
   Bill[] bl = new Bill[nu];
   for(int i=0;i<bl.length;i++){
     int billNo = sc.nextInt();
     sc.nextLine();
     String name = sc.nextLine();
     String type = sc.nextLine();
     double amount = sc.nextDouble();
     boolean status = sc.nextBoolean();
     
     bl[i] = new Bill(billNo,name,type,amount,status);
   }
   
   boolean status = sc.nextBoolean();
   sc.nextLine();
   String type = sc.nextLine();
   
  // code to call required method
   
   Bill ans1 = findBillWithMaxBillAmountBasedOnStatus(bl,status);
   int ans2 = getCountWithTypeOfConnection(bl,type);
   
  // code to display the result
   //Displaying the output of the fist method
   if(ans1!=null){
    System.out.println(ans1.getbillNo()+"#"+ans1.getname());
   }
   else{
   System.out.println("There are no bill with the given status");
   }
   // Displaying the output of the second method
   if(ans2>0)
  System.out.println(ans2);
else
  System.out.println("There are no bills with given type of connection");
   
 }


    
 //code the first method

public static Bill findBillWithMaxBillAmountBasedOnStatus(Bill[] b,boolean status){
  
  // sorting the Bill objects in descending order of their respective Bill Amount
  for(int i=0;i<b.length;i++){
    for(int j=1;j<b.length;j++){
      if(b[j-1].getbillAmount()<b[j].getbillAmount()){
        Bill temp = b[j-1];
        b[j-1] = b[j];
        b[j] = temp;       
      }
    }
  }
  Bill ans = null;
  for(int i=0;i<b.length;i++){
    if(b[i].getstatus()==status){
      ans = b[i];
      break;
    }
  }
  return ans;
}
    
 //code the second method   

  public static int getCountWithTypeOfConnection(Bill[] b,String billtype){
  int count = 0;
  for(int i=0;i<b.length;i++){
   if(billtype.equalsIgnoreCase(b[i].gettypeOfConnection())){
     count+=1; 
   }
 }
  //System.out.println(count);
  return count;
 }
}// main

//code the class

class Bill{
 private int billNo;
  private String name,typeOfConnection;
  private double billAmount;
  private boolean status;
  
  Bill(int billNo,String name,String typeOfConnection,double billAmount,boolean status){
    this.billNo = billNo;
    this.name = name;
    this.typeOfConnection = typeOfConnection;
    this.billAmount = billAmount;
    this.status = status;
  }
  
  int getbillNo(){
  return billNo;
  }
  
  String getname(){
  return name;
  }
  
  String gettypeOfConnection(){
  return typeOfConnection;
  }
  
  double getbillAmount(){
  return billAmount;
  }
  
  boolean getstatus(){
  return status;
  }
}
            
