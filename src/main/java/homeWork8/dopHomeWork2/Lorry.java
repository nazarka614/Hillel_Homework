package homeWork8.dopHomeWork2;

public class Lorry extends Car {
    int carrying;

    public Lorry(String brand, String type, int weight, Driver driver, Engine engine, int carrying) {
        super(brand, type, weight, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public String toString() {
        return "Марка: " + getBrand() +"\nТип: " + getType() +"\nВодитель; \n"+ getDriver() +""+ getEngine() +"\nВес машины: "+ getWeight() + "\nГрузоподьемность: " + getCarrying();
    }
}
