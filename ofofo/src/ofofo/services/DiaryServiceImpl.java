package ofofo.services;

import ofofo.data.models.Diary;
import ofofo.data.repositories.DiaryRepository;
import ofofo.data.repositories.DiaryRepositoryImpl;

public class DiaryServiceImpl implements DiaryService {
    private DiaryRepository diaryRepository = new DiaryRepositoryImpl();

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
                diaryRepository.findByUsername(username).setLocked(false);
                return diaryRepository.findByUsername(username);
            } else{
                throw new IllegalArgumentException("Wrong password!!!");
            }
        } else{
           throw new IllegalArgumentException("User not found!!!");
        }
    }

    @Override
    public Diary logout(long id) {
        return null;
    }
}
