/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package dungeon;


//Klass innehållandes information som rör dörrar.
public class Door {
   
//klassvariablar deklareras
private boolean locked;

//Konstruktor
public Door(boolean locked) {
   this.locked = locked; 
}

    
public boolean locked () {
   return locked;
} 

// metod för att initiera dörren till låst
public void setLocked (boolean locked) {
   this.locked = locked;
}

//metod setLocked
public void setName (String name) {
   this.name = name;
}

//metod getLocked
public String name() {
   return name;
}


}



