import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Range {

    private Long lowerBound ;
    private Long upperBound ;

    public Range(Long lowerBound, Long upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public boolean contains(Long number,Long lowerBound,Long upperBound) {
        return (number >= lowerBound && number <= upperBound);
    }

    public boolean isBefore(Range otherRange) {
        return this.lowerBound > otherRange.upperBound;
    }

    public boolean isAfter(Range otherRange) {
        return this.upperBound < otherRange.lowerBound;
    }

    public boolean isConcurrent(Range otherRange) {
        return (this.lowerBound == otherRange.lowerBound) && (this.upperBound == otherRange.upperBound);
    }

    public List<Long> asList() {
        List<Long> list = new ArrayList<>();
        for (Long inRange = this.lowerBound; inRange<=this.upperBound; inRange++) {
            list.add(inRange);
        }
        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Range range = (Range) o;

        if (getLowerBound() != null ? !getLowerBound().equals(range.getLowerBound()) : range.getLowerBound() != null)
            return false;
        return getUpperBound() != null ? getUpperBound().equals(range.getUpperBound()) : range.getUpperBound() == null;
    }

    @Override
    public int hashCode() {
        int result = getLowerBound() != null ? getLowerBound().hashCode() : 0;
        result = 31 * result + (getUpperBound() != null ? getUpperBound().hashCode() : 0);
        return result;
    }

   public Iterator<Long> asIterator(Long lowerBound,Long upperBound){
        Iterator<Long> iterator= new Iterator<Long>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Long next() {
                return null;
            }
        };
       List<Long> longs = new ArrayList<>();
       for (long i = lowerBound; i < upperBound; i++) {
          longs.add(lowerBound + i);
          iterator = longs.iterator();
       }
       return  iterator;
    }

    public Long getLowerBound() {
        return lowerBound;
    }

    public Long getUpperBound() {
        return upperBound;
    }

    public static void main(String[] args) {

    }
}