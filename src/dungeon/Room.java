/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package dungeon;


import items.*;
import monsters.*;
import java.util.ArrayList;

//Klass innehållandes information om och saker som händer i rummen.
public class Room {
   
   private final String description;
   private Item item;
   private Monster monster;
   private final Door doorNorth;
   private final Door doorEast;
   private final Door doorSouth;
   private final Door doorWest;
   
    
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
   
   //Beskriver rummets innehåll.
   public void roomNarrative() {
      System.out.println("You are " + description);
      if (item != null) {
         System.out.println(item.getDescription());
      }
      if (doorNorth != null) {
         System.out.println("There is a door to the north.");
      }
      if (doorEast != null) {
         System.out.println("There is a door to the east.");
      }
      if (doorSouth != null) {
         System.out.println("There is a door to the south.");
      }
      if (doorWest != null) {
         System.out.println("There is a door to the west.");
      }
      if (monster != null) {
         System.out.println(monster.getDescription());
         if (monster.getName() == "Dragon")
            System.out.println(
                  " .~))>>\n"+
                  " .~)>>\n"+
                  " .~))))>>>\n"+
                  " .~))>> ___\n"+
                  " .~))>>)))>> .-~))>>\n"+
                  " .~)))))>> .-~))>>)>\n"+
                  " .~)))>>))))>> .-~)>>)>\n"+
                  " ) .~))>>))))>> .-~)))))>>)>\n"+
                  " ( )@@*) //)>)))))) .-~))))>>)>\n"+
                  " ).@(@@ //))>>))) .-~))>>)))))>>)>\n"+
                  " (( @.@). //))))) .-~)>>)))))>>)>\n"+
                  " )) )@@*.@@ ) //)>))) //))))))>>))))>>)>\n"+
                  " (( ((@@@.@@ |/))))) //)))))>>)))>>)>\n"+
                  " )) @@*. )@@ ) (\\_(\\-\\b |))>)) //)))>>)))))))>>)>\n"+
                  " (( @@@(.@(@ . _/`-` ~|b |>))) //)>>)))))))>>)>\n"+
                  " )* @@@ )@* (@) (@) /\\b|))) //))))))>>))))>>\n"+
                  " (( @. )@( @ . _/ / / \\b)) //))>>)))))>>>_._\n"+
                  " )@@ (@@*)@@. (6///6)- / ^ \\b)//))))))>>)))>> ~~-.\n"+
                  " ( @jgs@@. @@@.*@_ VvvvvV// ^ \\b/)>>))))>> _. `bb\n"+
                  " ((@@ @@@*.(@@ . - | o |' \\ ( ^ \\b)))>> .' b`,\n"+
                  " ((@@).*@@ )@ ) \\^^^/ (( ^ ~)_ \\ / b `,\n"+
                  " (@@. (@@ ). `-' ((( ^ `\\ \\ \\ \\ \\| b `.\n"+
                  " (*.@* / (((( \\| | | \\ . b `.\n"+
                  " / / ((((( \\ \\ / _.-~\\ Y, b ;\n"+
                  " / / / (((((( \\ \\.-~ _.`\" _.-~`, b ;\n"+
                  " / / `(((((() ) (((((~ `, b ;\n"+
                  " _/ _/ `\"\"\"/ /' ; b ;\n"+
                  " _.-~_.-~ / /' _.'~bb _.'\n"+
                  " ((((~~ / /' _.'~bb.--~\n"+
                  " (((( __.-~bb.-~\n"+
                  " .' b .~~\n"+
                  " :bb ,' \n"+
                  " ~~~~\n");
      }
      System.out.println(" ");
      
   }

   //Returnerar värdet på item.
   public Item getItem() {
      return item;
   }

   //Ändrar värde på item.
   public void setItem(Item item) {
      this.item = item;
   }

   //Returnerar värdet på monster.
   public Monster getMonster() {
      return monster;
   }
   
   //Ändrar värde på monster.
   public void setMonster(Monster monster) {
      this.monster = monster;
   }
   
   //Räknar ut resultatet av en strid mellan spelaren och ett monster.
   public int resolveBattle(int playerHealth, int playerGivesDamage) {
      do {
         System.out.println("The " + monster.getName() + " attacks you and does " + monster.getGivesDamage() + " damage.");
         playerHealth -= monster.getGivesDamage();
         if (playerHealth <= 0) {
            break;
         }
         System.out.println("You attack the " + monster.getName() + " and do " + playerGivesDamage + " damage");
         monster.setHealthPoints(monster.getHealthPoints() - playerGivesDamage);
         
      } while (monster.getHealthPoints() > 0);
      
      if (monster.getHealthPoints() <= 0) {
         System.out.println("You kill the " + monster.getName() + ", but you only have " + playerHealth + " health points left.");
         setMonster(null);
      }        
      return playerHealth;
   }
   
   //Frågar spelaren vad hen vill göra baserat på vad som finns i rummet.
   public ArrayList choices() {
      
      ArrayList<String> choices = new ArrayList<>();
      
      System.out.println("\nWhat do you want to do? Select a choice and press [Enter]");
      if (item != null) {
         System.out.println("Pick up " + item.getName() + " [p]");
         choices.add("p");
      }
      if (doorNorth != null) {
         System.out.println("Go north [n]");
         choices.add("n");
      }
      if (doorEast != null) {
         System.out.println("Go east [e]");
         choices.add("e");
      }
      if (doorSouth != null) {
         System.out.println("Go South [s]");
         choices.add("s");
      }
      if (doorWest != null) {
         System.out.println("Go west [w]");
         choices.add("w");
      }
      return choices;
   }
   
   //Returnerar huruvida spelaren kan öppna dörren och passera till nästa rum eller ej.
   public boolean openDoor(String choice, boolean hasKey) {
      Door currentDoor = doorNorth;
      switch (choice){
					case "n":
                  currentDoor = doorNorth;
                  break;
					case "e":
                  currentDoor = doorEast;
                  break;
					case "s":
                  currentDoor = doorSouth;
                  break;
					case "w":
                  currentDoor = doorWest;
      }           
      if (currentDoor.isLocked() == true && hasKey == true) { //Dörren är låst, men spelaren har nyckel.
         currentDoor.setLocked(false);
         System.out.println("The door is locked, but the key you found fits perfectly in the lock. You turn the key and the door opens with a loud squeaky sound.");
         return true;
      }
      else if (currentDoor.isLocked() == true && hasKey == false) { //Dörren är låst och spelaren har ingen nyckel.
         System.out.println("The door is locked...");
         return false;
      }
      else { //Dörren är ej låst.
         System.out.println("The door is unlocked. You open it and go thrue the door.");
      }
      return true;
   }
}
