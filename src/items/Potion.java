/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package items;

/**
 *
 * @author Caroline
 */
public class Potion extends Item {
    
   //klassvariablar
   String description;
   String name;
   
   //Konstruktor
   public Potion healthPotion (String description, String name) {
      this.description = description;
      this.name = name;
      
}
   
}
