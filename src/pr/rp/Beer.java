package pr.rp;

public class Beer extends AlcoholDrink {

    private String type;

    public Beer(String color, String taste, String consistance, double alc, String type) {
        super(color, taste, consistance, 500.00, alc);
        this.type = type;
    }

    @Override
    public void myWeightAndType() {
        System.out.println("i'm beer and my weight is 500");

    }


}
