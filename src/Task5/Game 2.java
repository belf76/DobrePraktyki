package Task5;

public class Game {
    private static final int MAXIMUM_UNITS = 50;
    private static final int MAXIMUM_ARMOUR = 100;
    static void initializeGame() {
        System.out.println("Game initialization");
    }
    static void showMaxUnitInfo() {
        System.out.println("Maximum unit in game is" + MAXIMUM_UNITS);
    }
    static void showMaxArmourInfo() {
        System.out.println(MAXIMUM_ARMOUR + " is the maximum armour");
        System.out.printf("Remember that you have only %s maximum armour", MAXIMUM_ARMOUR);
    }

    static void game() {
        initializeGame();
        showMaxUnitInfo();
        showMaxArmourInfo();
    }

    public static void main(String[] args) {
        game();
    }
}