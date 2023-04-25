package Units;

import java.util.ArrayList;

public class Thief extends Unit {

    public Thief(String name, ArrayList<Unit> team) {
        super(name, 20, 0.8f, 3, 2, 10, team);
    }

    @Override
    public String toString() {
        return "Разбойник";
    }

    void dodge() {

    }

    void stealth() {

    }


    @Override
    public String getInfo() {
        return super.getInfo();
    }
}