package rpg;

import java.util.*;


public class RPG {

    private Random rand = new Random();
    private static String playerName;
    
    static Scanner sc = new Scanner(System.in);

    public RPG() {
        this.rand = new Random();
    }

    // generate a random monster name..
    public String getRandomMonsterName() {
        String[] adjectives = {"Green", "Slimy", "Bloody", "Smelly"};
        String[] monsters = {"Ogre", "Elf", "Giant", "Teacher"};
        List<String> adjs = Arrays.asList(adjectives);
        List<String> mons = Arrays.asList(monsters);

        return adjs.get(randInt(0, adjs.size() - 1)) + " " + mons.get(randInt(0, mons.size() - 1));
    }

    // inclusive random integer
    public int randInt(int min, int max) {
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    } 
    
    // pause the game for awhile for dramatic effect!
    public void sleep(int x) {
        try {
            Thread.sleep(x);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    //determines if dodged or nay
    public boolean dodge(RPGCharacter attacker) {
        return attacker.getAccuracy() >= randInt(0, 100);
    }
    
    public boolean attack(RPGCharacter attacker, RPGCharacter defender) {
        int damage = attacker.attack();
        System.out.println("--> " + attacker.getName() + " ATK " + defender.getName());
        sleep(2000);

        if (dodge(attacker)) {
            int initHp = defender.getHp();
            int remHp = defender.takeDamage(damage);
            System.out.println(attacker.getName() + " dealt " + (initHp - remHp) + " damage!");
            if (remHp <= 0) {
                System.out.printf("--> %s killed %s!\n", attacker.getName(), defender.getName());
                return true;
            }
        } else {
            System.out.printf("%s dodged %s's attack!\n", defender.getName(), attacker.getName());   
        }
        return false;
    }
    
    public void flee(RPGCharacter attacker) {
        System.out.println(attacker.getName() + " has fled the battle!");
        System.exit(0);
    }
    
    // duel two characters, one as attacker, one as defender
    // returns true if someone is killed
    public boolean duel(RPGCharacter attacker, RPGCharacter defender, boolean isHero) {
        if(isHero == true) {
            System.out.println("Choose your move: \n" +
                               "1-> Attack\n" +
                               "2-> Flee");
            switch(sc.nextInt()) {
                case 1: if(attack(attacker, defender) == true) {
                            return true;
                        }
                        else {
                            return false;
                        }
                case 2: flee(attacker);
                default:
            }
        }
        else {
            if(attack(attacker, defender)) {
                return true;
            }
            else {
                return false;
            }
        }
        return true;
    }
    
    public static RPGCharacter getNewMonster(RPGCharacter monster, RPG rpg) {
        return monster = new Monster(rpg.getRandomMonsterName(), 1000, rpg.randInt(0, 200), 0);
    }
    
    // game...
    public static void main(String[] args) {
        RPG rpg = new RPG();
        RPGCharacter hero = null;
        RPGCharacter monster = new Monster(rpg.getRandomMonsterName(), 1000, rpg.randInt(0, 200), 0);
        System.out.println("====== GAME START =====");
        System.out.println("Input name: ");
        playerName = sc.next();
        System.out.println("Choose your class:\n1-Warrior\n2-Mage\n3-Rogue");
        switch(sc.nextInt()){
            case 1: 
                hero = new Warrior(playerName, 100);
                break;
            case 2:
                hero = new Mage(playerName, 100);
                break;
            case 3:
                hero = new Rogue(playerName, 100);
                break;
            default:
                //do nothing
        }
        System.out.printf("%s\n%s\n", hero, monster);

        // fight! for version 1, hero will always attack first.
        int count = 0;
        while (true) {
            System.out.println("== round " + ++count);
            // hero's turn
            boolean heroVsMonster = rpg.duel(hero, monster, true);
            if (heroVsMonster) break;

            // monster's turn
            boolean monsterVsHero = rpg.duel(monster, hero, false);
            if (monsterVsHero) break;

            System.out.printf("%s\n%s\n", hero, monster);
        }
        System.out.println("=GAME OVER=");
        System.out.printf("%s\n%s\n", hero, monster);
    }
}

