/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package players;


import dungeon.Room;
import items.*;
import java.util.ArrayList;


//Klass innehållandes saker rörandes spelaren.
public class Player {
   
   private final String name;
   private int healthPoints = 10;
   private final int givesDamage = 1;
   private Room position;
   private ArrayList<Item> inventory = new ArrayList<>();
   
   
   //Konstruktor
   public Player(String name) {
      this.name = name;
   }

   //Returnerar spelarens namn.
   public String getName() {
      return name;
   }

   //Returnerar spelarens health points.
   public int getHealthPoints() {
      return healthPoints;
   }

   //Ändrar spelarens health points.
   public void setHealthPoints(int healthPoints) {
      this.healthPoints = healthPoints;
   }
   
   //Återställer spelarens health points till 10 och tar bort ett potion ur inventory.
   public void drinkPotion() {
      healthPoints = 10;
      System.out.println("You drink the potion and is now fully healed to 10 health points.");
      for(Item item : inventory) {
         if (item instanceof Potion) {
            inventory.remove(item);
            break;
         }
      }   
   }
   
   //Returnerar totala skadan en spelare gör, inkl. eventuellt vapen. Väljer det bästa vapnet om spelaren har flera.
   public int getGivesDamage() {
      int weaponDamage = 0;
      
      for(Item item : inventory) {
         if (item instanceof Weapon) {
            if (item.getIncreaseDamageBy() > weaponDamage) {
               weaponDamage = item.getIncreaseDamageBy();
            }
         }
      }
      int totalDamage = givesDamage + weaponDamage;
      return totalDamage;
   }
   
   //Returnerar spelarens position.
   public Room getPosition() {
      return position;
   }

   //Ändrar spelarens position.
   public void setPosition(Room position) {
      this.position = position;
   }

   //Returnerar spelarens inventory.
   public ArrayList<Item> getInventory() {
      return inventory;
   }
   
   //Ser om något Key-objekt finns i spelarens inventory.
   public boolean hasKey() { 
      for(Item item : inventory) {
         if (item instanceof Key) {
            return true;
         }
      }
      return false;
   }
      
   //Lägger till det item som finns i rummet som är spelarens position till inventory och sätter attributet "item" hos rummet till null.
   public void addToInventory() {
      inventory.add(position.getItem());
      position.setItem(null);
   }
}
