package homeWork6.main;

import homeWork6.objects.Cat;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getColor());
        System.out.println();
        Cat cat1 = new Cat(true, "Whiskas", 4, "Gray");
        cat1.say();
    }
}
