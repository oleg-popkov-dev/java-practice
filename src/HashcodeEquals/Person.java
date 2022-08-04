package HashcodeEquals;

import java.util.Objects;

public class Person {
    private int age;
    private int salary;

    public Person(int age, int salary) {
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                salary == person.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, salary);
    }
}