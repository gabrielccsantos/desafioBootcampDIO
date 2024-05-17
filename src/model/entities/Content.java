package model.entities;

public abstract class Content {
    protected static final Double XP_DEFAULT = 10.0;
    private String title;
    private String describe;

    public Content(String title, String describe) {
       this.title = title;
       this.describe = describe;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public abstract Double calcXp();

}
