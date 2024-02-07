//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Car myCar = new Car("Toyota", 900,2027);
        myCar.displayInfo();

    }

    // Nested class Car
    public static class Car {
        // Fields
        private String name;
        private int maxSpeed;
        private int yearOfMake;

        // Constructor
        public Car(String name, int maxSpeed, int yearOfMake) {
            this.name = name;
            this.maxSpeed = maxSpeed;
            this.yearOfMake = yearOfMake;
        }

        // Method to display car information
        public void displayInfo() {
            System.out.println("Car Name: " + name);
            System.out.println("Max Speed: " + maxSpeed + " km/h");
            System.out.println("Year of Make: " + yearOfMake);
        }

        // Method to accelerate the car
        //Optional
//        public void accelerate(int speedIncrease) {
//            maxSpeed += speedIncrease;
//            System.out.println("Car accelerated to " + maxSpeed + " km/h");
//        }
    }
}