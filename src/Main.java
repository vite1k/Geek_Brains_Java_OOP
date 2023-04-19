import characters.*;

public class Main {
    public static void main(String[] args) {
        Peasant peasant = new Peasant();
        Bandit bandit = new Bandit();
        Sniper sniper = new Sniper();
        Wizard wizard = new Wizard();
        Spearman spearman = new Spearman();
        Crossbowman crossbowman = new Crossbowman();
        Monk monk = new Monk();

        System.out.println(peasant);
        System.out.println(bandit);
        System.out.println(sniper);
        System.out.println(wizard);
        System.out.println(spearman);
        System.out.println(crossbowman);
        System.out.println(monk);
    }
}
