package ofofo.data.models;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String username;
    private String password;
    private int diaryId;
    private boolean isLocked = true;
    private final List<Entry> entries = new ArrayList<>();

    public Diary() {}

    public Diary(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDiaryId(int diaryId) {
        this.diaryId = diaryId;
    }

    public int getDiaryId() {
        return diaryId;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLock(boolean locked) {
        isLocked = locked;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntry(Entry entry) {
        entries.add(entry);
    }
}
