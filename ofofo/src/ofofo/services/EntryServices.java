package ofofo.services;

import ofofo.data.models.Entry;

import java.util.List;

public interface EntryServices {
    void createEntry(Entry entry);
    long numberOfEntries();
    Entry getEntry(int diaryId, int id);
    List<Entry> getAllEntries();
    void updateEntry(int id, Entry entry);
    void deleteEntry(int id);
}
