package ofofo.services;

import ofofo.data.models.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntryServicesImplTest {
    private EntryServices entryServices;

    @BeforeEach
    public void setUp() {
        entryServices = new EntryServicesImpl();
    }
    @Test
    public void testThatEntryRepositoryIsEmptyWhenNoEntryIsCreated() {
        assertEquals(0, entryServices.numberOfEntries());
    }

    @Test
    public void testThatEntryRepositoryIsNotEmptyWhenOneEntryIsCreated_numberOfEntriesIsOne() {
        Entry entry = new Entry(1, "My New Entry", "I want to create a new entry");
        entryServices.createEntry(entry);
        assertEquals(1, entryServices.numberOfEntries());
    }

    @Test
    public void testThatEntryRepositoryIsNotEmptyWhenTwoEntriesAreCreated_numberOfEntriesEqualsTwo() {
        Entry entry = new Entry(1, "My New Entry", "I want to add a new entry");
        entryServices.createEntry(entry);
        assertEquals(1, entryServices.numberOfEntries());
        Entry entry2 = new Entry(2, "Another Entry", "I want to create another entry");
        entryServices.createEntry(entry2);
        assertEquals(2, entryServices.numberOfEntries());
    }

    @Test
    public void testThatEntryRepositoryIsNotEmptyWhenThreeEntriesAreCreated_OneEntryIsDeleted_numberOfEntriesEqualsTwo() {
        Entry entry = new Entry(1, "My New Entry", "I want to add a new entry");
        entryServices.createEntry(entry);
        assertEquals(1, entryServices.numberOfEntries());
        Entry entry2 = new Entry(2, "Another Entry", "I want to create another entry");
        entryServices.createEntry(entry2);
        assertEquals(2, entryServices.numberOfEntries());
        Entry entry3 = new Entry(3, "Third Entry", "I want to create third entry");
        entryServices.createEntry(entry3);
        assertEquals(3, entryServices.numberOfEntries());
        entryServices.deleteEntry(1);
        assertEquals(2, entryServices.numberOfEntries());
    }

    @Test
    public void testThatAnEntryInTheRepositoryCanBeUpdated_numberOfEntriesDoesNotIncrease() {
        Entry entry = new Entry(1, "My New Entry", "I want to add a new entry");
        entryServices.createEntry(entry);
        assertEquals(1, entryServices.numberOfEntries());
        Entry entry2 = new Entry(2, "Another Entry", "I want to create another entry");
        entryServices.createEntry(entry2);
        assertEquals(2, entryServices.numberOfEntries());
        Entry entry3 = new Entry(3, "Third Entry", "I want to create third");
        entryServices.updateEntry(2, entry3);
        assertEquals(2, entryServices.numberOfEntries());
    }

    @Test
    public void testThatAnEntryInTheRepositoryCanBeUpdated_EntryBodyIsChanged(){
        Entry entry = new Entry(1, "My New Entry", "I want to add a new entry");
        entryServices.createEntry(entry);
        assertEquals(1, entryServices.numberOfEntries());
        Entry entry2 = new Entry(2, "Another Entry", "I want to create another entry");
        entryServices.createEntry(entry2);
        assertEquals(2, entryServices.numberOfEntries());
        Entry entry3 = new Entry(2, "Third Entry", "I want to create third");
        entryServices.updateEntry(2, entry3);
        assertEquals("I want to create third", entry2.getBody());
    }

    @Test
    public void testThatAnEntryCanBeGottenFromRepositoryUsingID() {
        Entry entry1 = new Entry(1, "My New Entry", "I want to add a new entry");
        entryServices.createEntry(entry1);
        assertEquals(1, entryServices.numberOfEntries());

        Entry entry2 = new Entry(2, "Another Entry", "I want to create another entry");
        entryServices.createEntry(entry2);
        assertEquals(2, entryServices.numberOfEntries());
        assertEquals(entry2, entryServices.getEntry(2, 2));
    }


    @Test
    public void testThatTwoEntriesAreCreatedByTwoDifferentDiaryIds_WeCanGetIdsIndependentlyUsingTheDiaryIdAndEntryId(){
        Entry entry1 = new Entry(1, "My New Entry", "I want to add a new entry");
        entryServices.createEntry(entry1);
        Entry entry2 = new Entry(1, "My New Entry", "I want to add a new entry");
        entryServices.createEntry(entry2);
        assertEquals(2, entryServices.numberOfEntries());

        Entry entry3 = new Entry(2, "My New Entry", "I want to add a new entry");
        entryServices.createEntry(entry3);
        Entry entry4 = new Entry(2, "My New Entry", "I want to add a new entry");
        entryServices.createEntry(entry4);
        assertEquals(4, entryServices.numberOfEntries());
        assertEquals(entry3, entryServices.getEntry(2, 3));
    }

}