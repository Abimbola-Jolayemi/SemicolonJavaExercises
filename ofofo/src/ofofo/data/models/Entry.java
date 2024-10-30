package ofofo.data.models;

import java.time.LocalDate;

public class Entry {
    private long id;
    private String title;
    private String body;
    private LocalDate date = LocalDate.now();
    private int diaryId;

    public Entry(int diaryId, String title, String body) {
        this.title = title;
        this.body = body;
        this.diaryId = diaryId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(int diaryId) {
        this.diaryId = diaryId;
    }

}
