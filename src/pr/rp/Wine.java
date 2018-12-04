package pr.rp;

public class Wine extends AlcoholDrink {
    public Wine(String color, String taste, String consistance, double alc) {
        super(color, taste, consistance, 700, alc);
    }


    @Override
    public void myWeightAndType() {
        System.out.println("i'm wine and i'm 700");
    }
}
