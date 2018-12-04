package pr.rp;

public abstract class Bottle {

    private Drink drink;
    private String caption;
    private String color;
    private double weight;
    private final double VOLUME;

    public Bottle(Drink drink, String caption, String color, double weight, double VOLUME) {
        this.drink = drink;
        this.caption = caption;
        this.color = color;
        this.weight = weight;
        this.VOLUME = VOLUME;
    }

    public double getVOLUME() {
        return VOLUME;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void fill(Drink drink) {

        if (drink.getLiquidWeight() <= getVOLUME()) {
            this.drink = drink;
        } else {
            System.out.println("The waight of liquid is " + drink.getLiquidWeight() + " and volume of bottle is " + getVOLUME());
            System.out.println("Overdose!!! Liquid amount changed from " + drink.getLiquidWeight() + " to " + getVOLUME());
            drink.setLiquidWeight(getVOLUME());
            //TODO если не помещается, то изменить вливаемый дринк до объёма который могу поместить
        }
    }

    public abstract void draw();

}
