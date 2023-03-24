package Potion;

import Player.Wizard;
import Spell.Spell;
import Wand.Wand;

public class Potion { //药水
    private String name;
    private int addHP;


    public Potion(String name, int addHP) {
        this.name = name;
        this.addHP = addHP;
    }

    private static final Potion invigorationDraught = new Potion("Invigoration Draught", 20);//活力滋补剂
    private static final Potion bruiseHealing = new Potion("Bruise Bealing", 40);//淤伤治疗剂
    private static final Potion bloodrReplenishing = new Potion("Blood Replenishing", 60);//补血药
    private static final Potion skeleGro = new Potion("Skele Gro", 100);//生骨灵

    public int getAddHP() {
        return addHP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddHP(int addHP) {
        this.addHP = addHP;
    }

    public static void getPotion() {
        System.out.println("1." + invigorationDraught);
        System.out.println("2." + bruiseHealing);
        System.out.println("3." + bloodrReplenishing);
        System.out.println("4." + skeleGro);
    }
    public static Potion choosePotion(int potion) {
        switch (potion) {
            case 1:
                return invigorationDraught;
            case 2:
                return bruiseHealing;
            case 3:
                return bloodrReplenishing;
            case 4:
                return skeleGro;
            default:
                return null;
        }

    }


    public String toString(){
        return name;
    }


}

