package pr.rp;

public class BeerBottle extends Bottle {
    public BeerBottle(Drink drink, String caption, String color, double weight) {
        super(drink, caption, color, weight, 500.00);
    }

    @Override
    public void draw() {
        System.out.println("    _.._..,_,_                      \n" +
                "   (          )                     \n" +
                "    ]~,\"--~~[                      \n" +
                "  .=])' (;  ([                      \n" +
                "  | ]:: '    [                      \n" +
                "  '=]): .)  ([                      \n" +
                "    |:: '    |                      \n" +
                "PMH  ~~----~~ ");
    }
}
