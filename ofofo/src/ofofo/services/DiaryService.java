package ofofo.services;

import ofofo.data.models.Diary;
import ofofo.data.models.Entry;

public interface DiaryService {
    String register(String username, String password);
    long numberOfUsers();
    Diary login(String username, String password);
    void logout(Diary diary);
    void createEntry(String Username, Entry entry);
}
