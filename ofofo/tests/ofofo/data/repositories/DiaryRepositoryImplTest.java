package ofofo.data.repositories;

import ofofo.data.models.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryRepositoryImplTest {
    private DiaryRepository diaryRepository;

    @BeforeEach
    public void startWith() {
        diaryRepository = new DiaryRepositoryImpl();
    }

    @Test
    public void testThatRepositoryIsEmpty() {
        assertEquals(diaryRepository.count(), 0);
    }

    @Test
    public void testThatWhenOneDiaryIsAdded_RepositoryIsNotEmpty_sizeBecomesOne() {
        Diary diary = new Diary("username", "title");
        diaryRepository.save(diary);
        assertEquals(diaryRepository.count(), 1);
    }

    @Test
    public void testThatWhenTwoDiariesAreAdded_sizeBecomesTwo() {
        Diary diary = new Diary("username", "title");
        diaryRepository.save(diary);
        assertEquals(diaryRepository.count(), 1);
        Diary diary2 = new Diary("username2", "title2");
        diaryRepository.save(diary);
        assertEquals(diaryRepository.count(), 2);
    }

    @Test
    public void testThatWhenThreeDiariesAreSaved_OneIsRemoved_sizeBecomesTwo() {
        Diary diary = new Diary("username", "title");
        diaryRepository.save(diary);
        Diary diary2 = new Diary("username2", "title2");
        diaryRepository.save(diary2);
        Diary diary3 = new Diary("username3", "title3");
        diaryRepository.save(diary3);
        assertEquals(diaryRepository.count(), 3);
        diaryRepository.delete(diary3);
        assertEquals(diaryRepository.count(), 2);
    }

//    @Test
//    public void testThatTwoDiariesAreAdded_WeCanFindById(){
//        Diary diary = new Diary("username", "title");
//        diaryRepository.save(diary);
//        Diary diary2 = new Diary("username2", "title2");
//        diaryRepository.save(diary2);
//        Diary diary3 = new Diary("username3", "title3");
//        diaryRepository.save(diary3);
//        Diary foundDiary = diaryRepository.findById(2);
//        assertEquals(foundDiary, diary2);
//    }

    @Test
    public void testThatTwoDiariesAreAdded_OneIsDeleted_WeCannotFindInexistingDiaryById(){
        Diary diary = new Diary("username", "title");
        diaryRepository.save(diary);
        Diary diary2 = new Diary("username2", "title2");
        diaryRepository.save(diary2);
        Diary diary3 = new Diary("username3", "title3");
        diaryRepository.save(diary3);
        diaryRepository.delete(diary2);
        assertEquals(null, diaryRepository.findById(2));
    }

}