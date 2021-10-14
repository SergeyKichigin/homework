package homework6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {
    @ParameterizedTest
    @MethodSource("changeArrayParams")
    void changeArray(int[] in, int [] out) {
        Assertions.assertArrayEquals(out, Array.changeArray(in));
    }

    static Stream<Arguments> changeArrayParams() {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[] {7,8,9,4,5,6,7}, new int[] {5,6,7}));
        list.add(Arguments.arguments(new int[] {100, 50, 4}, new int[] {}));
        list.add(Arguments.arguments(new int[] {4,4,4,4,1,1,4,11,22,33,44,55}, new int[] {11,22,33,44,55}));
        return list.stream();
    }

    @Test
    void changeArrayException() {
        Assertions.assertThrows(RuntimeException.class, () -> Array.changeArray(new int[] {1,2,3,5,7}));
    }

    @Test
    void checkArray() {
        Assertions.assertTrue(Array.checkArray(new int[] {1,1,1,1,4,4,4}));
        Assertions.assertFalse(Array.checkArray(new int[] {3,1,1,4,4,4}));
        Assertions.assertFalse(Array.checkArray(new int[] {1,1,1,1,1,1,1}));
        Assertions.assertFalse(Array.checkArray(new int[] {4,4,4,4,4}));  //Не смог подать массивы на тест из csv файла
    }
}