package rpg;

import java.util.*;

public class Rogue extends Hero {

    private Random rand = new Random();
    
    private static final int BASE_ATTACK = 8;
    private static final int ARMOR = 4;
    private static final int ACCURACY = 80;
    private static final int CRIT_CHANCE = 10;
    
    public int randInt(int min, int max) {
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    } 

    public Rogue(String name, int level) {
        super(name, level, level + ARMOR, ACCURACY);
    }
    
    public int attack() {
        if(randInt(0, 100) <= CRIT_CHANCE) {
            return (BASE_ATTACK + getLevel()) * 2;
        }
        else {
            return BASE_ATTACK + getLevel();
        }
    }

    public int takeDamage(int damage) {
        // reduce damage because of armor!!! oh yeah!
        damage -= ARMOR;
        // set new hp
        return super.takeDamage(damage);
    }
}
