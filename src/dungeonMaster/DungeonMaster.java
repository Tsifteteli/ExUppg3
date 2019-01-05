/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package dungeonMaster;


import java.util.Scanner;
import players.Player;
import dungeon.Dungeon;
        
//Klass innehållandes starten och slutet. Saker som sker utanför dungeon:en.
public class DungeonMaster {
   
   private Player player1;
           
   //mainmetod
   public static void main(String[] args) {
      new DungeonMaster();
   }

   private DungeonMaster() {
      beginning();
      introduction();
      Dungeon smalDungeon = new Dungeon(player1);
      smalDungeon.playGame();
   }
   
   
   
   //börja spelet och skapar en player
   private void beginning() {
      
      System.out.println("Welcomme to Dungeon Master!"); 
      System.out.println("What is your name? Pleas type it an press [Enter]");
      
      Scanner input = new Scanner(System.in);
      String name = input.nextLine();
      
      player1 = new Player(name);
   }
   
   //introducerar miljön och skapar en dungeon
   private void introduction() { // Kalla enteringTheDungeon() ist, skapa även smalDungeon i beginning och lägg denna i Dungeon. Alt gör som Josef och skapa Playerobjekt
      
      System.out.println("Welcome brave explorer" + player1.getName());
      System.out.println("You have arrived to the cave where the lost "
              + "treasure is supposed to be hidden. "
              + "You are determined to find it and you enter the cave. "
              + "Just a few steps in you hear an earth shattering roar! "
              + "The whole mountain trembles, and the entrance to the "
              + "cave collapses behind you. "
              + "That kind of roar can only come from a dragon! "
              + "You better be careful.");
   } 
}
