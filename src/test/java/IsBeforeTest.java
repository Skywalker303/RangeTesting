import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class IsBeforeTest {
    Long lowerBound = 0L;
    Long upperBound = 0L;
    Long lowerBound1 = 0L;
    Long upperBound1 = 0L;

    Range range = new Range(lowerBound, upperBound);
    Range otherRange1 = new Range(lowerBound1, upperBound1);
    Range otherRange2 = new Range(lowerBound, upperBound);

    @BeforeEach
    public void setData() {
        this.lowerBound = 1000L;
        this.upperBound = 1000000L;
        this.lowerBound1 = 100001L;
        this.upperBound1 = 1000000L;
    }

    @Test
    @Tag("Method")
    void testMethod() {
        assertFalse(range.isBefore(otherRange1), "The range is before otherRange1");
        assertThat(range, is(otherRange2));
        assertNotEquals("false", range.isBefore(otherRange2));
    }
}
