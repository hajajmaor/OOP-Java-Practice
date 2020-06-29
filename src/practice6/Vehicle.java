package practice6;

public abstract class Vehicle {
    private int engineSize; // >0
    private int speed; // <0 REVERSE >0 FORWARD
    private GearType gearType;
    private DrivingDirection direction;
    private boolean AC;

    Vehicle(int engineSize, int speed, int gearTypeChoice, boolean AC) {
        this.setAC(AC);
        this.setEngineSize(engineSize);
        this.setSpeed(speed);
        this.setGearType(gearTypeChoice);
    }

    protected void setAC(boolean AC) {
        this.AC = AC;
    }

    protected boolean getAC() {
        return this.AC;
    }

    protected void setEngineSize(int size) {
        if (size < 0) {
            System.out.println("size cannot be below 0");
            this.engineSize = 0;
        } else {
            this.engineSize = size;
        }
    }

    protected void setSpeed(int speed) {// -50
        if (speed < 0 && speed >= -20) {
            this.direction = DrivingDirection.REVERSE;
            this.speed = speed * (-1);
        } else if (speed <= 120 && speed > 0) {
            this.direction = DrivingDirection.FORWARD;
            this.speed = speed;
        } else if (speed > 120) {
            this.direction = DrivingDirection.FORWARD;
            System.out.println("you are driving too fast!!!!");
            this.speed = 120;
        } else if (speed < -20) {
            this.direction = DrivingDirection.REVERSE;
            System.out.println("you are driving too fast in reverse!!!!");
            this.speed = 20;
        }
    }

    protected void setGearType(int choice) {
        // העמסה מתודות

        // * אם משתמש הקיש 0, משמע אוטו' אם הקיש 1 משמע ידני אחרת שגיאה ברירת מחדל אוטו

        switch (choice) {
            case 0:
                this.setGearType(GearType.AUTO);
                break;
            case 1:
                this.setGearType(GearType.MANUEL);
                break;
            default:
                System.out.println("choice enterd wrong, setting AUTO for gear type");
                this.setGearType(GearType.AUTO);
                break;
        }
    }

    protected void setGearType(GearType gearType) {

        this.gearType = gearType;
    }

    protected void changeGear(int gear) {
        if (this.gearType == GearType.AUTO) {
            System.out.println("you cannot change gear in automate gear box");
        } else {// MAN
            System.out.println("switched to gear " + gear);
        }
    }

    public int getEngineSize() {
        return this.engineSize;
    }

    public int getSpeed() {
        return this.speed;
    }

    public GearType getGearType() {
        return this.gearType;
    }

    public DrivingDirection getDirection() {
        return this.direction;
    }

    @Override
    public String toString() {

        /*
         * private int engineSize; // >0 private int speed; // <0 REVERSE >0 FORWARD
         * private GearType gearType; private DrivingDirection direction; private
         * boolean AC;
         */
        return "vehicle details are: \n" + "engineSize= " + this.engineSize + "speed= " + this.speed + "gearType= "
                + this.gearType + "DrivingDirection= " + this.direction + "AC = " + this.AC;
    }
}