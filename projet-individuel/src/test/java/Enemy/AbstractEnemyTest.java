package Enemy;

import Character.Character;
import Player.Wizard;
import Spell.Spell;
import Pet.Pet;
import Wand.Wand;
import House.House;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AbstractEnemyTest {

    private AbstractEnemy enemy;
    private Wizard wizard;

    @BeforeEach
    public void setup() {
        // 初始化测试数据
        List<Spell> knownSpells = new ArrayList<>();
        knownSpells.add(new Spell("Fireball", 10, 20));
        enemy = new AbstractEnemy(50, 50, "Goblin", 0, 5, 5, 80, 1, knownSpells, 10) {
            @Override
            public void attack(Wizard wizard, Character enemy, Spell spell) {
                // 在测试中不需要实现具体的攻击行为
            }
        };
        wizard = new Wizard(100, "Harry Potter", 20, 10, 10, 90, 1,Pet.CAT, Wand.chooseWand(1),
                House.Gryffindor, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), 100);

    }

    @Test
    public void testAttack() {
        // 测试攻击方法是否正确处理伤害值
        Spell spell = Spell.expulso;
        enemy.attack(wizard, enemy, spell);
        Assertions.assertEquals(wizard.getHP(), 90 - spell.getDamage());
    }

}
