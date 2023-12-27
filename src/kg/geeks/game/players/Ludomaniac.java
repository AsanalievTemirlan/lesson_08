package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Ludomaniac extends Hero {
    public Ludomaniac(int health, int damage, String name) {
        super(health, damage, SuperAbility.LUDOMANIA, name);
    }
    //Герой лудоман.
    // Его способность: Он бросает две игральные кости,
    // если они совпадают, то он отнимает произвидение чисел которые выпали из здоровья босса,
    // если же они не совпадают, то он отнимает сумму чисел из здоровья случайного сокомандника.
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int dice1 = RPG_Game.random.nextInt(6);
        int dice2 = RPG_Game.random.nextInt(6);
        int randomHero = RPG_Game.random.nextInt(heroes.length);
        if(dice1 == dice2){
            boss.setHealth(boss.getHealth() - (dice1 * dice2));
            System.out.println("Jackpot! The boss has lost " + (dice1 * dice2) + " health points");
        }else {
            heroes[randomHero].setHealth(heroes[randomHero].getHealth() - (dice1 + dice2));
            System.out.println(heroes[randomHero].getName() + " lost " + (dice1 + dice2) + " of his health points. No such luck((( ");
        }

    }
}
