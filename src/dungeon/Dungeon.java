/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package dungeon;


import players.Player;

//Klass innehållandes saker som rör dungeonen som helhet
public class Dungeon {
   
   private Player player1;
   private Room[][] dungeon;
   
   
   //Konstruktor
   public Dungeon(Player player1) {
      this.player1 = player1;
      //dungeon = {{secondRoom, thirdRoom, outsideExit}, {entryRoom, fourthRoom, treasureChamber}, {firstRoom}};
      dungeon = new Room [3][];
      dungeon[0] = new Room [3];
      dungeon[1] = new Room [3];
      dungeon[2] = new Room [1];
   }
}
