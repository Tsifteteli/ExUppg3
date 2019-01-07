/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

/*Spelet går ut på att hitta skatten och ta sig ut ur dungeon:en levande.
Detta gör spelaren genom att navigera genom en dungeon:en, samla föremål och besegra monster.
Vinner gör spelaren om hen har skatten i sitt inventory och befinner sig utanför dungeon:en.
Förlorar gör spelaren om hen dör, dvs får 0 eller mindre i hälsa.*/

package dungeonMaster;


import java.util.Scanner;
import players.Player;
import dungeon.Dungeon;
        
//Klass innehållandes starten och slutet. Saker som sker utanför dungeon:en.
public class DungeonMaster {
   
   private Player player1;
   Dungeon smalDungeon;
    
   
   //mainmetod.
   public static void main(String[] args) {
      new DungeonMaster();
   }

   //Konstruktor. Skapar objekt och kör spelet.
   private DungeonMaster() {
      beginning();
      introduction();
      smalDungeon = new Dungeon(player1);
      smalDungeon.playGame();
      gameEnding();
   }
   
   
   
   //Inleder spelet och skapar en player.
   private void beginning() {
      
      System.out.println("Welcomme to Dungeon Master!"); 
      System.out.println("What is your name? Pleas type it an press [Enter]");
      
      /*Scanner input = new Scanner(System.in);
      String name;
      do {
         try {
            name = input.nextLine();
         } catch (Exception e) {
            throw new Exception("Something went wrong. Please try again.");
         } catch (Exception e) {
            System.out.println(e.getMessage());
         }
      } while (name.equals(null));
      player1 = new Player(name);
      */

      Scanner input = new Scanner(System.in);
      String name;
      name = input.nextLine();
      player1 = new Player(name);
   }
   
   //Introducerar miljön.
   private void introduction() {
      
      System.out.println("\nWelcome brave explorer " + player1.getName() + "!");
      System.out.println("You have arrived to the cave where the lost "
              + "treasure is supposed to be hidden.\n"
              + "You are determined to find it and you enter the cave.\n"
              + "Just a few steps in you hear an earth shattering roar!\n"
              + "The whole mountain trembles, and the entrance to the "
              + "cave collapses behind you.\n"
              + "That kind of roar can only come from a dragon. "
              + "You better be careful...\n");
   }
   
   //Slutet på spelet.
   private void gameEnding() {
      if (smalDungeon.playerWin() == true) {
         System.out.println(
            "                  _.--.\n"+
            "              _.-'_:-'||\n"+
            "          _.-'_.-::::'||\n"+
            "     _.-:'_.-::::::'  ||\n"+
            "   .'`-.-:::::::'     ||\n"+
            "  /.'`;|:::::::'      ||_\n"+
            " ||   ||::::::'      _.;._'-._\n"+
            " ||   ||:::::'   _.-!oo @.!-._'-.\n"+
            " \'.  ||:::::.-!() oo @!()@.-'_.||\n"+
            "   '.'-;|:.-'.&$@.& ()$%-'o.'\\U||\n"+
            "     `>'-.!@%()@'@_%-'_.-o _.|'||\n"+
            "      ||-._'-.@.-'_.-' _.-o  |'||\n"+
            "      ||=[ '-._.-\\U/.-'    o |'||\n"+
            "      || '-.]=|| |'|      o  |'||\n"+
            "      ||      || |'|        _| ';\n"+
            "      ||      || |'|    _.-'_.-'\n"+
            "      |'-._   || |'|_.-'_.-'\n"+
            "      '-._'-.|| |' `_.-'\n"+
            "           '-.||_/.-'\n");
         System.out.println("You walk out from the dungeon dragging the treasure with you. Congratulations " + player1.getName() + "! You have won the game. You are a true Dungeon Master!");
      }
      else {
         System.out.println("\nYou are dead... RIP " + player1.getName() + "... Better luck next life...");
      }
   }    
}
