package ofofo.data.repositories;

import ofofo.data.models.Diary;
import ofofo.data.models.Entry;

import java.util.ArrayList;
import java.util.List;

public class EntryRepositoryImpl implements EntryRepository {
    private List<Entry> entries = new ArrayList<>();
    private long entryId = 0;

    @Override
    public void saveEntry(Entry entry) {
        entry.setId(assignId(entry));
        entries.add(entry);
    }

    @Override
    public long countEntry() {
        return entries.size();
    }

    @Override
    public void deleteEntry(Entry entry) {
        entries.remove(entry);
    }

    @Override
    public Entry findEntryById(int id) {
        for(Entry entry: entries){
            if(entry.getId() == id){
                return entry;
            }
        }
        return null;
    }

    @Override
    public Entry findEntryByDiaryId(int diaryId, int entryId) {
        for (Entry entry : entries) {
            if (entry.getDiaryId() == diaryId && entry.getId() == entryId) {
                return entry;
            }
        }
        return null;
    }


    @Override
    public Entry findEntryByTitle(String title) {
        String ignoredTitleCase = title.toLowerCase();
        for(Entry entry: entries){
            if(entry.getTitle().toLowerCase().equals(ignoredTitleCase)){
                return entry;
            }
        }
        return null;
    }

    private long assignId(Entry entry) {
        return ++entryId;
    }
}
