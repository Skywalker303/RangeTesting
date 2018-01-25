import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsCuncurrentTest {
    Long lowerBound = 0L;
    Long upperBound = 0L;

    Range range = new Range(lowerBound,upperBound);
    Range otherRange2 = new Range(lowerBound,upperBound);

    @BeforeEach
    public void setData(){
        this.lowerBound = 1000L;
        this.upperBound = 1000000L;
    }

    @Test
    @Tag("Method")
    void testMethod() {
        assertTrue(range.isConcurrent(otherRange2));
        assertThat(range,is(otherRange2));
        assertNotEquals("false",range.isConcurrent(otherRange2));
    }
}
