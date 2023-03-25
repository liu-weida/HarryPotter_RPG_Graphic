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

    public static final House Hufflepuff = new House("Hufflepuff", 20, 0, 0, 0);
    public static final House Slytherin = new House("Slytherin", 0, 10, 0, 0);
    public static final House Gryffindor = new House("Gryffindor", 0, 0, 10, 0);
    public static final House Ravenclaw = new House("Ravenclaw", 0, 0, 0, 10);

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


    public String toString(){
        return name;
    }

}
