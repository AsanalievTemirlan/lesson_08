package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

import static kg.geeks.game.general.RPG_Game.*;

public class King extends Hero {// Герой King, не наносить урон,
    // только получает, с 10% шансом он может призвать героя Saitama который убьет босса с 1 удара
    public King(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAITAMA, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int luck = random.nextInt(10);
        if(luck == 10){
            boss.setHealth(0);
            System.out.println("Saitama came in and defeated the boss with one punch!");
        }
    }
}
