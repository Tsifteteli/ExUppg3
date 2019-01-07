/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package items;


//Subklass innehållandes information om vapen. 
public class Weapon extends Item {
    
   //Konstruktorn
   private final int increaseDamageBy;
    
  
   //Konstruktor 
   public Weapon(String name, String description, int increaseDamageBy) {
      super.name = name;
      super.description = description;
      this.increaseDamageBy = increaseDamageBy;         
   }
    
   //Returnerar increaseDamageby
   @Override
   public int getIncreaseDamageBy() {
      return increaseDamageBy;  
   }
}
