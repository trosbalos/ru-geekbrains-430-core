package hw3;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

public class PhonebookTest {

    @Test
    public void testPhoneBook(){
        Phonebook phonebook = new Phonebook();
        phonebook.add("Yuri", "89999999999");
        phonebook.add("Yuri", "88888888888");

        Set<Object> numbers = phonebook.get("Yuri");

        Assert.assertEquals(2 ,numbers.size());

    Assertions.assertThat(numbers).containsExactlyInAnyOrder("89999999999", "88888888888");
    }

    @Test
    //Плохо-плохо, если человека нет в вашей книге, то программа взрывается
    public void testEmptyPhoneBook(){
        Phonebook phonebook = new Phonebook();

        Set<Object> numbers = phonebook.get("Yuri");

        Assert.assertTrue(numbers.isEmpty());
    }


    @Test(expected = NullPointerException.class)

    //Если вы считается, что это правильно выбрасывать ошибки и хотите проверить, что они точно выброшены
    //Приминил в hw2
    public void testEmptyPhoneBookWithException(){
        Phonebook phonebook = new Phonebook();

        Set<Object> numbers = phonebook.get("Yuri");

        Assert.assertTrue(numbers.isEmpty());
    }


}