/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package monsters;


//Klass innehållandes information om monster.
public class Monster {
    
   //klassvariablerna deklareras
   private final String name;
   private int healthPoints;
   private final int givesDamage;
   private final String description;
    
   
   //Konstruktor 
   public Monster(String name, int healthPoints, int givesDamage, String description) {
      this.name = name;
      this.healthPoints = healthPoints;
      this.givesDamage = givesDamage;
      this.description = description;   
   }
  
   //Returnerar name
   public String getName() {
      return name;
   }

   //Anger nytt värde på healtPoints 
   public void setHealthPoints(int healthPoints) {
       this.healthPoints = healthPoints;
   }

   //Returnerar healthPoints
   public int getHealthPoints() {
      return healthPoints;
   }

   //ReturnerargivesDamage
   public int getGivesDamage() {
      return givesDamage;
   }

   //Returnerar description
   public String getDescription() {
      return description; 
   }
}

