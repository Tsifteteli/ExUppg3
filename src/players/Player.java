/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package players;


import dungeon.Room;
import dungeon.Dungeon;
import items.*;
import java.util.ArrayList;

//Klass innehållandes saker rörandes spelaren.
public class Player {
   
   private final String name;
   private int healthPoints;
   private final int givesDamage;
   private Room position;
   private ArrayList<Item> inventory = new ArrayList<Item>();
   
   
   //Konstruktor
   public Player(String name) {
      this.name = name;
      healthPoints = 10;
      givesDamage = 1; //Onödigt att ge värde här om alla har 1? Sätt till 1 där instansvariabeln deklareras?
      //position = ??? Hur ska detta skrivas?
      //inventory ev onödigt att initiera till null här? Är ju ändå tom från början då inget stoppats i den än...?
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
   
   //Återställer spelarens health points till 10.
   public void drinkPotion() {
      healthPoints = 10;
      System.out.println("You drink the potion and is now fully healed to 10 health points.");
   }
   
   //Returnerar totala skadan en spelare gör inkl. eventuellt vapen.
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
   
   //Ser om Key-objekt finns i spelarens inventory.
   public boolean hasKey() { 
      for(Item item : inventory) {
         if (item instanceof Key) {//...............? Ändra för att göra så det funkar med valfri klass?
            return true;
         }
      }
      return false;
   }
      
   //Lägger till ett item i inventory och sätter attributet "item" hos rummet som är spelares position till null.
   public void addToInventory() {
      inventory.add(position.getItem());
      position.setItem(null);
   }
}
