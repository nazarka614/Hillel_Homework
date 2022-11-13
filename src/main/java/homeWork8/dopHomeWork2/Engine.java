package homeWork8.dopHomeWork2;

public class Engine {
    int force;
    String manufacturer;

    public Engine(int force, String manufacturer) {
        this.force = force;
        this.manufacturer = manufacturer;
    }

    public int getForce() {
        return force;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "\nЛошадок: " + force + "\nСтрана производитель: "+ manufacturer;
    }
}
