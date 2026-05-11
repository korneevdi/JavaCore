package datastructures.arraylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    MyArrayList<Integer> list;

    @BeforeEach
    public void setUp() {
        list = new MyArrayList<>();
        for(int i = 0; i < 100; i++) {
            list.add(i);
        }
    }

    @Test
    public void addWhenInsert100ElementsSizeMustIncreaseBy100() {
        assertEquals(100, list.size());
        assertEquals(68, list.get(68));
    }

    @Test
    public void addWhenInsertElementSizeMustIncreaseByOne() {
        assertEquals(100, list.size());
        list.add(8);
        assertEquals(101, list.size());
        assertEquals(8, list.get(100));
    }

    @Test
    public void addWhenInsertNullExceptionMustBeThrown() {
        assertThrows(IllegalArgumentException.class, () -> list.add(null));
    }

    @Test
    public void addWhenInsertElementAtSpecificPositionSizeMustIncreaseByOne() {
        list.add(24, 11);
        assertEquals(101, list.size());
        assertEquals(11, list.get(24));
        assertEquals(99, list.get(100));
    }

    @Test
    public void addWhenInsertElementAtIllegalPositionExceptionMustBeThrown() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(-4, 7));
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(104, 7));
    }

    @Test
    public void addWhenInsertNullAtSpecificPositionExceptionMustBeThrown() {
        assertThrows(IllegalArgumentException.class, () -> list.add(7, null));
    }

    @Test
    public void removeWhenRemoveSpecificElementSizeMustDecreaseByOne() {
        list.remove(63);
        assertEquals(99, list.size());
        assertEquals(64, list.get(63));
    }

    @Test
    public void removeWhenRemoveNullSizeMustNotChange() {
        list.remove(null);
        assertEquals(100, list.size());
    }

    @Test
    public void removeAtWhenRemoveOneElementSizeMustDecreaseByOne() {
        list.removeAt(63);
        assertEquals(99, list.size());
        assertEquals(64, list.get(63));
    }

    @Test
    public void removeAtWhenRemoveElementAtIllegalPositionExceptionMustBeThrown() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.removeAt(-4));
        assertThrows(IndexOutOfBoundsException.class, () -> list.removeAt(104));
    }

    @Test
    public void clearMustSetSizeToZero() {
        assertFalse(list.isEmpty());
        list.clear();
        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }
}
