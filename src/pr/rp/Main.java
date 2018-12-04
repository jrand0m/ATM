package pr.rp;

public class Main {
    public static void main(String[] args) {

        Drink beer = new Beer("yellow", "tasty", "maggie", 8.5, "beer");
        Bottle lvivske = new BeerBottle(beer, "lvivske", "Green", 200.00);
        lvivske.setDrink(beer);
        validateVolume(lvivske, beer);
        lvivske.fill(beer);
        System.out.println("-------------------------------------------------------------");

        Drink wine = new Wine("red", "dry", "xxx", 700.00);//TODO разбить дринк -> alc -> wine,beer
        Bottle portvejn = new WineBottle(wine, "Portvejn", "red", 180.00);//TODO *Определить и показать свойства
        portvejn.fill(wine);
        validateVolume(portvejn, wine);
        System.out.println("----------------------------------------------------------------");

        Drink tequillaSunrise = new AlcoholDrink("sunrize", "sweet", "good", 700, 30);
        Bottle bottle = new BeerBottle(tequillaSunrise, "Tequilla", "brown", 100);
        bottle.fill(tequillaSunrise);
        beer.myWeightAndType();
    }

    public static void validateVolume(Bottle bottle, Drink drink) {
        if (drink.getLiquidWeight() == 500.00) {//вместо веса жижи, можно утановить переменную тип к каждому новому алкоголю и сетить по типу.
            drink.setLiquidWeight(drink.getLiquidWeight() + 50.00);
            System.out.println("Beer with foam is " + drink.getLiquidWeight());
        } else if (bottle.getDrink().getLiquidWeight() == bottle.getVOLUME()) {
            System.out.println("Everything is good");
        } else {
            System.out.println("try more");
        }
    }
}
