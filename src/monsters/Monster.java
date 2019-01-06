/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package monsters;

//Klass innehållandes information om monster.
public class Monster {
    
   //klassvariablerna deklareras
   private String name;
   private int healthPoints;
   private int givesDamage;
   private String description;
    
    
   //konstruktor Scorpilion
   public Monster Scorpilion (String name, int healthPoints, int givesDamages, String description) {
      name = "Scorplion";
      healthPoints = 8;
      givesDamage = 1;
      description = "a big monster with a sharp tail"; 
       return null;
   }
   
     //konstruktorn Dragon
   public Monster Dragon (String name, int healthPoints, int givesDamages, String description) {
      name = "Dragon";
      healthPoints = 18;
      givesDamage = 8;
      description = "a strong undefeeted dragon"; 
       return null;
}
  
   //metod get name
   public String getName() {
      return name;
   }

 //metod set healtPoints 
   public void setHealthPoints (int healthPoints) {
       this.healthPoints = healthPoints;
   }

   //metod get healthPoints
   public int getHealthPoints () {
      return healthPoints;
   }

   //metod get givesDamage
   public int getGivesDamage () {
      return givesDamage;
   }

   //metod get description
   public String getDescription () {
      return description; 
   }
}

