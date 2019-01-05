/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package dungeon;


import items.*;
import monsters.*;

//Klass innehållandes information om och saker som händer i rummen.
public class Room {
   
    private String description;
    private Item item;
    private Monster monster;
    private Door doorNorth;
    private Door doorEast;
    private Door doorSouth;
    private Door doorWest;
    
    //Konstruktor

   public Room(String description, Item item, Monster monster, Door doorNorth, Door doorEast, Door doorSouth, Door doorWest) {
      this.description = description;
      this.item = item;
      this.monster = monster;
      this.doorNorth = doorNorth;
      this.doorEast = doorEast;
      this.doorSouth = doorSouth;
      this.doorWest = doorWest;
   }
   
}
