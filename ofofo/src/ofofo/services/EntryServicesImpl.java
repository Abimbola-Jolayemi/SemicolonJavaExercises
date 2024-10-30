package ofofo.services;

import ofofo.data.models.Entry;
import ofofo.data.repositories.DiaryRepository;
import ofofo.data.repositories.DiaryRepositoryImpl;
import ofofo.data.repositories.EntryRepository;
import ofofo.data.repositories.EntryRepositoryImpl;

import java.util.List;

public class EntryServicesImpl implements EntryServices {
    private final EntryRepository entryRepository = new EntryRepositoryImpl();
    private final DiaryRepository diaryRepository = new DiaryRepositoryImpl();

    @Override
    public void createEntry(Entry entry) {
        entryRepository.saveEntry(entry);
    }

    @Override
    public long numberOfEntries() {
        return entryRepository.countEntry();
    }

    @Override
    public Entry getEntry(int diaryId, int id) {
//        if (diaryRepository.findById(diaryId) != null) {
//            if (entryRepository.findEntryById(id) != null) {
//               return entryRepository.findEntryById(id);
//            }
//        }
//        return null;

        return entryRepository.findEntryByDiaryId(diaryId, id);
    }

    @Override
    public List<Entry> getAllEntries() {
//        return entryRepository.findAllEntries();
        return null;
    }

    @Override
    public void updateEntry(int id, Entry newEntry) {
        Entry foundEntry = entryRepository.findEntryById(id);
        if (foundEntry != null) {
            foundEntry.setTitle(newEntry.getTitle());
            foundEntry.setBody(newEntry.getBody());
        }
    }

    @Override
    public void deleteEntry(int id) {
        Entry foundEntry = entryRepository.findEntryById(id);
        if (foundEntry != null) {
            entryRepository.deleteEntry(foundEntry);
        }
    }
}
