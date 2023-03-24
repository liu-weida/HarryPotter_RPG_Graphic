package Spell;

import Wand.Wand;

public class Spell extends AbstractSpell {
    public Spell(String name, int damage, float precise) {
        super(name, damage, precise);
    }

    public static final Spell reducto = new Spell("Reducto", 40, 0.6f);//粉身碎骨
    private static final Spell confringo = new Spell("Confringo", 50, 0.6f);//霹雳爆炸
    private static final Spell locomotorMortis = new Spell("Locomotor mortis", 10, 0.4f);//腿立僵
    private static final Spell diffindo = new Spell("Diffindo", 50, 0.5f);//四分五裂
    private static final Spell incendio = new Spell("Incendio", 50, 0.5f);//火焰熊熊
    private static final Spell deprimo = new Spell("Deprimo", 50, 0.5f);//房塌地陷
    private static final Spell expulso = new Spell("Expulso", 60, 0.5f);//房塌地陷
    public static void getSpell(){
        System.out.println("1."+reducto);
        System.out.println("2."+confringo);
        System.out.println("3."+locomotorMortis);
        System.out.println("4."+diffindo);
        System.out.println("5."+incendio);
        System.out.println("6."+deprimo);
        System.out.println("7."+expulso);
    }
    public static Spell chooseSpell(int spell) {
        switch (spell) {
            case 1:
                return reducto;
            case 2:
                return confringo;
            case 3:
                return locomotorMortis;
            case 4:
                return diffindo;
            case 5:
                return incendio;
            case 6:
                return deprimo;
            case 7:
                return expulso;
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
