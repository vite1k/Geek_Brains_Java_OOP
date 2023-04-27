package Units;

import java.util.ArrayList;

import Game.Coordinate;


public abstract class Unit implements GameInterface{
    protected String name;
    protected float maxHp, currentHp, luck, armor;
    protected int attack;
    public int speed;
    protected ArrayList<Unit> team, enemy;
    protected Coordinate coordinate;




    Unit(String name, float maxHp, float luck, int speed, int attack, float armor, ArrayList<Unit> team, int x, int y){
        this.name = name;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.luck = luck;
        this.speed =speed;
        this.attack = attack;
        this.armor = armor;
        this.team = team;
        this.coordinate = new Coordinate(x, y);
    }

    void attack(Unit target){
        target.getDmage(attack);
        System.out.println(this.introduce() + " атакует " + target.introduce());
    }
    void await(){

    }
    void defend(){

    }

    boolean die(){
        if (currentHp <= 0) {
            return true;
        }else{
            return false;
        }
    }

    public void getDmage(float damage){
        this.currentHp -= damage;
        if (this.currentHp > this.maxHp) {
            this.currentHp = this.maxHp;
        }
        if (this.currentHp < 0) {
            this.currentHp = 0;
        }
    }

    @Override
    public String getInfo() {
        return "[" + name + " " + toString() + "] hp:" +
                currentHp + "/" + maxHp + " luck:" + luck
                + " speed:" + speed + " attack:" + attack
                + " armor:" + armor;
    }

    @Override
    public void step(ArrayList<Unit> enemy) {
        System.out.println(getClass().getName());
    }

    public Unit findNearUnit(ArrayList<Unit> team){
        Unit nearUnit = null;
        float minDist = Float.MAX_VALUE;
        for (Unit unit : team) {
            float dist = unit.coordinate.distance(this.coordinate);
            if (minDist > dist) {
                nearUnit = unit;
                minDist = dist;
            }
        }
        return nearUnit;
    }

    @Override
    public String introduce() {
        return this + " " + this.name;
    }



}