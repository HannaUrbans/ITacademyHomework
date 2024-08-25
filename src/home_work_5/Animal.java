package home_work_5;

import home_work_5.api.AnimalCreationUtil;

import java.util.Objects;

public class Animal {
    private int age;
    private String nick;

    public Animal(int age, String nick) {
        setAge(age);
        this.nick = nick;
    }

    public static Animal generateAnimal() {

        int age = AnimalCreationUtil.generateAge(1, 15);
        String nick = AnimalCreationUtil.generateAnimalNick();

        return new Animal(age, nick);
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    public void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Животное должно быть старше 1 года");
        } else if (age > 15) {
            throw new IllegalArgumentException("Животное должно быть младше 15 лет");
        }
        this.age = age;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(nick, animal.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, nick);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", nick='" + nick + '\'' +
                '}';
    }
}
