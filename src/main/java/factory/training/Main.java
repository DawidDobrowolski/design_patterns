package factory.training;

import factory.training.factory.*;

public class Main {

    public static void main(String[] args) {
        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car bmw = commonwealthFactory.buildBMW(BMWModel.E62);
        System.out.println(bmw.getSteeringWheelPosition());

        Car ford = continentalFactory.buildFord(FordModel.Mondeo);
        System.out.println(ford.getSteeringWheelPosition());
    }



}
