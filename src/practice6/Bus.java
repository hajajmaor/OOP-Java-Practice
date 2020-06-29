package practice6;

import java.util.LinkedList;

public class Bus extends Vehicle {

    // נוסעים, ערך עלות נסיעה????
    // הוספת נוסע
    private LinkedList<String> passengers;
    private double cost;
    // final value will be set after the constractor;
    private final int maxPassengers;

    Bus(int engineSize, int speed, int gearTypeChoice, boolean AC, double cost, int maxPassengers) {
        // מתודה בונה אבא
        super(engineSize, speed, gearTypeChoice, AC);
        // פרמטרים של המחלקה שלנו
        this.maxPassengers = maxPassengers;
        this.setCost(cost);
        this.passengers = new LinkedList<String>();
    }

    public void setCost(double cost) {
        if (cost > 0 && cost <= 8.0)
            this.cost = cost;
        else {
            System.out.println("the price that you requested is too high");
            this.cost = 5;
        }

    }

    public double getCost() {
        return cost;

    }

    private void addPassenger(String name) {
        if (this.passengers.size() < this.maxPassengers) {
            this.passengers.add(name);
        } else {
            System.out.println("there is no place in the bus");
            // 15 points to omri
        }
    }

    // 25 points to omri
    @Override
    public String toString() {
        String str = "";
        str += "bus max passengers is = " + this.maxPassengers + ", total income for the bus is= "
                + (this.cost * this.passengers.size()) + ", passangers name: \n";
        for (int i = 0; i < this.passengers.size(); i++) {
            str += this.passengers.get(i).toString() + ",";
        }
        return super.toString() + ", " + str;
    }
}