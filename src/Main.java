import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import Units.Crossbowman;
import Units.Monk;
import Units.Names;
import Units.Peasant;
import Units.Sniper;
import Units.Spearman;
import Units.Thief;
import Units.Unit;
import Units.Wizard;

public class Main {
    public static void main(String[] args) {

        ArrayList<Unit> team1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    team1.add(new Peasant(getName(), team1));
                    break;
                case 1:
                    team1.add(new Spearman(getName(), team1));
                    break;
                case 2:
                    team1.add(new Crossbowman(getName(), team1));
                    break;
                case 3:
                    team1.add(new Wizard(getName(), team1));
                    break;
            }
        }

        ArrayList<Unit> team2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    team2.add(new Peasant(getName(), team2));
                    break;
                case 1:
                    team2.add(new Thief(getName(), team2));
                    break;
                case 2:
                    team2.add(new Sniper(getName(), team2));
                    break;
                case 3:
                    team2.add(new Monk(getName(), team2));
                    break;
            }
        }

        ArrayList<Unit> team3 = new ArrayList<Unit>();
        team3.addAll(team1);
        team3.addAll(team2);
        team3.sort(new Comparator<Unit>() {

            @Override
            public int compare(Unit o1, Unit o2) {
                return o2.speed - o1.speed;
            }

        });

        team3.forEach(n -> n.getDmage(2));

        System.out.println("[Команда 1]");
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("\n[Команда 2]");
        team2.forEach(n -> System.out.println(n.getInfo()));

        System.out.println("\n[Инициатива]");
        System.out.println(team3);

        System.out.println("-".repeat(15));
        team3.forEach(n -> n.step());
        System.out.println("\n[Команда 1]");
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("\n[Команда 2]");
        team2.forEach(n -> System.out.println(n.getInfo()));
    }
    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}