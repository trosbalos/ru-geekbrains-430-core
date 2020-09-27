package hw4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Авторизация")
public class DisplayNameExample {

    @DisplayName("Корректный логин/пароль")
    @Test
    public void checkSumCorrect() {
        Assertions.assertEquals(2, 1 + 1);
    }

    @DisplayName("Логин заблокирован")
    @Test
    public void checkSumException() {
        Assertions.assertEquals(3, 1 + 1);
    }
}
