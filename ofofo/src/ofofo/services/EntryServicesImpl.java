package ofofo.services;

import ofofo.data.models.Entry;
import ofofo.data.repositories.EntryRepository;
import ofofo.data.repositories.EntryRepositoryImpl;

import java.util.List;

public class EntryServicesImpl implements EntryServices {
    private EntryRepository entryRepository = new EntryRepositoryImpl();

    @Override
    public void createEntry(Entry entry) {
        entryRepository.saveEntry(entry);
    }

    @Override
    public long numberOfEntries() {
        return entryRepository.countEntry();
    }


    @Override
    public Entry getEntry(int id) {
        return entryRepository.findEntryById(id);
    }

    @Override
    public List<Entry> getAllEntries() {
        return List.of();
    }

    @Override
    public void updateEntry(int id, Entry newEntry) {
        Entry foundEntry = entryRepository.findEntryById(id);
        foundEntry.setTitle(newEntry.getTitle());
        foundEntry.setBody(newEntry.getBody());
    }

    @Override
    public void deleteEntry(int id) {
        Entry foundEntry = entryRepository.findEntryById(id);
        entryRepository.deleteEntry(foundEntry);
    }
}
