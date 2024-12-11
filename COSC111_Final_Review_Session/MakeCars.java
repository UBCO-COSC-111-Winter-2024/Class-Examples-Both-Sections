public class MakeCars {
    public static void main(String... arrrrr) {
        Car c1 = new Car("VW", "Golf", 2018);
        // System.out.println(c1.getNumWheels()); // static
        // System.out.println(Math.sqrt(6));
        
        Car scottsCar = new Car("VW", "Golf", 2001);
        Sedan s1 = new Sedan("Toyota", "Camry", 2005);
        SportsCar s2 = new SportsCar("Corvette", "z8", 2020);
        SUV suv = new SUV("LandRover", "RangeRover", 2021);
        System.out.println(c1);
        System.out.println(scottsCar);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(suv);

        // example of an array of Car objects
        Car[] allCars = {c1, s1, s2, suv, scottsCar, new SUV("Lada", "Nina", 1975)};
        for (Car c : allCars) {
            System.out.println(c);
        }

    }

}
