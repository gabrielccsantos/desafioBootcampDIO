package model.entities;

public class Course extends Content{

    private Integer workload;

    public Course(String title, String describe, Integer workload) {
        super(title, describe);
        this.workload = workload;
    }

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    @Override
    public Integer calcXp() {
        return XP_DEFAULT * workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Title=" + getTitle() +
                "Describe=" + getDescribe() +
                "workload=" + getWorkload() +
                '}';
    }
}
