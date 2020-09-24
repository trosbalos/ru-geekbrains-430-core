package hw3;
// Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
// искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько
// телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
// Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие
// с пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки
// телефонного справочника.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Phonebook {

    private Map<String, HashSet<Object>> listOfNumbers = new HashMap<>();

    public void add(String name, String phone) {
        if (!listOfNumbers.containsKey(name)) {
            listOfNumbers.put(name, new HashSet<>());
        }
        Set<Object> values = listOfNumbers.get(name);
        values.add(phone);
    }

    public Set<Object> get(String name) {
        Set<Object> values = listOfNumbers.get(name);
        return values;
    }
}

