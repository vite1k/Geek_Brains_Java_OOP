package characters;

public abstract class GameCharacter {
    protected int health, strength, intelligence, agility, armor, magicResist, attackSpeed, movementSpeed;
    protected int[] damage;
    protected String name;
    public GameCharacter(int health, int strength, int intelligence, int agility, int armor,
                         int magicResist, int attackSpeed, int movementSpeed, int[] damage, String name){
        this.health = health;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.armor = armor;
        this.magicResist = magicResist;
        this.attackSpeed = attackSpeed;
        this.movementSpeed = movementSpeed;
        this.damage = damage;
        this.name = name;
    }
    public String toString() {
        return "Имя персонажа: " + name;
    }

    public abstract void attack();
    public abstract void heal();
    public abstract void specialAbility();
}
