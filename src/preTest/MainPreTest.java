package preTest;

public class MainPreTest {

    public static void main(String[] args) {
        CarAgency ca = new CarAgency("Omri");

        Car c1 = new Car(1234, "Mazda", 2001, 5000);
        Car c2 = new Car(12455, "Fiat", 1999, 2500);
        Truck t1 = new Truck(15478, "Avis", 2020, 17000, 30000, true);
        Truck t2 = new Truck(9878, "Eldan", 2019, 20000, 50020, false);
        ca.addCar(new Car[] { c1, c2, t1, t2 });
        ca.addCar(c1);
        ca.addCar(c2);
        ca.addCar(t1);
        ca.addCar(t2);
        // System.out.println(ca.countTracksWithTrailer(2005));
        System.out.println(ca);
    }

}