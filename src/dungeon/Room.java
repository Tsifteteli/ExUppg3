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
         System.out.println(monster.getDescription);
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
}
