package model.entities;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class Bootcamp {
    private String name;
    private String describe;
    private Instant initialDate;
    private Instant finalDate;

    private Set<Content> contentSet;
    private Set<Developer> developersSet;

    public Bootcamp(String name, String describe) {
        this.name = name;
        this.describe = describe;
        this.initialDate = Instant.now();
        this.finalDate = getInitialDate().plus(Duration.ofDays(45));
        contentSet = new HashSet<>();
        developersSet = new LinkedHashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Instant getInitialDate() {
        return initialDate;
    }

    public Instant getFinalDate() {
        return finalDate;
    }

    public Set<Content> getContentSet() {
        return contentSet;
    }

    public void addContent(Content content){
        contentSet.add(content);
    }

    public Set<Developer> getDevelopersSet() {
        return developersSet;
    }

    public void addDevelopers(Developer dev){
        developersSet.add(dev);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(describe, bootcamp.describe) && Objects.equals(initialDate, bootcamp.initialDate) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(contentSet, bootcamp.contentSet) && Objects.equals(developersSet, bootcamp.developersSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, describe, initialDate, finalDate, contentSet, developersSet);
    }
}
