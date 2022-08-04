package JavaLessons.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        //Person person1 = new Person("Chaser", 2.5);
        //Person person2 = new Person("Chaser", 2.5);

        Person[] people = {new Person("Chaser", 2.5),new Person("Mark2", 3.0),new Person("Cresta", 2.0)};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){

            //oos.writeObject(person1);
            //oos.writeObject(person2);

            oos.writeObject(people);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}