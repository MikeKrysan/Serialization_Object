import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person1 = (Person) ois.readObject();  //ClassNotFoundException возникнет в случае записи в другой проект, где нет класса Person (1)
            Person person2 = (Person) ois.readObject();

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

/*
1. Метод readObject() возвращает родителя всех объектов - объект класса Object. Чтобы получить объект класса Person, мы
    должны сделать даункастинг до (Person)
 */