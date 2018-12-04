package RegPC;

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine(13475482, 24, 5000, 800, true);
        System.out.println(washingMachine);
        washingMachine.start();
        washingMachine.methodProcess();
        washingMachine.stop();


        Notebook notebook = new Notebook(151436, 36, 3200, 15, "IBM", "2MHz", "DDR1024");
        notebook.start();
        notebook.methodProcess();
        notebook.stop();

    }
}
