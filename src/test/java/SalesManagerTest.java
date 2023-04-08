import org.junit.jupiter.api.*;

public class SalesManagerTest {

    private SalesManager salesManager;
    @BeforeEach
    void start() {
        salesManager = new SalesManager(new long[]{3,4,5,6,7,8});
        System.out.println("Начало");
    }

    @AfterEach
    void finish() {
        System.out.println("Конец");
    }

    @Test
    void salesMangerMax() {
        Assertions.assertEquals(8, salesManager.max());
    }

    @Test
    void salesManagerMedium() {
        Assertions.assertEquals(3, salesManager.medium());
    }

    @Test
    void salesManagerMin() {
        Assertions.assertEquals(3, salesManager.min());
    }
}