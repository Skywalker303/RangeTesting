import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AsIteratorTest {
        Long lowerBound = 0L;
        Long upperBound = 0L;

        Range range = new Range(lowerBound,upperBound);
        List list = new ArrayList<>();

        @BeforeEach
        public void setData(){
            this.lowerBound = 1000L;
            this.upperBound = 1000000L;
        }

        @Test
        @Tag("Method")
        void testMethod() {
            list.add(range);
            assertEquals(list.iterator().getClass(),range.asIterator(lowerBound,upperBound).getClass());
            assertThat(list.iterator().getClass(),is(range.asIterator(lowerBound,upperBound).getClass()));
        }
}
