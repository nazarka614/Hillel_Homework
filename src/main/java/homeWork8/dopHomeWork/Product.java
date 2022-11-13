package homeWork8.dopHomeWork;

public class Product {
    private Type type;

    public Product(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return type.toString();
    }
}
