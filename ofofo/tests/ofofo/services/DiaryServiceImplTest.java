package ofofo.services;

import ofofo.data.models.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryServiceImplTest {
    private DiaryService diaryService;

    @BeforeEach
    public void setUp() {
        diaryService = new DiaryServiceImpl();
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

//    @Test
//    public void testThatALoggedInUserCanLogout(){
//        diaryService.register("Abimbola", "0000");
//        Diary diary = diaryService.login("Abimbola", "0000");
//        assertFalse(diary.isLocked());
//        diaryService.logout(1);
//
//    }
}