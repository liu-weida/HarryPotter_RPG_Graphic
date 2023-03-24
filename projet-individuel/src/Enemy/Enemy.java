package Enemy;

import Character.Character;
import Player.Wizard;
import Spell.Spell;
import Wand.Wand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Enemy extends AbstractEnemy {

    public Enemy(int HP, String name, int pharmacy, int attack, int defense, int precise, int level, List<Spell> knownSpells,int gold) {
        super(HP, name, pharmacy, attack, defense, precise, level, knownSpells,gold);
    }
    public static final Enemy gargoyle = new Enemy(200, "Gargoyle", 2, 2, 2, 2, 1,new ArrayList<Spell>(Arrays.asList(Spell.reducto)),20);
    public static final Enemy juvenileTrolls = new Enemy(200, "Juvenile Trolls", 2, 2, 2, 2, 1,new ArrayList<Spell>(Arrays.asList(Spell.reducto)),20);
    public static final Enemy snake = new Enemy(200, "Snake", 2, 2, 2, 2, 1,new ArrayList<Spell>(Arrays.asList(Spell.reducto)),20);
    public static final Enemy deathEaters = new Enemy(200, "Death Eaters", 2, 2, 2, 2, 1,new ArrayList<Spell>(Arrays.asList(Spell.reducto)),20);


    public void attack(Wizard wizard, Character enemy, Spell spell) {

        Random random = new Random();
        double number = random.nextDouble();
        if (number < enemy.getPrecise()) {
            int wizardHP = wizard.getHP() - (spell.getDamage() * enemy.getAttack());
            System.out.println("Enemy has dealt "+(spell.getDamage() * enemy.getAttack())+" points of damage to you!");
            wizard.setHP(wizardHP);
        }else {
            System.out.println("The enemy's attack missed!");
        }
    }

}