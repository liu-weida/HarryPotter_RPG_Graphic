package Pet;

import Wand.Wand;

public enum Pet {
    OWL(1, 0, 0, 0),
    RAT(0, 0, 0, 1),
    CAT(0, 1, 0, 6),
    TOAD(0, 0, 1, 0);

    private int pharmacyBonus;
    private int attackBonus;
    private int defenseBonus;
    private int preciseBonus;

    Pet(int pharmacyBonus, int attackBonus, int defenseBonus, int preciseBonus) {
        this.pharmacyBonus = pharmacyBonus;
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
        this.preciseBonus = preciseBonus;
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

    public static Pet choosePet(int pet) {
        switch (pet) {
            case 1:
                return OWL;
            case 2:
                return RAT;
            case 3:
                return CAT;
            case 4:
                return TOAD;
            default:
                return null;
        }
    }
}

