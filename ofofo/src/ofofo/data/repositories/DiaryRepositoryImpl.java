package ofofo.data.repositories;

import ofofo.data.models.Diary;
//import ofofo.data.models.Entry;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class DiaryRepositoryImpl implements DiaryRepository{
    private List<Diary> diaries= new ArrayList<>();
    private int diaryId = 0;


    @Override
    public void save(Diary diary) {
        diary.setDiaryId(assignId());
        diaries.add(diary);
    }

    @Override
    public Diary findById(int diaryID) {
        for(Diary diary: diaries){
            if(diary.getDiaryId() == diaryID){
                return diary;
            }
        }
        return null;
    }

    @Override
    public void delete(Diary diary) {
        diaries.remove(diary);
    }

    @Override
    public long count() {
        return diaries.size();
    }

    @Override
    public String getPassword(String Username) {
        for(Diary diary: diaries){
            if(diary.getUsername().equals(Username)){
                return diary.getPassword();
            }
        }
        return null;
    }

    @Override
    public Diary findByUsername(String Username) {
        for(Diary diary: diaries){
            if(diary.getUsername().equals(Username)){
                return diary;
            }
        }
        return null;
    }

    private int assignId(){
        return ++diaryId;
    }

}
