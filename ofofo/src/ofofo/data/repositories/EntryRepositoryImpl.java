package ofofo.data.repositories;

import ofofo.data.models.Diary;
import ofofo.data.models.Entry;

import java.util.ArrayList;
import java.util.List;

public class EntryRepositoryImpl implements EntryRepository {
    private List<Entry> entries = new ArrayList<>();

    @Override
    public void saveEntry(Entry entry) {
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
}