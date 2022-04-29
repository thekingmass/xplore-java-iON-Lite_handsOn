import java.util.Scanner;
class MyClass{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String st = sc.nextLine();
   int c = 0;
   // Assigning the first vowel ascii to the variable
   for(int i=0;i<st.length();i++){
    if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' || st.charAt(i)=='u'){
     c = st.charAt(i);
    }
   }
//  checking the entire string for the smallest vowel
   for(int i=0;i<st.length();i++){
    if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' || st.charAt(i)=='u'){
      int temp = (int)st.charAt(i);
      if(c > temp){
       c = temp;
      }
    }
   }
   System.out.println((char)c);
   
 }
}        
