package rpg;


public abstract class RPGCharacter {

    private String name;
    private int hp;
    private int mp;
    private int accuracy;
    private String[] skill;
    private String skillInfo;
    private String[] skillConditions;
    
    public RPGCharacter(String name, int hp, int accuracy) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.accuracy = accuracy;
    }

    // implement in subclass
    public abstract int attack();

    // checks to see if character is still alive
    public boolean isAlive() {
        return hp > 0 ? true : false;
    }

    // may be overriden in subclass, damage is dependent on hero type
    public int takeDamage(int damage) {
        hp -= damage;
        return hp;
    }

    // getters setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }
    
    public void setMp(int mp) {
        this.mp = mp;
    }
    
    public int getAccuracy() {
        return accuracy;
    }
    
    public String getSkill(int move) {
        return skill[move];
    }
    
    public String getSkillInfo() {
        return skillInfo;
    }
    
    public String[] getSkillCond() {
        return skillConditions;
    }
    
    @Override
    public String toString() {
        return "RPGCharacter{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", mp=" + mp +
                '}';
    }
}
