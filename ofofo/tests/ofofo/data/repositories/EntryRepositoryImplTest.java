package ofofo.data.repositories;

import ofofo.data.models.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntryRepositoryImplTest {
    private EntryRepository entryRepository;

    @BeforeEach
    public void startWith() {
        entryRepository = new EntryRepositoryImpl();
    }

    @Test
    public void testThatEntryRepositoryIsEmpty_WhenNoEntryIsSaved(){
        assertEquals(0, entryRepository.countEntry());
    }

    @Test
    public void testThatEntryRepositoryIsNotEmpty_WhenOneEntryIsSaved_NoOfEntryIsOne(){
        Entry entry = new Entry(1, "New title", "New body");
        entryRepository.saveEntry(entry);
        assertEquals(1, entryRepository.countEntry());
    }

    @Test
    public void testThatEntryRepositoryIsNotEmpty_WhenTwoEntryIsSaved_NoOfEntryIsTwo(){
        Entry entry = new Entry(1, "New title", "New body");
        entryRepository.saveEntry(entry);
        Entry entry2 = new Entry(2, "Second title", "Second body");
        entryRepository.saveEntry(entry);
        assertEquals(2, entryRepository.countEntry());
    }

    @Test
    public void testThatWhenThreeEntryIsSaved_OneIsDeleted_NoOfEntryIsTwo(){
        Entry entry = new Entry(1, "New title", "New body");
        entryRepository.saveEntry(entry);
        Entry entry2 = new Entry(2, "Second title", "Second body");
        entryRepository.saveEntry(entry2);
        Entry entry3 = new Entry(3, "Second title", "Second body");
        entryRepository.saveEntry(entry3);
        assertEquals(3, entryRepository.countEntry());
        entryRepository.deleteEntry(entry2);
        assertEquals(2, entryRepository.countEntry());
    }

    @Test
    public void testThatEntryRepositoryCanFindEntryById(){
        Entry entry = new Entry(1, "New title", "New body");
        entryRepository.saveEntry(entry);
        Entry entry2 = new Entry(2, "Second title", "Second body");
        entryRepository.saveEntry(entry2);
        Entry entry3 = new Entry(3, "Second title", "Second body");
        entryRepository.saveEntry(entry3);
        Entry foundEntry = entryRepository.findEntryById(2);
        assertEquals(entry2, foundEntry);
    }
}