import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;


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

    static public ArrayList<Unit> team1 = new ArrayList<>();
    static public ArrayList<Unit> team2 = new ArrayList<>();
    static public ArrayList<Unit> team3 = new ArrayList<>();

    public static void main(String[] args) {

        //ArrayList<Unit> team1 = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    team1.add(new Peasant(getName(), team1, 1, i));
                    break;
                case 1:
                    team1.add(new Spearman(getName(), team1, 1, i));
                    break;
                case 2:
                    team1.add(new Crossbowman(getName(), team1, 1, i));
                    break;
                case 3:
                    team1.add(new Wizard(getName(), team1, 1, i));
                    break;
            }
        }


        //ArrayList<Unit> team2 = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            switch (new Random().nextInt(4)) {
                case 0:
                    team2.add(new Peasant(getName(), team2, 10, i));
                    break;
                case 1:
                    team2.add(new Thief(getName(), team2, 10, i));
                    break;
                case 2:
                    team2.add(new Sniper(getName(), team2, 10, i));
                    break;
                case 3:
                    team2.add(new Monk(getName(), team2, 10, i));
                    break;
            }
        }

        //ArrayList<Unit> team3 = new ArrayList<Unit>();
        team3.addAll(team1);
        team3.addAll(team2);
        team3.sort(new Comparator<Unit>() {

            @Override
            public int compare(Unit o1, Unit o2) {
                return o2.speed - o1.speed;
            }

        });
        System.out.println(Charset.defaultCharset());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            View.view();
            scanner.nextLine();
            for (Unit unit : team3) {
                if (team1.contains(unit)) {
                    unit.step(team2);
                }else{
                    unit.step(team1);
                }
            }
        }

    }
    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }
}