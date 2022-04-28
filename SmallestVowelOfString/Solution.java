import java.util.Scanner;
class MyClass{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   String st = sc.nextLine();
   int c = st.charAt(0);
   //System.out.println(c);
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
            
