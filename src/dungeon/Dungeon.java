/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package dungeon;


import players.Player;
import items.*;
import monsters.*;

//Klass innehållandes saker som sker i dungeon:en och rör dungeon:en som helhet.
public class Dungeon {
   
   private Player player1;
   private Room[][] dungeon = new Room[3][3];
   
   
   //Konstruktor. Skapar en dungeon med innehåll.
   public Dungeon(Player player1) {
      this.player1 = player1;
      
      //Adda data om items och monster till rummen.........................................!
      // new Room(String description, Item item, Monster monster, Door doorNorth, Door doorEast, Door doorSouth, Door doorWest)
      dungeon[0][0] = new Room("in a big room lit by torches sitting on the rough cave walls. A dead body with some realy nasty wounds is laying on the floor.",new Key(), null, null, new Door(true), new Door(false),null);
		dungeon[0][1] = new Room("in another big room lit by torches.", new Weapon(), new Monster(), null, new Door(false), new Door(false), new Door(false));
		dungeon[0][2] = new Room("outside in the fresh air!", null, null, null, null, null, new Door(false));
		dungeon[1][0] = new Room("in a small room lit by a few candles sitting on a table in front of you.", null, null, new Door(false), null, new Door(false),null);
		dungeon[1][1] = new Room("in a smaller room with brick walls lit by candles in candle holders. Piles of sticks, small rocks and miscellaneous dirt is laying in the corners.", new Potion(), null, new Door(false), new Door(true), null, null);
      dungeon[1][2] = new Room("in a gigantic hall.", new Treasure(), new Monster(), null, null, null, new Door(false));
      dungeon[2][0] = new Room("in a slightly bigger room that's not lit up at all. The only light is the one coming in through the door.", new Weapon(), null, new Door(false), null, null ,null);
   }
   
   //Kör spelordningen.
   public void playGame() {
      do {
         
      } while(playerWin() == false);
   }
   
   private boolean playerWin() {
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
