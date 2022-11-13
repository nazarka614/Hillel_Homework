package homeWork8.dopHomeWork2;

public class Car {
    String brand;
    String type;
    int weight;
    Driver driver;
    Engine engine;

    public Car(String brand, String type, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот направо");
    }
    public void turnLeft(){
        System.out.println("Поворот налево");
    }

}
