package ofofo.services;

import ofofo.data.models.Diary;
import ofofo.data.models.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryServiceImplTest {
    private DiaryService diaryService;
    private EntryServices entryServices;

    @BeforeEach
    public void setUp() {
        diaryService = new DiaryServiceImpl();
        entryServices = new EntryServicesImpl();
    }
    @Test
    public void testThatWhenNoUserRegisters_RepositoryIsEmpty() {
        assertEquals(0, diaryService.numberOfUsers());
    }

    @Test
    public void testThatWhenAUserRegisters_RepositoryIsNotEmpty_RepoHasOneUser() {
        diaryService.register("Abimbola", "0000");
        assertEquals(1, diaryService.numberOfUsers());
    }

    @Test
    public void testThatTwoUserRegisters_RepositoryIsNotEmpty_RepoHasTwoUsers() {
        diaryService.register("Abimbola", "0000");
        diaryService.register("Comfort", "1111");
        assertEquals(2, diaryService.numberOfUsers());
    }

    @Test
    public void testThatWhenAUsernameIsRegisteredTwice_RepoHasOneUser() {
        diaryService.register("Abimbola", "0000");
        diaryService.register("Abimbola", "0000");
        assertEquals(1, diaryService.numberOfUsers());
    }

    @Test
    public void testThatWhenAUserCanLoginUser() {
        diaryService.register("Abimbola", "0000");
        Diary diary = diaryService.login("Abimbola", "0000");
        assertEquals("Abimbola", diary.getUsername());
    }

    @Test
    public void testThatWhenAUserCannotLoginAUser_withAWrongUsername() {
        diaryService.register("Abimbola", "0000");
        assertThrows(IllegalArgumentException.class, () -> diaryService.login("Jolayemi", "0000"));
    }

    @Test
    public void testThatWhenAUserCannotLoginAUser_withAWrongPassword() {
        diaryService.register("Abimbola", "0000");
        assertThrows(IllegalArgumentException.class, () -> diaryService.login("Abimbola", "2222"));
    }

    @Test
    public void testThatWhenAUserLogInWithValidDetails_DiaryIsUnlocked(){
        diaryService.register("Abimbola", "0000");
        Diary diary = diaryService.login("Abimbola", "0000");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testThatOnlyALoggedInUserCanLogOut(){
        diaryService.register("Abimbola", "0000");
        Diary diary = diaryService.login("Abimbola", "0000");
        assertFalse(diary.isLocked());
        diaryService.logout(diary);
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThatUserCanLogout_DiaryBecomesLocked(){
        diaryService.register("Abimbola", "0000");
        Diary diary = diaryService.login("Abimbola", "0000");
        assertFalse(diary.isLocked());
        diaryService.logout(diary);
        assertTrue(diary.isLocked());
    }

//    @Test
//    public void testThatARegisteredDiaryUserCanCreateAnEntry_weCanGetTitleOfNewEntry(){
//        diaryService.register("Abimbola", "0000");
//        Diary diary = diaryService.login("Abimbola", "0000");
//        Entry myEntry = new Entry("my title", "my diary body");
//        entryServices.createEntry(myEntry);
//        Entry createdEntry = entryServices.getEntry(1);
//        diary.setEntry(createdEntry);
//        assertEquals(1, diaryService.numberOfUsers());
//        assertEquals("my title", diary.getEntries().get(0).getTitle());
//    }
//
//    @Test
//    public void testThatWhenTwoUsersRegistersAndCreatesNewEntries_WeCanGetBodyOfUser2Alone(){
//        diaryService.register("Abimbola", "0000");
//        diaryService.register("Jolayemi", "1111");
//        Diary diary = diaryService.login("Jolayemi", "1111");
//        entryServices.createEntry(new Entry("my title", "my diary body"));
//        entryServices.createEntry(new Entry("Second title", "Second entry"));
//        Entry createdEntry = entryServices.getEntry(2);
//        diary.setEntry(createdEntry);
//        diary.setEntry(entryServices.getEntry(1));
//        assertEquals(2, diaryService.numberOfUsers());
//        assertEquals("my title", diary.getEntries().get(1).getTitle());
//    }

}