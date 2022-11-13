package homeWork8.dopHomeWork2;

public class start {
    public static void main(String[] args) {
        Driver driver = new Driver(10, "Bob", 37);
        Engine engine = new Engine(480, "Germany");
        Car car = new Lorry("BMW", "Грузовик",7845,driver,engine,1550);
        System.out.println(car);
        System.out.println("******************************");
        Driver driver2 = new Driver(4, "Rob", 23);
        Engine engine2 = new Engine(740, "italy");
        Car car2 = new SportCar("Ferrari", "Спорт кар",2500,driver2,engine2,450);
        System.out.println(car2);
    }
}
