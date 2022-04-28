import java.util.Scanner;
class Solution{
 public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in); 
    String st = sc.nextLine();
    sc.close();
    int vowel=0,conso=0;
    st = st.toLowerCase();
    st = st.replace(" ","");
    for(int i=0;i<st.length();i++){
      if(st.charAt(i)>='a' && st.charAt(i)<='z'){
        if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' || st.charAt(i)=='u'){
         vowel+=1;
        }
        else{
        conso+=1;
        }
      }
       
    }
    System.out.println("Number of Vowels: "+vowel);
    System.out.println("Number of Consonants: "+conso);
  }
}
