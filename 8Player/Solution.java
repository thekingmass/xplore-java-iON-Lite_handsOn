import java.util.Scanner;
import java.util.Arrays;

public class Solution
{

public static void main(String[] args)
{
//code to read values
  
  Scanner sc = new Scanner(System.in);
  Player[] player = new Player[4];
  for(int i=0;i<player.length;i++){
   int id = sc.nextInt();
    sc.nextLine();
    String country = sc.nextLine();
    String side = sc.nextLine();
    double price = sc.nextDouble();
    player[i] = new Player(id,country,side,price);
  }
  
  sc.nextLine();
  String search = sc.nextLine();
  sc.close();
  
//code to call required method

  Player[] res = searchPlayerForMatch(search,player);
  
  //code to display the result
  for(int i=0;i<res.length;i++){
   System.out.println(res[i].getid());
  }
  
}

public static Player[] searchPlayerForMatch(String search, Player[] players)
{
//method logic
  
  // sorting the player object in ascending order of their id.
  for(int i=0;i<players.length;i++){
    for(int j=1;j<players.length;j++){
      Player temp = players[j-1];
      players[j-1] = players[j];
      players[j] = temp;
     }
    
  }
  
  // searching the player object which match withe given parameter
  Player[] pl = new Player[0];
  for(int i=0;i<players.length;i++){
  if(search.equalsIgnoreCase(players[i].getside())){
     pl = Arrays.copyOf(pl,pl.length+1);
     pl[pl.length-1]=players[i];
     }
  }
  return pl;

}
}

class Player
{
//code to build Player class
  private int id;
  private String country,side;
  private double price;
  
  Player(int id,String country,String side,double price){
    this.id = id;
    this.country = country;
    this.side = side;
    this.price = price;
  }
  
  int getid(){
  return id;
  }
  String getcountry(){
  return country;
  }
  String getside(){
  return side;
  }
  double getprice(){
    return price;
  }
   
  
}
            
