package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class QueueTest {
    private Queue queue;

    @BeforeEach
    public void setUp() {
        queue = new Queue(4);
    }

    @Test
    public void testThatQueueIsEmpty() {
        assertEquals(true, queue.isEmpty());
    }

    @Test
    public void testThatQueueIsNotEmptyWhenOneItemIsAdded() {
        queue.enqueue("First string");
        assertEquals(false, queue.isEmpty());
    }

    @Test
    public void testThatQueueSizeIsTwoWhenTwoItemIsAdded() {
        queue.enqueue("First string");
        queue.enqueue("Second string");
        assertEquals(false, queue.isEmpty());
        assertEquals(2, queue.getSize());
    }

    @Test
    public void testThatQueueSizeIsOneWhenTwoItemIsAddedAndOneRemoved() {
        queue.enqueue("First string");
        queue.enqueue("Second string");
        assertEquals(false, queue.isEmpty());
        assertEquals(2, queue.getSize());
        String removedItem = queue.dequeue();
        assertEquals("First string", removedItem);
        assertEquals(false, queue.isEmpty());
    }

    @Test
    public void testThatQueueSizeIsOneWhenFourItemIsAddedAndOneRemoved() {
        queue.enqueue("First string");
        queue.enqueue("Second string");
        queue.enqueue("Third string");
        queue.enqueue("Fourth string");
        assertEquals(false, queue.isEmpty());
        String removedItem1 = queue.dequeue();
        assertEquals("First string", removedItem1);
        String removedItem2 = queue.dequeue();
        assertEquals("Second string", removedItem2);
    }

    @Test
    public void testThatQueueCapacityIsFull_allItemsAreRemoved() {
        queue.enqueue("First string");
        queue.enqueue("Second string");
        queue.enqueue("Third string");
        queue.enqueue("Fourth string");
        assertEquals(false, queue.isEmpty());
        assertEquals(4, queue.getSize());
        assertEquals("First string", queue.dequeue());
        assertEquals(false, queue.isEmpty());
        assertEquals(3, queue.getSize());
        assertEquals("Second string", queue.dequeue());
        assertEquals(false, queue.isEmpty());
        assertEquals(2, queue.getSize());
        assertEquals("Third string", queue.dequeue());
        assertEquals(false, queue.isEmpty());
        assertEquals(1, queue.getSize());
        assertEquals("Fourth string", queue.dequeue());
        assertEquals(true, queue.isEmpty());
        assertEquals(0, queue.getSize());
    }

    @Test
    public void testThatAnEmptyQueueCannotDequeue() {
        String removedItem1 = queue.dequeue();
        assertEquals(null, removedItem1);
    }

    @Test
    public void testThatQueueCapacityIsFull_itemsCannotBeAdded() {
        queue.enqueue("First string");
        queue.enqueue("Second string");
        queue.enqueue("Third string");
        queue.enqueue("Fourth string");
        assertEquals(false, queue.isEmpty());
        assertEquals(4, queue.getSize());
        queue.enqueue("Fifth string");
        assertEquals(4, queue.getSize());
    }
}