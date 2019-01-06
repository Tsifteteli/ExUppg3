/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package dungeon;


//Klass innehållandes information som rör dörrar.
public class Door {
   
   private boolean locked;

   
   //Konstruktor
   public Door(boolean locked) { //locked är ett av värdena "true" eller "false".
      this.locked = locked; 
   }
  
   //Returnerar huruvida dörren är låst eller ej.
   public boolean isLocked() {
      return locked;
   }

   //Ändrar värde på locked.
   public void setLocked(boolean locked) {
      this.locked = locked;
   }
}



