package characters;

public class Peasant extends GameCharacter {
    public Peasant() {
        super(300, 20, 10, 15, 50, 30,
                10, 10, new int[]{10, 25}, "Иван");
    }

    @Override
    public void attack() {
    }
    @Override
    public void heal() {
    }
    @Override
    public void specialAbility() {
    }
}