package hw3;
// Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать, сколько раз встречается каждое слово.
//


import java.util.*;

public class CollectionWordSorter {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new  ArrayList<String>();
        arrayList.add("Word");
        arrayList.add("Strong");
        arrayList.add("Cat");
        arrayList.add("Dog");
        arrayList.add("Dog");
        arrayList.add("Cat");
        arrayList.add("Dog");
        arrayList.add("Road");
        arrayList.add("ButerbRoad");
        arrayList.add("Bird");
        arrayList.add("Bath");
        arrayList.add("Apple");

        Set<String> list   = new HashSet<String>(arrayList);
        for (String word :  list) {
            System.out.println("Слово "+ word + " повторяется " + Collections.frequency(arrayList,word) + " раз(а)");
        }



        }






    }




