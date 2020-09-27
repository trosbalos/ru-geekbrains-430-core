package hw4.before.after;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public abstract class BeforeConfigTest {
    @BeforeAll
    public static void beforeAllBeforeConfigTest() {
        System.out.println("BeforeConfigTest.beforeAll");
    }

    @BeforeEach
    public void setUpBeforeConfigTest() {
        System.out.println("BeforeConfigTest.setUp");
    }

    @AfterEach
    public void tearDownBeforeConfigTest() {
        System.out.println("BeforeConfigTest.tearDown");
    }

    @AfterAll
    public static void afterAllBeforeConfigTest() {
        System.out.println("BeforeConfigTest.afterAll");
    }
}
