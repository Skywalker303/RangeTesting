import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.util.Optional.ofNullable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class getUpperBoundTest {
    Long lowerBound;
    Long upperBound;

    Range range = new Range(lowerBound,upperBound);

        @Test
        @Tag("Method")
        void testMethod() {
            assertEquals(ofNullable(upperBound),ofNullable(range.getUpperBound()));
            assertNotEquals(2000000L,range.getUpperBound(),"Upper bound is lower");
        }
}
