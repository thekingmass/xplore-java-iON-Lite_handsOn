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
     String name = sc.nextLine();
     int rank = sc.nextInt();
     int matches = sc.nextInt();
     int totalruns = sc.nextInt();
     player[i] = new Player(id,name,rank,matches,totalruns);
   }
   int noOfmatchesPlayed = sc.nextInt();
   
   
  //code to call required method   
   double[] res = findAverageScoreOfPlayers(player,noOfmatchesPlayed);
   
  //code to calculate Grade and display the results
   for(int i=0;i<res.length;i++){
     if(res[i]>=80){
     System.out.println("Grade A Player");
     }
     else if(res[i]<=79 && res[i]>=50){
             System.out.println("Grade B Player");
             }
     else{
     System.out.println("Grade C Player");
     }
   }   
   
 }

 public static double[] findAverageScoreOfPlayers(Player[] player,int target)
 {
  //method logic
   double[] result = new double[0];
   double avg=0;
   for(int i=0;i<player.length;i++){
    if(player[i].getnoOfMatchesPlayed() >= target){
        avg = (double)player[i].gettotalRunsScored()/(double)player[i].getnoOfMatchesPlayed();
        result = Arrays.copyOf(result,result.length+1);
        result[result.length-1]=avg;
       }
   }
   
  return result;
 }
}

class Player
{
  //code to build player class
  private int playerId,noOfMatchesPlayed,totalRunsScored,iccRank;
  private String playerName;
  
  Player(int playerId,String playerName,int iccRank,int noOfMatchesPlayed,int totalRunsScored){
   	 this.playerId = playerId;
    this.playerName = playerName;
    this.iccRank = iccRank;
    this.noOfMatchesPlayed = noOfMatchesPlayed;
    this.totalRunsScored = totalRunsScored;
  }
  
  int getplayerId(){
  return playerId;
  }
  String getplayerName(){
  return playerName;
  }
  int geticcRank(){
  return iccRank;
  }
  int getnoOfMatchesPlayed(){
  return noOfMatchesPlayed;
  }
  int gettotalRunsScored(){
  return totalRunsScored;
  }
  
}
            
