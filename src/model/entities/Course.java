package model.entities;

public class Course {
    private String tittle;
    private String describe;
    private Integer workload;

    public Course(String tittle, String describe, Integer workload) {
        this.tittle = tittle;
        this.describe = describe;
        this.workload = workload;
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

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    public Double calcXp(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Course{" +
                "tittle='" + tittle + '\'' +
                ", describe='" + describe + '\'' +
                ", workload=" + workload +
                '}';
    }
}
