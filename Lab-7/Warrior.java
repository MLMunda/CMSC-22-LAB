package rpg;

import java.util.Random;


public class Warrior extends Hero {

    private Random rand = new Random();
    
    private static final int BASE_ATTACK = 6;
    private static final int ARMOR = 6;
    private static final int ACCURACY = 80;
    private static final int BLOCK_CHANCE = 10;

    public int randInt(int min, int max) {
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    } 
    
    public Warrior(String name, int level) {
        super(name, level, level + ARMOR, ACCURACY);
    }
    
    public int attack() {
        return BASE_ATTACK + getLevel();
    }
    
    public int takeDamage(int damage) {
        if(randInt(0, 100) <= BLOCK_CHANCE) {
            damage = 0;
            return super.takeDamage(damage);
        }
        else {
            damage -= ARMOR;
            return super.takeDamage(damage); 
        }
    }
}
