package si.flyp.inf030;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestExercise07_01 {

    @Test
    void SimpleNumberArray_IsSorted() {
        int[] numbers = { 1, 9, 3, 8, 10 };

        Exercise07_01.quickSort(numbers);

        assertArrayEquals(numbers, new int[] { 1, 3, 8, 9, 10 });
    }
    
    @Test
    void ComplexNumberArray_IsSorted() {
        int[] numbers = { -10, 123, 981723, -123, 8234, 1, 9, 3, 8, 10, 12839, -123, 12312 };

        Exercise07_01.quickSort(numbers);

        assertArrayEquals(numbers, new int[] { -123, -123, -10, 1, 3, 8, 9, 10, 123, 8234, 12312, 12839, 981723});
    }
}
