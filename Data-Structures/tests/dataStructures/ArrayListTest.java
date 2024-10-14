package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class ArrayListTest {
    private ArrayList list;

    @BeforeEach
    public void setUp() {
        list = new ArrayList();
    }

    @Test
    public void testThatArrayListCanAddItems(){
        list.add("First element");
        assertEquals(1, list.getSize());
    }

    @Test
    public void testThatArrayListIsNotEmpty(){
        assertEquals(0, list.getSize());
    }

    @Test
    public void testThatArrayListIsDynamic(){
        list.add("First element");
        list.add("Second element");
        list.add("Third element");
        list.add("Fourth element");
        assertEquals(4, list.getSize());
    }

    @Test
    public void testThatArrayCanReturnIndexOfObject(){
        list.add("First element");
        list.add("Second element");
        list.add("Third element");
        list.add("Fourth element");
        assertEquals(4, list.getSize());
        assertEquals(2, list.getIndexOf("Third element"));
        assertEquals(0, list.getIndexOf("First element"));
    }

    @Test
    public void testThatArrayCanElementByIndex(){
        list.add("First element");
        list.add("Second element");
        list.add("Third element");
        list.add("Fourth element");
        assertEquals(4, list.getSize());
        assertEquals("Third element", list.getElementOf(2));
        assertEquals("First element", list.getElementOf(0));
    }

    @Test
    public void testThatArrayListCanRemoveByIndex(){
        list.add("First element");
        list.add("Second element");
        list.add("Third element");
        list.add("Fourth element");
        assertEquals(4, list.getSize());
        list.remove(2);
        assertEquals(3, list.getSize());
        assertEquals("First element", list.remove(0));
        assertEquals(0, list.getIndexOf("Second element"));
    }

    @Test
    public void testThatArrayListCanRemoveByElement(){
        list.add("First element");
        list.add("Second element");
        list.add("Third element");
        list.add("Fourth element");
        assertEquals(4, list.getSize());
        list.remove("Second element");
        assertEquals(3, list.getSize());
        assertEquals("Third element", list.getElementOf(1));
    }

    @Test
    public void testThatArrayListCanRemoveAllElements(){
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");
        assertEquals(4, list.getSize());
        list.removeAll();
        assertEquals(0, list.getSize());
        assertEquals(null, list.getElementOf(1));
    }

    @Test
    public void testThatArrayListCanInsertObjectAtIndex_sizeIsPlus1(){
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");
        assertEquals(4, list.getSize());
        list.insert(2, "element3A");
        assertEquals(5, list.getSize());
        assertEquals("element3A", list.getElementOf(2));
        assertEquals("element3", list.getElementOf(3));
    }

    @Test
    public void testThatArrayListCanReplaceElements(){
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");
        assertEquals(4, list.getSize());
        list.replace(2, "element3A");
        assertEquals(4, list.getSize());
        assertEquals("element3A", list.getElementOf(2));
        assertEquals("element4", list.getElementOf(3));
    }

    @Test
    public void testThatArrayListCanValidateElements(){
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");
        assertEquals(4, list.getSize());
        assertTrue(list.contains("element2"));
        assertFalse(list.contains("Element2"));
    }
}
