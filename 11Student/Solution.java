import java.util.Scanner;
public class MyClass
{

 public static void main(String[] args)
 {
  //code to read values 
   Scanner sc = new Scanner(System.in);
   Student[] st = new Student[4];
   for(int i=0;i<st.length;i++){
     int rollNo = sc.nextInt();
     sc.nextLine();
     String name = sc.nextLine();
     String branch = sc.nextLine();
     double score = sc.nextDouble();
     sc.nextLine();
     boolean dayScholar = sc.nextBoolean();
     st[i] = new Student(rollNo,name,branch,score,dayScholar);
    }
   
  //code to call required method
   
   int ans1 = findCountOfDayscholarStudents(st);// first method call
   Student ans2[] = findStudentWithSecondHighestScore(st);
   
  //code to display the result
   if(ans1>0){
    System.out.println(ans1);
   }
   else
     System.out.println("There are no such dayscholar students");
   
   // Outpur of the second method
   if(ans2[0] != null){
     
     System.out.println(ans2[0].getrollNo()+"#"+ans2[0].getname()+"#"+ans2[0].getscore());
   }
   else{
     System.out.println("There are no student from non day scholar");
   }
     
 } // main
    
 //code the first method
public static int findCountOfDayscholarStudents(Student[] s){
  int count = 0;
   for(int i=0;i<s.length;i++){
     if(s[i].getdayScholar() && s[i].getscore() > 80 ){
       count+=1;
     }
   }
  
  if(count == 0)
    return 0;
  else
    return count;

}
    
 //code the second method   
public static Student[] findStudentWithSecondHighestScore(Student [] s){
  Student[] ans= new Student[1];
  int count = 0;
  for(int i=0;i<s.length;i++){
   for(int j=1;j<s.length;j++){
     if(s[j-1].getscore()<s[j].getscore()){
        Student temp = s[j-1];
        s[j-1] = s[j];
       s[j] = temp;       
      }
    } //for j
   }// for i
  for(int i=0;i<s.length;i++){
    if(!s[i].getdayScholar()){     
        ans[0]=s[i];
        count+=1;
       if(count>2){
        break;
       }
    }
   }
  return ans;
  
 }

}

//code the class
class Student{
 private int rollNo;
  private String name,branch;
  private double score;
  private boolean dayScholar;
  
  Student(int rollNo,String name,String branch,double score,boolean dayScholar){
   this.rollNo = rollNo;
    this.name = name;
    this.branch= branch;
    this.score = score;
    this.dayScholar = dayScholar;
  }
  
  int getrollNo(){
  return rollNo;
  }
  
  String getname(){
  return name;
  }
  
  String getbranch(){
  return branch;
  }
  
  double getscore(){
  return score;
  }
  
  boolean getdayScholar(){
  return dayScholar;
  }
  
}
            
