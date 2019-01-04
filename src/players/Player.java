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
   
   
   //Konstruktor
   public Player(String name) {
      this.name = name;
      healthPoints = 10;
      givesDamage = 1; //Onödigt att ge värde här om alla har 1? Sätt till 1 där instansvariabeln deklareras?
      //position = ??? Hur ska detta skrivas?
      //inventory ev onödigt att initiera till null här? Är ju ändå tom från början då inget stoppats i den än...?
   }

   //Returnerar spelarens namn
   public String getName() {
      return name;
   }

   //Returnerar spelarens health points
   public int getHealthPoints() {
      return healthPoints;
   }

   //Ändrar spelarens health points
   public void setHealthPoints(int healthPoints) {
      this.healthPoints = healthPoints;
   }
   
   //Återställer spelarens health points till 10
   public void drinkPotion() {
      healthPoints = 10;
      System.out.println("You drink the potion and is now fully healed to 10 health points.");
   }
   
   //Returnerar totala skadan en spelare gör inkl. eventuellt vapen.
   public int getGivesDamage() {
      int weaponDamage = 0;
      
      for(Item item : inventory) {
         if (item instanceof Weapon) { //......................Hur lösa detta?
            if (item.getIncreaseDamageBy() > weaponDamage) {
               weaponDamage = item.getIncreaseDamageBy();
            }
         }
      }
      int totalDamage = givesDamage + weaponDamage;
      return totalDamage;
   }
}
