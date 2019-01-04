/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package players;


import dungeon.Room;
import items.*;
import java.util.ArrayList;

//Klass innehållandes saker rörandes spelaren
public class Player {
   String name;
   int healthPoints;
   int givesDamage;
   Room position;
   ArrayList<Item> inventory = new ArrayList<Item>();
}
