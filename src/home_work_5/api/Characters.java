package home_work_5.api;

public enum Characters {
    LATIN_LETTERS("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"),
    CYRILLIC_LETTERS("АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЬЫЭЮЯабвгдеёжзийклмнопрстуфхцчшщьыэюя"),
    DIGITS("0123456789"),
    SPECIAL_CHARACTERS("!@#$%^&*()-_=+[]{}|;:',.<>?/");

    private final String characters;

    Characters(String characters) {
        this.characters = characters;
    }

    public String getCharacters() {
        return characters;
    }
}