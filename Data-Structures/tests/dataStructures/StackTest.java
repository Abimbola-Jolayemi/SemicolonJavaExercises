package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {
    private Stack stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack(4);
    }

    @Test
    public void testThatStackIsEmpty() {
        assertEquals(
                true, stack.isEmpty());
    }

    @Test
    public void testThatStackIsNotEmpty() {
        stack.push("First String");
        assertEquals(false, stack.isEmpty());
    }

    @Test
    public void testThatTwoItemsAreAdded_stackSizeIsTwo(){
        stack.push("First String");
        stack.push("Second String");
        assertEquals(false, stack.isEmpty());
        assertEquals(2, stack.getSize());
    }

    @Test
    public void testThatTwoItemsAreRemovedFromAStackOfSizeThree_stackSizeIsTwo(){
        stack.push("First String");
        stack.push("Second String");
        stack.push("Third String");
        assertEquals(false, stack.isEmpty());
        assertEquals(3, stack.getSize());
        String removedItem = stack.pop();
        assertEquals("Third String", removedItem);
        assertEquals(2, stack.getSize());
    }

    @Test
    public void testThatTwoItemsAreRemovedFromAStackOfSizeOne_stackSizeIsOne(){
        stack.push("First String");
        stack.push("Second String");
        stack.push("Third String");
        assertEquals(false, stack.isEmpty());
        assertEquals(3, stack.getSize());
        String removedItem1 = stack.pop();
        assertEquals("Third String", removedItem1);
        assertEquals(2, stack.getSize());
        String removedItem2 = stack.pop();
        assertEquals("Second String", removedItem2);
        assertEquals(1, stack.getSize());
    }

    @Test
    public void testThatAnEmptyStackCannotRemoveItems(){
        assertEquals(null, stack.pop());
    }

    @Test
    public void testThatAFilledStackCannotPushItems(){
        stack.push("First String");
        stack.push("Second String");
        stack.push("Third String");
        stack.push("Fourth String");
        assertEquals(false, stack.isEmpty());
        assertEquals(4, stack.getSize());
        stack.push("Fifth String");
        assertEquals(4, stack.getSize());
    }

    @Test
    public void testThatStackIsEmptyWhenAllItemsArePopped(){
        stack.push("First String");
        stack.push("Second String");
        String removedItem1 = stack.pop();
        String removedItem2 = stack.pop();
        assertEquals(true, stack.isEmpty());
    }

    @Test
    public void testThatStackCanPeekAnItem(){
        stack.push("First String");
        stack.push("Second String");
        stack.push("Third String");
        assertEquals(false, stack.isEmpty());
        assertEquals(3, stack.getSize());
        String peekedItem = stack.peek();
        assertEquals("Third String", peekedItem);
        assertEquals(3, stack.getSize());
    }

    @Test
    public void testThatStackCannotPeekFromAnEmptyStack(){
        String peekedItem = stack.peek();
        assertEquals(null, peekedItem);
    }

    @Test
    public void testThatStackIsFull(){
        stack.push("First String");
        stack.push("Second String");
        stack.push("Third String");
        stack.push("Fourth String");
        assertEquals(false, stack.isEmpty());
        assertEquals(true, stack.isFull());
    }
}
