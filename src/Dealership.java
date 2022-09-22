import java.util.Arrays;

public class Dealership{
    private Car[] cars;

    public Dealership(Car[] cars){
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
        }
    public void setCar(Car car, int index){
        this.cars[index] = new Car(car);
    }
    public Car getCar(int index){
        return new Car(this.cars[index]);
    }
    public void sell(int index){
        this.cars[index].drive();
        this.cars[index] = null;
    }
    public int search(String carMake, int budget){
        for(int i = 0; i < this.cars.length; i++) {
            if (this.cars[i] == null) {
                continue;
            } else if (this.cars[i].getMake().equalsIgnoreCase(carMake) && this.cars[i].getPrice() <= budget) {
                System.out.println("We found a car in spot " + i + "\n\n" + cars[i].toString());
                System.out.println("If interested, type yes ");
                return i;
            }
        }
        System.out.println("We couldn't find any cars");
        return 404;

        }
        public String toString(){
        String temp = " ";
        for (int i = 0; i <this.cars.length; i++){
            temp += "\n Parking Spot: " + i + "\n";
            if(this.cars[i] == null){
                temp += "Empty for that spot";
            } else {
            temp += this.cars[i].toString()+"\n";
        }}
        return temp;

        }
}