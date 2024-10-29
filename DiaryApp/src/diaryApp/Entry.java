package diaryApp;

public class Entry {
    private String title;
    private String details;
    private String ID;

    public Entry(String ID, String title, String details) {
        this.ID = ID;
        this.title = title;
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getID(){
        return ID;
    }

    public void setID(String ID){
        this.ID = ID;
    }
}
