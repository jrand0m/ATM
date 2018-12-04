package com.company;

public class Main {
    public static void main(String[] args) {


        Sedan lada = new Sedan(12354,220,80,7.5,"red",4);
        F1 ferrari = new F1(35135,320,"Ferrari",3,"Viktor");




        System.out.println("Driver name is "+ferrari.getDriverName());


        lada.setFuelConsumption(5.5);
        System.out.println("Gas consumption is " + lada.getFuelConsumptionCount(125));

    }
}
