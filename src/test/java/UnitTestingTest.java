import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UnitTestingTest {

    @Test
    void processList() {
        UnitTesting unitTesting = new UnitTesting();
        List<Integer> expected = List.of(2, 4, 8, 16, 32);

        List<Integer> result = unitTesting.processList(unitTesting.intList);

        Assertions.assertFalse(result.isEmpty());
        Assertions.assertEquals(expected, result);
    }
}