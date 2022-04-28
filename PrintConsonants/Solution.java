import java.util.Scanner;
class MyClass{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine();
    sc.close();
    st = st.toLowerCase();
    for(int i=0;i<st.length();i++){
      if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' }}st.charAt(i)=='o' || st.charAt(i)=='u'){
      continue;
      }
     else{
      System.out.print(st.charAt(i));
     }
  }//for
 }//main
}// class
