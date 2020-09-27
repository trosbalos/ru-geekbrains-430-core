package hw4;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;

public class DisplayExample {
    @Test
    public void checkSumCorrect() {
        Assertions.assertEquals(2, 1 + 1);
    }

    @Disabled(value = "Отключен до 26 сентября")
    @Test
    public void checkSumException() {
        Assertions.assertEquals(3, 1 + 1);
    }
}
