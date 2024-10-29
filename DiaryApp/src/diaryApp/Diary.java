package diaryApp;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Diary {
    private boolean isLocked = true;
    private String defaultPassword;
    private List<Entry> entries;

    public Diary() {
        defaultPassword = "0000";
        entries = new ArrayList<>();
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unlock(String password) {
        if (validatePassword(password)) {
            this.isLocked = false;
        }
    }

    public void lock() {
        this.isLocked = true;
    }

    private boolean validatePassword(String password) {
        return password.equals(defaultPassword);
    }

    public void resetPassword(String defaultPassword, String newPassword) {
        if (validatePassword(defaultPassword)) {
            this.defaultPassword = newPassword;
        } else{
            throw new IllegalArgumentException("Invalid Password");
        }
    }

    public boolean isEmpty() {
        return entries.isEmpty();
    }

    public int getNumberOfEntries() {
        return entries.size();
    }

    public void createEntries(String title, String details) {
        if (!isLocked()) {
            String entryID = assignIdToEntry(entries.size());
            Entry entry = new Entry(entryID, title, details);
            entries.add(entry);
        }
    }

    private String assignIdToEntry(int index) {
        return String.format("%04d", index + 1);
    }

    public Entry findById(String id) {
        if (!isLocked()) {
            for (Entry entry : entries) {
                if (entry.getID().equals(id)) {
                    return entry;
                }
            }
            throw new NoSuchElementException("Entry with ID " + id + " not found.");
        }
        return null;
    }

    public void delete(String id) {
        if (!isLocked()) {
            Entry entry = findById(id);
            if (entry != null) {
                entries.remove(entry);
                repositionIDs();
            } else {
                throw new NoSuchElementException("Entry with ID " + id + " is not found.");
            }
        }
    }

    private void repositionIDs() {
        for (int index = 0; index < entries.size(); index++) {
            entries.get(index).setID(assignIdToEntry(index));
        }
    }

    public void updateEntry(String id, String newTitle, String newDetails) {
        if (!isLocked()) {
            boolean entryFound = false;
            for (Entry entry : entries) {
                if (entry.getID().equals(id)) {
                    entry.setTitle(newTitle);
                    entry.setDetails(newDetails);
                    entryFound = true;
                    break;
                }
            }
            if (!entryFound) {
                throw new NoSuchElementException("Entry with ID " + id + " not found.");
            }
        }
    }

}
