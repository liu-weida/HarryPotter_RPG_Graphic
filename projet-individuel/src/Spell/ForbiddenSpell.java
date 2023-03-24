package Spell;

import Wand.Wand;

public class ForbiddenSpell extends AbstractSpell {
    public ForbiddenSpell(String name, int damage, float precise) {
        super(name, damage, precise);
    }
    private static final ForbiddenSpell avadaKedavra = new ForbiddenSpell("Avada Kedavra", 100, 0.8f);//阿瓦达啃大瓜
    private static final ForbiddenSpell imperio = new ForbiddenSpell("Imperio", 90, 0.8f);//魂魄出窍
    private static final ForbiddenSpell crucio = new ForbiddenSpell("Crucio", 80, 0.8f);//钻心剜骨

    public static void getForbiddenSpell(){
        System.out.println("1."+avadaKedavra);
        System.out.println("2."+imperio);
        System.out.println("3."+crucio);
    }
    public static ForbiddenSpell chooseForbiddenSpell(int forbiddenSpell) {
        switch (forbiddenSpell) {
            case 1:
                return avadaKedavra;
            case 2:
                return imperio;
            case 3:
                return crucio;
            default:
                return null;
        }

    }
    public int getDamage(){
        return damage;
    }

    public float getPrecise(){
        return precise;
    }

    public String toString() {
        return name;
    }
}
