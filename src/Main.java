import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        String[] parts = {"tires", "keys"};

        Car[] cars = new Car[]{
                new Car("Nissan", 5000, 2020, "red", parts),
        new Car("Dodge", 20000, 2021, "green", parts),
        new Car("Nissan", 5000, 2020, "yellow", new String[]{"tires", "filter"}),
    };

        Dealership dealership = new Dealership();
        for (int i = 0; i < cars.length; i++) {
            dealership.setCar(cars[i], i);
        }

        Car newCar = dealership.getCar(0);
        System.out.println(newCar);
        newCar.setColor("blue");

        System.out.println(dealership.getCar(0 ));
        dealership.sell(2);
    }
}