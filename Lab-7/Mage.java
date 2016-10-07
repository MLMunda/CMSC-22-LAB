package rpg;

import java.util.Random;


public class Mage extends Hero {

    private Random rand = new Random();

    private static final int BASE_ATTACK = 9;
    private static final int ARMOR = 3;
    private static final int ACCURACY = 80;
    private static final int YEAH_CHANCE = 5;
    
    public int randInt(int min, int max) {
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    } 

    public Mage(String name, int level) {
        super(name, level, level + ARMOR, ACCURACY);
    }

    public int attack() {
        if(randInt(0, 100) <= YEAH_CHANCE) {
            return (BASE_ATTACK + getLevel()) * 2;
        }
        else {
            return BASE_ATTACK + getLevel();
        }
    }

    public int takeDamage(int damage) {
        if(randInt(0, 100) <= YEAH_CHANCE) {
            damage -= ARMOR * 3;
        }
        else {
            damage -= ARMOR;
        }
        return super.takeDamage(damage);
    }
}
