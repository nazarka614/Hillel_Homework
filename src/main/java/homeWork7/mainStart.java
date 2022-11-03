package homeWork7;

public class mainStart {
    public static void main(String[] args) {
        Dog dog = new Dog("Boby");
        dog.greets(dog);
        BigDog bigDog = new BigDog("Spike");
        bigDog.greets(bigDog);
        dog.play();
        Cat cat = new Cat("Tom");
        cat.feed();
        cat.walk();
        Wolf wolf = new Wolf("Seriy");
        Lion lion = new Lion("Simba");
        wolf.greets();
        wolf.hunting();
        lion.greets();
        lion.hunting();
    }
}
