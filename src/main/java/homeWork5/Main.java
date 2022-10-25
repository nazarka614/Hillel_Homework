package homeWork5;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 = new Dog("Tuzik","Black", 10,17);
        dog1.print();
        System.out.println();
        Dog dog2 = new Dog("Sharik","White");
        dog2.print();
        dog2.setName("Bobi");
        System.out.println();
        dog2.print();
        System.out.println();
        System.out.println("Name: " + dog1.getName() +" \nColor: "+ dog1.getColor());

    }
}
