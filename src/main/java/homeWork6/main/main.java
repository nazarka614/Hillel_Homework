package homeWork6.main;

import homeWork6.objects.Cat;

public class main {
    public static void main(String[] args) {
        Cat cat = new Cat(false,"Whiskas", 4);
        cat.say();
        System.out.println();
        Cat cat1 = new Cat(true, "Whiskas", 4, "Gray");
        cat1.say();
    }
}
