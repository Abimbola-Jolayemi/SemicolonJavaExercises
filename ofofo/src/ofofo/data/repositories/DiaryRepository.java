package ofofo.data.repositories;

import ofofo.data.models.Diary;

public interface DiaryRepository {
   void save (Diary diary);
   Diary findById(int id);
   void delete(Diary dairy);
   long count();
   String getPassword(String Username);
   Diary findByUsername(String Username);
}
