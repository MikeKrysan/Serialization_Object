import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject_1 {
    public static void main(String[] args) {
        Person1 person1 = new Person1(1, "Stiv");
        Person1 person2 = new Person1(2, "Jack");

        try {
            FileOutputStream fos = new FileOutputStream("people_1.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
