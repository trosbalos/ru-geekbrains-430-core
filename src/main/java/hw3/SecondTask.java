package hw3;

public class SecondTask {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Иванов", "89213736655");
        phonebook.add("Иванов", "+79115556655");
        phonebook.add("Иванов", "+74954433221");
        phonebook.add("Сидоров", "89115222334");
        phonebook.add("Петров", "89064422114");
        phonebook.add("Петров", "89064422114");
        phonebook.add("Петров", "89064422113");

        System.out.println(phonebook.get("Иванов"));
        System.out.println(phonebook.get("Сидоров"));
        System.out.println(phonebook.get("Петров"));
    }
}
