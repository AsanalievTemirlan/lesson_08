package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Kamikaze extends Hero {
    //Герой Kamikadze  без урона но хорошое здоровье, его способность  жертвовать собой.
    // Но он должен попасть точно в цель, иначе нанесет урон только на 50% из своего остатка жизни.
    public Kamikaze(int health, int damage, String name) {
        super(health, damage, SuperAbility.SUICIDAL, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean luck = RPG_Game.random.nextBoolean();
        if(heroes[9].getHealth() > 0) {
            if (luck) {
                boss.setHealth(boss.getHealth() - heroes[9].getHealth());
                heroes[9].setHealth(0);
                System.out.println("Kamikaze has done his duty!");
            } else {
                boss.setHealth(boss.getHealth() - heroes[9].getHealth() / 2);
                heroes[9].setHealth(0);
                System.out.println("The boss dodged and only took 50% damage");
            }
        }
    }
}
