package Game;

import Player.Wizard;
import House.House;
import Potion.Potion;
import Wand.Wand;
import Pet.Pet;
import Spell.Spell;
import Spell.ForbiddenSpell;
import Spell.ApplySpell;
import Enemy.Enemy;
import Enemy.Boss;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Game {
    private int[] property;
    private Wizard wizard;
    private Spell knowSpells;
    List<Spell> spells = new ArrayList<>();
    List<ForbiddenSpell> forbiddenSpells = new ArrayList<>();
    List<ApplySpell> applySpells = new ArrayList<>();
    List<Potion> potions = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
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

        this.property = initializationProperty();
        System.out.println("Your current attributes are:");
        System.out.println("level: " + property[0] + "\nHP: " + property[1] + "\npharmacy: " + property[2] +
                "\nattack: " + property[3] + "\ndefense: " + property[4] + "\nprecise: " + property[5]);
        wizard = new Wizard(property[1], name, property[2], property[3], property[4], property[5], property[0], null, null, null, null, null, null, null, property[6]);

    }

    public void assignHouse() {
        System.out.println("Next, SortingHat will assign you to a house.");

        House house = House.getRandomHome();
        System.out.println("Your house is: " + house + "\nNext, choose your wand.");
        Wand.getWand();
        int intWand = scanner.nextInt();
        Wand wand = Wand.chooseWand(intWand);
        System.out.println("Your wand is: " + wand + "\nNext, choose your pet.");
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
    }

    public void currentProperties() {
        for (int i = 2; i < 6; i++) {
            property[i] = property[i] + Wand.getPharmacyBonus() + House.getRandomHome().getPharmacyBonus() + Pet.CAT.getPharmacyBonus();
        }
        System.out.println("Your current attributes are:");
        System.out.println("level: " + property[0] + "\nHP: " + property[1] + "\npharmacy: " + property[2] +
                "\nattack: " + property[3] + "\ndefense: " + property[4] + "\nprecise: " + property[5] + "\ngold: " + property[6]);
//        wizard.setPharmacy(property[2]);
//        wizard.setAttack(property[3]);
//        wizard.setDefense(property[4]);
//        wizard.setPrecise(property[5]);
    }

    public int[] initializationProperty() {
        int[] property = new int[7];
        Random random = new Random();
        int level = 100;
        int HP = 100;
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
        System.out.println("1. Learn new spell.\n"+ "2. Learn new forbidden spell.\n" + "3. Buy potions.\n"+"4. Access to Boot Camp.\n"+"5. Start the adventure.");
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
            default:break;
        }
    }
    public void adventure1st(){
        System.out.println("Dumbledore: Student, this adventure is very dangerous, please be very careful. I divined for you yesterday, the stars show that you need Wingardium leviosa to help you complete this adventure, I'm here to teach you Wingardium leviosa.");
        ApplySpell applySpell = ApplySpell.chooseApplySpell(1);
        applySpells.add(applySpell);
        System.out.println("Congratulations on learning Wingardium leviosa. start your adventure.");
        System.out.println("The first level:  The Philosopher’s Stone.");
        System.out.println("In order to explore the secrets of the Sage's Stone, you came alone to the dungeon.");
        System.out.println("There are a few Juvenile Trolls in front of you, so tackle them.");
        combat(Enemy.juvenileTrolls);
        System.out.println("After some exploration you came to the door of the dungeon toilet, which seems to have a dangerous atmosphere, whether to enter?");
        System.out.println("1. Enter\n" + "2. Don't enter");
        int chooseEnter = scanner.nextInt();
        if (chooseEnter == 1){
            System.out.println("After thinking about it, you decide to enter the dungeon toilet full of danger.");
            boss1st();
        } else if (chooseEnter == 2) {
            System.out.println("After thinking about it, you decide not to enter the dungeon toilet.");
            System.out.println("After just a few steps, you encounter the enemy again.");
            combat(Enemy.juvenileTrolls);
            System.out.println("You find yourself surrounded by enemies, and you fight and retreat, and finally retreat to the door of the dungeon toilet. You find that the enemy seems to be afraid of the dungeon toilet, so you enter the dungeon toilet anyway.");
            boss1st();
        }
    }
    public void boss1st(){
        System.out.println("You sneak into the dungeon toilet and you find an oversized troll.");
        System.out.println("It looks like you can't beat it.");
        System.out.println("After observing the environment, you found a nearby boulder, and then think of the spell Dumbledore taught you before the trip, you suddenly have a way.");
        System.out.println("You use Wingardium leviosa to lift a nearby boulder and smash it against the troll.");
        System.out.println("With a wail from the troll, the troll is smashed by the boulder and is a bloody mess, but it also finds you.");
        combatBoss(Boss.troll);
        System.out.println("Congratulations you have successfully defeated the troll and you are in level 2!");
        System.out.println("After returning to school, you received a compliment from Dean Dumbledore.");
    }

    public void adventure2nd(){
        Enemy.snake.setHP(200);
        System.out.println(Enemy.snake.getHP());
        System.out.println("Dumbledore: Go and defeat the Basilic in the chamber, then destroy Tom Riddle's diary with its fangs.");
        System.out.println("After a period of rest, you come to the next level.");
        System.out.println("The second level: The Chamber of Secrets");
        if(Objects.equals(wizard.getHouse().getName(), "Gryffindor")){
            System.out.println("Minerva McGonagall: Don't forget that you are a part of Gryffindor and you can summon the legendary sword of Godric Gryffindor through courage and loyalty in times of need.");
        }
        System.out.println("After some exploration, you found the hidden room, but in front of the room, there is a large poisonous snake guarding, quickly defeat it.");
        combat(Enemy.snake);
        System.out.println("After eliminating the snake, you enter the hidden room.");
        boss2nd();
    }

    public void boss2nd(){
        System.out.println("In the room, you find Basilic, whose large size makes you wince.");
        if (Objects.equals(wizard.getHouse().getName(), "Gryffindor")){
            System.out.println("You think of Minerva McGonagall's command and decide to overcome your fears and summon the legendary sword of Godric Gryffindor with courage and loyalty to defeat your enemies.");
            System.out.println("With your call, the legendary sword of Godric Gryffindor appears and it turns into a light and rushes towards Basilic.");
            System.out.println("Basilic is wiped out!");
        }else {
            System.out.println("You still mustered up the courage and decided to fight Basilic!");
            combatBoss(Boss.basilic);
            System.out.println("After a hard-fought battle, you defeated Basilic!");
        }
        System.out.println("You then pulled Basilic's fangs and used them to destroy Tom Riddle's diary.");
        System.out.println("Upon your return to the college, you once again received a warm welcome from all your fellow students and professors.");
        }

    public void adventure3nd(){
        System.out.println("Level 3: The Prisonner of Azkaban");
        System.out.println("In recent times, many Dementors have inexplicably appeared near Hogwarts, roaming the streets and wandering the countryside ...... wilfully harming others. One of your classmates was hurt by a Dementor, so you decided to learn the legendary Patronus spell to expel these Dementors.");
        System.out.println("For this reason, you find Remus Lupin and ask him to teach you this defense spell.");
        System.out.println("Remus Lupin happily agreed, but he said it was a difficult spell and you would need several attempts to learn it.");
        System.out.println("You started studying.");
        System.out.println("The first time, you failed because the moment you had in mind was not good enough, and fortunately Remus Lupin saved you.");
        System.out.println("You didn't give up, and this time, you managed to cast Expectro Patronum using your fond memories of spending time with your parents.");
        ApplySpell applySpell = ApplySpell.chooseApplySpell(2);
        applySpells.add(applySpell);
        System.out.println("You bid farewell to Remus Lupin and decide to set out on the road to expel the Dementors.");
        boss3rd();
    }
    public void boss3rd(){
        System.out.println("In the wilderness, you find a group of dementors. They found you, too.");
        System.out.println("When they come at you, you use Expectro Patronum again, and all of a sudden, a white light rises to the sky, and the image of a Patronus gradually becomes solid in the white light, fending off the Dementors' attacks.");
        System.out.println("A Dementor's wail rang out, the majority of Dementors flew backwards, only one Dementor seemed to be frozen in place like a fool.");
        System.out.println("You rush up and decide to educate the dementor with an attack spell of your own.");
        combatBoss(Boss.dementor);
        System.out.println("With the Dementors dissipating in place, you know these Dementors will never dare to infest Hogwarts again, and you've successfully banished them!");
        System.out.println("Back at House, you became a real star and everyone thanked you.");
    }

    public void adventure4th(){
        System.out.println("Level 4: The Goblet of Fire.");
        System.out.println("After winning the Triwizard Tournament, you reaped a rare period of peace and quiet in which you desperately tried to learn various spells.");
        System.out.println("Among other things, you learn Accio, a magical spell that can manipulate items to fly into your hands.");
        ApplySpell applySpell = ApplySpell.chooseApplySpell(3);
        applySpells.add(applySpell);
        System.out.println("You also learn about various magic items and how to use them in the museum class.");
        System.out.println("Suddenly one day, you received a distress message about a friend, and without the slightest doubt, you followed the instructions in the message to the cemetery.");
        System.out.println("But there is no friend of yours here, you were deceived by Voldemort.");
        System.out.println("You had to find a way to get around Voldemort and Peter Pettigrew while you were at it.");
        System.out.println("Suddenly, you see the Portkey around Peter Pettigrew's waist, and through the knowledge you learned in your museum class, you know that you can teleport anywhere through it, which is the only possibility for you to be saved.");
        System.out.println("But Peter Pettigrew doesn't want to give you what you want. He assumes a fighting stance and prepares to start using the spell.");
        boss4th();
    }
    public void boss4th(){
        System.out.println("There is no way, you had to beat him first, fortunately Voldemort just stood aside, and did not intervene.");
        combatBoss(Boss.peterPettigrew);
        System.out.println("Finally, you send him flying with a spell. In this instant, you use your newly learned spell Accio and use it to draw the Portkey around Peter Pettigrew's waist.");
        System.out.println("A burst of light rose, you disappeared in place, before disappearing you took one last look at Voldemort, he looked at you with a smirk, but did not stop.");
        System.out.println("After returning to the House, you first found Dean Dumbledore and reported the incident to him. But he could not guess Voldemort's intentions, so he had to remind the students and professors to strengthen the defense of the College.");
    }

    public void adventure5th(){
        System.out.println("Level 5: The Order of the Phenix.");
        System.out.println("After your last escape from death, you discovered the importance of learning magic, and during this time, you worked your ass off to learn all kinds of magic.");
        System.out.println("Soon, exam of Universal Certificate of Elementary Witchcraft came.");
        System.out.println("You and your buddies did well in the exam.");
        System.out.println("To celebrate, you have decided to throw a big party.");
        System.out.println("How can a grand party be without fireworks?");
        System.out.println("But all of Hogwarts' fireworks are kept in storage.");
        System.out.println("The Hogwarts warehouse is guarded by Dolores Ombrage.");
        System.out.println("You and your partners decide that you will attract Dolores Ombrage's attention while the others sneak into the warehouse and take the fireworks.");
        boss5th();
    }
    public void boss5th(){
        System.out.println("You approach the warehouse and say hello to Dolores Ombrage.");
        System.out.println("What are you doing here? Dolores Ombrage asked you sternly.");
        System.out.println("Without speaking, you strike out with a spell.");
        combatBoss(Boss.doloresOmbrage);
        System.out.println("You have received a message from your partners.");
        System.out.println("You run away in a hurry.");
        System.out.println("After meeting up with friends, the party officially started.");
        System.out.println("You partied all night long and celebrated together.");
    }

    public void adventure6th(){
        System.out.println("Level 6: The Half-Blood Prince.");
        System.out.println("After the party, you have a smooth time again.");
        System.out.println("One day, you are learning a new mantra.");
        System.out.println("Suddenly, the alarm went off and it was the Death Eaters attacking Hogwarts.");
        System.out.println("You pick up your staff and rush in the direction of the Death Eaters' attack.");
        combat(Enemy.deathEaters);
        System.out.println("You release a spell that knocks a Death Eater away, followed by a group of Death Eaters surrounding it.");
        combat(Enemy.deathEaters);
        System.out.println("Just as you are surrounded, a light suddenly strikes, sending all the Death Eaters around you flying. It was Dean Dumbledore's help.");
        System.out.println("\"Capture the thief, go and defeat the leader of this group of Death Eaters, and they will naturally retreat.\" Dumbledore said.");
        System.out.println("Hearing the instructions of Dean Dumbledore, you resolutely rushed to the most dense area of the Death Eaters, where the leader of this group of Death Eaters is located.");
        boss6th();
    }

    public void boss6th(){
        System.out.println("To protect the chief, the Death Eaters rush towards you.");
        combat(Enemy.deathEaters);
        System.out.println("You use the spell to hit the Death Eaters while moving quickly to prevent being surrounded by them.");
        System.out.println("Finally, after some hard fighting, you finally came to the leader of this group of Death Eaters, fortunately, not Voldemort.");
        combatBoss(Boss.doloresOmbrageLeader);
        System.out.println("With the defeat of the leader of the Death Eaters, the siege of Hogwarts Death Eaters also gradually dispersed.");
        System.out.println("You got the win.");
        System.out.println("But you also know that this is not the first time, and will not be the last, it is time to make a break with Voldemort.");
    }

    public void adventure7th(){
        System.out.println("Level 7: The Deathly Hallows.");
        System.out.println("For some time after repelling the Death Eaters, you were desperately trying to learn various spells.");
        System.out.println("You vow to end it all by taking care of Voldemort as soon as possible.");
        System.out.println("You wanted to seek revenge on Voldemort yourself, but you didn't expect him to take the initiative to come to you.");
        System.out.println("Not only did he come, but he brought a large number of Death Eaters and Bellatrix Lestrange.");
        System.out.println("They rushed to Hogwarts, and instantly, everyone at the college went into battle.");
        System.out.println("A guardian stone statue fell, a magical light rose to the sky, and everyone did their best to resist Voldemort and the Death Eaters.");
        System.out.println("You also joined your classmates and professors, rebelling against Voldemort with a spell.");
        combat(Enemy.deathEaters);
        System.out.println("Just when you're in the middle of a good fight, you see Bellatrix Lestrange flying towards you with her staff raised.");
        boss7th();
    }
    public void boss7th(){
        System.out.println("You strike first with an attack spell.");
        combatBoss(Boss.bellatrixLestrange);
        System.out.println("You've just defeated Bellatrix Lestrange and watched Voldemort fly towards you.");
        System.out.println("In the blink of an eye, an eerie black light struck, and it was Avada Kedavra.");
        System.out.println("You can't avoid it, this is your best friend Jim rushed to your front and blocked the blow for you.");
        System.out.println("\"Jim!!!\" You wail, while using a spell to hit Voldemort.");
        System.out.println("In that moment, you decided that even if you put everything you had into it, you would take revenge on Voldemort and bring it all to an end.");
        combatBoss(Boss.voldemort);
        System.out.println("Finally, Voldemort falls under your attack and it's all over.");
        System.out.println("You feel as if all this is a dream that is not real, but the wreckage and bodies everywhere tell you that it is all real.");
        System.out.println("You hugged Jim's body and cried out, as if you were mourning Jim, and as if you were glad it was over.");
    }
        public void adventure(){//用来控制进入的关卡

        switch (adventurelevel){
            case 1:
                adventure1st();
                break;
            case 2:
                adventure2nd();
                break;
            case 3:
                adventure3nd();
                break;
            case 4:
                adventure4th();
                break;
            case 5:
                adventure5th();
                break;
            case 6:
                adventure6th();
                break;
            case 7:
                adventure7th();
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
    public void combat(Enemy enemy){
        System.out.println("Enemy "+enemy.getName()+" has appeared!");

        while (enemy.getHP()>0 && wizard.getHP()>0) {

            System.out.println("Please choose your action: \n1. use spell. \n2. use potion. \n3. use forbidden spell.");
            int choose = scanner.nextInt();
            if (choose == 1){
                useSpells(enemy);
            } else if (choose == 2) {
                usePotion(enemy);
            } else if (choose == 3) {
                useForbiddenSpell(enemy);
            } else {
                System.out.println("Invalid option, please try again.");
            }

            if (wizard.getHP() <= 0) {
                System.out.println("You have been defeated!");
                // 在这里执行其他操作
                break;}
        }

    }
    public void useSpells(Enemy enemy){
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
    public void usePotion(Enemy enemy){
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
    public void useForbiddenSpell(Enemy enemy){
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
    public void combatBoss(Boss enemy){
        System.out.println("You face "+enemy.getName()+" head on, but choose to fight it anyway.");

        while (enemy.getHP()>0) {
            System.out.println("Please choose your action: \n1. use spell. \n2. use potion. \n3. use forbidden spell.");
            int choose = scanner.nextInt();
            if (choose == 1){
                useSpellsBoss(enemy);
            } else if (choose == 2) {
                usePotionBoss(enemy);
            } else if (choose == 3) {
                useForbiddenSpellBoss(enemy);
            } else {
                System.out.println("Invalid option, please try again.");
            }
        }
    }
    public void useSpellsBoss(Boss enemy){
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
    public void usePotionBoss(Boss enemy){
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
    public void useForbiddenSpellBoss(Boss enemy){
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
    public void battleVictory(){
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
    public void delay(int delay){
       try {
            TimeUnit.SECONDS.sleep(delay);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
