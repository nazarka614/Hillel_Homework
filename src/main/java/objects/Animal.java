package objects;

public class Animal {
    private boolean vegetarian = true;
    private String eats = "Feed";
    private int noOfLegs = 0;

    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    public Animal() {
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
    public void say() {
        System.out.println(("Vegetarian: " + isVegetarian() + "\nFeed: " + getEats() + "\nLegs: " + getNoOfLegs()));
    }
}
