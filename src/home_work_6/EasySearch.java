package home_work_6;

import home_work_6.utils.ISearchEngine;

//Реализовать поиск используя метод indexOf из класса String.
//Данный класс ищет слова с учётом регистра.
//Поиск должен находить отдельно стоящее слово, а не часть слова

public class EasySearch implements ISearchEngine {

    public static void main(String[] args) {
        String text = "Однако,   Мры в течение этого времени, мры  , совершали мр только мрык простейшие операции: удаление (мры?), вставку (мры!!!), вывод в кмры консоль (мры ...). Конечно,         мры     на этом список задач, с которыми сталкиваются разработчики при использовании ArrayList, не исчерпывается.";
        String word = "мры";
        EasySearch tmp = new EasySearch();
        long count = tmp.search(text, word);
        System.out.println("Количество вхождений слова '" + word + "': " + count);
    }

    @Override
    public long search(String text, String word) {

        if (text == null || word == null || text.isEmpty() || word.isEmpty()) {
            throw new IllegalArgumentException("Ошибка при передаче данных");
        }

        long frequencyOfInputWord = 0;
        //с какого символа ведем поиск в тексте
        int i = 0;

        //indexOf ищет подстроку word
        while ((i = text.indexOf(word, i)) != -1) {
            //проверяем, что слово отдельностоящее, а не часть другого
            //флаги должны на каждом круге сбрасываться, поэтому инициализация внутри
            //первая буква может быть, если стоит в начале текста или пред.символ не буква
            boolean firstLetter = ((i == 0) || !Character.isLetter(text.charAt(i - 1)));

            //послед. буква может быть, если стоит в конце текста или след.символ не буква
            boolean lastLetter = ((i + word.length()) == text.length()) || !Character.isLetter(text.charAt((i + word.length())));

            if (firstLetter && lastLetter) {
                ++frequencyOfInputWord;
            }
            //перешагиваем слово, чтобы искать дальше
            i += word.length();
        }
        return frequencyOfInputWord;
    }


//    text = text.replace('.', ' ')
//            .replace(',', ' ')
//                .replace('&', ' ')
//                .replace('?', ' ')
//                .replace(':', ' ')
//                .replace(';', ' ')
//                .replace('!', ' ')
//                .replace('(', ' ')
//                .replace(')', ' ')
//                .replace('\n', ' ')
//                .replace('\'', ' ')
//                .replace('\"', ' ');
//
//    //список для хранения слов из текста (вместо массива)
//    List<String> wordsList = new LinkedList<>();
//
//    //разбили стринг на коллекцию стрингов с учетом наличия нескольких пробелов между словами
//    Scanner scanner = new Scanner(text);
//        while (scanner.hasNext()) {
//        wordsList.add(scanner.next());
//    }
//
//        for (String elem : wordsList) {
//        if (Objects.equals(elem,word)) {
//            ++frequencyOfInputWord;
//        }
//    }
}

