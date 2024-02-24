package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {34, 14, 61};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {14, 34, 61};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {63, 4, 100, 2, 5500};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 4, 63, 100, 5500};
        assertThat(result).containsExactly(expected);
    }
}