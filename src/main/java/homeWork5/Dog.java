package homeWork5;

public class Dog {
   private int height;
   private String name;
   private String color;
   private int age;

    public Dog(String name, String color, int height,  int age) {
        this.name = name;
        this.color = color;
        if (height >= 10 && height <= 130) {
            this.height = height;
        }else {
            this.height = 80;
        }
        if (age >= 0 && age <= 17) {
            this.age = age;
        }else {
            this.age = 7;
        }
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
        this.height = 80;
        this.age = 7;
    }

    public Dog() {
        System.out.println("Creating object of the class Dog.");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void print(){
        System.out.printf("Name: %s \nColor: %s \nHeight: %d \nAge: %d \n",name,color,height,age);
    }
}
