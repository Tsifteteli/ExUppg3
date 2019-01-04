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
    
    //klassvariablernas egenskaper defineras
    private String name;
    private int healthPoints;
    private int givesDamage;
    private String description;
    
    
    //konstruktorn defineras
    public Monster () {
        String name = "scorpilion";
        int healthPoints = 8;
        int givenDamages = 1;
        String description = "a big monster with a long sharp tail"; 
    }
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

