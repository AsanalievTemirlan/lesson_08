package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int boost = RPG_Game.random.nextInt(10);
        for (Hero hero : heroes) {
            if (hero.getName() != "Geralt" && hero.getName() != "King" && hero.getName() != "Ace") {
                hero.setDamage(hero.getDamage() + boost);
                System.out.println("Magic " + this.getName() + " boosted the team " + boost);
            }
        }
    }
}
