package pr.rp;

public abstract class Drink {
    private String color;
    private String taste;
    private String consistance;
    private double liquidWeight;

    public Drink(String color, String taste, String consistance, double liquidWeight) {
        this.color = color;
        this.taste = taste;
        this.consistance = consistance;
        this.liquidWeight = liquidWeight;
    }

    public double getLiquidWeight() {
        return liquidWeight;


    }

    public void setLiquidWeight(double liquidWeight) {
        this.liquidWeight = liquidWeight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getConsistance() {
        return consistance;
    }

    public void setConsistance(String consistance) {
        this.consistance = consistance;
    }

    public abstract void myWeightAndType();
}
