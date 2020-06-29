package preTest;

import java.util.ArrayList;

public class CarAgency {

    private String agencyName; // agency name
    private ArrayList<Car> cars; // car list

    public CarAgency(String name) {
        agencyName = name;
        cars = new ArrayList<Car>();
    }

    public ArrayList<Car> between(double lowPrice, double highPrice) {
        /*
         * 1. הקמת רשימה מקושרת חדשה 2. לרוץ על הרשימה 3. לבדוק אם המחיר בטווח אם כן -
         * נוסיף 4. מחזירים רשימה של רכבים בטווח
         */
        ArrayList<Car> inRange = new ArrayList<Car>();
        for (Car c : this.cars) {
            if (c.getPrice() >= lowPrice && c.getPrice() <= highPrice)
                inRange.add(c);
        }
        return inRange;

    }

    public void addCar(Car[] carArr) {
        for (Car c : carArr) {
            this.addCar(c);
        }
    }

    public void addCar(Car car) {
        // boolean found = false;
        // for(int i=0;i<this.cars.size();i++){
        // cars.contains(car);
        for (Car c1 : cars) {
            if (c1.equals(car)) {
                // found =true;
                System.out.println("car already existed in the list");
                // break;
                return;
            }
        }
        // if(!found)
        cars.add(car);
    }

    public int countTracksWithTrailer(int year) {
        int counter = 0;

        for (int i = 0; i < this.cars.size(); i++) {
            if (this.cars.get(i) instanceof Truck && this.cars.get(i).getYear() > year
                    && ((Truck) this.cars.get(i)).getHook())
                counter++;

        }
        return counter;

    }

    @Override
    public String toString() {
        String str = "CarAgency name. " + this.agencyName + "\n";
        for (Car c1 : cars) {
            str += "\t" + c1.toString() + "\n";
        }
        return str;
    }
}