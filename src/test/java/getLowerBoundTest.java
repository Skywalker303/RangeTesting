import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.util.Optional.ofNullable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class getLowerBoundTest {
    Long lowerBound = 0L;
    Long upperBound = 0L;

    Range range = new Range(lowerBound,upperBound);

    @Test
    @Tag("Method")
    void testMethod() {
        assertEquals(ofNullable(lowerBound),ofNullable(range.getLowerBound()));
        assertNotEquals(999L,range.getLowerBound(),"Lower bound is greater");
    }
}
