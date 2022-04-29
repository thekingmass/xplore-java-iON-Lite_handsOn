import java.util.Scanner;
import java.util.Arrays;

public class Solution {
 public static void main(String[] args) {
  Medicine[] medicine = new Medicine[4];
  String search;

  Scanner sc = new Scanner(System.in);

  for (int i = 0; i < medicine.length; i++) {
   String medicineName = sc.nextLine();
   String batchNo = sc.nextLine();
   String disease = sc.nextLine();
   int price = sc.nextInt();
   sc.nextLine();
   medicine[i] = new Medicine(medicineName, batchNo, disease, price);

  }

  search = sc.nextLine();
  Integer[] price = medicinePriceForGivenDisease(medicine, search);
  
  for(int i=0;i<price.length;i++) {
   System.out.println(price[i]);
  }
 }
 public static Integer[] medicinePriceForGivenDisease(Medicine[] medicine,String disease)
 {
  //method logic
  //code to find price, sort and return the sorted array.
   
   //Sorting the object array of type Medicine into ascending order of its associated price;
   for(int i=0;i<medicine.length;i++){
    for(int j=1;j<medicine.length;j++){
      if(medicine[j-1].getprice()>medicine[j].getprice()){
      Medicine temp = medicine[j-1];
      medicine[j-1] = medicine[j];
      medicine[j] = temp;
      }    
    }
   }
   
   Integer[] result = new Integer[0];
  for(int i=0;i<medicine.length;i++){
   if(disease.equals(medicine[i].getdisease())){
     result = Arrays.copyOf(result,result.length+1);
     result[result.length-1]=medicine[i].getprice();
    }
  }
   
   return result;
   
 }
}

class Medicine
{
  //code to build Medicine class
  private String medicineName,batchNo,disease;
  private int price;
  
  Medicine(String medicineName,String batchNo,String disease,int price){
   this.medicineName = medicineName;
    this.batchNo = batchNo;
    this.disease = disease;
    this.price = price;
  }
  
  String getmedicineName(){
  return medicineName;
  }
  String getbatchNo(){
  return batchNo;
  }
  String getdisease(){
  return disease;
  }
  int getprice(){
  return price;
  }
  
}
            
