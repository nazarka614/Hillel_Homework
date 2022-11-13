package homeWork8.dopHomeWork2;

public class Driver extends Person {
    int experience;

    public Driver(int experience, String username, int age) {
        super(username,age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Username: " + username + "\nExperience: " + experience + "\nAge: "+ age;
    }
}
