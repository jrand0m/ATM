package pr.rp;

public class WineBottle extends Bottle {
    public WineBottle(Drink drink, String caption, String color, double weight) {
        super(drink, caption, color, weight, 700.00);
    }

    @Override
    public void draw() {
        System.out.println("     ____\n" +
                "    |    |\n" +
                "    |    |\n" +
                "    |____|\n" +
                "    |    |\n" +
                "    (    )\n" +
                "    )    (\n" +
                "  .'      `.\n" +
                " /          \\\n" +
                "|------------|\n" +
                "|            |\n" +
                "|    ----    |\n" +
                "|   (No.7)   |\n" +
                "|    ----    |\n" +
                "|            |\n" +
                "|            |\n" +
                "|    % Vol.  |\n" +
                "|------------|\n" +
                "|____________|dp\n" +
                "\n");
    }
}
