import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsTest {
    Long lowerBound = 0L;
    Long upperBound = 0L;
    Long number1 = 10000L;
    String number2 = "number";

    @BeforeEach
    public void setData(){
        this.lowerBound = 1000L;
        this.upperBound = 1000000L;
    }
    Range range = new Range(lowerBound,upperBound);
    @Test
    @Tag("Method")
    void testMethod() {
        assertTrue(range.contains(number1,lowerBound,upperBound));
        assertThrows(NumberFormatException.class,()->{range.contains(Long.valueOf(number2),lowerBound,upperBound);});
    }
}
