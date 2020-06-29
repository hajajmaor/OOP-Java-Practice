package preTest;

public class Truck extends Car {
    private int weight;// set condition >0, KG
    private boolean hook;

    public Truck(int number, String model, int year, int price, int weight, boolean hook) {
        super(number, model, year, price);

        this.hook = hook;
        this.setWeight(weight);
    }

    public boolean equals(Truck other) {
        return super.equals(other);
    }

    public int compareTo(Truck other) {
        int result = super.compareTo(other);
        if (result == 0) {
            if (this.weight == other.weight)
                return 0;
            else if (this.weight > other.weight)
                return 1;
            return -1;
        } else {
            return result;
        }

        /*
         * משתמשים במתודה השוואה של האבא אם זה 0 השוואה לפי משקלים אם לא 0 מחזיר תוצאה
         * של הסופר.
         * 
         */
    }

    public void setWeight(int weight) {
        if (weight > 0)
            this.weight = weight;
        else
            this.weight = 1500;
    }

    public boolean getHook() {
        return this.hook;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "Truck:\n" + super.toString() + ", weight=" + this.weight + ", Hook=" + this.hook; // omriTheKing - 15
                                                                                                  // points
    }

}