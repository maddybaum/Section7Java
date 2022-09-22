import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] parts = {"tires", "keys"};

        Car[] cars = new Car[]{
        new Car("Nissan", 5000, 2020, "red", new String[]{"tires", "keys"}),
        new Car("Dodge", 20000, 2021, "green", new String[]{"tires", "keys"}),
        new Car("Nissan", 5000, 2020, "yellow", new String[]{"tires", "filter"}),
        new Car("Honda", 7000, 2019, "orange", new String[]{"tires", "filter"}),
        new Car("Mercedes", 12000, 2015, "black",new String[]{"tires", "filter", "transmission"} ),
    };
       Dealership dealership = new Dealership(cars);
        Scanner scan = new Scanner(System.in);
        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.print("Welcome! Enter the type of car you're looking for: ");
//pick up make
        String carMake = scan.nextLine();
        System.out.print("Enter your budget: ");
//pick up budget
       int budget = scan.nextInt();

       int index = dealership.search(carMake, budget);

       switch (index) {
           case 404:
               System.out.println("Please browse through our collection");
               System.out.println(dealership);
               break;

           default:
               scan.nextLine();
               String decision = scan.nextLine();
                 if (decision.equalsIgnoreCase("yes")){
                   dealership.sell(index);
               }
       }
    }}
