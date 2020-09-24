package hw3;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CollectionWordSorterTest {
    @Test
    public void testCollectionWordSorter(){
        //Данные
        //Создаем экземпляр класса
        CollectionWordSorter collectionWordSorter = new CollectionWordSorter();
        //Создаем и заполняем коллекцию
        ArrayList<String> arrayList = new ArrayList<String>();
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

        // Метод возращает .size() коллекции
        int actual = collectionWordSorter.collectionWordSorter(arrayList);

        //до удаления дублей размер 12, после удаления 9. Ожидаем 9.
        Assert.assertEquals(9, actual);
    }

}