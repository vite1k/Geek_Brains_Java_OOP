package Units;

import java.util.ArrayList;

public abstract class Shooter extends Unit {
    protected int distance, maxCountBullet, currentCountBullet;
    protected float accuracy;

    Shooter(String name, float maxHp, float luck, int speed, int attack,
            int distance, int maxCountBullet, float accuracy, float armor, ArrayList<Unit> team) {
        super(name, maxHp, luck, speed, attack, armor, team);
        this.distance = distance;
        this.maxCountBullet = maxCountBullet;
        this.currentCountBullet = maxCountBullet;
        this.accuracy = accuracy;
    }

    void shoot() {

    }
    @Override
    public String getInfo() {
        return super.getInfo() + " distance:" + distance +
                " bullets:" + currentCountBullet + "/" + maxCountBullet +
                " accuracy:" + accuracy;
    }
}