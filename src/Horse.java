/**
 * Created by nikjke on 04.10.2016.
 */
public class Horse {
    String name;
    int age;
    String sex;
    double speed;

    public Horse(String name, int age, boolean male, double speed) {
        this.name = name;
        this.age = age;
        this.sex = (male) ? "Stallion" : "Mare";
        this.speed = speed;
    }
}
