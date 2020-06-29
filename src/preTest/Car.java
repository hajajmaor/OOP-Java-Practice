package preTest;

public class Car {
    protected int number; // car license no. (e.g., 123456, etc.)
    protected String model; // car model (e.g., Fiat Punto, etc.)
    protected int year;
    // manufacture year (e.g., 1997, etc.)
    protected int price;

    // car price in $ (e.g., 5000, etc.)
    public Car(int number, String model, int year, int price) {
        this.number = number;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public boolean equals(Car other) {
        return (this.number == other.number);

        // if (this.number == other.number)
        // return true;
        // return false;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int compareTo(Car other) {
        if (this.year == other.year)
            return 0;
        else if (this.year > other.year)
            return 1;
        else // אפשר להוציא את זה ואז -1 הוא ברירת מחדל
            return -1;
    }

    @Override
    public String toString() {
        return "Car [number=" + this.number + ", model=";
    }

}