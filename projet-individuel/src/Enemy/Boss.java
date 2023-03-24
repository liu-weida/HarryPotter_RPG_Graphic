package Enemy;

import Character.Character;
import Player.Wizard;
import Spell.Spell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Boss extends AbstractEnemy {

    public Boss(int HP, String name, int pharmacy, int attack, int defense, int precise, int level, List<Spell> knownSpells,int gold) {
        super(HP, name, pharmacy, attack, defense, precise, level, knownSpells,gold);
    }
    public static final Boss troll = new Boss(200, "Troll", 5, 5, 5, 5, 1,new ArrayList<Spell>(Arrays.asList(Spell.reducto)),100);
    public static final Boss basilic = new Boss(200, "Basilic", 5, 5, 5, 5, 1,new ArrayList<Spell>(Arrays.asList(Spell.reducto)),100);
    public static final Boss dementor = new Boss(200, "Dementor", 5, 5, 5, 5, 1,new ArrayList<Spell>(Arrays.asList(Spell.reducto)),100);
    public static final Boss peterPettigrew = new Boss(200, "Peter Pettigrew", 5, 5, 5, 5, 1,new ArrayList<Spell>(Arrays.asList(Spell.reducto)),100);
    public static final Boss doloresOmbrage = new Boss(200, "Dolores Ombrage", 5, 5, 5, 5, 1,new ArrayList<Spell>(Arrays.asList(Spell.reducto)),100);
    public static final Boss doloresOmbrageLeader = new Boss(200, "Dolores Ombrage Leader", 5, 5, 5, 5, 1,new ArrayList<Spell>(Arrays.asList(Spell.reducto)),100);
    public static final Boss bellatrixLestrange = new Boss(200, "Bellatrix Lestrange", 5, 5, 5, 5, 1,new ArrayList<Spell>(Arrays.asList(Spell.reducto)),100);
    public static final Boss voldemort = new Boss(200, "Voldemort", 5, 5, 5, 5, 1,new ArrayList<Spell>(Arrays.asList(Spell.reducto)),100);
    public void attack(Wizard wizard, Character boss, Spell spell) {

        Random random = new Random();
        double number = random.nextDouble();
        if (number < boss.getPrecise()) {
            int wizardHP = wizard.getHP() - (spell.getDamage() * boss.getAttack());
            System.out.println("Enemy has dealt "+(spell.getDamage() * boss.getAttack())+" points of damage to you!");
            wizard.setHP(wizardHP);
        }else {
            System.out.println("The enemy's attack missed!");
        }
    }
}