package model.entities;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
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

    public Set<Content> getSubscribeContent(){
        return subscribeContent;
    }

    public Set<Content> getFineshedContent(){
        return fineshedContent;
    }

    public void subscribe(Bootcamp bootcamp){
        subscribeContent.addAll(bootcamp.getContentSet());
        bootcamp.addDevelopers(this);
    }

    public void progress(){
        Optional<Content> content = subscribeContent.stream().findFirst();
        if(content.isPresent()){
            fineshedContent.add(content.get());
            subscribeContent.remove(content.get());
        }else{
            System.err.println("Não está matriculado em nenhum bootcamp");
        }
    }

    public Integer calcTotalXP(){
        return fineshedContent.stream().mapToInt(Content::calcXp).reduce(0, Integer::sum);
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
