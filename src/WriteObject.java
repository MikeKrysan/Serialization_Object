import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");

        try {
            FileOutputStream fos = new FileOutputStream("people.bin"); //1. Последовательность записи байтов
            ObjectOutputStream oos = new ObjectOutputStream(fos);   //2. Предназначен только для записи объектов в файл(более специализированный класс)

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}

/*
1. Создаем объект класса FileOutputStream для того, чтобы можно было сериализовать наши созданные объекты класса Person
    Записываем бинарные данные в файл с расширением bin
2. Чтобы записать наш объект, мы должны создать еще однин объект класса ObjectOutputStream. Для записи объектов ему нужен более объектный, приближенный к байтам объект класса FileOutputStream
 */