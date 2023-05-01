package Game;

import Player.Wizard;
import House.House;
import House.SortingHat;
import Potion.Potion;
import Wand.Wand;
import Pet.Pet;
import Spell.Spell;
import Spell.ForbiddenSpell;
import Spell.ApplySpell;
import Enemy.Enemy;
import Enemy.Boss;
import javafx.scene.control.TextArea;


import java.util.*;
import java.util.List;

public class Game {
    public static int[] property;
    public static Wizard wizard;
    public static List<Spell> spells = new ArrayList<>();
    public static List<ForbiddenSpell> forbiddenSpells = new ArrayList<>();
    public static List<ApplySpell> applySpells = new ArrayList<>();
    public static List<Potion> potions = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static int adventurelevel = 1;


    public void play() {
        createPlayers();
        assignHouse();
        Properties();//显示属性
    }



    public void createPlayers() {//创建角色，分配学院和法杖（杖芯和尺寸）
        String name = "Harry Potter";
        property = initializationProperty();
        wizard = new Wizard(property[1], name, property[2], property[3], property[4], property[5], property[0], null, null, null, null, null, null, null, property[6]);

    }




    public int[] initializationProperty() {
        int[] property = new int[7];
        Random random = new Random();
        int level = 100;
        int HP = 100000;
        int gold = 1000;
        int sum = 100;
        int pharmacy = random.nextInt(21) + 20;
        sum -= pharmacy;
        int attack = random.nextInt(21) + 10;
        sum -= attack;
        int defense = random.nextInt(21) + 20;
        sum -= defense;
        int precise = sum;
        property[0] = level;
        property[1] = HP;
        property[2] = pharmacy;
        property[3] = attack;
        property[4] = defense;
        property[5] = precise;
        property[6] = gold;
        return property;
    }
    public void assignHouse() {
        House house = SortingHat.getRandomHome();
        wizard.setHouse(house);

        chooseWand();
    }
        public void chooseWand() {
        int intWand = 1;
        Wand wand = Wand.chooseWand(intWand);
            wizard.setWand(wand);
         
        choosePet();
    }

    public void choosePet() {
        int intPet = 1;
        Pet pet = Pet.choosePet(intPet);
        wizard.setPet(pet);
         
    }

    public void Properties() {
        property[2] = property[2] + Wand.getPharmacyBonus() + wizard.getHouse().getPharmacyBonus() + wizard.getPet().getPharmacyBonus();
        property[3] = property[3] + Wand.getAttackBonus() + wizard.getHouse().getAttackBonus() + wizard.getPet().getAttackBonus();
        property[4] = property[4] + Wand.getDefenseBonus() + wizard.getHouse().getDefenseBonus() + wizard.getPet().getDefenseBonus();
        property[5] = property[5] + Wand.getPreciseBonus() + wizard.getHouse().getPreciseBonus() + wizard.getPet().getPreciseBonus();
        wizard.setPharmacy(property[2]);
        wizard.setAttack(property[3]);
        wizard.setDefense(property[4]);
        wizard.setPrecise(property[5]);
       }



      
   
    }

