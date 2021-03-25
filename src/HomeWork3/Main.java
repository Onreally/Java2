package HomeWork3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>(15);
        // ArrayList<String> unique = new ArrayList<>();
        words.addAll(Arrays.asList("Борис", "Яблоко", "Борис", "Яблоко", "Машина", "Дом", "Велосипед", "Стакан", "Тетрадь", "Лист", "Джава", "Тетрадь", "Лист", "Питон", "Питон"));
        System.out.println("Уникальные слова: " + words);
        List<String> copyWords = new ArrayList<>();
        copyWords.addAll(Arrays.asList("Борис", "Яблоко", "Борис", "Яблоко", "Машина", "Дом", "Велосипед", "Стакан", "Тетрадь", "Лист", "Джава", "Тетрадь", "Лист", "Питон", "Питон"));

        for (int i = 0; i < copyWords.size(); i++) {
            int score = 0;
            for (int j = 0; j < copyWords.size(); j++) {
                if (copyWords.get(i).equals(copyWords.get(j))) {
                    copyWords.remove(j);
                    score++;

                }

            }System.out.println("Слово " + copyWords.get(i) + " повторяется " + score);

        }

    }


}
