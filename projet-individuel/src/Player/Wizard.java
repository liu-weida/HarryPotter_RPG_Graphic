package Player;
import Character.Character;
import Enemy.Enemy;
import Pet.Pet;
import Wand.Wand;
import House.House;
import Spell.Spell;
import Spell.ForbiddenSpell;
import Spell.ApplySpell;
import Potion.Potion;
import java.util.List;
import java.util.Random;

public class Wizard extends Character {
    private Pet pet;
    private Wand wand;
    private House house;
    private List<Spell> knownSpells;
    private List<ForbiddenSpell> knownForbiddenSpells;
    private List<ApplySpell> knownApplySpell;
    private List<Potion> potions;

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


    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        this.wand = wand;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public List<Spell> getKnownSpells() {
        return knownSpells;
    }

    public void setKnownSpells(List<Spell> knownSpells) {
        this.knownSpells = knownSpells;
    }

    public List<ForbiddenSpell> getKnownForbiddenSpells() {
        return knownForbiddenSpells;
    }

    public void setKnownForbiddenSpells(List<ForbiddenSpell> knownForbiddenSpells) {
        this.knownForbiddenSpells = knownForbiddenSpells;
    }

    public List<Potion> getPotions() {
        return potions;
    }

    public void setPotions(List<Potion> potions) {
        this.potions = potions;
    }

    public void defend() {
        // Implementation of defend method goes here
    }


    public void attack(Wizard wizard, Character enemy, Spell spell) {
        Random random = new Random();
        double number = random.nextDouble();
        if (number < wizard.getPrecise()) {
            int enemyHP = enemy.getHP() - (spell.getDamage() * wizard.getAttack());
            System.out.println("You have dealt "+(spell.getDamage() * wizard.getAttack())+" points of damage to "+enemy.getName()+"!");
            enemy.setHP(enemyHP);
            System.out.println("The "+enemy.getName()+" has "+enemyHP+" HP points left.");
        }else {
            System.out.println("The magic spell did not hit.");
        }
    }
    public void usePotion(Wizard wizard, Potion potion){
        int HP = wizard.getHP()+(potion.getAddHP()*wizard.getPharmacy());
        wizard.setHP(HP);
        System.out.println("You have used "+potion.getName()+" and your HP has increased by "+(potion.getAddHP()*wizard.getPharmacy())+" points!");
        System.out.println("Your current HP is "+wizard.getHP()+" points.");
    }
    public void forbiddenAttack(Wizard wizard, Character enemy, ForbiddenSpell forbiddenSpell) {
        Random random = new Random();
        double number = random.nextDouble();
        if (number < wizard.getPrecise()) {
            int enemyHP = enemy.getHP() - (forbiddenSpell.getDamage() * wizard.getAttack());
            System.out.println("You have dealt "+(forbiddenSpell.getDamage() * wizard.getAttack())+" points of damage to "+enemy.getName()+"!");
            enemy.setHP(enemyHP);
            System.out.println("The "+enemy.getName()+" has "+enemyHP+" HP points left.");
        }else {
            System.out.println("The magic spell did not hit.");
        }
    }
}
