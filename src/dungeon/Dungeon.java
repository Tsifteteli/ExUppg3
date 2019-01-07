/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package dungeon;


import players.Player;
import items.*;
import monsters.*;
import java.util.ArrayList;
import java.util.Scanner;

//Klass innehållandes saker som sker i dungeon:en och rör dungeon:en som helhet.
public class Dungeon {
   
   private final Player player1;
   private Room[][] dungeon = new Room[3][3];
   private Room currentRoom;
   private int i;
   private int j;
   
   
   //Konstruktor. Skapar en dungeon med innehåll.
   public Dungeon(Player player1) {
      this.player1 = player1;
      
      //Skapa items => (String name, String description, int increaseDamageBy) alt. (String name, String description).
      Key key = new Key("key", "A smal sliver key is laying on the floor.");
      Weapon sword = new Weapon("Sword", "A shiny sword of steel is hanging on the wall.", 2);
      Potion potion = new Potion("Health potion", "There is something red laying amongst the rocks on the floor. A small bottle with glittering red liquid inside. It looks like a health potion");
      Treasure treasure = new Treasure("Treasure", "A big chest filled with gold and jewels is standing on the far side of the room.");
      Weapon dagger = new Weapon("Dagger", "There is something glimmering in the corner. A pointy dagger is laying on the floor.", 1);

      //Skapa monster => (String name, int healthPoints, int givesDamage, String description).
      Monster scorpilion = new Monster("Scorpiolion", 8, 1, "A huge scorpiolion is pacing back and forth. Three times the size of a normal lion with a scorpion tail.");
      Monster dragon = new Monster ("Dragon", 18, 1, "There is a greedy and angry dragon guarding the treasure. It roars and spit fire.");
      
      //Populera dungeon:en med rum inkl innehåll => (String description, Item item, Monster monster, Door doorNorth, Door doorEast, Door doorSouth, Door doorWest).
      dungeon[0][0] = new Room("in a big room lit by torches sitting on the rough cave walls. A dead body with some realy nasty wounds is laying on the floor.", key, null, null, new Door(true), new Door(false),null);
		dungeon[0][1] = new Room("in another big room lit by torches.", sword, scorpilion, null, new Door(false), new Door(false), new Door(false));
		dungeon[0][2] = new Room("outside in the fresh air!", null, null, null, null, null, new Door(false));
		dungeon[1][0] = new Room("in a small room lit by a few candles sitting on a table in front of you.", null, null, new Door(false), null, new Door(false),null);
		dungeon[1][1] = new Room("in a smaller room with brick walls lit by candles in candle holders. Piles of sticks, small rocks and miscellaneous dirt is laying in the corners.", potion, null, new Door(false), new Door(true), null, null);
      dungeon[1][2] = new Room("in a gigantic hall.", treasure, dragon, null, null, null, new Door(false));
      dungeon[2][0] = new Room("in a slightly bigger room that's not lit up at all. The only light is the one coming in through the door.", dagger, null, new Door(false), null, null ,null);
      
      //Rummet spelaren startar i.
      i = 1;
      j = 0;
      currentRoom = dungeon [i][j];
   }
   
   //Kör spelordningen.
   public void playGame() {
      do {
         player1.setPosition(currentRoom);
         currentRoom.roomNarrative();
         
         Monster currentMonster = currentRoom.getMonster();
         if (currentMonster != null) {
            player1.setHealthPoints(currentRoom.resolveBattle(player1.getHealthPoints(), player1.getGivesDamage()));
            if (player1.getHealthPoints() <= 0) {
               break;
            }
         }
         ArrayList choicesGiven = currentRoom.choices();
         choicesGiven = addDrinkPotionChoice(choicesGiven);
         
         String choice = playerChoice(choicesGiven);
         executeChoice(choice);
         
      } while(playerWin() == false);
   }
   
   //Lägger till valmöjligheten att drika health potion om spelaren har ett sådant och har låg hälsa.
   private ArrayList addDrinkPotionChoice(ArrayList choicesGiven) {
      for(Item item : player1.getInventory()) {
         if (item instanceof Potion) {
            if (player1.getHealthPoints() < 10) {
               System.out.println("Drink health potion [d] (You have " + player1.getHealthPoints() + " health points.");
               choicesGiven.add("d");
            }
         }
      }
      return choicesGiven;
   }
   
   //Läser in spelarens val och kolla om det är giltigt.
   private String playerChoice(ArrayList choicesGiven) {
      String choice = "choice";
      Scanner input = new Scanner(System.in);
      do {
         try {
            choice = input.next();
            choice.toLowerCase();
            if (!choicesGiven.contains(choice)) {
               throw new Exception("Not a valid choice. Please try a given choice.");
            }
         } catch (Exception e) {
            System.out.println(e.getMessage());
         }       
      } while(!choicesGiven.contains(choice));
      System.out.println("~.~.~.~.~.~.~.~.~.~.~.~.~.~\n");
      return choice;        
   }
   
   //Verkställer spelarens val.
   private void executeChoice(String choice) {
      switch (choice){
					case "p":
                  player1.addToInventory();
                  break;
					case "n":
					case "e":
					case "s":
					case "w":
                  if (currentRoom.openDoor(choice, player1.hasKey()) == true) {
                     movePlayer(choice);
                  }
                  break;
               case "d":
                  player1.drinkPotion();
      }
   }
   
   //Flyttar spelaren mellan två rum.
   private void movePlayer(String choice) {
      switch (choice){
         case "n": // vid n: minska i med 1
            i--;
            break;
         case "s": // vid s: öka i med 1
            i++;
            break;
         case "w": // vid w: minska j med 1
            j--;
            break;
         case "e": // vid e: öka j med 1
            j++;
      }
      currentRoom = dungeon[i][j];
   }
   
   //Kollar om vinstförutsättningarna är uppfyllda. (Spelaren har skatten i sitt inventory och befinner sig utanför dungeon:en.)
   public boolean playerWin() {
      for(Item item : player1.getInventory()) {
         if (item instanceof Treasure) {
            if (player1.getPosition() == dungeon[0][2]) {
               return true;   
            }
         }
      }
      return false;
   }
}
