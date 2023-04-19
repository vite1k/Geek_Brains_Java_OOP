package characters;

public class Bandit extends GameCharacter {
    public Bandit() {
        super(250, 15, 15, 25, 30, 30,
                15, 15, new int[]{15, 25}, "Максим");
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