/*2019-01-08
D0019N Examinationsuppgift 3, Äventyrsspel
Caroline Blomgren, carbol-8@student.ltu.se
Amanda Nordmark, norama-6@student.ltu.se*/

package monsters;

/**
 *
 * @author Caroline
 */
public class Monster {
    
    //klassvariablerna deklareras
    private String name;
    private int healthPoints;
    private int givesDamage;
    private String description;
    
    
    //konstruktorn defineras
    public Monster (String name, int healthPoints, int givesDamages, String description) {
        this.name = name;
        healthPoints = 8;
        givesDamage = 1;
        description = description; 
    }
    
   

    //metod get name
    public String getName() {
       return name;
    }

    //metod set healthPoints
    public int setHealthPoints () {
        return healthPoints;
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

