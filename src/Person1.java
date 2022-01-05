import java.io.Serializable;

public class Person1 implements Serializable {
    private int id;
    private String name;

    public Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " : " + name;
    }
}
