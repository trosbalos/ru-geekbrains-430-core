package hw3;
// Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать, сколько раз встречается каждое слово.
//


import java.util.*;

public class CollectionWordSorter {

        public int collectionWordSorter (ArrayList<String> arrayList){

            Set<String> list = new HashSet<String>(arrayList);
            for (String word : list) {
                System.out.println("Слово " + word + " повторяется " + Collections.frequency(arrayList, word) + " раз(а)");
            }

            return list.size();
        }

    }





