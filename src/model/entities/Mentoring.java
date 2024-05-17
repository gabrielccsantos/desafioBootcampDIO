package model.entities;

import java.time.Instant;

public class Mentoring extends Content{

    private Instant date;

    public Mentoring(String title, String describe, Instant date) {
        super(title, describe);
        this.date = date;
    }


    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    @Override
    public Double calcXp(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "Title=" + getTitle() +
                "Describe=" + getDescribe() +
                "date=" + getDate() +
                '}';
    }
}
