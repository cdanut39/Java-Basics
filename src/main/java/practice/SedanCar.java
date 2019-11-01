package practice;

public class SedanCar implements Car {
    private String name;
    private String model;
    private int maxSpeed;
    private Color color;
    private int horsePower;
    private int year;

    public SedanCar(String name, String model, int maxSpeed, Color color, int horsePower, int year) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.horsePower = horsePower;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void horn() {
        System.out.println("Inside horn method");
    }

    @Override
    public void doorOpening() {
        System.out.println("Inside doorOpening method");
    }

    @Override
    public void move() {
        System.out.println("Inside move method");
    }

    @Override
    public void accelerate() {
        System.out.println("Inside accelerate method");
    }

    @Override
    public void park() {
        System.out.println("Inside park method");
    }

    @Override
    public void slowDown() {
        System.out.println("Inside slowDown method");
    }
}
