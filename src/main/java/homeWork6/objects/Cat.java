package homeWork6.objects;

public class Cat extends Animal{
    private String color;

    public Cat(boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }

    public Cat() {
        this.color = "Black";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void say() {
        System.out.println(("Vegetarian: " + isVegetarian() + "\nFeed: " + getEats() + "\nLegs: " + getNoOfLegs()) + "\nColor: " + getColor());

    }
}
