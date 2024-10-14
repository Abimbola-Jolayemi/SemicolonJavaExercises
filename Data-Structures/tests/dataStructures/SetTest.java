package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SetTest {
    private Set set;

    @BeforeEach
    public void setUp(){
        set = new Set(4);
    }

    @Test
    public void testThatSetIsEmptyWhenNoItemIsAdded() {
        assertEquals(0, set.size());
    }

    @Test
    public void testThatSetHasASizeOfOneWhenAnItemIsAdded() {
        set.add(2);
        assertEquals(1, set.size());
    }

    @Test
    public void testThatCheckIfSetContainsAnItem() {
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        assertEquals(4, set.size());
        assertTrue(set.contains(3));
    }

    @Test
    public void testThatShowsThatAnEmptySetDoesNotContainAnItem()
    {
        assertFalse(set.contains("1"));
    }

    @Test
    public void testThatSetCannotAddANumberThatIsPresentInTheSet() {
        set.add(2);
        set.add(3);
        assertEquals(2, set.size());
        set.add(2);
        assertEquals(2, set.size());
    }

    @Test
    public void testThatSetCannotAddANumberWhenSetIsFull() {
        set.add("item 1");
        set.add("item 2");
        set.add("item 3");
        set.add("item 4");
        assertEquals(4, set.size());
        set.add("item 5");
        assertEquals(4, set.size());
    }

    @Test
    public void testThatSetCanBeCleared() {
        set.add("item 1");
        set.add("item 2");
        set.add("item 3");
        set.add("item 4");
        assertEquals(4, set.size());
        set.clear();
        assertEquals(0, set.size());
    }

    @Test
    public void testThatSetCanReturnAnArrayOfItsElements() {
        Set<String> set = new Set<>(10);
        set.add("item 1");
        set.add("item 2");
        set.add("item 3");
        set.add("item 4");
        assertEquals(4, set.size());
        String[] expectedArray = new String[] {"item 1", "item 2", "item 3", "item 4"};
        assertArrayEquals(expectedArray, set.toArray());
    }
}
