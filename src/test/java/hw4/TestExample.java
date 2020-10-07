package hw4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExample {
    @Test
    public void checkSumCorrect() {
        Assertions.assertEquals(2, 1 + 1);
    }

    @Test
    public void checkSumException() {
        Assertions.assertEquals(3, 2 + 1);
    }
}
