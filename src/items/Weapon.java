/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package items;

/**
 *
 * @author Caroline
 */
public class Weapon extends Item {
    
    //konstruktorn
    private int increaseDamageBy;
    
  
    //Konstruktor 
    public Weapon(String name, String description, int increaseDamageBy) {
      super.name = name;
      super.description = description;
      this.increaseDamageBy = increaseDamageBy;         
    }
    
    //metod get increaseDamageby
   public int getIncreaseDamageBy() {
      return increaseDamageBy;  

    }
}
