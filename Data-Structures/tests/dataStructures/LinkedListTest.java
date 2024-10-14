package dataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void testThatLinkedListIsEmpty() {
        LinkedList list = new LinkedList();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testThatANewNodeCanBeAddedToTheLinkedList_listIsNotEmpty() {
        LinkedList list = new LinkedList();
        list.add("Item 1");
        list.add("Item 2");
        assertFalse(list.isEmpty());
    }

    @Test
    public void testThatWhenANewNodeIsAddedSizeIsIncreased() {
        LinkedList list = new LinkedList();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        assertFalse(list.isEmpty());
        assertEquals(4, list.size());
    }

    @Test
    public void testThatLinkedListCanBeEmptied(){
        LinkedList list = new LinkedList();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        assertFalse(list.isEmpty());
        list.clear();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testThatIfListIsEmptied_SizeReturnsToZero() {
        LinkedList list = new LinkedList();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.clear();
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    public void testThatAnElementCanBeRemovedByIndex() {
        LinkedList list = new LinkedList();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.remove(2);
        assertFalse(list.isEmpty());
        assertEquals(3, list.size());
    }

    @Test
    public void testThatLinkedCannotRemoveAnItemBeyondThePresentListSize(){
        LinkedList list = new LinkedList();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(7));
    }

    @Test
    public void testThatLinkedCanRemoveItemByNodeElement(){
        LinkedList list = new LinkedList();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.remove("Item 3");
        assertFalse(list.isEmpty());
        assertEquals(3, list.size());
    }
}
