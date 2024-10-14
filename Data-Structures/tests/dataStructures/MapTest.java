package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class MapTest {
    private Map<String, String> map;


    @BeforeEach
    public void setUp() {
        map = new Map<>();
    }

    @Test
    public void testMapSizeIsZeroWhenNothingIsPutInIt() {
         assertEquals(0, map.size());
         assertTrue(map.isEmpty());
    }

    @Test
    public void test_addAKeyAndValue_mapSizeBecomesOne() {
        map.put("key", "value");
        assertEquals(1, map.size());
        assertFalse(map.isEmpty());
    }

    @Test
    public void test_addAKeyAndValue_mapSizeBecomesTwo() {
        map.put("key1", "value1");
        assertEquals(1, map.size());
        map.put("key2", "value2");
        assertEquals(2, map.size());
    }

    @Test
    public void testThatMapCanCheckIfAkeyIsPresent(){
        map.put("Key1", "value1");
        map.put("Key2", "value2");
        map.put("Key3", "value3");
        assertTrue(map.containsKey("Key2"));
    }

    @Test
    public void testThatWhenTwoIdenticalKeyValuePairsAreAddedSizeRemainsTheSame_valueIsChanged(){
        map.put("key1", "value1");
        assertEquals(1, map.size());
        map.put("key2", "value2");
        assertEquals(2, map.size());
        map.put("key1", "value3");
        assertEquals(2, map.size());
    }

    @Test
    public void testThatMapCanCheckIfAValueIsPresent(){
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        assertTrue(map.containsValue("value2"));
    }

    @Test
    public void testThatMapCanReturnValueOfAkey(){
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        assertEquals("value3", map.get("key3"));
    }

    @Test
    public void testThatMapCannotReturnValueOfAkeyThatIsNotPresent(){
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        assertEquals(null, map.get("key10"));
    }

    @Test
    public void testThatAkeyValuePairCanBeRemoved_andSizeIsReducedByOne(){
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        assertEquals(4, map.size());
        map.remove("key3");
        assertEquals(null, map.get("key3"));
    }

    @Test
    public void testThatAllPairsInAMapCanBeCleared(){
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        assertEquals(3, map.size());
        map.clear();
        assertEquals(0, map.size());
    }

    @Test
    public void testThatNoItemCanBeGottenFromTheMapAfterMapHasBeenCleared(){
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.clear();
        assertEquals(0, map.size());
        assertEquals(null, map.get("key1"));
        assertEquals(null, map.get("key2"));
        assertEquals(null, map.get("key3"));
    }
}
