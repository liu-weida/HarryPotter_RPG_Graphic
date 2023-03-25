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

import java.util.*;

public class Game {
    private int[] property;
    public static Wizard wizard;
    private Spell knowSpells;
    public static List<Spell> spells = new ArrayList<>();
    static List<ForbiddenSpell> forbiddenSpells = new ArrayList<>();
    static List<ApplySpell> applySpells = new ArrayList<>();
    static List<Potion> potions = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    int adventurelevel = 1;
    public void play() {
        createPlayers();
        assignHouse();
        currentProperties();//显示属性
        while (true){
            arrivalHouse();//购买药剂或者学习魔法或者训练营
        }

    }

    public void createPlayers() {//创建角色，分配学院和法杖（杖芯和尺寸）
        System.out.println("Welcome to Hogwarts, dear new student. What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + ".\n"
                + "Attributes are being assigned to you.");
        waitForInput();
        this.property = initializationProperty();
        System.out.println("Your current attributes are:");
        System.out.println("level: " + property[0] + "\nHP: " + property[1] + "\npharmacy: " + property[2] +
                "\nattack: " + property[3] + "\ndefense: " + property[4] + "\nprecise: " + property[5]);
        wizard = new Wizard(property[1], name, property[2], property[3], property[4], property[5], property[0], null, null, null, null, null, null, null, property[6]);

    }

    public void assignHouse() {
        System.out.println("Next, SortingHat will assign you to a house.");
        waitForInput();
        House house = SortingHat.getRandomHome();
        System.out.println("Your house is: " + house);
        waitForInput();
        System.out.println("Next, choose your wand.");
        Wand.getWand();
        int intWand = scanner.nextInt();
        Wand wand = Wand.chooseWand(intWand);
        System.out.println("Your wand is: " + wand );
        waitForInput();
        System.out.println("Next, choose your pet.");
        int i = 1;
        for (Pet pet : Pet.values()) {
            System.out.println(i + "." + pet);
            i++;
        }
        int intPet = scanner.nextInt();
        Pet pet = Pet.choosePet(intPet);
        System.out.println("Your pet is: " + pet);
        wizard.setHouse(house);
        wizard.setWand(wand);
        wizard.setPet(pet);
        waitForInput();
    }

    public void currentProperties() {
        for (int i = 2; i < 6; i++) {
            property[i] = property[i] + Wand.getPharmacyBonus() + SortingHat.getRandomHome().getPharmacyBonus() + Pet.CAT.getPharmacyBonus();
        }
        System.out.println("Your current attributes are:");
        System.out.println("House: "+ wizard.getHouse()+"\nWand: "+wizard.getWand()+"\nPet: "+wizard.getPet());
        System.out.println("level: " + property[0] + "\nHP: " + property[1] + "\npharmacy: " + property[2] +
                "\nattack: " + property[3] + "\ndefense: " + property[4] + "\nprecise: " + property[5] + "\ngold: " + property[6]);
        System.out.println("Spells:");
        int i = 1;
        if (spells.isEmpty()) {
            System.out.println("You don't know the spell yet");
        } else {
            for (Spell spell : spells) {
                System.out.println(i+". "+spell);
                i++;
            }
        }
        System.out.println("Forbidden Spells:");
        int j = 1;
        if (forbiddenSpells.isEmpty()) {
            System.out.println("You don't know the forbidden spell yet");
        } else {
            for (ForbiddenSpell forbiddenSpell : forbiddenSpells) {
                System.out.println(j+". "+forbiddenSpell);
                j++;
            }
        }
        System.out.println("Potions:");
        int ij = 1;
        if (potions.isEmpty()) {
            System.out.println("You don't have the potion yet.");
        } else {
            for (Potion potion : potions) {
                System.out.println(ij + ". " + potion);
                ij++;
            }
        }
        System.out.println("Click to enter House.");
        waitForInput();

    }

    public int[] initializationProperty() {
        int[] property = new int[7];
        Random random = new Random();
        int level = 100;
        int HP = 100000;
        int gold = 10000;
        int sum = 20;
        int pharmacy = random.nextInt(5) + 4; // 3-7
        sum -= pharmacy;
        int attack = random.nextInt(5) + 4; // 3-7
        sum -= attack;
        int defense = random.nextInt(5) + 4; // 3-7
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

    public void arrivalHouse() { //到达学院，可以购买药剂和学习魔法
        System.out.println("Welcome to House, how can I help you?");
        System.out.println("1. Learn new spell.\n"+ "2. Learn new forbidden spell.\n" + "3. Buy potions.\n"+"4. Access to Boot Camp.\n"+"5. Start the adventure.\n"+"6. View own properties");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                learnSpell();
                break;
            case 2:
                learnForbiddenSpell();
                break;
            case 3:
                buyPotion();
                break;
            case 4:
                trainingGround();
                break;
            case 5:
                adventure();
                break;
            case 6:
                currentProperties();
                break;
            default:break;
        }
    }



        public void adventure(){//用来控制进入的关卡
            if (spells.isEmpty()){
                System.out.println("You have not mastered the spell, so it is not safe to start the adventure, go and learn it!");
                waitForInput();
                arrivalHouse();
            }
        switch (adventurelevel){
            case 1:
                Level.adventure1st();
                break;
            case 2:
                Level.adventure2nd();
                break;
            case 3:
                Level.adventure3nd();
                break;
            case 4:
                Level.adventure4th();
                break;
            case 5:
                Level.adventure5th();
                break;
            case 6:
                Level.adventure6th();
                break;
            case 7:
                Level.adventure7th();
                break;
        }
        adventurelevel += 1;
    }

    public void learnSpell() {
        System.out.println("Welcome to the magic class, what magic do you want to learn?");
        Spell.getSpell();
        int choose = scanner.nextInt();
        if ((choose == 1 && wizard.getLevel()<2)||
                (choose == 2 && wizard.getLevel()<3)||
                (choose == 3 && wizard.getLevel()<4)||
                (choose == 4 && wizard.getLevel()<5)||
                (choose == 5 && wizard.getLevel()<6)||
                (choose == 6 && wizard.getLevel()<7)||
                (choose == 7 && wizard.getLevel()<8))
                {System.out.println("Your level is not enough oh, please go to the adventure and then come back.");}
        Spell spell = Spell.chooseSpell(choose);
        if (spells.contains(spell)){
            System.out.println("You have mastered this spell, please reselect.");
            arrivalHouse();
        }else {
            spells.add(spell);
            wizard.setKnownSpells(spells);
            System.out.println("After studying hard, congratulations you have learned: "+ spell);
        }

        //List<Spell> spells = wizard.getKnownSpells();


    }

    public void learnForbiddenSpell() {//禁忌魔法
        System.out.println("Welcome to the Forbidden Magic Class, what magic do you want to learn?");
        ForbiddenSpell.getForbiddenSpell();
        int choose = scanner.nextInt();
        if ((choose == 1 && wizard.getLevel()<8)||
                (choose == 2 && wizard.getLevel()<9)||
                (choose == 3 && wizard.getLevel()<10))
        {System.out.println("Your level is not enough oh, please go to the adventure and then come back.");}
        ForbiddenSpell forbiddenSpell = ForbiddenSpell.chooseForbiddenSpell(choose);
        if (forbiddenSpells.contains(forbiddenSpell)){
            System.out.println("You have mastered this spell, please reselect.");
            arrivalHouse();
        }else {
            forbiddenSpells.add(forbiddenSpell);
            wizard.setKnownForbiddenSpells(forbiddenSpells);
            System.out.println("After a long and hard study, congratulations you have learned: "+ forbiddenSpell);
            System.out.println("Please be sure to use caution!");
        }
        //List<ForbiddenSpell> forbiddenSpells = wizard.getKnownForbiddenSpells();

    }

    public void buyPotion() {
        System.out.println("Welcome to the Potion House, what potion do you want to buy?");
        Potion.getPotion();
        int choose = scanner.nextInt();
        if ((choose == 1 && wizard.getGold()<20)||
                (choose == 1 && wizard.getGold()<40)||
                (choose == 1 && wizard.getGold()<60)||
                (choose == 1 && wizard.getGold()<100))
        {System.out.println("You don't have enough coins, so come back after you get enough coins.");}
        else if(choose == 1) {
            int gold =  wizard.getGold();
            gold = gold - 20;
        }else if(choose == 2) {
            int gold =  wizard.getGold();
            gold = gold - 40;
        }else if(choose == 3) {
            int gold =  wizard.getGold();
            gold = gold - 60;
        }else if(choose == 4) {
            int gold =  wizard.getGold();
            gold = gold - 100;
        }
        Potion potion = Potion.choosePotion(choose);
        System.out.println(potion);
        potions.add(potion);
        wizard.setPotions(potions);
        System.out.println("You have purchased: "+potion+" ×1");
        //List<Potion> potions = wizard.getPotions();
    }
    public static void combat(Enemy enemy){
        enemy.resetHP();
        System.out.println("Enemy "+enemy.getName()+" has appeared!");

        while (enemy.getHP()>0 && wizard.getHP()>0) {

            System.out.println("Please choose your action: \n1. use spell. \n2. use potion. \n3. use forbidden spell.\n4. Conduct defense.");
            int choose = scanner.nextInt();
            if (choose == 1){
                useSpells(enemy);
            } else if (choose == 2) {
                usePotion(enemy);
            } else if (choose == 3) {
                useForbiddenSpell(enemy);
            } else if (choose == 4) {
                defense(enemy);
            } else {
                System.out.println("Invalid option, please try again.");
            }

        }

    }
    public static void useSpells(Enemy enemy){
        System.out.println("Please select the spell you want to use:");
        List<Spell> spells = wizard.getKnownSpells();
        for (int i = 0; i < spells.size(); i++) {
            System.out.println((i + 1) + "." + spells.get(i));
        }
        int chooseSpell = scanner.nextInt();
        wizard.attack(wizard,enemy, spells.get(chooseSpell-1));
        if (enemy.getHP()<=0){
            System.out.println(enemy.getName()+" is dead, you have won!!!");
            int level = wizard.getLevel()+1;
            wizard.setLevel(level);
            int gold = wizard.getGold()+enemy.getGold();
            wizard.setGold(gold);
            System.out.println("You now have "+wizard.getGold()+" gold!");
            battleVictory();
        } else {
            enemy.attack(wizard, enemy, spells.get(0));
            System.out.println("You have "+wizard.getHP()+" HP points left.");
        }
    }
    public static void usePotion(Enemy enemy){
        if (potions.isEmpty()){
            System.out.println("You do not have potions oh, quickly use the spell to defeat the enemy.");
            waitForInput();
            combat(enemy);
        }
        int sizePotion = potions.size();
        if (sizePotion == 0){
            System.out.println("You don't have potion.");
            combat(enemy);
        }
        System.out.println("Please select the potion you want to use:");
        List<Potion> potions = wizard.getPotions();
        for (int i = 0; i < potions.size(); i++) {
            System.out.println((i + 1) + "." + potions.get(i));
        }
        int choosePotion = scanner.nextInt();
        wizard.usePotion(wizard,potions.get(choosePotion-1));
        potions.remove(choosePotion-1);
    }
    public static void useForbiddenSpell(Enemy enemy){
        if (forbiddenSpells.isEmpty()){
            System.out.println("You haven't mastered the forbidden spell yet, so use the other spells first.");
            waitForInput();
            combat(enemy);
        }
        int sizeForbiddenSpells = forbiddenSpells.size();
        if (sizeForbiddenSpells == 0){
            System.out.println("You don't have forbidden spells.");
            combat(enemy);
        }
        System.out.println("Please select the forbidden spell you want to use:");
        List<ForbiddenSpell> forbiddenSpells = wizard.getKnownForbiddenSpells();

        for (int i = 0; i < forbiddenSpells.size(); i++) {
            System.out.println((i + 1) + "." + forbiddenSpells.get(i));
        }
        int chooseSpell = scanner.nextInt();
        wizard.forbiddenAttack(wizard, enemy, forbiddenSpells.get(chooseSpell-1));
        if (enemy.getHP()<=0){
            System.out.println(enemy.getName()+" is dead, you have won!!!");
            int level = wizard.getLevel()+1;
            wizard.setLevel(level);
            int gold = wizard.getGold()+enemy.getGold();
            wizard.setGold(gold);
            System.out.println("You now have "+wizard.getGold()+" gold!");
            battleVictory();
        } else {
            enemy.attack(wizard, enemy, spells.get(0));
            System.out.println("You have "+wizard.getHP()+" HP points left.");
        }
    }

    public static void defense(Enemy enemy){
        Wizard.defend(enemy);
    }
    public static void combatBoss(Boss enemy){
        enemy.resetHP();
        System.out.println("You face "+enemy.getName()+" head on, but choose to fight it anyway.");

        while (enemy.getHP()>0) {
            System.out.println("Please choose your action: \n1. use spell. \n2. use potion. \n3. use forbidden spell.\n4. Conduct defense.");
            int choose = scanner.nextInt();
            if (choose == 1){
                useSpellsBoss(enemy);
            } else if (choose == 2) {
                usePotionBoss(enemy);
            } else if (choose == 3) {
                useForbiddenSpellBoss(enemy);
            } else if (choose == 4) {
                defense(enemy);
            } else {
                System.out.println("Invalid option, please try again.");
            }
        }

    }
    public static void useSpellsBoss(Boss enemy){
        System.out.println("Please select the spell you want to use:");
        List<Spell> spells = wizard.getKnownSpells();
        for (int i = 0; i < spells.size(); i++) {
            System.out.println((i + 1) + "." + spells.get(i));
        }
        int chooseSpell = scanner.nextInt();
        wizard.attack(wizard,enemy, spells.get(chooseSpell-1));
        if (enemy.getHP()<=0){
            System.out.println(enemy.getName()+" is dead, you have won!!!");
            int level = wizard.getLevel()+1;
            wizard.setLevel(level);
            int gold = wizard.getGold()+enemy.getGold();
            wizard.setGold(gold);
            System.out.println("You now have "+wizard.getGold()+" gold!");
            battleVictory();
        } else {
            enemy.attack(wizard, enemy, spells.get(0));
            System.out.println("You have "+wizard.getHP()+" HP points left.");
        }
    }
    public static void usePotionBoss(Boss enemy){
        if (potions.isEmpty()){
            System.out.println("You do not have potions oh, quickly use the spell to defeat the enemy.");
            waitForInput();
            combatBoss(enemy);
        }
        int sizePotion = potions.size();
        if (sizePotion == 0){
            System.out.println("You don't have potion.");
            combatBoss(enemy);
        }
        System.out.println("Please select the potion you want to use:");
        List<Potion> potions = wizard.getPotions();
        for (int i = 0; i < potions.size(); i++) {
            System.out.println((i + 1) + "." + potions.get(i));
        }
        int choosePotion = scanner.nextInt();
        wizard.usePotion(wizard,potions.get(choosePotion-1));
        potions.remove(choosePotion-1);
    }
    public static void useForbiddenSpellBoss(Boss enemy){
        if (forbiddenSpells.isEmpty()){
            System.out.println("You haven't mastered the forbidden spell yet, so use the other spells first.");
            waitForInput();
            combatBoss(enemy);
        }
        int sizeForbiddenSpells = forbiddenSpells.size();
        if (sizeForbiddenSpells == 0){
            System.out.println("You don't have forbidden spells.");
            combatBoss(enemy);
        }
        System.out.println("Please select the forbidden spell you want to use:");
        List<ForbiddenSpell> forbiddenSpells = wizard.getKnownForbiddenSpells();

        for (int i = 0; i < forbiddenSpells.size(); i++) {
            System.out.println((i + 1) + "." + forbiddenSpells.get(i));
        }
        int chooseSpell = scanner.nextInt();
        wizard.forbiddenAttack(wizard, enemy, forbiddenSpells.get(chooseSpell-1));
        if (enemy.getHP()<=0){
            System.out.println(enemy.getName()+" is dead, you have won!!!");
            int level = wizard.getLevel()+1;
            wizard.setLevel(level);
            int gold = wizard.getGold()+enemy.getGold();
            wizard.setGold(gold);
            System.out.println("You now have "+wizard.getGold()+" gold!");
            battleVictory();
        } else {
            enemy.attack(wizard, enemy, spells.get(0));
            System.out.println("You have "+wizard.getHP()+" HP points left.");
        }
    }
    public static void defense(Boss enemy){
        Wizard.defend(enemy);
    }
    public static void battleVictory(){
        waitForInput();
        System.out.println("Your level +1 ");
        wizard.setLevel(wizard.getLevel()+1);
        System.out.println("Please select the attributes to be enhanced:");
        System.out.println("1. HP +20 \n2. Pharmacy +1 \n3. Attack +1 \n4. Defense +1 \n5. Precise +1");
        int chosebonu = scanner.nextInt();
        switch (chosebonu){
            case 1:
                wizard.setHP(wizard.getHP()+20);
                break;
            case 2:
                wizard.setPharmacy(wizard.getPharmacy()+1);
                break;
            case 3:
                wizard.setAttack(wizard.getAttack()+1);
                break;
            case 4:
                wizard.setDefense(wizard.getDefense()+1);
                break;
            case 5:
                wizard.setPrecise(wizard.getPrecise()+1);
                break;
            default:break;
        }
    }
    public void trainingGround() {
        int sizeSpell = spells.size();
        if (sizeSpell == 0) {
            System.out.println("You don't know the spell yet, go to House and learn spell and then come back.");
            arrivalHouse();
        }
        System.out.println("Welcome to the training ground, please start training.");
        combat(Enemy.gargoyle);
        //combatBoss(Boss.basilic);
        System.out.println("The battle is over and you return to the House.");
    }
        public static void waitForInput() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\u25BC");
            scanner.nextLine();
        }
    }

