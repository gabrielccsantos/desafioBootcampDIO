package model.entities;

import java.time.Instant;

public class Mentoring {
    private String tittle;
    private String describe;
    private Instant date;

    public Mentoring(String tittle, String describe, Instant date) {
        this.tittle = tittle;
        this.describe = describe;
        this.date = date;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Instant getWorkload() {
        return date;
    }

    public void setWorkload(Instant date) {
        this.date = date;
    }

    public Double calcXp(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "tittle='" + tittle + '\'' +
                ", describe='" + describe + '\'' +
                ", date=" + date +
                '}';
    }
}
