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
           
   //mainmetod.
   public static void main(String[] args) {
      new DungeonMaster();
   }

   //Konstruktor. Skapar objekt och kör spelet.
   private DungeonMaster() {
      beginning();
      introduction();
      Dungeon smalDungeon = new Dungeon(player1);
      smalDungeon.playGame();
      //Lägg till gameEnding()
   }
   
   
   
   //Inleder spelet och skapar en player.
   private void beginning() {
      
      System.out.println("Welcomme to Dungeon Master!"); 
      System.out.println("What is your name? Pleas type it an press [Enter]");
      
      Scanner input = new Scanner(System.in);
      String name = input.nextLine();
      
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
              + "You better be careful...");
   }
}
