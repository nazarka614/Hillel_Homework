package homeWork8.dopHomeWork2;

public class SportCar extends Car {
    int Speed;

    public SportCar(String brand, String type, int weight, Driver driver, Engine engine, int speed) {
        super(brand, type, weight, driver, engine);
        this.Speed = speed;

    }

    public int getSpeed() {
        return Speed;
    }

    public String toString() {
        return "Марка: " + getBrand() +"\nТип: " + getType() +"\nВодитель; \n"+ getDriver() +""+ getEngine() +"\nВес машины: "+ getWeight() +" кг" + "\nМаксимальная корость: " + getSpeed()+" км/ч";
    }
}
