package ofofo.data.repositories;

import ofofo.data.models.Entry;

public interface EntryRepository {
    void saveEntry(Entry entry);
    long countEntry();
    void deleteEntry(Entry entry);
    Entry findEntryById(int id);
    Entry findEntryByTitle(String title);
    Entry findEntryByDiaryId(int diaryId, int entryId);
}
