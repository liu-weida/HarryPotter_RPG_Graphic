package Player;

import Character.Character;
import Game.Game;
import Pet.Pet;
import Wand.Wand;
import House.House;
import Spell.Spell;
import Spell.ForbiddenSpell;
import Spell.ApplySpell;
import Potion.Potion;
import java.util.List;
import java.util.Random;


import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Wizard extends Character {
    public Pet pet;
    public Wand wand;
    public House house;
    private List<Spell> knownSpells;
    private List<ForbiddenSpell> knownForbiddenSpells;
    private List<ApplySpell> knownApplySpell;
    private List<Potion> potions;

    public static int enemyHP = 0;
    public static int injury = 0;

    public static int injuryF = 0;

    public static boolean ifDefense = false;

    public Wizard(int HP, String name, int pharmacy, int attack, int defense, int precise, int level, Pet pet, Wand wand, House house, List<Spell> knownSpells, List<ForbiddenSpell> knownForbiddenSpells, List<ApplySpell> knownApplySpells, List<Potion> potions,int gold) {
        super(HP, name, pharmacy, attack, defense, precise, level,gold);
        this.pet = pet;
        this.wand = wand;
        this.house = house;
        this.knownSpells = knownSpells;
        this.knownForbiddenSpells = knownForbiddenSpells;
        this.knownApplySpell = knownApplySpells;
        this.potions = potions;
    }


    public void attack(Wizard wizard, Character enemy, Spell spell) {
        Random random = new Random();
        double number = random.nextDouble();
        if (number < wizard.getPrecise()+wizard.getPrecise()*0.05) {
            injury = (int)((spell.getDamage() + wizard.getAttack())*((100-(enemy.getDefense()))*0.01));
            enemyHP = enemy.getHP() - injury;
            System.out.println("You have dealt "+injury+" points of damage to "+enemy.getName()+"!");
            enemy.setHP(enemyHP);
            System.out.println("The "+enemy.getName()+" has "+enemyHP+" HP points left.");
        }else {
            System.out.println("The magic spell did not hit.");
        }
    }

    public void forbiddenAttack(Wizard wizard, Character enemy, ForbiddenSpell forbiddenSpell) {
        Random random = new Random();
        double number = random.nextDouble();
        if (number < wizard.getPrecise()+wizard.getPrecise()*0.05) {
            injuryF = (int)((forbiddenSpell.getDamage() + wizard.getAttack())*((100-(enemy.getDefense()))*0.01));
            int enemyHP = enemy.getHP() - injuryF;
            enemy.setHP(enemyHP);
        }
    }
    public static void defend(Character enemy) {
        Random random = new Random();
        double number = random.nextDouble();
        if (number <= 0.6f){
            ifDefense = true;
        }else {
            ifDefense = false;
            enemy.attack(Game.wizard, enemy, Game.spells.get(0));

        }
    }
}
