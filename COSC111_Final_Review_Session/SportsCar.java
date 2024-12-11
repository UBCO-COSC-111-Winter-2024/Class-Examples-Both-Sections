public class SportsCar extends Car {
    public SportsCar (String make, String model, int year) {
        super(make, model, year);
        System.out.println("a sports car");
        setNumDoors(2);
    }

    public String toString() {
        return getNumDoors() + " doors: " + super.toString();
    }
}


class Sedan extends Car {

    public Sedan (String make, String model, int year) {
            super(make, model, year);
            setNumDoors(4);
    }

}

class SUV extends Car {

    public SUV (String make, String model, int year) {
            super(make, model, year);
            setNumDoors(4);
    }

    public String toString() {
        return "SUV with " + getNumDoors() + " doors: " + super.toString(); 
    }
}