package home_work_5;

import home_work_5.api.PersonCreationUtil;

import java.util.Objects;

public class Person {
    private String nick;
    private String password;
    private String name;

    public Person() {
    }

    public Person(String nick, String password, String name) {
        this.nick = nick;
        setPassword(password);
        this.name = name;
    }

    public static Person generatePerson() {

        String nick = PersonCreationUtil.generatePersonNick();
        String password = PersonCreationUtil.generatePassword(5, 10);
        String name = PersonCreationUtil.generateName();

        return new Person(nick, password, name);
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPassword(String password) {
        if (password.length() < 5) {
            throw new IllegalArgumentException("Пароль не должен содержать менее 5 символов");
        } else if (password.length() > 10) {
            throw new IllegalArgumentException("Пароль не должен содержать более 10 символов");
        }
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(nick, person.nick) && Objects.equals(password, person.password) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, password, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
