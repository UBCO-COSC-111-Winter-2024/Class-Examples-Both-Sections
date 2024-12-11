public class Car {
    private String make;
    private String model;
    private int year;
    private int numDoors;

    public Car(String make, String model, int year) {
        System.out.print(" Creating a car which is .. ");
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public static int getNumWheels(){
        return 4;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int n) {
        if ( n > 0)
            numDoors = n;
        else
            System.out.println("num doors must be a positive int");
    }

    public String toString() {
        return make + " " + model + " " + year;
    }
}
