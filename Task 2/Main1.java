

package conteststats;

public class ContestStats {

  int[] scores={85, 90, 95};
  
  void printFirstScore(){
      System.out.println(scores[0]);
  }

 
    public static void main(String[] args) {
        ContestStates contest= new ContestStates();
        contest.printFirstScore();
    }
    
}
