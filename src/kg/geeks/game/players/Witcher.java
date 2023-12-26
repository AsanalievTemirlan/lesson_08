package kg.geeks.game.players;

public class Witcher extends Hero {


    public Witcher(int health, int damage, String name) {
        super(health, damage, SuperAbility.RESURRECTION, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if(getHealth() > 0){
            for (Hero hero : heroes) {
                if (hero.getName() != getName() && hero.getHealth() == 0) {
                    hero.setHealth(hero.getHealth() + getHealth());
                    setHealth(0);
                }
            }
        }
    }
}
