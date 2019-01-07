/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package items;


//Abstract superklass innehållandes gemensam information för items.
public abstract class Item {
    
   protected String name;
   protected String description;
    
         
   //Returnerar description.
   public String getDescription() {
      return description; 
   }
   
   //Returnerar name.
   public String getName() {
      return name;  
   }
   
   //Returnerar increaseDamageby
   public int getIncreaseDamageBy() {
      return 0;  
   }
}
