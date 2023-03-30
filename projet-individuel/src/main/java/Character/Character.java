package Character;


import Player.Wizard;
import Spell.Spell;


import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public abstract class Character{
    private String name;
    private int level;
    public static int HP;
    private int gold;
    private int pharmacy;  //药水
    private int attack;  //攻击
    private int defense;  //防御
    private int precise;  //精准

    public Character(int HP, String name, int pharmacy, int attack, int defense, int precise, int level, int gold ){
        this.name = name;
        this.level = level;
        this.HP = HP;
        this.pharmacy = pharmacy;
        this.attack = attack;
        this.defense = defense;
        this.precise = precise;
        this.gold = gold;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getLevel() {
//        return level;
//    }
//
//    public void setLevel(int level) {
//        this.level = level;
//    }
//

//    public int getPharmacy() {
//        return pharmacy;
//    }
//
//    public void setPharmacy(int pharmacy) {
//        this.pharmacy = pharmacy;
//    }
//
//    public int getAttack() {
//        return attack;
//    }
//
//    public void setAttack(int attack) {
//        this.attack = attack;
//    }
//
//    public int getDefense() {
//        return defense;
//    }
//
//    public void setDefense(int defense) {
//        this.defense = defense;
//    }
//
//    public int getPrecise() {
//        return precise;
//    }
//
//    public void setPrecise(int precise) {
//        this.precise = precise;
//    }
//
//    public int getGold() {
//        return gold;
//    }
//
//    public void setGold(int gold) {
//        this.gold = gold;
//    }


    public abstract void attack(Wizard wizard, Character enemy, Spell spell);

}
