package rpg;


public class Monster extends RPGCharacter{
    private int attackDamage;
    private static final int ACCURACY = 65;

    public Monster(String name, int hp, int attackDamage, int mp) {
        super(name, hp, ACCURACY);
        this.attackDamage = attackDamage;
    }

    public int attack() {
        return attackDamage;
    }

}
