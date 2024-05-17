package model.entities;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Developer {
    private String name;

    private Set<Content> subscribeContent;
    private Set<Content> fineshedContent;

    public Developer(String name) {
        this.name = name;
        subscribeContent = new LinkedHashSet<>();
        fineshedContent = new LinkedHashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void subscribe(){

    }

    public void progress(){

    }

    public Double calcTotalXP(){
        return 0.0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(name, developer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
