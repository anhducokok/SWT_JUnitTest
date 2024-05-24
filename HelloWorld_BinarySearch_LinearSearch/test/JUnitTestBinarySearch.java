import org.junit.Test;
import static org.junit.Assert.*;

public class JUnitTestBinarySearch {

    private final BinarySearch bs = new BinarySearch();

    @Test
    public void testEmptyArray() {
        int[] array = new int[0];
        int searchValue = 5;
        int expectedIndex = -1;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testSingleElementFound() {
        int[] array = {5};
        int searchValue = 5;
        int expectedIndex = 0;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testSingleElementNotFound() {
        int[] array = {5};
        int searchValue = 3;
        int expectedIndex = -1;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testMultipleElementsFound() {
        int[] array = {1, 2, 3, 5, 8}; // sorted array
        int searchValue = 5;
        int expectedIndex = 3;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testMultipleElementsNotFound() {
        int[] array = {1, 2, 3, 5, 8}; // sorted array
        int searchValue = 4;
        int expectedIndex = -1;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testDuplicateElements() {
        int[] array = {1, 2, 3, 3, 3, 5, 8}; // sorted array
        int searchValue = 3;
        int expectedIndex = 2; // could also be 3 or 4 depending on the implementation

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        // Since we know 3 appears in index 2, 3, and 4, we only check if it exists within these indices
        assertTrue(actualIndex == 2 || actualIndex == 3 || actualIndex == 4);
    }

    @Test
    public void testLargeArray() {
        int size = 1000000;
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        int searchValue = 999999;
        int expectedIndex = 999999;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testFirstElement() {
        int[] array = {1, 2, 3, 4, 5};
        int searchValue = 1;
        int expectedIndex = 0;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testLastElement() {
        int[] array = {1, 2, 3, 4, 5};
        int searchValue = 5;
        int expectedIndex = 4;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testMiddleElement() {
        int[] array = {1, 2, 3, 4, 5};
        int searchValue = 3;
        int expectedIndex = 2;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testLargeSearchValueNotFound() {
        int[] array = {1, 2, 3, 4, 5};
        int searchValue = 10;
        int expectedIndex = -1;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testNegativeNumbers() {
        int[] array = {-5, -3, -1, 0, 2, 4, 6};
        int searchValue = -3;
        int expectedIndex = 1;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testArrayWithOneElementNotFound() {
        int[] array = {5};
        int searchValue = -5;
        int expectedIndex = -1;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testArrayWithRepeatedElementsFound() {
        int[] array = {1, 1, 1, 1, 1};
        int searchValue = 1;
        int expectedIndex = 0;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        // Since all elements are the same, we check if the search value is found
        assertTrue(actualIndex >= 0 && actualIndex < array.length);
    }

    @Test
    public void testArrayWithMaxInteger() {
        int[] array = {1, 2, 3, Integer.MAX_VALUE};
        int searchValue = Integer.MAX_VALUE;
        int expectedIndex = 3;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }
     @Test
    public void testOddLengthArrayElementFound() {
        int[] array = {2, 4, 6, 8, 10};
        int searchValue = 8;
        int expectedIndex = 3;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testOddLengthArrayElementNotFound() {
        int[] array = {2, 4, 6, 8, 10};
        int searchValue = 5;
        int expectedIndex = -1;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testEvenLengthArrayElementFound() {
        int[] array = {1, 3, 5, 7, 9, 11};
        int searchValue = 5;
        int expectedIndex = 2;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testEvenLengthArrayElementNotFound() {
        int[] array = {1, 3, 5, 7, 9, 11};
        int searchValue = 6;
        int expectedIndex = -1;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testArrayWithNegativeAndPositiveNumbers() {
        int[] array = {-10, -5, 0, 5, 10};
        int searchValue = 0;
        int expectedIndex = 2;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testSearchValueGreaterThanAllElements() {
        int[] array = {1, 2, 3, 4, 5};
        int searchValue = 6;
        int expectedIndex = -1;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testSearchValueLessThanAllElements() {
        int[] array = {10, 20, 30, 40, 50};
        int searchValue = 5;
        int expectedIndex = -1;

        int actualIndex = BinarySearch.BinarySearch(array, searchValue);

        assertEquals(expectedIndex, actualIndex);
    }
}
