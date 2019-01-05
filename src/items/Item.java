/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package items;

/**
 *
 * @author Caroline
 */
public abstract class Item {
    
    //klassvariablarna deklareras
    private String description;
    private String name;
    
     //metod hämtar och returerar värdet på description
   public String getDescription () {
      return description; 
   }
    //metod hämtar och returerar värdet på name
   public String getName() {
      return name;
      
   }      
   
}
