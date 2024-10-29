package ofofo.services;

import ofofo.data.models.Diary;

public interface DiaryService {
    String register(String username, String password);
    long numberOfUsers();
    Diary login(String username, String password);
    Diary logout(long id);
}
