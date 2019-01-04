/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package dungeonMaster;


import java.util.Scanner;
import players.Player;
        
//Klass innehållandes starten och slutet. Saker som sker utanför dungeon:en.
public class DungeonMaster {
   
   //mainmetod
   public static void main(String[] args) {
      beginning();
   }
   
   //börja spelet och skapar player
   private static void beginning() {
      
      System.out.println("Welcomme to Dungeon Master!"); 
      System.out.println("What is your name?");
      
      Scanner input = new Scanner(System.in);
      String name = input.nextLine();
      
      Player player1 = new Player(name);

		introducton(player1);
   }
}
