package House;

import java.util.Random;
public class House { //学院

    private String name;
    private static int pharmacyBonus;  //药水
    private static int attackBonus;  //攻击
    private static int defenseBonus;  //防御
    private static int preciseBonus;  //精准

    public House(String name, int pharmacyBonus, int attackBonus, int defenseBonus, int preciseBonus) {
        this.name = name;
        this.pharmacyBonus = pharmacyBonus;
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
        this.preciseBonus = preciseBonus;
    }

    private static final House Hufflepuff = new House("Hufflepuff", 1, 0, 0, 0);
    private static final House Slytherin = new House("Slytherin", 0, 1, 0, 0);
    private static final House Gryffindor = new House("Gryffindor", 0, 0, 1, 0);
    private static final House Ravenclaw = new House("Ravenclaw", 0, 0, 0, 1);

    public String getName() {
        return name;
    }
    public int getPharmacyBonus() {
        return pharmacyBonus;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public int getDefenseBonus() {
        return defenseBonus;
    }

    public int getPreciseBonus() {
        return preciseBonus;
    }

    public static House getRandomHome() {
        Random random = new Random();
        int randomNumber = random.nextInt(4);
        switch (randomNumber) {
            case 0:
                return Hufflepuff;
            case 1:
                return Slytherin;
            case 2:
                return Gryffindor;
            case 3:
                return Ravenclaw;
            default:
                return null;
        }
    }
    public String toString(){
        return name;
    }

}
