package ofofo.services;

import ofofo.data.models.Diary;
import ofofo.data.models.Entry;
import ofofo.data.repositories.DiaryRepository;
import ofofo.data.repositories.DiaryRepositoryImpl;
import ofofo.data.repositories.EntryRepository;
import ofofo.data.repositories.EntryRepositoryImpl;

public class DiaryServiceImpl implements DiaryService {
    private DiaryRepository diaryRepository = new DiaryRepositoryImpl();
    private EntryServices entryServices = new EntryServicesImpl();

    @Override
    public String register(String username, String Password) {
        if(diaryRepository.findByUsername(username) == null) {
            diaryRepository.save(new Diary(username, Password));
            return "Diary registered successfully";
        } else {
            return "User already exists!";
        }
    }

    @Override
    public long numberOfUsers() {
        return diaryRepository.count();
    }

    @Override
    public Diary login(String username, String password) {
        if(diaryRepository.findByUsername(username) != null) {
            if(diaryRepository.findByUsername(username).getPassword().equals(password)) {
                diaryRepository.findByUsername(username).setLock(false);
                return diaryRepository.findByUsername(username);
            } else{
                throw new IllegalArgumentException("Wrong password!!!");
            }
        } else{
           throw new IllegalArgumentException("User not found!!!");
        }
    }

    @Override
    public void logout(Diary diary) {
        diary.setLock(true);
    }

    @Override
    public void createEntry(String username, Entry entry) {
        Diary diary = diaryRepository.findByUsername(username);
        diary.setLastCount(diary.getLastCount() + 1);
        entryServices.createEntry(entry);
    }


}
