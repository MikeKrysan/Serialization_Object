import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject_1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people_1.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person1 person1 = (Person1) ois.readObject();
            Person1 person2 = (Person1) ois.readObject();

            System.out.println(person1);
            System.out.println(person2);

            ois.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
