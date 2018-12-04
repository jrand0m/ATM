package pr.rp;

public class AlcoholDrink extends Drink {
    private double alc;

    public AlcoholDrink(String color, String taste, String consistance, double liquidWeight, double alc) {
        super(color, taste, consistance, liquidWeight);
        this.alc = alc;
    }

    public double getAlc() {
        return alc;
    }

    public void setAlc(double alc) {
        this.alc = alc;
    }

    @Override
    public void myWeightAndType() {

    }
}
