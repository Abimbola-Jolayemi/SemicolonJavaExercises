package diaryApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary diary;

    @BeforeEach
    public void setUp() {
        diary = new Diary();
    }

    @Test
    public void testThatDiaryIsLockedByDefault() {
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThatDiaryCanBeUnlockedUsingTheDefaultPassword() {
        assertTrue(diary.isLocked());
        diary.unlock("0000");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testThatDiaryPasswordCanBeReset_DefaultPasswordCannotBeUsedToUnlock() {
        diary.resetPassword("0000", "1111");
        diary.unlock("0000");
        assertTrue(diary.isLocked());
        diary.unlock("1111");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testThatPasswordCanOnlyBeResetWhenDefaultPasswordIsEnteredCorrectly() {
        assertThrows(IllegalArgumentException.class, () -> diary.resetPassword("2222", "1111"));
    }

    @Test
    public void testThatDiaryCanBeLockedAgainAfterBeingUnlocked() {
        assertTrue(diary.isLocked());
        diary.unlock("0000");
        assertFalse(diary.isLocked());
        diary.lock();
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThatDiaryIsEmptyWhenNoEntryIsAdded() {
        assertTrue(diary.isEmpty());
    }

    @Test
    public void testThatEntriesCanBeEnteredOnlyWhenDiaryIsUnlocked() {
        diary.createEntries("Title1", "Details1");
        diary.createEntries("Title2", "Details2");
        assertEquals(0, diary.getNumberOfEntries());
        diary.unlock("0000");
        diary.createEntries("Title1", "Details1");
        diary.createEntries("Title2", "Details2");
        assertEquals(2, diary.getNumberOfEntries());
    }

    @Test
    public void testThatWhenAnEntryIsAdded_DiaryIsNotEmpty() {
        diary.unlock("0000");
        assertTrue(diary.isEmpty());
        diary.createEntries("Title1", "Details1");
        assertFalse(diary.isEmpty());
    }

    @Test
    public void testThatWhenTwoEntriesAreAdded_DiaryEntrySizeBecomesTwo() {
        diary.unlock("0000");
        diary.createEntries("Title1", "Details1");
        diary.createEntries("Title2", "Details2");
        assertEquals(2, diary.getNumberOfEntries());
    }

    @Test
    public void testThatEntriesCannotBeAddedWhenDiaryIsLocked_numberOfEntriesRemainTheSame() {
        diary.createEntries("Title1", "Details1");
        diary.createEntries("Title2", "Details2");
        assertEquals(0, diary.getNumberOfEntries());
    }

    @Test
    public void testThatAnEntryCanBeGottenByID() {
        diary.unlock("0000");
        diary.createEntries("Title1", "Details1");
        diary.createEntries("Title2", "Details2");
        assertEquals(2, diary.getNumberOfEntries());
        Entry entry = diary.findById("0002");
        assertEquals("Title2", entry.getTitle());
    }

    @Test
    public void testThatEntriesCannotBeGottenByWrongID() {
        diary.unlock("0000");
        diary.createEntries("Title1", "Details1");
        diary.createEntries("Title2", "Details2");
        assertEquals(2, diary.getNumberOfEntries());
        assertThrows(NoSuchElementException.class, () -> diary.findById("0010"));
    }

    @Test
    public void testThatEntriesCannotBeGottenFromALockedDiary() {
        diary.unlock("0000");
        diary.createEntries("Title1", "Details1");
        diary.createEntries("Title2", "Details2");
        diary.createEntries("Title3", "Details3");
        assertEquals(3, diary.getNumberOfEntries());
        diary.lock();
        assertTrue(diary.isLocked());
        assertNull(diary.findById("0002"));
    }

    @Test
    public void testThatThreeEntriesAreAdded_OneIsDeleted_SizeBecomesTwo() {
        diary.unlock("0000");
        diary.createEntries("Title1", "Details1");
        diary.createEntries("Title2", "Details2");
        diary.createEntries("Title3", "Details3");
        assertEquals(3, diary.getNumberOfEntries());
        diary.delete("0002");
        assertEquals(2, diary.getNumberOfEntries());
    }

    @Test
    public void testThatIDIsShiftedBackwardsWhenAMiddleElementIsDeleted() {
        diary.unlock("0000");
        diary.createEntries("Title1", "Details1");
        diary.createEntries("Title2", "Details2");
        diary.createEntries("Title3", "Details3");
        assertEquals(3, diary.getNumberOfEntries());
        assertEquals("Title2", diary.findById("0002").getTitle());
        diary.delete("0002");
        assertEquals(2, diary.getNumberOfEntries());
        assertEquals("Title3", diary.findById("0002").getTitle());
    }

    @Test
    public void testThatAnInvalidEntryCannotBeDeleted() {
        diary.unlock("0000");
        diary.createEntries("Title1", "Details1");
        diary.createEntries("Title2", "Details2");
        diary.createEntries("Title3", "Details3");
        assertEquals(3, diary.getNumberOfEntries());
        assertThrows(NoSuchElementException.class, () -> diary.delete("0011"));
    }

    @Test
    public void testThatAnEntryCanBeUpdated(){
        diary.unlock("0000");
        diary.createEntries("Title1", "Details1");
        diary.createEntries("Title2", "Details2");
        diary.createEntries("Title3", "Details3");
        diary.updateEntry("0002", "New-Title", "New Details");
        assertEquals("New-Title", diary.findById("0002").getTitle());
    }

    @Test
    public void testThatAnEntryCanBeUpdatedOnlyWhenDiaryIsUnlocked() {
        diary.unlock("0000");
        diary.createEntries("Title1", "Details1");
        diary.createEntries("Title2", "Details2");
        diary.createEntries("Title3", "Details3");
        diary.lock();
        diary.updateEntry("0002", "New-Title", "New Details");
        diary.unlock("0000");
        assertEquals("Title2", diary.findById("0002").getTitle());
        diary.updateEntry("0002", "New-Title", "New Details");
        assertEquals("New-Title", diary.findById("0002").getTitle());
    }

}
